package org.springframework.samples.petclinic.web;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.samples.petclinic.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.samples.petclinic.model.Person;
import org.springframework.samples.petclinic.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WelcomeController {
	
	
	  @GetMapping("/")
	  public String welcome(Map<String, Object> model) {
		  
		  List<Person> persons = new ArrayList<Person>();
		  Person person = new Person();
		  person.setFirstName("Alejandro");
		  person.setLastName("Barranco");
		  persons.add(person);
		  
		  person = new Person();
		  person.setFirstName("David");
		  person.setLastName("Brincau");
		  persons.add(person);
		  
		  person = new Person();
		  person.setFirstName("Juan Ramón");
		  person.setLastName("Ostos");
		  persons.add(person);
		  
		  person = new Person();
		  person.setFirstName("Jesús");
		  person.setLastName("Aparicio");
		  persons.add(person);
		  
		  person = new Person();
		  person.setFirstName("Víctor");
		  person.setLastName("Granero");
		  persons.add(person);
		  
		  model.put("persons", persons);
		  model.put("title", "Pet Shop Project");
		  model.put("group", "G2-L6");
		  

	    return "welcome";
	  }
}
