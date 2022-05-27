package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ControlAlumno {
 List<ModeloAlumno> Listita = new ArrayList<ModeloAlumno>();

 private ModeloAlumno alu;
 
 @GetMapping

public String formu1(Model modelo) {
	 
 
	 modelo.addAttribute("alu",Listita);
	 
	 return "formulario";
 }
//********* AGREGAR ****************** 
@GetMapping("/add")
public String formu2(Model modelo) {
	 
	ModeloAlumno alu = new ModeloAlumno();
	 
	 modelo.addAttribute("alumno",alu);
	 
	 return "add";
 }
//********* GUARDAR ******************

@PostMapping("/guardar")

public String Formu3(@ModelAttribute ModeloAlumno alumno) {
	
	alu = buscar(alumno.getLu());
	if(alu==null) {
	Listita.add(alumno);
	}else {
		int pos=Listita.indexOf(alu);
		Listita.set(pos, alumno);
	}
return "redirect:/";
}
//********* EDITAR ******************
@GetMapping("/edit/{lu}")
public String formu4(@PathVariable("lu") int lu, Model modelo) {
	 
	 ModeloAlumno alu = buscar(lu);
	 
	 modelo.addAttribute("alumno",alu);
	 
	 return "add";
 }

//********* ELIMINAR ******************
@GetMapping("/del/{lu}")
public String formu5(@PathVariable("lu") int lu, Model modelo) {
	 
	 ModeloAlumno alu = buscar(lu);
	 Listita.remove(alu);
	 modelo.addAttribute("alu",Listita);
	 
	 return "redirect:/";
}
//********* BUSCAR ******************
public ModeloAlumno buscar(int lu) {
	 ModeloAlumno alu = null;

	for(int indice = 0;indice<Listita.size();indice++)
	{
	   if (Listita.get(indice).getLu()==lu) {
		   alu=Listita.get(indice);
	   }
	} 
	
	return alu;
}
}
