package hnch.referencia.core.bean.general.antecedentes;


import hnch.referencia.base.bean.BaseBean;
import hnch.referencia.core.bean.general.PacienteBean;
import hnch.referencia.core.bean.general.TablaBean;


public class AntecedentesAdiccionBean extends BaseBean{
	private String codAdiccion;
	private String nombAdiccion;
	private TablaBean adiccion;
	private PacienteBean paciente;
	
	public AntecedentesAdiccionBean(){
		super();
	}

	public String getCodAdiccion() {
		return codAdiccion;
	}

	public void setCodAdiccion(String codAdiccion) {
		this.codAdiccion = codAdiccion;
	}

	public String getNombAdiccion() {
		return nombAdiccion;
	}

	public void setNombAdiccion(String nombAdiccion) {
		this.nombAdiccion = nombAdiccion;
	}

	public PacienteBean getPaciente() {
		return paciente;
	}

	public void setPaciente(PacienteBean paciente) {
		this.paciente = paciente;
	}

	public TablaBean getAdiccion() {
		return adiccion;
	}

	public void setAdiccion(TablaBean adiccion) {
		this.adiccion = adiccion;
	}
	
	
}
