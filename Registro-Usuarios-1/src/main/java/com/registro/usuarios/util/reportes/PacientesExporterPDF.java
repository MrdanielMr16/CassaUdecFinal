package com.registro.usuarios.util.reportes;

import java.awt.Color;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Font;
import com.lowagie.text.FontFactory;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.registro.usuarios.entity.Pacientes;

public class PacientesExporterPDF {

	private List<Pacientes> listaPacientes;

	public PacientesExporterPDF(List<Pacientes> listaPacientes) {
		super();
		this.listaPacientes = listaPacientes;
	}
	
	private void escribirCabeceraDeLaTabla(PdfPTable table) {
		PdfPCell celda = new PdfPCell();
		celda.setBackgroundColor(Color.blue);
		celda.setPadding(5);
		
		Font fuente = FontFactory.getFont(FontFactory.HELVETICA);
		fuente.setColor(Color.white);
		
		celda.setPhrase(new Phrase("ID",fuente));
		table.addCell(celda);
		
		celda.setPhrase(new Phrase("Fecha Valoracion",fuente));
		table.addCell(celda);
		
		celda.setPhrase(new Phrase("Nombre",fuente));
		table.addCell(celda);
		
		celda.setPhrase(new Phrase("Apellido",fuente));
		table.addCell(celda);
		
		celda.setPhrase(new Phrase("Cedula",fuente));
		table.addCell(celda);
		
		celda.setPhrase(new Phrase("Direccion",fuente));
		table.addCell(celda);
		
		celda.setPhrase(new Phrase("Edad",fuente));
		table.addCell(celda);
		
		celda.setPhrase(new Phrase("DX Medico",fuente));
		table.addCell(celda);
		
		celda.setPhrase(new Phrase("Fecha Nacimiento",fuente));
		table.addCell(celda);
		
		celda.setPhrase(new Phrase("Relacion Paciente",fuente));
		table.addCell(celda);
		
		celda.setPhrase(new Phrase("Requiere Cuidador",fuente));
		table.addCell(celda);
		
		celda.setPhrase(new Phrase("Nombre Cuidador",fuente));
		table.addCell(celda);
		
		celda.setPhrase(new Phrase("Telefono",fuente));
		table.addCell(celda);
		
		celda.setPhrase(new Phrase("Pais",fuente));
		table.addCell(celda);
	}
	
	private void escribirDatosDeLaTabla(PdfPTable table) {
		for (Pacientes pacientes : listaPacientes) {
			table.addCell(String.valueOf(pacientes.getId()));
			table.addCell(pacientes.getFecha_valoracion().toString());
			table.addCell(pacientes.getNombre());
			table.addCell(pacientes.getApellidos());
			table.addCell(pacientes.getCedula());
			table.addCell(pacientes.getDireccion());
			table.addCell(String.valueOf(pacientes.getEdad()));
			table.addCell(pacientes.getDxMedico());
			table.addCell(pacientes.getFecha_nacimiento().toString());
			table.addCell(pacientes.getRelacion_paciente());
			table.addCell(pacientes.getRequiere_cuidador());
			table.addCell(pacientes.getNombre_Cuidador());
			table.addCell(String.valueOf(pacientes.getTelefono()));
			table.addCell(pacientes.getPais());	
		}
	}
	
	public void exportar(HttpServletResponse response) throws DocumentException, IOException {
		Document documento = new Document(PageSize.LEGAL);
		PdfWriter.getInstance(documento, response.getOutputStream());
		
		documento.open();
		
		Font fuente = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
		fuente.setColor(Color.BLUE);
		fuente.setSize(14);
		
		Paragraph titulo = new Paragraph("Lista de Pacientes", fuente);
		titulo.setAlignment(Paragraph.ALIGN_CENTER);
		documento.add(titulo);
		
		PdfPTable tabla = new PdfPTable(14);
		tabla.setWidthPercentage(100);
		tabla.setSpacingBefore(15);
		tabla.setWidths(new float[] { 2f, 5f, 5f, 5f, 5f, 5f, 4f, 5f, 5f, 5f, 5f, 5f, 5f, 5f});
		tabla.setWidthPercentage(110);
		
		escribirCabeceraDeLaTabla(tabla);
		escribirDatosDeLaTabla(tabla);
		
		documento.add(tabla);
		documento.close();
	}
}
