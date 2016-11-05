package siteParis;

import java.util.Collection;


public class Paris {

	/**
	 * @uml.property  name="competition"
	 */
	private Competition competition;

	/**
	 * Getter of the property <tt>competition</tt>
	 * @return  Returns the competition.
	 * @uml.property  name="competition"
	 */
	public Competition getCompetition() {
		return competition;
	}

	/**
	 * Setter of the property <tt>competition</tt>
	 * @param competition  The competition to set.
	 * @uml.property  name="competition"
	 */
	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

	/**
	 * @uml.property  name="competitionCourante"
	 * @uml.associationEnd  multiplicity="(1 1)" inverse="paris:siteParis.Competition"
	 */
	private Competition competitionCourante = new siteParis.Competition();

	/**
	 * Getter of the property <tt>competitionCourante</tt>
	 * @return  Returns the competitionCourante.
	 * @uml.property  name="competitionCourante"
	 */
	public Competition getCompetitionCourante() {
		return competitionCourante;
	}

	/**
	 * Setter of the property <tt>competitionCourante</tt>
	 * @param competitionCourante  The competitionCourante to set.
	 * @uml.property  name="competitionCourante"
	 */
	public void setCompetitionCourante(Competition competitionCourante) {
		this.competitionCourante = competitionCourante;
	}

	/**
	 * @uml.property  name="dateParis"
	 */
	private DateFrancaise dateParis;

	/**
	 * Getter of the property <tt>dateParis</tt>
	 * @return  Returns the dateParis.
	 * @uml.property  name="dateParis"
	 */
	public DateFrancaise getDateParis() {
		return dateParis;
	}

	/**
	 * Setter of the property <tt>dateParis</tt>
	 * @param dateParis  The dateParis to set.
	 * @uml.property  name="dateParis"
	 */
	public void setDateParis(DateFrancaise dateParis) {
		this.dateParis = dateParis;
	}

	/**
	 * @uml.property  name="nombreJetonMise"
	 */
	private long nombreJetonMise;

	/**
	 * Getter of the property <tt>nombreJetonMise</tt>
	 * @return  Returns the nombreJetonMise.
	 * @uml.property  name="nombreJetonMise"
	 */
	public long getNombreJetonMise() {
		return nombreJetonMise;
	}

	/**
	 * Setter of the property <tt>nombreJetonMise</tt>
	 * @param nombreJetonMise  The nombreJetonMise to set.
	 * @uml.property  name="nombreJetonMise"
	 */
	public void setNombreJetonMise(long nombreJetonMise) {
		this.nombreJetonMise = nombreJetonMise;
	}

	/** 
	 * @uml.property name="joueur"
	 * @uml.associationEnd multiplicity="(1 1)" inverse="paris:siteParis.Joueur"
	 * @uml.association name="place"
	 */
	private Joueur joueur = new siteParis.Joueur();

	/** 
	 * Getter of the property <tt>joueur</tt>
	 * @return  Returns the joueur.
	 * @uml.property  name="joueur"
	 */
	public Joueur getJoueur() {
		return joueur;
	}

	/** 
	 * Setter of the property <tt>joueur</tt>
	 * @param joueur  The joueur to set.
	 * @uml.property  name="joueur"
	 */
	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

	/**
	 * @uml.property  name="vainqueurPotentiel"
	 */
	private String vainqueurPotentiel;

	/**
	 * Getter of the property <tt>vainqueurPotentiel</tt>
	 * @return  Returns the vainqueurPotentiel.
	 * @uml.property  name="vainqueurPotentiel"
	 */
	public String getVainqueurPotentiel() {
		return vainqueurPotentiel;
	}

	/**
	 * Setter of the property <tt>vainqueurPotentiel</tt>
	 * @param vainqueurPotentiel  The vainqueurPotentiel to set.
	 * @uml.property  name="vainqueurPotentiel"
	 */
	public void setVainqueurPotentiel(String vainqueurPotentiel) {
		this.vainqueurPotentiel = vainqueurPotentiel;
	}

}
