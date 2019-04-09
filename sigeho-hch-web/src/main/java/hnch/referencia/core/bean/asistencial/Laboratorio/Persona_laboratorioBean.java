package hnch.referencia.core.bean.asistencial.Laboratorio;
 
import java.util.Date; 
import hnch.referencia.base.bean.BaseBean; 

public class Persona_laboratorioBean extends BaseBean {

	private String apellidoPaterno = ""; // Apellido Paterno
	private String apellidoMaterno = ""; // Apellido Materno
	private String primerNombre = "";
	private String segundoNombre = "";

	private String nombreCompleto = "";
	private String codigoPersonaSigeho = "";
	private String nroPeriodoPersona = "";
	
	private Tabla_referenciaBean sexo;
	private Tabla_referenciaBean nroHijos;
	private Ubigeo_laboratorioBean ubigeoNacimiento;
	private Ubigeo_laboratorioBean ubigeoDireccion;
	private Date fechaNac;
	private Date fechInsc;
	private Tabla_referenciaBean tipoDocumento;
	private String nroDocumento;
	private Tabla_referenciaBean nacionalidad;
	private Tabla_referenciaBean estadoCivil;
	private Tabla_referenciaBean grupoSanguineo;
	private Tabla_referenciaBean factorSanguineo;
	private Tabla_referenciaBean nivelInstrucion;
	private Tabla_referenciaBean ocupacion;
	private Tabla_referenciaBean religion;
	private byte[] foto;
	private String fotoCadena; 
	public String getFotoCadena() {
		return fotoCadena;
	}
	public void setFotoCadena(String fotoCadena) {
		this.fotoCadena = fotoCadena;
	}

	private String RutaFoto;
	private String observacion;
	private String origenDeRegistro;
	/***** VERIFICAR UTILIDADD DE VARIABLE<----- *****/
	private String validacionReniec = "1";
	private Tabla_referenciaBean etnia;
	private String donanteOrg;

	private Boolean swPaciente = false; // 1: Activo, 0:Inactivo;
	private Boolean swEmpleado; // 1: Activo, 0:Inactivo;
	private Boolean swFallecido; // 1: Activo, 0:Inactivo;
	private Boolean swReniec; // 1: Activo, 0:Inactivo;
	private Boolean swFamiliaEmpleado; // 1: Activo, 0:Inactivo;
	private Boolean swEmpleadoCesante; // 1: Activo, 0:Inactivo;
	private Boolean swRN;

	private String telfFijo;
	private String telfCelu;
	private String correo;
	private String edad;
	private String edadCompleta;
	private String fechaNacStr;
	private String direccion;
	private String ultimaFechaDonacion;
	
	private String telefonoNumero; 
	private String codigoErrorReniec; 
	private String origenDatos; 
	
	private String codigoDireccion; 
	private String codigoTelefono; 
	private String codigoCorreo; 
	
	private String tipo;
	
