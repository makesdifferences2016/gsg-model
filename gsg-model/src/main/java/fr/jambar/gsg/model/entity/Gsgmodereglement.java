package fr.jambar.gsg.model.entity;

// Generated 28 mars 2016 15:16:45 by Hibernate Tools 3.4.0.CR1

/**
 * Gsgmodereglement generated by hbm2java
 */
public class Gsgmodereglement implements java.io.Serializable {

	private int idMr;
	private String code;
	private String libelle;

	public Gsgmodereglement() {
	}

	public Gsgmodereglement(int idMr) {
		this.idMr = idMr;
	}

	public Gsgmodereglement(int idMr, String code, String libelle) {
		this.idMr = idMr;
		this.code = code;
		this.libelle = libelle;
	}

	public int getIdMr() {
		return this.idMr;
	}

	public void setIdMr(int idMr) {
		this.idMr = idMr;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

}
