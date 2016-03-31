package fr.jambar.gsg.model.entity;

// Generated 28 mars 2016 15:16:45 by Hibernate Tools 3.4.0.CR1

/**
 * Gsgproduits generated by hbm2java
 */
public class Gsgproduits implements java.io.Serializable {

	private long idProd;
	private Long idCat;
	private String code;
	private String libelle;
	private Long pu;
	private Long typeTva;
	private Long coefVente;
	private Integer stockActuel;
	private Integer seuilAlerte;

	public Gsgproduits() {
	}

	public Gsgproduits(long idProd) {
		this.idProd = idProd;
	}

	public Gsgproduits(long idProd, Long idCat, String code, String libelle,
			Long pu, Long typeTva, Long coefVente, Integer stockActuel,
			Integer seuilAlerte) {
		this.idProd = idProd;
		this.idCat = idCat;
		this.code = code;
		this.libelle = libelle;
		this.pu = pu;
		this.typeTva = typeTva;
		this.coefVente = coefVente;
		this.stockActuel = stockActuel;
		this.seuilAlerte = seuilAlerte;
	}

	public long getIdProd() {
		return this.idProd;
	}

	public void setIdProd(long idProd) {
		this.idProd = idProd;
	}

	public Long getIdCat() {
		return this.idCat;
	}

	public void setIdCat(Long idCat) {
		this.idCat = idCat;
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

	public Long getPu() {
		return this.pu;
	}

	public void setPu(Long pu) {
		this.pu = pu;
	}

	public Long getTypeTva() {
		return this.typeTva;
	}

	public void setTypeTva(Long typeTva) {
		this.typeTva = typeTva;
	}

	public Long getCoefVente() {
		return this.coefVente;
	}

	public void setCoefVente(Long coefVente) {
		this.coefVente = coefVente;
	}

	public Integer getStockActuel() {
		return this.stockActuel;
	}

	public void setStockActuel(Integer stockActuel) {
		this.stockActuel = stockActuel;
	}

	public Integer getSeuilAlerte() {
		return this.seuilAlerte;
	}

	public void setSeuilAlerte(Integer seuilAlerte) {
		this.seuilAlerte = seuilAlerte;
	}

}
