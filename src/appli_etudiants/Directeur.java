/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import com.mysql.jdbc.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author g.parra
 */
public class Directeur extends Employe {

    private String poste;

    public Directeur(Integer id, String nom, String prenom, String courriel, String embauche, String annee_naissance, String adresse, Integer cp, String ville, String position, String role, String pro, String perso) {
        super(id, nom, prenom, courriel, embauche, annee_naissance, adresse, cp, ville, position, role, pro, perso);
        this.poste = "Directeur";
    }

//    public void creer(Integer id, String nom, String prenom, String courriel, String embauche, String adresse, String ville, String cp, String annee_naissance, String position, String role, String pro, String perso) {
//        Employe nouveau = new Employe(id, nom, prenom, courriel, embauche, adresse, ville, cp, annee_naissance, position, role, pro, perso);
//
//    }
    public String promouvoir(int i) {
        try {
            Connection maConnexion = ConnexionBDD.getInstance();
            //requete
            Statement requete = maConnexion.createStatement();

            requete.executeUpdate("update utilisateurs set role ='responsable' where id_utilisateur=" + i);

        } catch (SQLException ex) {
            Logger.getLogger(Responsable.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ("select nom,prenom,role from Utilisateurs where id_utilisateur=" + i);
    }

    public String retrograder(int i) {
        try {
            Connection maConnexion = ConnexionBDD.getInstance();
            //requete
            Statement requete = maConnexion.createStatement();

            requete.executeUpdate("update utilisateurs set role ='employe' where id_utilisateur=" + i);

        } catch (SQLException ex) {
            Logger.getLogger(Responsable.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ("select nom,prenom,role from Utilisateurs where id_utilisateur=" + i);
    }

}
