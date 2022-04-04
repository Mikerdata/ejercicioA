package com.example.demo.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.Usuarios;

@Controller
public class HomeController {
	@GetMapping("/")
	public String inicio(Model model) {
		model.addAttribute("inicio","Bienvenido al sietmas de Gestion de Usuarios");
		
	 return  "inicio";
	}
	
	@GetMapping("/gestionausuarios")
	public String gestiona(Model model) {
		model.addAttribute("gestion","Alta de Usuarios");
		
	 return  "gestionausuarios";
	}
	
//	@GetMapping("/tablerousuarios")
//	public String tablero(Model model) {
//		Usuarios usuario=new Usuarios();
//		usuario.setNombre("Juan");
//		usuario.setApellido_paterno("lopez");
//		usuario.setLogin("Jlopez");
//	
//		usuario.setStatus("A");
//		
//		
//		model.addAttribute("tablero",usuario);
//		
//	 return  "tablerousuarios";
//	}
	
	@GetMapping("/tablerousuarios")
	public String tablero(Model model) {
	List<Usuarios>lstdatos=getDatos();
		
		
		model.addAttribute("tablero",lstdatos);
		
	 return  "tablerousuarios";
	}
	
	
//	@GetMapping("/tablerousuarios")
//	public String tablero(Model model) {
//		List<String>lstdatos=new LinkedList<String>();
//		lstdatos.add("juan lopez");
//		lstdatos.add("marta");
//		lstdatos.add("2022-03-30");
//		lstdatos.add("A");
//		
//		
//		model.addAttribute("tablero",lstdatos);
//		
//	 return  "tablerousuarios";
//	}
	
	private List<Usuarios> getDatos() {
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
		List<Usuarios> lstdatos=new LinkedList<>();
		try {
			Usuarios usuario1=new Usuarios();
			usuario1.setNombre("Juan");
			usuario1.setApellido_paterno("lopez");
			usuario1.setLogin("Jlopez");
			usuario1.setStatus("A");
			
			Usuarios usuario2=new Usuarios();
			usuario2.setNombre("Miguel");
			usuario2.setApellido_paterno("Sanchez");
			usuario2.setLogin("msanchez");
			usuario2.setStatus("A");
			lstdatos.add(usuario1);
			lstdatos.add(usuario2);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lstdatos;
	}
}
