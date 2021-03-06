package org.springframework.samples.petclinic.service;

import java.util.Collection;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.model.Articulo;
import org.springframework.samples.petclinic.model.Noticia;
import org.springframework.samples.petclinic.model.Tutor;
import org.springframework.samples.petclinic.repository.TutorRepository;
import org.springframework.stereotype.Service;

@Service
public class TutorService {
	
	@Autowired
	TutorRepository tutoRepo;
	
	@Autowired
	NoticiaService noticiaService;
	
	@Autowired
	ArticuloService articuloService;
	
	
	public Collection<Tutor> findAll(){
		return tutoRepo.findAll();
	}
	
	public Optional<Tutor> findById(int id){
		return tutoRepo.findById(id);
	}
	
	public void save(@Valid Tutor tutor) {
		tutoRepo.save(tutor);
	}
	
	public Collection<Noticia> findTutorNoticias(int id){
		return noticiaService.findTutorNoticias(id);
	}
	
	public Collection<Articulo> findTutorArticulos(int id){
		return articuloService.findTutorArticulos(id);
	}
}
