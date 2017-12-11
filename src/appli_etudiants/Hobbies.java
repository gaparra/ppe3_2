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
public class Hobbies extends javax.swing.JDialog {

    /**
     * Creates new form Hobbies
     */
    private InterfaceGraphique fenetre;
    private Personne gens;

    public Hobbies(java.awt.Frame parent, boolean modal, Personne gens) {
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

        jButtonValidModif = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonMod = new javax.swing.JButton();
        jButtonValidInsert = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDesc = new javax.swing.JTextArea();
        jButtonSuppr = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButtonValidModif.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonValidModif.setText("Valider");
        jButtonValidModif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidModifActionPerformed(evt);
            }
        });

        jLabel1.setText("Hobbie");

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
        jButton1.setText("Nouveau Hobbie");
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonSuppr, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonValidModif, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButtonValidInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(51, 51, 51)
                            .addComponent(jLabel2))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonMod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonValidInsert)
                .addContainerGap(17, Short.MAX_VALUE))
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
            ResultSet resultat = requete.executeQuery("select * from hobbies where id_utilisateur=" + id);
            while (resultat.next()) {
                String nom = resultat.getString("nom");
                jComboBox1.addItem(nom);
            }
//            jLabelConf.setText("Modifications réussis");
        } catch (SQLException ex) {
            Logger.getLogger(ModifRole.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButtonValidModifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidModifActionPerformed
        Integer id = gens.getId();
        String item = jComboBox1.getSelectedItem().toString();
        try {
            Connection maConnexion = ConnexionBDD.getInstance();
            //requetes
            Statement requete = maConnexion.createStatement();
            System.out.println("select * from hobbies where id_utilisateur=" + id + " and nom='" + item + "'");
            ResultSet resultat = requete.executeQuery("select * from hobbies where id_utilisateur=" + id + " and nom='" + item + "'");
            if (resultat.next()) {
                Integer idS = resultat.getInt("id_hobbie");

                System.out.println("update hobbies set nom='" + item + "' , description=\""
                        + jTextAreaDesc.getText() + "\"where id_hobbie=" + idS);
                requete.executeUpdate("update hobbies set nom='" + item + "' , description=\""
                        + jTextAreaDesc.getText() + "\"where id_hobbie=" + idS);
            }
            jLabel2.setVisible(true);
            jComboBox1.setVisible(true);
            jTextField1.setVisible(false);
            //            jLabelConf.setText("Modifications réussis");
        } catch (SQLException ex) {
            Logger.getLogger(ModifRole.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonValidModifActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Integer id = gens.getId();
        jLabel2.setVisible(false);

        String item = jComboBox1.getSelectedItem().toString();
        try {
            Connection maConnexion = ConnexionBDD.getInstance();
            //requetes
            Statement requete = maConnexion.createStatement();
            System.out.println("select description from hobbies where id_utilisateur=" + id + " and nom ='" + item);
            ResultSet resultat = requete.executeQuery("select description from hobbies where id_utilisateur=" + id + " and nom ='" + item + "'");
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
        jButtonSuppr.setVisible(false);
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
            String nouveauHobbie = jTextField1.getText();
            System.out.println("INSERT INTO hobbies (id_hobbie, nom, description, id_utilisateur) VALUES "
                    + "(NULL, '" + nouveauHobbie + "', '" + jTextAreaDesc.getText() + "', '" + id + "');");
            requete.executeUpdate("INSERT INTO hobbies (id_hobbie, nom, description, id_utilisateur) VALUES "
                    + "(NULL, '" + nouveauHobbie + "', '" + jTextAreaDesc.getText() + "', '" + id + "');");

            jLabel2.setVisible(true);
            jComboBox1.setVisible(true);
            jTextField1.setVisible(false);
            //            jLabelConf.setText("Modifications réussis");
        } catch (SQLException ex) {
            Logger.getLogger(ModifRole.class.getName()).log(Level.SEVERE, null, ex);
        }
        jTextAreaDesc.setEditable(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonValidInsertActionPerformed

    private void jButtonSupprActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSupprActionPerformed
        String nom = jComboBox1.getSelectedItem().toString();
        String desc = jTextAreaDesc.getText();

        try {
            Connection maConnexion = ConnexionBDD.getInstance();
            //requetes
            Statement requete = maConnexion.createStatement();
            System.out.println("DELETE FROM hobbies WHERE hobbies.nom ='" + nom + "'" + " and hobbies.description = '" + desc + "'");
            requete.executeUpdate("DELETE FROM hobbies WHERE hobbies.nom ='" + nom + "'" + " and hobbies.description = '" + desc + "'");

            jLabel2.setVisible(true);
            jLabel2.setText("Suppression réussi");
            DefaultComboBoxModel combox = (DefaultComboBoxModel) jComboBox1.getModel();
            int index = jComboBox1.getSelectedIndex();
            combox.removeElementAt(index);

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
            java.util.logging.Logger.getLogger(Hobbies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hobbies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hobbies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hobbies.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Hobbies dialog = new Hobbies(new javax.swing.JFrame(), true, null);
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
