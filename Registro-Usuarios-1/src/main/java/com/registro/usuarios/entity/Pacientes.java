package com.registro.usuarios.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.lang.NonNull;

@Entity
@Table
public class Pacientes implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4375458895489437554L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_valoracion", nullable = false)
	private Date fecha_valoracion;
	
	@NotEmpty
	private String cedula;
	
	@NotEmpty
	private String nombre;
	
	@NotEmpty
	private String apellidos;
	
	@NotEmpty
	private String direccion;
	
	@NotNull
	private long edad;
	
	@NotEmpty
	private String dxMedico;
	
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name = "fecha_nacimiento", nullable = false)
	private Date fecha_nacimiento;
	
	@NotEmpty
	private String requiere_cuidador;
	
	
	private String nombre_Cuidador;
	
	
	private String relacion_paciente;
	
	@NotNull
	private long telefono;
	
	@NotEmpty
	private String pais;

	/**
	 Estado de salud
	 */
	@NotEmpty
	private String tiempoEnfermo;
	
	@NotEmpty
	private String cambioEnfermedad;
	
	@NotEmpty
	private String conocimientoEstadoSalud;
	
	/**
	 Orientacion Sociocultural
	 */
	
	@NotEmpty
	private String nivelEducacion;
	
	@NotEmpty
	private String medidasAlternativas;
	
	@NotEmpty
	private String religion;
	
	/**
	 Factores del sistema familiar
	 */
	
	@NotEmpty
	private String conQuienVive;
	
	@NotEmpty
	private String relacionesFamiliares;
	
	@NotEmpty
	private String tipoFamilia;
	
	/**
	 Patron de vida
	 */
	
	@NotEmpty
	private String ocupacionActual;
	
	@NotEmpty
	private String ocupacionAnterior;

	@NotEmpty
	private String actividadesDiarias;
	
	/**
	 Factores Ambientales
	 */
	
	@NotEmpty
	private String comunaCorregimiento;
	
	@NotEmpty
	private String relacionComuna;
	
	@NotEmpty
	private String contaminacionAmbiental;
	
	@NotEmpty
	private String viasAcceso;
	
	@NotEmpty
	private String servicioTransporte;
	
	@NotEmpty
	private String zonasVerdes;
	
	@NotEmpty
	private String zonasPublicas;
	
	@NotEmpty
	private String barrerasArquitectonicas;
	
	/**
	 Recursos disponibles y adecuados
	 */
	
	@NotEmpty
	private String eps;
	
	@NotEmpty
	private String estrato;
	
	@NotEmpty
	private String fuenteIngresos;
	
	@NotEmpty
	private String ingresosEconomicos;
	
	/**
	 Requisitos de desarrollo
	 */
	
	@NotEmpty
	private String efectosNegativos;
	
	@NotEmpty
	private String requisitosVitales;
	
	/**
	 Requisitos de autocuidado en la desviacion de la salud
	 */
	
	@NotEmpty
	private String controlesMedicos;
	
	@NotEmpty
	private String efectosEnfermedad;
	
	@NotEmpty
	private String tratamientoFarmacologico;
	
	@NotEmpty
	private String recibioInformacion;
	
	@NotEmpty
	private String efectosIndeseados;
	
	@NotEmpty
	private String enfermedadEstiloVida;
	
	@NotEmpty
	private String autoconcepto;
	
	@NotEmpty
	private String recibeApoyo;
	
	@NotEmpty
	private String aprendidoVivir;
	
	/**
	 Valoracion
	 */
	
	@NotEmpty
	private String requisitoAutocuidado;
	
	@NotEmpty
	private String metaAutocuidado;
	
	/**
	 Diagnostico de enfermeria (nanda)
	 */
	
	@NotEmpty
	private String diagnosticoNANDA;
	
	/**
	 Intervenciones (NIC)
	 */
	
	@NotEmpty
	private String intervencionesEnfermeria;
	
	@NotEmpty
	private String abiertoActividades;
	
	/**
	Resultados esperados (NOC)
	 */
	
	@NotEmpty
	private String diagnosticoNOC;
	
	@NotEmpty
	private String abiertoIndicadores;
	
	@NotEmpty
	private String escalaValoracion;
	
	@NotEmpty
	private String puntuacionInicial;
	
	@NotEmpty
	private String puntuacionDeseada;
	
	@NotEmpty
	private String puntuacionFinal;
	
	/**
	Evaluacion
	 */
	@NotEmpty
	private String Evaluacion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha_valoracion() {
		return fecha_valoracion;
	}

	public void setFecha_valoracion(Date fecha_valoracion) {
		this.fecha_valoracion = fecha_valoracion;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public long getEdad() {
		return edad;
	}

	public void setEdad(long edad) {
		this.edad = edad;
	}

	public String getDxMedico() {
		return dxMedico;
	}

	public void setDxMedico(String dxMedico) {
		this.dxMedico = dxMedico;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getRequiere_cuidador() {
		return requiere_cuidador;
	}

	public void setRequiere_cuidador(String requiere_cuidador) {
		this.requiere_cuidador = requiere_cuidador;
	}

	public String getNombre_Cuidador() {
		return nombre_Cuidador;
	}

	public void setNombre_Cuidador(String nombre_Cuidador) {
		this.nombre_Cuidador = nombre_Cuidador;
	}

	public String getRelacion_paciente() {
		return relacion_paciente;
	}

	public void setRelacion_paciente(String relacion_paciente) {
		this.relacion_paciente = relacion_paciente;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getTiempoEnfermo() {
		return tiempoEnfermo;
	}

	public void setTiempoEnfermo(String tiempoEnfermo) {
		this.tiempoEnfermo = tiempoEnfermo;
	}

	public String getCambioEnfermedad() {
		return cambioEnfermedad;
	}

	public void setCambioEnfermedad(String cambioEnfermedad) {
		this.cambioEnfermedad = cambioEnfermedad;
	}

	public String getConocimientoEstadoSalud() {
		return conocimientoEstadoSalud;
	}

	public void setConocimientoEstadoSalud(String conocimientoEstadoSalud) {
		this.conocimientoEstadoSalud = conocimientoEstadoSalud;
	}

	public String getNivelEducacion() {
		return nivelEducacion;
	}

	public void setNivelEducacion(String nivelEducacion) {
		this.nivelEducacion = nivelEducacion;
	}

	public String getMedidasAlternativas() {
		return medidasAlternativas;
	}

	public void setMedidasAlternativas(String medidasAlternativas) {
		this.medidasAlternativas = medidasAlternativas;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getConQuienVive() {
		return conQuienVive;
	}

	public void setConQuienVive(String conQuienVive) {
		this.conQuienVive = conQuienVive;
	}

	public String getRelacionesFamiliares() {
		return relacionesFamiliares;
	}

	public void setRelacionesFamiliares(String relacionesFamiliares) {
		this.relacionesFamiliares = relacionesFamiliares;
	}

	public String getTipoFamilia() {
		return tipoFamilia;
	}

	public void setTipoFamilia(String tipoFamilia) {
		this.tipoFamilia = tipoFamilia;
	}

	public String getOcupacionActual() {
		return ocupacionActual;
	}

	public void setOcupacionActual(String ocupacionActual) {
		this.ocupacionActual = ocupacionActual;
	}

	public String getOcupacionAnterior() {
		return ocupacionAnterior;
	}

	public void setOcupacionAnterior(String ocupacionAnterior) {
		this.ocupacionAnterior = ocupacionAnterior;
	}

	public String getActividadesDiarias() {
		return actividadesDiarias;
	}

	public void setActividadesDiarias(String actividadesDiarias) {
		this.actividadesDiarias = actividadesDiarias;
	}

	public String getComunaCorregimiento() {
		return comunaCorregimiento;
	}

	public void setComunaCorregimiento(String comunaCorregimiento) {
		this.comunaCorregimiento = comunaCorregimiento;
	}

	public String getRelacionComuna() {
		return relacionComuna;
	}

	public void setRelacionComuna(String relacionComuna) {
		this.relacionComuna = relacionComuna;
	}

	public String getContaminacionAmbiental() {
		return contaminacionAmbiental;
	}

	public void setContaminacionAmbiental(String contaminacionAmbiental) {
		this.contaminacionAmbiental = contaminacionAmbiental;
	}

	public String getViasAcceso() {
		return viasAcceso;
	}

	public void setViasAcceso(String viasAcceso) {
		this.viasAcceso = viasAcceso;
	}

	public String getServicioTransporte() {
		return servicioTransporte;
	}

	public void setServicioTransporte(String servicioTransporte) {
		this.servicioTransporte = servicioTransporte;
	}

	public String getZonasVerdes() {
		return zonasVerdes;
	}

	public void setZonasVerdes(String zonasVerdes) {
		this.zonasVerdes = zonasVerdes;
	}

	public String getZonasPublicas() {
		return zonasPublicas;
	}

	public void setZonasPublicas(String zonasPublicas) {
		this.zonasPublicas = zonasPublicas;
	}

	public String getBarrerasArquitectonicas() {
		return barrerasArquitectonicas;
	}

	public void setBarrerasArquitectonicas(String barrerasArquitectonicas) {
		this.barrerasArquitectonicas = barrerasArquitectonicas;
	}

	public String getEps() {
		return eps;
	}

	public void setEps(String eps) {
		this.eps = eps;
	}

	public String getEstrato() {
		return estrato;
	}

	public void setEstrato(String estrato) {
		this.estrato = estrato;
	}

	public String getIngresosEconomicos() {
		return ingresosEconomicos;
	}

	public void setIngresosEconomicos(String ingresosEconomicos) {
		this.ingresosEconomicos = ingresosEconomicos;
	}

	public String getEfectosNegativos() {
		return efectosNegativos;
	}

	public void setEfectosNegativos(String efectosNegativos) {
		this.efectosNegativos = efectosNegativos;
	}

	public String getRequisitosVitales() {
		return requisitosVitales;
	}

	public void setRequisitosVitales(String requisitosVitales) {
		this.requisitosVitales = requisitosVitales;
	}

	public String getControlesMedicos() {
		return controlesMedicos;
	}

	public void setControlesMedicos(String controlesMedicos) {
		this.controlesMedicos = controlesMedicos;
	}

	public String getEfectosEnfermedad() {
		return efectosEnfermedad;
	}

	public void setEfectosEnfermedad(String efectosEnfermedad) {
		this.efectosEnfermedad = efectosEnfermedad;
	}

	public String getTratamientoFarmacologico() {
		return tratamientoFarmacologico;
	}

	public void setTratamientoFarmacologico(String tratamientoFarmacologico) {
		this.tratamientoFarmacologico = tratamientoFarmacologico;
	}

	public String getRecibioInformacion() {
		return recibioInformacion;
	}

	public void setRecibioInformacion(String recibioInformacion) {
		this.recibioInformacion = recibioInformacion;
	}

	public String getEfectosIndeseados() {
		return efectosIndeseados;
	}

	public void setEfectosIndeseados(String efectosIndeseados) {
		this.efectosIndeseados = efectosIndeseados;
	}

	public String getEnfermedadEstiloVida() {
		return enfermedadEstiloVida;
	}

	public void setEnfermedadEstiloVida(String enfermedadEstiloVida) {
		this.enfermedadEstiloVida = enfermedadEstiloVida;
	}

	public String getAutoconcepto() {
		return autoconcepto;
	}

	public void setAutoconcepto(String autoconcepto) {
		this.autoconcepto = autoconcepto;
	}

	public String getRecibeApoyo() {
		return recibeApoyo;
	}

	public void setRecibeApoyo(String recibeApoyo) {
		this.recibeApoyo = recibeApoyo;
	}

	public String getAprendidoVivir() {
		return aprendidoVivir;
	}

	public void setAprendidoVivir(String aprendidoVivir) {
		this.aprendidoVivir = aprendidoVivir;
	}

	public String getRequisitoAutocuidado() {
		return requisitoAutocuidado;
	}

	public void setRequisitoAutocuidado(String requisitoAutocuidado) {
		this.requisitoAutocuidado = requisitoAutocuidado;
	}

	public String getMetaAutocuidado() {
		return metaAutocuidado;
	}

	public void setMetaAutocuidado(String metaAutocuidado) {
		this.metaAutocuidado = metaAutocuidado;
	}

	public String getDiagnosticoNANDA() {
		return diagnosticoNANDA;
	}

	public void setDiagnosticoNANDA(String diagnosticoNANDA) {
		this.diagnosticoNANDA = diagnosticoNANDA;
	}

	public String getIntervencionesEnfermeria() {
		return intervencionesEnfermeria;
	}

	public void setIntervencionesEnfermeria(String intervencionesEnfermeria) {
		this.intervencionesEnfermeria = intervencionesEnfermeria;
	}

	public String getAbiertoActividades() {
		return abiertoActividades;
	}

	public void setAbiertoActividades(String abiertoActividades) {
		this.abiertoActividades = abiertoActividades;
	}

	public String getDiagnosticoNOC() {
		return diagnosticoNOC;
	}

	public void setDiagnosticoNOC(String diagnosticoNOC) {
		this.diagnosticoNOC = diagnosticoNOC;
	}

	public String getAbiertoIndicadores() {
		return abiertoIndicadores;
	}

	public void setAbiertoIndicadores(String abiertoIndicadores) {
		this.abiertoIndicadores = abiertoIndicadores;
	}

	public String getEscalaValoracion() {
		return escalaValoracion;
	}

	public void setEscalaValoracion(String escalaValoracion) {
		this.escalaValoracion = escalaValoracion;
	}

	public String getPuntuacionInicial() {
		return puntuacionInicial;
	}

	public void setPuntuacionInicial(String puntuacionInicial) {
		this.puntuacionInicial = puntuacionInicial;
	}

	public String getPuntuacionDeseada() {
		return puntuacionDeseada;
	}

	public void setPuntuacionDeseada(String puntuacionDeseada) {
		this.puntuacionDeseada = puntuacionDeseada;
	}

	public String getPuntuacionFinal() {
		return puntuacionFinal;
	}

	public void setPuntuacionFinal(String puntuacionFinal) {
		this.puntuacionFinal = puntuacionFinal;
	}

	public String getEvaluacion() {
		return Evaluacion;
	}

	public void setEvaluacion(String evaluacion) {
		Evaluacion = evaluacion;
	}

	public String getFuenteIngresos() {
		return fuenteIngresos;
	}

	public void setFuenteIngresos(String fuenteIngresos) {
		this.fuenteIngresos = fuenteIngresos;
	}

	public Pacientes(int id, Date fecha_valoracion, @NotEmpty String cedula, @NotEmpty String nombre,
			@NotEmpty String apellidos, @NotEmpty String direccion, @NotNull long edad, @NotEmpty String dxMedico,
			Date fecha_nacimiento, @NotEmpty String requiere_cuidador, String nombre_Cuidador,
			String relacion_paciente, long telefono, @NotEmpty String pais, @NotEmpty String tiempoEnfermo,
			@NotEmpty String cambioEnfermedad, @NotEmpty String conocimientoEstadoSalud,
			@NotEmpty String nivelEducacion, @NotEmpty String medidasAlternativas, @NotEmpty String religion,
			@NotEmpty String conQuienVive, @NotEmpty String relacionesFamiliares, @NotEmpty String tipoFamilia,
			@NotEmpty String ocupacionActual, @NotEmpty String ocupacionAnterior, @NotEmpty String actividadesDiarias,
			@NotEmpty String comunaCorregimiento, @NotEmpty String relacionComuna,
			@NotEmpty String contaminacionAmbiental, @NotEmpty String viasAcceso, @NotEmpty String servicioTransporte,
			@NotEmpty String zonasVerdes, @NotEmpty String zonasPublicas, @NotEmpty String barrerasArquitectonicas,
			@NotEmpty String eps, @NotEmpty String estrato, @NotEmpty String fuenteIngresos,
			@NotEmpty String ingresosEconomicos, @NotEmpty String efectosNegativos, @NotEmpty String requisitosVitales,
			@NotEmpty String controlesMedicos, @NotEmpty String efectosEnfermedad,
			@NotEmpty String tratamientoFarmacologico, @NotEmpty String recibioInformacion,
			@NotEmpty String efectosIndeseados, @NotEmpty String enfermedadEstiloVida, @NotEmpty String autoconcepto,
			@NotEmpty String recibeApoyo, @NotEmpty String aprendidoVivir, @NotEmpty String requisitoAutocuidado,
			@NotEmpty String metaAutocuidado, @NotEmpty String diagnosticoNANDA,
			@NotEmpty String intervencionesEnfermeria, @NotEmpty String abiertoActividades,
			@NotEmpty String diagnosticoNOC, @NotEmpty String abiertoIndicadores, @NotEmpty String escalaValoracion,
			@NotEmpty String puntuacionInicial, @NotEmpty String puntuacionDeseada, @NotEmpty String puntuacionFinal,
			@NotEmpty String evaluacion) {
		super();
		this.id = id;
		this.fecha_valoracion = fecha_valoracion;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.edad = edad;
		this.dxMedico = dxMedico;
		this.fecha_nacimiento = fecha_nacimiento;
		this.requiere_cuidador = requiere_cuidador;
		this.nombre_Cuidador = nombre_Cuidador;
		this.relacion_paciente = relacion_paciente;
		this.telefono = telefono;
		this.pais = pais;
		this.tiempoEnfermo = tiempoEnfermo;
		this.cambioEnfermedad = cambioEnfermedad;
		this.conocimientoEstadoSalud = conocimientoEstadoSalud;
		this.nivelEducacion = nivelEducacion;
		this.medidasAlternativas = medidasAlternativas;
		this.religion = religion;
		this.conQuienVive = conQuienVive;
		this.relacionesFamiliares = relacionesFamiliares;
		this.tipoFamilia = tipoFamilia;
		this.ocupacionActual = ocupacionActual;
		this.ocupacionAnterior = ocupacionAnterior;
		this.actividadesDiarias = actividadesDiarias;
		this.comunaCorregimiento = comunaCorregimiento;
		this.relacionComuna = relacionComuna;
		this.contaminacionAmbiental = contaminacionAmbiental;
		this.viasAcceso = viasAcceso;
		this.servicioTransporte = servicioTransporte;
		this.zonasVerdes = zonasVerdes;
		this.zonasPublicas = zonasPublicas;
		this.barrerasArquitectonicas = barrerasArquitectonicas;
		this.eps = eps;
		this.estrato = estrato;
		this.fuenteIngresos = fuenteIngresos;
		this.ingresosEconomicos = ingresosEconomicos;
		this.efectosNegativos = efectosNegativos;
		this.requisitosVitales = requisitosVitales;
		this.controlesMedicos = controlesMedicos;
		this.efectosEnfermedad = efectosEnfermedad;
		this.tratamientoFarmacologico = tratamientoFarmacologico;
		this.recibioInformacion = recibioInformacion;
		this.efectosIndeseados = efectosIndeseados;
		this.enfermedadEstiloVida = enfermedadEstiloVida;
		this.autoconcepto = autoconcepto;
		this.recibeApoyo = recibeApoyo;
		this.aprendidoVivir = aprendidoVivir;
		this.requisitoAutocuidado = requisitoAutocuidado;
		this.metaAutocuidado = metaAutocuidado;
		this.diagnosticoNANDA = diagnosticoNANDA;
		this.intervencionesEnfermeria = intervencionesEnfermeria;
		this.abiertoActividades = abiertoActividades;
		this.diagnosticoNOC = diagnosticoNOC;
		this.abiertoIndicadores = abiertoIndicadores;
		this.escalaValoracion = escalaValoracion;
		this.puntuacionInicial = puntuacionInicial;
		this.puntuacionDeseada = puntuacionDeseada;
		this.puntuacionFinal = puntuacionFinal;
		Evaluacion = evaluacion;
	}

	public Pacientes(Date fecha_valoracion, @NotEmpty String cedula, @NotEmpty String nombre,
			@NotEmpty String apellidos, @NotEmpty String direccion, @NotNull long edad, @NotEmpty String dxMedico,
			Date fecha_nacimiento, @NotEmpty String requiere_cuidador, String nombre_Cuidador,
			String relacion_paciente, long telefono, @NotEmpty String pais, @NotEmpty String tiempoEnfermo,
			@NotEmpty String cambioEnfermedad, @NotEmpty String conocimientoEstadoSalud,
			@NotEmpty String nivelEducacion, @NotEmpty String medidasAlternativas, @NotEmpty String religion,
			@NotEmpty String conQuienVive, @NotEmpty String relacionesFamiliares, @NotEmpty String tipoFamilia,
			@NotEmpty String ocupacionActual, @NotEmpty String ocupacionAnterior, @NotEmpty String actividadesDiarias,
			@NotEmpty String comunaCorregimiento, @NotEmpty String relacionComuna,
			@NotEmpty String contaminacionAmbiental, @NotEmpty String viasAcceso, @NotEmpty String servicioTransporte,
			@NotEmpty String zonasVerdes, @NotEmpty String zonasPublicas, @NotEmpty String barrerasArquitectonicas,
			@NotEmpty String eps, @NotEmpty String estrato, @NotEmpty String fuenteIngresos,
			@NotEmpty String ingresosEconomicos, @NotEmpty String efectosNegativos, @NotEmpty String requisitosVitales,
			@NotEmpty String controlesMedicos, @NotEmpty String efectosEnfermedad,
			@NotEmpty String tratamientoFarmacologico, @NotEmpty String recibioInformacion,
			@NotEmpty String efectosIndeseados, @NotEmpty String enfermedadEstiloVida, @NotEmpty String autoconcepto,
			@NotEmpty String recibeApoyo, @NotEmpty String aprendidoVivir, @NotEmpty String requisitoAutocuidado,
			@NotEmpty String metaAutocuidado, @NotEmpty String diagnosticoNANDA,
			@NotEmpty String intervencionesEnfermeria, @NotEmpty String abiertoActividades,
			@NotEmpty String diagnosticoNOC, @NotEmpty String abiertoIndicadores, @NotEmpty String escalaValoracion,
			@NotEmpty String puntuacionInicial, @NotEmpty String puntuacionDeseada, @NotEmpty String puntuacionFinal,
			@NotEmpty String evaluacion) {
		super();
		this.fecha_valoracion = fecha_valoracion;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.direccion = direccion;
		this.edad = edad;
		this.dxMedico = dxMedico;
		this.fecha_nacimiento = fecha_nacimiento;
		this.requiere_cuidador = requiere_cuidador;
		this.nombre_Cuidador = nombre_Cuidador;
		this.relacion_paciente = relacion_paciente;
		this.telefono = telefono;
		this.pais = pais;
		this.tiempoEnfermo = tiempoEnfermo;
		this.cambioEnfermedad = cambioEnfermedad;
		this.conocimientoEstadoSalud = conocimientoEstadoSalud;
		this.nivelEducacion = nivelEducacion;
		this.medidasAlternativas = medidasAlternativas;
		this.religion = religion;
		this.conQuienVive = conQuienVive;
		this.relacionesFamiliares = relacionesFamiliares;
		this.tipoFamilia = tipoFamilia;
		this.ocupacionActual = ocupacionActual;
		this.ocupacionAnterior = ocupacionAnterior;
		this.actividadesDiarias = actividadesDiarias;
		this.comunaCorregimiento = comunaCorregimiento;
		this.relacionComuna = relacionComuna;
		this.contaminacionAmbiental = contaminacionAmbiental;
		this.viasAcceso = viasAcceso;
		this.servicioTransporte = servicioTransporte;
		this.zonasVerdes = zonasVerdes;
		this.zonasPublicas = zonasPublicas;
		this.barrerasArquitectonicas = barrerasArquitectonicas;
		this.eps = eps;
		this.estrato = estrato;
		this.fuenteIngresos = fuenteIngresos;
		this.ingresosEconomicos = ingresosEconomicos;
		this.efectosNegativos = efectosNegativos;
		this.requisitosVitales = requisitosVitales;
		this.controlesMedicos = controlesMedicos;
		this.efectosEnfermedad = efectosEnfermedad;
		this.tratamientoFarmacologico = tratamientoFarmacologico;
		this.recibioInformacion = recibioInformacion;
		this.efectosIndeseados = efectosIndeseados;
		this.enfermedadEstiloVida = enfermedadEstiloVida;
		this.autoconcepto = autoconcepto;
		this.recibeApoyo = recibeApoyo;
		this.aprendidoVivir = aprendidoVivir;
		this.requisitoAutocuidado = requisitoAutocuidado;
		this.metaAutocuidado = metaAutocuidado;
		this.diagnosticoNANDA = diagnosticoNANDA;
		this.intervencionesEnfermeria = intervencionesEnfermeria;
		this.abiertoActividades = abiertoActividades;
		this.diagnosticoNOC = diagnosticoNOC;
		this.abiertoIndicadores = abiertoIndicadores;
		this.escalaValoracion = escalaValoracion;
		this.puntuacionInicial = puntuacionInicial;
		this.puntuacionDeseada = puntuacionDeseada;
		this.puntuacionFinal = puntuacionFinal;
		Evaluacion = evaluacion;
	}

	public Pacientes(int id) {
		super();
		this.id = id;
	}

	public Pacientes() {
		super();
	}

}
