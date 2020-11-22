package org.springframework.samples.petclinic.web;


import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Tutor;
import org.springframework.samples.petclinic.service.TutorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/tutores")
public class TutorController {

	@Autowired
	TutorService tutorService;
	
	@GetMapping("")
	public String listTutores(ModelMap model) {
		model.addAttribute("tutores", tutorService.findAll());
		return "/tutores/tutoresList";
	}
	
	
	@GetMapping("/{email}/edit")
	public String editTutor(@PathVariable("email") String email, ModelMap model) {
		Optional<Tutor> tutor = tutorService.finByEmail(email);
		if(tutor.isPresent()) {
			model.addAttribute("tutor", tutor.get());
			return"tutores/createOrUpdateTutorForm";
		}else {
			model.addAttribute("message","No se encuentra el tutor seleccionado");
			return listTutores(model);
		}
	}
	
	@PostMapping("/{email}/edit")
	public String editNoticia(@PathVariable("email") String email, @Valid Tutor modifiedTutor, BindingResult binding, ModelMap model) {
		Optional<Tutor> tutor = tutorService.finByEmail(email);
		if(binding.hasErrors()) {
			return "tutores/createOrUpdateTutorForm";
		}else {
			BeanUtils.copyProperties(modifiedTutor, tutor.get(), "email");
			tutorService.save(tutor.get());
			model.addAttribute("message","Tutor actualizado con exito");
			return listTutores(model);
		}
	}
	
	
	@GetMapping("/{email}/delete")
	public String deleteTutor(@PathVariable("email") String email, ModelMap model) {
		Optional<Tutor> tutor = tutorService.finByEmail(email);
		if(tutor.isPresent()) {
			tutorService.delete(tutor.get());
			model.addAttribute("message","Tutor borrado correctamente");
		}else {
			model.addAttribute("message","El tutor seleccionado no se ha podido eliminar");
		}
		return listTutores(model);
	}
	
}