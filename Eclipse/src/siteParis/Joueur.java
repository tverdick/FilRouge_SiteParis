package siteParis;

import java.util.Collection;


public class Joueur {

	/**
	 * @uml.property  name="nom"
	 */
	private String nom;
   private String prenom;
   private String pseudo;
  	private long nombreJeton;

   
   public Joueur (String nom, String prenom, String pseudo) {
   
   this.nom = nom ;
   this.prenom = prenom ;
   this.pseudo = pseudo ;
   this.nombreJeton = 0;
   }

	/**
	 * Getter of the property <tt>nom</tt>
	 * @return  Returns the nom.
	 * @uml.property  name="nom"
	 */
    
    
   /** Test l'égalité entre joueur */
   
   public boolean equals(Object o) {
   
      if (o instanceof  Joueur) {
      
         Joueur j = (Joueur) o ;
                  
         return (j.nom.equals(nom) && j.prenom.equals(prenom) && j.pseudo.equals(pseudo)) ;


      }
      return false ;
   }      
    
    
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
	 * Getter of the property <tt>prenom</tt>
	 * @return  Returns the prenom.
	 * @uml.property  name="prenom"
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Setter of the property <tt>prenom</tt>
	 * @param prenom  The prenom to set.
	 * @uml.property  name="prenom"
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	
	/**
	 * Getter of the property <tt>pseudo</tt>
	 * @return  Returns the pseudo.
	 * @uml.property  name="pseudo"
	 */
	public String getPseudo() {
		return pseudo;
	}

	/**
	 * Setter of the property <tt>pseudo</tt>
	 * @param pseudo  The pseudo to set.
	 * @uml.property  name="pseudo"
	 */
	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	/**
	 * @uml.property  name="passwordJoueur"
	 */
	private String passwordJoueur;

	/**
	 * Getter of the property <tt>passwordJoueur</tt>
	 * @return  Returns the passwordJoueur.
	 * @uml.property  name="passwordJoueur"
	 */
	public String getPasswordJoueur() {
		return passwordJoueur;
	}

	/**
	 * Setter of the property <tt>passwordJoueur</tt>
	 * @param passwordJoueur  The passwordJoueur to set.
	 * @uml.property  name="passwordJoueur"
	 */
	public void setPasswordJoueur(String passwordJoueur) {
		this.passwordJoueur = passwordJoueur;
	}

	
	/**
	 * Getter of the property <tt>nombreJeton</tt>
	 * @return  Returns the nombreJeton.
	 * @uml.property  name="nombreJeton"
	 */
	public long getNombreJeton() {
		return nombreJeton;
	}

	/**
	 * Setter of the property <tt>nombreJeton</tt>
	 * @param nombreJeton  The nombreJeton to set.
	 * @uml.property  name="nombreJeton"
	 */
	public void setNombreJeton(long nombreJeton) {
		this.nombreJeton = nombreJeton;
	}

		
		/** 
		 * @uml.property name="paris"
		 * @uml.associationEnd multiplicity="(0 -1)" inverse="joueur:siteParis.Paris"
		 * @uml.association name="place"
		 */
		private Collection paris;

		/**
		 * @uml.property  name="siteDeParisMetier"
		 * @uml.associationEnd  multiplicity="(1 1)" inverse="joueur:siteParis.SiteDeParisMetier"
		 */
		private SiteDeParisMetier siteDeParisMetier;

		/**
		 * Getter of the property <tt>siteDeParisMetier</tt>
		 * @return  Returns the siteDeParisMetier.
		 * @uml.property  name="siteDeParisMetier"
		 */
		public SiteDeParisMetier getSiteDeParisMetier() {
			return siteDeParisMetier;
		}

		/**
		 * Setter of the property <tt>siteDeParisMetier</tt>
		 * @param siteDeParisMetier  The siteDeParisMetier to set.
		 * @uml.property  name="siteDeParisMetier"
		 */
		public void setSiteDeParisMetier(SiteDeParisMetier siteDeParisMetier) {
			this.siteDeParisMetier = siteDeParisMetier;
		}

		/** 
		 * Getter of the property <tt>paris</tt>
		 * @return  Returns the paris.
		 * @uml.property  name="paris"
		 */
		public Collection getParis() {
			return paris;
		}

		/** 
		 * Setter of the property <tt>paris</tt>
		 * @param paris  The paris to set.
		 * @uml.property  name="paris"
		 */
		public void setParis(Collection paris) {
			this.paris = paris;
		}

}
