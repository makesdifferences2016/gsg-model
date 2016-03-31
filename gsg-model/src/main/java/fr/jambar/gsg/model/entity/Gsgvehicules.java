package fr.jambar.gsg.model.entity;

// Generated 28 mars 2016 15:16:45 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Gsgvehicules generated by hbm2java
 */
public class Gsgvehicules implements java.io.Serializable {

	private GsgvehiculesId id;
	private Long idGenre;
	private Long idType;
	private Long idMaque;
	private String matricule;
	private Date datePmc;
	private Long puissance;
	private String energie;
	private String couleur;
	private String plaqueOvale;
	private Date dateCertif;
	private Date dateCont;
	private Date dateNg;

	public Gsgvehicules() {
	}

	public Gsgvehicules(GsgvehiculesId id) {
		this.id = id;
	}

	public Gsgvehicules(GsgvehiculesId id, Long idGenre, Long idType,
			Long idMaque, String matricule, Date datePmc, Long puissance,
			String energie, String couleur, String plaqueOvale,
			Date dateCertif, Date dateCont, Date dateNg) {
		this.id = id;
		this.idGenre = idGenre;
		this.idType = idType;
		this.idMaque = idMaque;
		this.matricule = matricule;
		this.datePmc = datePmc;
		this.puissance = puissance;
		this.energie = energie;
		this.couleur = couleur;
		this.plaqueOvale = plaqueOvale;
		this.dateCertif = dateCertif;
		this.dateCont = dateCont;
		this.dateNg = dateNg;
	}

	public GsgvehiculesId getId() {
		return this.id;
	}

	public void setId(GsgvehiculesId id) {
		this.id = id;
	}

	public Long getIdGenre() {
		return this.idGenre;
	}

	public void setIdGenre(Long idGenre) {
		this.idGenre = idGenre;
	}

	public Long getIdType() {
		return this.idType;
	}

	public void setIdType(Long idType) {
		this.idType = idType;
	}

	public Long getIdMaque() {
		return this.idMaque;
	}

	public void setIdMaque(Long idMaque) {
		this.idMaque = idMaque;
	}

	public String getMatricule() {
		return this.matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public Date getDatePmc() {
		return this.datePmc;
	}

	public void setDatePmc(Date datePmc) {
		this.datePmc = datePmc;
	}

	public Long getPuissance() {
		return this.puissance;
	}

	public void setPuissance(Long puissance) {
		this.puissance = puissance;
	}

	public String getEnergie() {
		return this.energie;
	}

	public void setEnergie(String energie) {
		this.energie = energie;
	}

	public String getCouleur() {
		return this.couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getPlaqueOvale() {
		return this.plaqueOvale;
	}

	public void setPlaqueOvale(String plaqueOvale) {
		this.plaqueOvale = plaqueOvale;
	}

	public Date getDateCertif() {
		return this.dateCertif;
	}

	public void setDateCertif(Date dateCertif) {
		this.dateCertif = dateCertif;
	}

	public Date getDateCont() {
		return this.dateCont;
	}

	public void setDateCont(Date dateCont) {
		this.dateCont = dateCont;
	}

	public Date getDateNg() {
		return this.dateNg;
	}

	public void setDateNg(Date dateNg) {
		this.dateNg = dateNg;
	}

}
