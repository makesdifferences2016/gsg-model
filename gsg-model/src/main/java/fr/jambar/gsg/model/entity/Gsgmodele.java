package fr.jambar.gsg.model.entity;

// Generated 28 mars 2016 15:16:45 by Hibernate Tools 3.4.0.CR1

/**
 * Gsgmodele generated by hbm2java
 */
public class Gsgmodele implements java.io.Serializable {

	private long idModel;
	private Long idMaque;
	private String code;
	private String libelle;

	public Gsgmodele() {
	}

	public Gsgmodele(long idModel) {
		this.idModel = idModel;
	}

	public Gsgmodele(long idModel, Long idMaque, String code, String libelle) {
		this.idModel = idModel;
		this.idMaque = idMaque;
		this.code = code;
		this.libelle = libelle;
	}

	public long getIdModel() {
		return this.idModel;
	}

	public void setIdModel(long idModel) {
		this.idModel = idModel;
	}

	public Long getIdMaque() {
		return this.idMaque;
	}

	public void setIdMaque(Long idMaque) {
		this.idMaque = idMaque;
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
