package com.registro.usuarios.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lowagie.text.DocumentException;
import com.registro.usuarios.entity.Pacientes;
import com.registro.usuarios.service.Impl.PacienteServiceImpl;
import com.registro.usuarios.util.reportes.PacientesExporterPDF;



@Controller
@RequestMapping
public class PacientesController {

	@Autowired
	private PacienteServiceImpl pacientesService;
	
	@GetMapping("/ListarPacientes")
	public String listar(Model model) {
		List<Pacientes>pacientes= pacientesService.Listar();
		model.addAttribute("pacientes", pacientes);
		return "Admin/ListarPacientes";
	}
	
	@GetMapping("/RPacientes")
	public String agregar(Model model) {
		
		model.addAttribute("paciente", new Pacientes());
		return "Admin/RPacientes";
	}
	@PostMapping("/guardar")
	public String save(@Valid Pacientes pacientes, Model model) {
		pacientesService.save(pacientes);
		return "redirect:/ListarPacientes";
	}
	
	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Pacientes>paciente=pacientesService.ListarId(id);
		model.addAttribute("paciente", paciente);
		return "Admin/RPacientes";
	}

	@GetMapping("/eliminar/{id}")
	public String eliminar(Model model, @PathVariable int id) {
		pacientesService.delete(id);
		return "redirect:/ListarPacientes";
	}

	@GetMapping("Cartillas")
	public String VerPaginaDeCartillas() {
		return "Admin/Cartillas";
	}
	
	@GetMapping("/exportarPDF")
	public void exportarListadoDePacientesEnPDF(HttpServletResponse response) throws DocumentException, IOException {
	
		response.setContentType("application/pdf");
		
		DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
		String fechaActual = dateFormatter.format(new Date());
		
		String cabecera = "Content-Disposition";
		String valor = "attachment; filename=Pacientes_" + fechaActual + ".pdf";
		
		response.setHeader(cabecera, valor);
		
		List<Pacientes> pacientes = pacientesService.Listar();
		
		PacientesExporterPDF exporter = new PacientesExporterPDF(pacientes);
		exporter.exportar(response);
	}
	
}
