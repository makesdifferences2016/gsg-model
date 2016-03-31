package fr.jambar.gsg.model.entity;

// Generated 28 mars 2016 15:16:45 by Hibernate Tools 3.4.0.CR1

/**
 * GsgpersonnemoraleId generated by hbm2java
 */
public class GsgpersonnemoraleId implements java.io.Serializable {

	private long idPerson;
	private int idPm;

	public GsgpersonnemoraleId() {
	}

	public GsgpersonnemoraleId(long idPerson, int idPm) {
		this.idPerson = idPerson;
		this.idPm = idPm;
	}

	public long getIdPerson() {
		return this.idPerson;
	}

	public void setIdPerson(long idPerson) {
		this.idPerson = idPerson;
	}

	public int getIdPm() {
		return this.idPm;
	}

	public void setIdPm(int idPm) {
		this.idPm = idPm;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GsgpersonnemoraleId))
			return false;
		GsgpersonnemoraleId castOther = (GsgpersonnemoraleId) other;

		return (this.getIdPerson() == castOther.getIdPerson())
				&& (this.getIdPm() == castOther.getIdPm());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getIdPerson();
		result = 37 * result + this.getIdPm();
		return result;
	}

}
