/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

/**
 *
 * @author nc
 */
public class Employe extends Personne {

    private String login;
    private String mot_de_passe;

    public Employe(Integer id, String nom, String prenom, String courriel, String embauche, String annee_naissance, String adresse, Integer cp, String ville, String position, String role, String pro, String perso) {
        super(id, nom, prenom, courriel, embauche, annee_naissance, adresse, cp, ville, position, role, pro, perso);
    }

 



    //accesseurs
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getMot_de_passe() {
        return mot_de_passe;
    }

    public void setMot_de_passe(String mot_de_passe) {
        this.mot_de_passe = mot_de_passe;
    }

  

}
