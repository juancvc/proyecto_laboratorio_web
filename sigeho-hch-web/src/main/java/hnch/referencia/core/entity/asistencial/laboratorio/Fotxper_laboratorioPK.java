package hnch.referencia.core.entity.asistencial.laboratorio;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the EMPRESAH database table.
 * 
 */
@Embeddable
public class Fotxper_laboratorioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;



	@Column(name="CODFOCXP")
	private String codfocpx;

	@Column(name="CODPERSO")
	private String codperso;


	public Fotxper_laboratorioPK() {
	}

	public String getCodfocpx() {
		return this.codfocpx;
	}
	public void setCodfocpx(String codfocpx) {
		this.codfocpx = codfocpx;
	}
	public String getCodperso() {
		return this.codperso;
	}
	public void setCodperso(String codperso) {
		this.codperso = codperso;
	}


	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Fotxper_laboratorioPK)) {
			return false;
		}
		Fotxper_laboratorioPK castOther = (Fotxper_laboratorioPK)other;
		return 
		
			 this.codfocpx.equals(castOther.codfocpx)
			&& this.codperso.equals(castOther.codperso);
			
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;

		hash = hash * prime + this.codfocpx.hashCode();
		hash = hash * prime + this.codperso.hashCode();
	
		
		return hash;
	}
}