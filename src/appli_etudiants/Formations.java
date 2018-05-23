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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Gaël
 */
public class Formations extends javax.swing.JDialog {

    /**
     * Creates new form Formations
     */
    private InterfaceGraphique fenetre;
    private Personne gens;

    public Formations(java.awt.Frame parent, boolean modal, Personne gens) {
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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonMod = new javax.swing.JButton();
        jButtonValidInsert = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDesc = new javax.swing.JTextArea();
        jButtonValidModif = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonSuppr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 0));
        jLabel2.setText("Modification réussi");

        jComboBox1.setModel(new DefaultComboBoxModel());
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Nouvelle Formation");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonMod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonMod.setText("Modifier");
        jButtonMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModActionPerformed(evt);
            }
        });

        jButtonValidInsert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonValidInsert.setText("Valider");
        jButtonValidInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidInsertActionPerformed(evt);
            }
        });

        jTextAreaDesc.setEditable(false);
        jTextAreaDesc.setColumns(20);
        jTextAreaDesc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextAreaDesc.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDesc);

        jButtonValidModif.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonValidModif.setText("Valider");
        jButtonValidModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidModifActionPerformed(evt);
            }
        });

        jLabel1.setText("Formations");

        jButtonSuppr.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonSuppr.setForeground(new java.awt.Color(204, 0, 51));
        jButtonSuppr.setText("Supprimer");
        jButtonSuppr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSupprActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonValidInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(jLabel2))
                        .addComponent(jButtonMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextField1)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButtonSuppr, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonValidModif, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jButtonMod)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonValidModif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonSuppr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButtonValidInsert)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Integer id = gens.getId();
        jLabel2.setVisible(false);
        jTextField1.setVisible(false);
        jButtonValidInsert.setVisible(false);
        try {
            Connection maConnexion = ConnexionBDD.getInstance();
            //requetes
            Statement requete = maConnexion.createStatement();
//            System.out.println("update utilisateurs set tel_personnel=" + perso + " and tel_professionnel = " + pro + " where id_utilisateur=" + id);
//            System.out.println("update adresse set code_postal=" + cp + " , rue = " + rue + " , ville =" + ville + " where id_utilisateur=" + id);
            ResultSet resultat = requete.executeQuery("select * from formations where id_utilisateur=" + id);
            while (resultat.next()) {
                String nom = resultat.getString("nom");
                jComboBox1.addItem(nom);
            }
//            jLabelConf.setText("Modifications réussis");
        } catch (SQLException ex) {
            Logger.getLogger(ModifRole.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Integer id = gens.getId();
        jLabel2.setVisible(false);

        String item = jComboBox1.getSelectedItem().toString();
        try {
            Connection maConnexion = ConnexionBDD.getInstance();
            //requetes
            Statement requete = maConnexion.createStatement();
            System.out.println("select description from formations where id_utilisateur=" + id + " and nom ='" + item);
            ResultSet resultat = requete.executeQuery("select description from formations where id_utilisateur=" + id + " and nom ='" + item + "'");
            while (resultat.next()) {
                String description = resultat.getString("description");

                jTextAreaDesc.setText(description);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ModifRole.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jButtonSuppr.setVisible(false);

        jButtonValidModif.setVisible(false);
        jComboBox1.setVisible(false);
        jTextField1.setVisible(true);
        jTextAreaDesc.setEditable(true);
        jButtonValidInsert.setVisible(true);
        jTextAreaDesc.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModActionPerformed
        jTextAreaDesc.setEditable(true);
        //        jTextFieldNom.setEditable(true);
    }//GEN-LAST:event_jButtonModActionPerformed

    private void jButtonValidInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidInsertActionPerformed
        Integer id = gens.getId();
        try {
            Connection maConnexion = ConnexionBDD.getInstance();
            //requetes
            Statement requete = maConnexion.createStatement();
            String nouvelleFormation = jTextField1.getText();
            System.out.println("INSERT INTO formations (id_formation, nom, description, id_utilisateur) VALUES "
                    + "(NULL, '" + nouvelleFormation + "', '" + jTextAreaDesc.getText() + "', '" + id + "');");
            requete.executeUpdate("INSERT INTO formations (id_formation, nom, description, id_utilisateur) VALUES "
                    + "(NULL, '" + nouvelleFormation + "', '" + jTextAreaDesc.getText() + "', '" + id + "');");

            jLabel2.setVisible(true);
            jComboBox1.setVisible(true);
            jTextField1.setVisible(false);
            //            jLabelConf.setText("Modifications réussis");
        } catch (SQLException ex) {
            Logger.getLogger(ModifRole.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextAreaDesc.setEditable(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonValidInsertActionPerformed

    private void jButtonValidModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidModifActionPerformed
        Integer id = gens.getId();
        String item = jComboBox1.getSelectedItem().toString();
        try {
            Connection maConnexion = ConnexionBDD.getInstance();
            //requetes
            Statement requete = maConnexion.createStatement();
            System.out.println("select * from formations where id_utilisateur=" + id + " and nom='" + item + "'");
            ResultSet resultat = requete.executeQuery("select * from formations where id_utilisateur=" + id + " and nom='" + item + "'");
            if (resultat.next()) {
                Integer idS = resultat.getInt("id_formation");

                System.out.println("update formations set nom='" + item + "' , description=\""
                        + jTextAreaDesc.getText() + "\"where id_formation=" + idS);
                requete.executeUpdate("update formations set nom='" + item + "' , description=\""
                        + jTextAreaDesc.getText() + "\"where id_formation=" + idS);
            }
            jLabel2.setVisible(true);
            jComboBox1.setVisible(true);
            jTextField1.setVisible(false);
            //            jLabelConf.setText("Modifications réussis");
        } catch (SQLException ex) {
            Logger.getLogger(ModifRole.class.getName()).log(Level.SEVERE, null, ex);
        }        jTextAreaDesc.setEditable(false);

    }//GEN-LAST:event_jButtonValidModifActionPerformed

    private void jButtonSupprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprActionPerformed
        String nom = jComboBox1.getSelectedItem().toString();
        String desc = jTextAreaDesc.getText();

        try {
            Connection maConnexion = ConnexionBDD.getInstance();
            //requetes
            Statement requete = maConnexion.createStatement();
            System.out.println("DELETE FROM formations WHERE formations.nom ='" + nom + "'" + " and formations.description = '" + desc + "'");
            requete.executeUpdate("DELETE FROM formations WHERE formations.nom ='" + nom + "'" + " and formations.description = '" + desc + "'");

            
            DefaultComboBoxModel combox = (DefaultComboBoxModel) jComboBox1.getModel();
            int index = jComboBox1.getSelectedIndex();
            combox.removeElementAt(index);
jLabel2.setVisible(true);
            jLabel2.setText("Suppression réussi");
        } catch (SQLException ex) {
            Logger.getLogger(ModifRole.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonSupprActionPerformed

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
            java.util.logging.Logger.getLogger(Formations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formations.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Formations dialog = new Formations(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonMod;
    private javax.swing.JButton jButtonSuppr;
    private javax.swing.JButton jButtonValidInsert;
    private javax.swing.JButton jButtonValidModif;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDesc;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}