	public String getCodigoDireccion() {
		return codigoDireccion;
	}
	public void setCodigoDireccion(String codigoDireccion) {
		this.codigoDireccion = codigoDireccion;
	}
	public String getCodigoTelefono() {
		return codigoTelefono;
	}
	public void setCodigoTelefono(String codigoTelefono) {
		this.codigoTelefono = codigoTelefono;
	}
	public String getCodigoCorreo() {
		return codigoCorreo;
	}
	public void setCodigoCorreo(String codigoCorreo) {
		this.codigoCorreo = codigoCorreo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getApellidoPaterno() {
		if(apellidoPaterno == null){
			apellidoPaterno = "";
		} 
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		if(apellidoMaterno == null){
			apellidoMaterno = "";
		}
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getPrimerNombre() {
		if(primerNombre == null){
			primerNombre = "";
		} 
		return primerNombre;
	}
	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}
	public String getSegundoNombre() {
		if (segundoNombre == null) {
			segundoNombre = "";
		}
		return segundoNombre;
	}
	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}
	public String getNombreCompleto() { 
			if(!this.getApellidoPaterno().equals("")){
				this.nombreCompleto = 	this.getApellidoPaterno().trim()
						+" "+ this.getApellidoMaterno().trim()
						+" "+ this.getPrimerNombre().trim()
						+" "+ this.getSegundoNombre().trim(); 
			}else{
				nombreCompleto = "";
			} 
		return this.nombreCompleto;
	}
	
	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}
	public Tabla_referenciaBean getSexo() {
		if (sexo == null) {
			sexo = new Tabla_referenciaBean();
		}
		return sexo;
	}
	public void setSexo(Tabla_referenciaBean sexo) {
		this.sexo = sexo;
	}
	public Tabla_referenciaBean getNroHijos() {
		return nroHijos;
	}
	public void setNroHijos(Tabla_referenciaBean nroHijos) {
		this.nroHijos = nroHijos;
	}
	 
	public String getCodigoErrorReniec() {
		return codigoErrorReniec;
	}
	public void setCodigoErrorReniec(String codigoErrorReniec) {
		this.codigoErrorReniec = codigoErrorReniec;
	}
	public Ubigeo_laboratorioBean getUbigeoNacimiento() {
		if (ubigeoNacimiento == null) {
			ubigeoNacimiento =  new Ubigeo_laboratorioBean();
		}
		return ubigeoNacimiento;
	}
	public void setUbigeoNacimiento(Ubigeo_laboratorioBean ubigeoNacimiento) {
		this.ubigeoNacimiento = ubigeoNacimiento;
	}
	public Date getFechaNac() {
		return fechaNac;
	}
	public void setFechaNac(Date fechaNac) {
		this.fechaNac = fechaNac;
	}
	public Date getFechInsc() {
		return fechInsc;
	}
	public void setFechInsc(Date fechInsc) {
		this.fechInsc = fechInsc;
	}
	public Tabla_referenciaBean getTipoDocumento() {
		if (tipoDocumento == null) {
			tipoDocumento = new Tabla_referenciaBean();
		}
		return tipoDocumento;
	}
	public void setTipoDocumento(Tabla_referenciaBean tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNroDocumento() {
		return nroDocumento;
	}
	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	public Tabla_referenciaBean getNacionalidad() {
		if (nacionalidad == null) {
			nacionalidad = new Tabla_referenciaBean();
		}
		return nacionalidad;
	}
	public void setNacionalidad(Tabla_referenciaBean nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public Tabla_referenciaBean getEstadoCivil() {
		if (estadoCivil == null) {
			estadoCivil = new Tabla_referenciaBean();
		}
		return estadoCivil;
	}
	public void setEstadoCivil(Tabla_referenciaBean estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public Tabla_referenciaBean getGrupoSanguineo() {
		return grupoSanguineo;
	}
	public void setGrupoSanguineo(Tabla_referenciaBean grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}
	public Tabla_referenciaBean getFactorSanguineo() {
		return factorSanguineo;
	}
	public void setFactorSanguineo(Tabla_referenciaBean factorSanguineo) {
		this.factorSanguineo = factorSanguineo;
	}
	public Tabla_referenciaBean getNivelInstrucion() {
		if (nivelInstrucion == null) {
			nivelInstrucion = new Tabla_referenciaBean();
		}
		return nivelInstrucion;
	}
	public void setNivelInstrucion(Tabla_referenciaBean nivelInstrucion) {
		this.nivelInstrucion = nivelInstrucion;
	}
	public Tabla_referenciaBean getOcupacion() {
		if (ocupacion == null) {
			ocupacion = new Tabla_referenciaBean();
		}
		return ocupacion;
	}
	public void setOcupacion(Tabla_referenciaBean ocupacion) {
		this.ocupacion = ocupacion;
	}
	public Tabla_referenciaBean getReligion() {
		return religion;
	}
	public void setReligion(Tabla_referenciaBean religion) {
		this.religion = religion;
	}
	public byte[] getFoto() {
		return foto;
	}
	public void setFoto(byte[] foto) {
		this.foto = foto;
	}
	public String getRutaFoto() {
		return RutaFoto;
	}
	public void setRutaFoto(String rutaFoto) {
		RutaFoto = rutaFoto;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public String getOrigenDeRegistro() {
		return origenDeRegistro;
	}
	public void setOrigenDeRegistro(String origenDeRegistro) {
		this.origenDeRegistro = origenDeRegistro;
	}
	public String getValidacionReniec() {
		return validacionReniec;
	}
	public void setValidacionReniec(String validacionReniec) {
		this.validacionReniec = validacionReniec;
	}
	public Tabla_referenciaBean getEtnia() {
		return etnia;
	}
	public void setEtnia(Tabla_referenciaBean etnia) {
		this.etnia = etnia;
	}
	public String getDonanteOrg() {
		return donanteOrg;
	}
	public void setDonanteOrg(String donanteOrg) {
		this.donanteOrg = donanteOrg;
	}
	public Boolean getSwPaciente() {
		return swPaciente;
	}
	public void setSwPaciente(Boolean swPaciente) {
		this.swPaciente = swPaciente;
	}
	public Boolean getSwEmpleado() {
		return swEmpleado;
	}
	public void setSwEmpleado(Boolean swEmpleado) {
		this.swEmpleado = swEmpleado;
	}
	public Boolean getSwFallecido() {
		return swFallecido;
	}
	public void setSwFallecido(Boolean swFallecido) {
		this.swFallecido = swFallecido;
	}
	public Boolean getSwReniec() {
		if (swReniec == null) {
			swReniec = false;
		}
		return swReniec;
	}
	public void setSwReniec(Boolean swReniec) {
		this.swReniec = swReniec;
	}
	public Boolean getSwFamiliaEmpleado() {
		return swFamiliaEmpleado;
	}
	public void setSwFamiliaEmpleado(Boolean swFamiliaEmpleado) {
		this.swFamiliaEmpleado = swFamiliaEmpleado;
	}
	public Boolean getSwEmpleadoCesante() {
		return swEmpleadoCesante;
	}
	public void setSwEmpleadoCesante(Boolean swEmpleadoCesante) {
		this.swEmpleadoCesante = swEmpleadoCesante;
	}
	public Boolean getSwRN() {
		return swRN;
	}
	public void setSwRN(Boolean swRN) {
		this.swRN = swRN;
	}
	public String getTelfFijo() {
		return telfFijo;
	}
	public void setTelfFijo(String telfFijo) {
		this.telfFijo = telfFijo;
	}
	public String getTelfCelu() {
		return telfCelu;
	}
	public void setTelfCelu(String telfCelu) {
		this.telfCelu = telfCelu;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
 
	public String getCodigoPersonaSigeho() {
		return codigoPersonaSigeho;
	}
	public void setCodigoPersonaSigeho(String codigoPersonaSigeho) {
		this.codigoPersonaSigeho = codigoPersonaSigeho;
	}
	public String getNroPeriodoPersona() {
		return nroPeriodoPersona;
	}
	public void setNroPeriodoPersona(String nroPeriodoPersona) {
		this.nroPeriodoPersona = nroPeriodoPersona;
	}
	public String getFechaNacStr() {
		return fechaNacStr;
	}
	public void setFechaNacStr(String fechaNacStr) {
		this.fechaNacStr = fechaNacStr;
	}
	
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getEdadCompleta() {
		return edadCompleta;
	}
	public void setEdadCompleta(String edadCompleta) {
		this.edadCompleta = edadCompleta;
	}
	public Ubigeo_laboratorioBean getUbigeoDireccion() {
		if (ubigeoDireccion == null) {
			ubigeoDireccion = new Ubigeo_laboratorioBean();
		}
		return ubigeoDireccion;
	}
	public void setUbigeoDireccion(Ubigeo_laboratorioBean ubigeoDireccion) {
		this.ubigeoDireccion = ubigeoDireccion;
	}
	public String getUltimaFechaDonacion() {
		return ultimaFechaDonacion;
	}
	public void setUltimaFechaDonacion(String ultimaFechaDonacion) {
		this.ultimaFechaDonacion = ultimaFechaDonacion;
	}
	public String getTelefonoNumero() {
		return telefonoNumero;
	}
	public void setTelefonoNumero(String telefonoNumero) {
		this.telefonoNumero = telefonoNumero;
	}
	public String getOrigenDatos() {
		return origenDatos;
	}
	public void setOrigenDatos(String origenDatos) {
		this.origenDatos = origenDatos;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
 
}
