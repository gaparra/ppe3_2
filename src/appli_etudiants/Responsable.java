/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author g.parra
 */
public class Responsable extends Employe {

    private String poste;

    public Responsable(Integer id, String nom, String prenom, String courriel, String embauche, String annee_naissance, String adresse, Integer cp, String ville, String position, String role, String pro, String perso) {
        super(id, nom, prenom, courriel, embauche, annee_naissance, adresse, cp, ville, position, role, pro, perso);
        this.poste = "Responsable";
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

}
