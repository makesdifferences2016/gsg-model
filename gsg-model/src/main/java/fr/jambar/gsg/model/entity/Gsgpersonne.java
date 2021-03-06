package fr.jambar.gsg.model.entity;

// Generated 28 mars 2016 15:16:45 by Hibernate Tools 3.4.0.CR1

/**
 * Gsgpersonne generated by hbm2java
 */
public class Gsgpersonne implements java.io.Serializable {

	private long idPerson;
	private String adresse;
	private String codep;
	private String tel;
	private String fax;
	private String mail;
	private String site;

	public Gsgpersonne() {
	}

	public Gsgpersonne(long idPerson) {
		this.idPerson = idPerson;
	}

	public Gsgpersonne(long idPerson, String adresse, String codep, String tel,
			String fax, String mail, String site) {
		this.idPerson = idPerson;
		this.adresse = adresse;
		this.codep = codep;
		this.tel = tel;
		this.fax = fax;
		this.mail = mail;
		this.site = site;
	}

	public long getIdPerson() {
		return this.idPerson;
	}

	public void setIdPerson(long idPerson) {
		this.idPerson = idPerson;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodep() {
		return this.codep;
	}

	public void setCodep(String codep) {
		this.codep = codep;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getSite() {
		return this.site;
	}

	public void setSite(String site) {
		this.site = site;
	}

}
