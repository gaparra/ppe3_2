/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appli_etudiants;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author g.parra
 */
public class Infos extends javax.swing.JDialog {

    private InterfaceGraphique fenetre;
    private Personne gens;

    /**
     * Creates new form InfosDir
     */
    public Infos(java.awt.Frame parent, boolean modal, Personne gens) {
        super(parent, modal);
        initComponents();
        //positionnement au milieu de la fenetre parente
        this.setLocationRelativeTo(parent);
        //modal==true signifie que l'on ne peut pas revenir 
        //sur la precedente fenêtre dans fermer connexion
        this.setModal(true);
        //on stocke dans this.fenetre la référence vers la fenetre parente
        this.fenetre = (InterfaceGraphique) parent;
        this.gens = gens;

        jTextFieldTelPerso.setText(gens.getPerso());
        jTextFieldTelPro.setText(gens.getPro());
        jLabelNom.setText(gens.getNom());
        jLabelPrenom.setText(gens.getPrenom());
        jLabelPosition.setText(gens.getPosition());
        jTextFieldCP.setText(gens.getCp().toString());
        jTextFieldRue.setText(gens.getAdresse());
        jTextFieldVille.setText(gens.getVille());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldCP = new javax.swing.JTextField();
        jButtonCP = new javax.swing.JButton();
        jTextFieldRue = new javax.swing.JTextField();
        jButtonRue = new javax.swing.JButton();
        jTextFieldVille = new javax.swing.JTextField();
        jButtonTelPerso = new javax.swing.JButton();
        jTextFieldTelPerso = new javax.swing.JTextField();
        jButtonVille = new javax.swing.JButton();
        jTextFieldTelPro = new javax.swing.JTextField();
        jButtonTelPro = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonValid = new javax.swing.JButton();
        jLabelPosition = new javax.swing.JLabel();
        jLabelNom = new javax.swing.JLabel();
        jLabelPrenom = new javax.swing.JLabel();
        jLabelConf = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabelSalaire = new javax.swing.JLabel();
        jButtonCreation = new javax.swing.JButton();
        jButtonSaveCrea = new javax.swing.JButton();
        jLabelSave = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Informations Personnelles");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Nom");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Prenom");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Code Postal");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Ville");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Rue");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Tel Perso");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Tel Pro");

        jTextFieldCP.setEditable(false);
        jTextFieldCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCPActionPerformed(evt);
            }
        });

        jButtonCP.setText("Modifier");
        jButtonCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCPActionPerformed(evt);
            }
        });

        jTextFieldRue.setEditable(false);

        jButtonRue.setText("Modifier");
        jButtonRue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRueActionPerformed(evt);
            }
        });

        jTextFieldVille.setEditable(false);

        jButtonTelPerso.setText("Modifier");
        jButtonTelPerso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTelPersoActionPerformed(evt);
            }
        });

        jTextFieldTelPerso.setEditable(false);

        jButtonVille.setText("Modifier");
        jButtonVille.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVilleActionPerformed(evt);
            }
        });

        jTextFieldTelPro.setEditable(false);

        jButtonTelPro.setText("Modifier");
        jButtonTelPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTelProActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Position");

        jButtonValid.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jButtonValid.setText("Valider modification");
        jButtonValid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidActionPerformed(evt);
            }
        });

        jLabelConf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelConf.setForeground(new java.awt.Color(51, 204, 0));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Adresse N°");

        jComboBox1.setModel(new DefaultComboBoxModel());
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel10.setText("Salaire");

        jButtonCreation.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCreation.setText("Créer une nouvelle adresse");
        jButtonCreation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreationActionPerformed(evt);
            }
        });

        jButtonSaveCrea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSaveCrea.setText("Sauvegarder");
        jButtonSaveCrea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveCreaActionPerformed(evt);
            }
        });

        jLabelSave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelSave.setForeground(new java.awt.Color(204, 0, 0));
        jLabelSave.setText("Veuillez renseigner tout les champs");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelNom, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabelPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 251, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jLabelConf, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldRue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                                    .addComponent(jTextFieldVille, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldTelPerso, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonValid, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldTelPro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldCP))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonTelPerso)
                                        .addComponent(jButtonVille)
                                        .addComponent(jButtonTelPro)
                                        .addComponent(jButtonRue))
                                    .addComponent(jButtonCP, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(jLabelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelSalaire, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(290, 290, 290))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(jButtonCreation, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonSaveCrea)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(jLabelSave, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabelNom, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(1, 1, 1))))))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCreation)
                    .addComponent(jButtonSaveCrea))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldCP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCP))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldRue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRue))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jButtonVille)
                    .addComponent(jTextFieldVille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelSave)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldTelPerso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTelPerso))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldTelPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTelPro))
                .addGap(18, 18, 18)
                .addComponent(jLabelConf, javax.swing.GroupLayout.DEFAULT_SIZE, 8, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabelSalaire, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonValid, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCPActionPerformed
        jTextFieldCP.setEditable(true);
    }//GEN-LAST:event_jButtonCPActionPerformed

    private void jButtonRueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRueActionPerformed
        jTextFieldRue.setEditable(true);
    }//GEN-LAST:event_jButtonRueActionPerformed

    private void jButtonVilleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVilleActionPerformed
        jTextFieldVille.setEditable(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVilleActionPerformed

    private void jButtonTelPersoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTelPersoActionPerformed
        jTextFieldTelPerso.setEditable(true);
    }//GEN-LAST:event_jButtonTelPersoActionPerformed

    private void jButtonTelProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTelProActionPerformed
        jTextFieldTelPro.setEditable(true);
    }//GEN-LAST:event_jButtonTelProActionPerformed

    private void jTextFieldCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCPActionPerformed


    }//GEN-LAST:event_jTextFieldCPActionPerformed

    private void jButtonValidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidActionPerformed

        String cp = jTextFieldCP.getText();
        String rue = jTextFieldRue.getText();
        String ville = jTextFieldVille.getText();
        String perso = jTextFieldTelPerso.getText();
        String pro = jTextFieldTelPro.getText();
        String item = jComboBox1.getSelectedItem().toString();

        Integer id = gens.getId();
        try {
            Connection maConnexion = ConnexionBDD.getInstance();
            //requete
            Statement requete = maConnexion.createStatement();
            System.out.println("update utilisateurs set tel_personnel=" + perso + " and tel_professionnel = " + pro + " where id_utilisateur=" + id);
            requete.executeUpdate("update utilisateurs set tel_personnel='" + perso + "' , tel_professionnel = '" + pro + "' where id_utilisateur=" + id);
            System.out.println("update adresse set code_postal=" + cp + " , rue = " + rue + " , ville =" + ville + " where id_utilisateur=" + id);
            requete.executeUpdate("update adresse set code_postal=" + cp + " , rue = \"" + rue + "\" , ville =\"" + ville + "\" where numero_adresse=" + item + " and id_utilisateur =" + id);

            jLabelConf.setText("Modifications réussis");
        } catch (SQLException ex) {
            Logger.getLogger(ModifRole.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextFieldCP.setEditable(false);
        jTextFieldTelPro.setEditable(false);
        jTextFieldTelPerso.setEditable(false);
        jTextFieldVille.setEditable(false);
        jTextFieldRue.setEditable(false);

    }//GEN-LAST:event_jButtonValidActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jButtonSaveCrea.setVisible(false);
        jLabelSave.setVisible(false);
        try {
            Connection maConnexion = ConnexionBDD.getInstance();
            //requete
            Statement requete = maConnexion.createStatement();
            ResultSet resultat = requete.executeQuery("select * from adresse where id_utilisateur =" + gens.getId());
            Integer i = 1;
            while (resultat.next()) {
                Integer id = resultat.getInt("numero_adresse");
                jComboBox1.addItem(id + "");
                i += 1;
            }

            resultat = requete.executeQuery("select * from utilisateurs, salaire where utilisateurs.categorie=salaire.categorie and id_utilisateur = " + gens.getId());
            if (resultat.next()) {
                Double salaire = resultat.getDouble("salaire");
                Integer date = resultat.getInt("date_embauche");
                Calendar dateAjd = new GregorianCalendar(Locale.FRANCE);
                Integer ancien = dateAjd.get(Calendar.YEAR) - date;
                Double total = 2000d;
                if (gens.getPosition().equals("cadre")) {
                    total = 6500d;
                } else {
                    if (gens.getPosition().equals("dirigeant")) {
                        total = 15000d;
                    }

                }
                while (ancien > 1) {
                    total = salaire * 1.03;
                    ancien = ancien - 1;
                }
                jLabelSalaire.setText(String.valueOf((total)));
            }

        } catch (SQLException ex) {
            Logger.getLogger(ModifRole.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_formWindowOpened

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Integer id = gens.getId();
        String item = jComboBox1.getSelectedItem().toString();
        try {
            Connection maConnexion = ConnexionBDD.getInstance();
            //requete
            Statement requete = maConnexion.createStatement();
            ResultSet resultat = requete.executeQuery("select * from adresse where numero_adresse =" + item + " and id_utilisateur = " + id);
            Integer i = 1;

            if (resultat.next()) {
                String ville = resultat.getString("ville");
                String rue = resultat.getString("rue");
                Integer cp = resultat.getInt("code_postal");
                jTextFieldCP.setText(cp.toString());
                jTextFieldRue.setText(rue);
                jTextFieldVille.setText(ville);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModifRole.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButtonCreationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreationActionPerformed
        jButtonValid.setVisible(false);
        jButtonSaveCrea.setVisible(true);
        jTextFieldCP.setEditable(true);
        jTextFieldVille.setEditable(true);
        jTextFieldRue.setEditable(true);
        jTextFieldCP.setText("");
        jTextFieldVille.setText("");
        jTextFieldRue.setText("");
        jLabelConf.setText("");


    }//GEN-LAST:event_jButtonCreationActionPerformed

    private void jButtonSaveCreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveCreaActionPerformed
        Integer id = gens.getId();
        try {
            Connection maConnexion = ConnexionBDD.getInstance();
            //requete
            Statement requete = maConnexion.createStatement();
            ResultSet resultat = requete.executeQuery("select count(*) from adresse where id_utilisateur=" + id);
            if (resultat.next()) {
                Integer total = resultat.getInt("count(*)");
                total = total + 1;
                if (jTextFieldCP.getText().equals("") || jTextFieldVille.getText().equals("") || jTextFieldRue.getText().equals("")) {
                    jLabelSave.setVisible(true);
                } else {
                    requete.executeUpdate("INSERT INTO adresse "
                            + "(id, code_postal, ville, rue, id_utilisateur, numero_adresse) "
                            + "VALUES (NULL, '" + jTextFieldCP.getText() + "', '" + jTextFieldVille.getText()
                            + "', '" + jTextFieldRue.getText() + "', '" + id + "', '" + total + "');");
                    jTextFieldCP.setEditable(false);
                    jTextFieldVille.setEditable(false);
                    jTextFieldRue.setEditable(false);
                    jLabelSave.setVisible(false);
                    jButtonSaveCrea.setVisible(false);
                    jButtonValid.setVisible(true);
                    jLabelConf.setText("Sauvegarde réussi");
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(ModifRole.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSaveCreaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Infos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Infos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Infos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Infos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Infos dialog = new Infos(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCP;
    private javax.swing.JButton jButtonCreation;
    private javax.swing.JButton jButtonRue;
    private javax.swing.JButton jButtonSaveCrea;
    private javax.swing.JButton jButtonTelPerso;
    private javax.swing.JButton jButtonTelPro;
    private javax.swing.JButton jButtonValid;
    private javax.swing.JButton jButtonVille;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelConf;
    private javax.swing.JLabel jLabelNom;
    private javax.swing.JLabel jLabelPosition;
    private javax.swing.JLabel jLabelPrenom;
    private javax.swing.JLabel jLabelSalaire;
    private javax.swing.JLabel jLabelSave;
    private javax.swing.JTextField jTextFieldCP;
    private javax.swing.JTextField jTextFieldRue;
    private javax.swing.JTextField jTextFieldTelPerso;
    private javax.swing.JTextField jTextFieldTelPro;
    private javax.swing.JTextField jTextFieldVille;
    // End of variables declaration//GEN-END:variables
}