package siteParis;

import java.util.LinkedList;
import java.util.Collection;


public class Competition {

	/** 
	 * @uml.property name="nom"
	 */
	private String nom;

	/** 
	 * Getter of the property <tt>nom</tt>
	 * @return  Returns the nom.
	 * @uml.property  name="nom"
	 */
	public String getNom() {
		return nom;
	}

	/** 
	 * Setter of the property <tt>nom</tt>
	 * @param nom  The nom to set.
	 * @uml.property  name="nom"
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @uml.property  name="competiteurs"
	 */
	private LinkedList competiteurs;

	/**
	 * Getter of the property <tt>competiteurs</tt>
	 * @return  Returns the competiteurs.
	 * @uml.property  name="competiteurs"
	 */
	public LinkedList getCompetiteurs() {
		return competiteurs;
	}

	/**
	 * Setter of the property <tt>competiteurs</tt>
	 * @param competiteurs  The competiteurs to set.
	 * @uml.property  name="competiteurs"
	 */
	public void setCompetiteurs(LinkedList competiteurs) {
		this.competiteurs = competiteurs;
	}

	/**
	 * @uml.property  name="paris"
	 * @uml.associationEnd  multiplicity="(0 -1)" ordering="true" inverse="competitionCourante:siteParis.Paris"
	 */
	private LinkedList paris;

	/**
	 * Getter of the property <tt>paris</tt>
	 * @return  Returns the paris.
	 * @uml.property  name="paris"
	 */
	public LinkedList getParis() {
		return paris;
	}

	/**
	 * Setter of the property <tt>paris</tt>
	 * @param paris  The paris to set.
	 * @uml.property  name="paris"
	 */
	public void setParis(LinkedList paris) {
		this.paris = paris;
	}

	/**
	 * @uml.property  name="dateDebut"
	 */
	private DateFrancaise dateDebut;

	/** 
	 * Getter of the property <tt>date</tt>
	 * @return  Returns the date.
	 * @uml.property  name="dateDebut"
	 */
	public DateFrancaise getDateDebut() {
		return dateDebut;
	}

	/** 
	 * Setter of the property <tt>date</tt>
	 * @param date  The date to set.
	 * @uml.property  name="dateDebut"
	 */
	public void setDateDebut(DateFrancaise dateDebut) {
		this.dateDebut = dateDebut;
	}

	/**
	 * @uml.property  name="dateFin"
	 */
	private DateFrancaise dateFin;

	/**
	 * Getter of the property <tt>dateFin</tt>
	 * @return  Returns the dateFin.
	 * @uml.property  name="dateFin"
	 */
	public DateFrancaise getDateFin() {
		return dateFin;
	}

	/**
	 * Setter of the property <tt>dateFin</tt>
	 * @param dateFin  The dateFin to set.
	 * @uml.property  name="dateFin"
	 */
	public void setDateFin(DateFrancaise dateFin) {
		this.dateFin = dateFin;
	}

	/** 
	 * @uml.property name="dates"
	 * @uml.associationEnd multiplicity="(0 -1)" inverse="competition:siteParis.DateFrancaise"
	 * @uml.association name="possède"
	 */
	private Collection dateFrancaise;

	/** 
	 * @uml.property name="siteDeParisMetier"
	 * @uml.associationEnd multiplicity="(1 1)" inverse="competition:siteParis.SiteDeParisMetier"
	 */
	//private SiteDeParisMetier siteDeParisMetier = new siteParis.SiteDeParisMetier();

	/** 
	 * Getter of the property <tt>siteDeParisMetier</tt>
	 * @return  Returns the siteDeParisMetier.
	 * @uml.property  name="siteDeParisMetier"
	 */
	//public SiteDeParisMetier getSiteDeParisMetier() {
	//	return siteDeParisMetier;
//	}

	/** 
	 * Setter of the property <tt>siteDeParisMetier</tt>
	 * @param siteDeParisMetier  The siteDeParisMetier to set.
	 * @uml.property  name="siteDeParisMetier"
	 */
	//public void setSiteDeParisMetier(SiteDeParisMetier siteDeParisMetier) {
	//	this.siteDeParisMetier = siteDeParisMetier;
	//}

	/**
	 * @uml.property  name="vainqueur"
	 */
	private String vainqueur;

	/**
	 * Getter of the property <tt>vainqueur</tt>
	 * @return  Returns the vainqueur.
	 * @uml.property  name="vainqueur"
	 */
	public String getVainqueur() {
		return vainqueur;
	}

	/**
	 * Setter of the property <tt>vainqueur</tt>
	 * @param vainqueur  The vainqueur to set.
	 * @uml.property  name="vainqueur"
	 */
	public void setVainqueur(String vainqueur) {
		this.vainqueur = vainqueur;
	}

	/** 
	 * Getter of the property <tt>dates</tt>
	 * @return  Returns the dateFrancaise.
	 * @uml.property  name="dates"
	 */
	public Collection getDates() {
		return dateFrancaise;
	}

	/** 
	 * Setter of the property <tt>dates</tt>
	 * @param dates  The dateFrancaise to set.
	 * @uml.property  name="dates"
	 */
	public void setDates(Collection dates) {
		dateFrancaise = dates;
	}

}
