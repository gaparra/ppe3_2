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
public class Stages extends javax.swing.JDialog {

    private InterfaceGraphique fenetre;
    private Personne gens;

    public Stages(java.awt.Frame parent, boolean modal, Personne gens) {
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

        jButtonMod = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDesc = new javax.swing.JTextArea();
        jButtonValid = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Stage");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButtonMod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonMod.setText("Modifier");
        jButtonMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModActionPerformed(evt);
            }
        });

        jTextAreaDesc.setEditable(false);
        jTextAreaDesc.setColumns(20);
        jTextAreaDesc.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextAreaDesc.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDesc);

        jButtonValid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonValid.setText("Valider");
        jButtonValid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonValidActionPerformed(evt);
            }
        });

        jLabel1.setText("Intitulé");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 204, 0));
        jLabel2.setText("Modification réussi");

        jComboBox1.setModel(new DefaultComboBoxModel());
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButtonValid, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonMod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonMod)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButtonValid)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        Integer id = gens.getId();
        jLabel2.setVisible(false);
        try {
            Connection maConnexion = ConnexionBDD.getInstance();
            //requetes
            Statement requete = maConnexion.createStatement();
            ResultSet resultat = requete.executeQuery("select * from stages where id_utilisateur=" + id);
            while (resultat.next()) {
                String nom = resultat.getString("nom");
                jComboBox1.addItem(nom);

            }
            jComboBox1.addItem("Ajouter stage");
//            jLabelConf.setText("Modifications réussis");
        } catch (SQLException ex) {
            Logger.getLogger(ModifRole.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButtonModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModActionPerformed
        jTextAreaDesc.setEditable(true);

    }//GEN-LAST:event_jButtonModActionPerformed

    private void jButtonValidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonValidActionPerformed
        Integer id = gens.getId();
        String item = jComboBox1.getSelectedItem().toString();
        try {
            Connection maConnexion = ConnexionBDD.getInstance();
            //requetes
            Statement requete = maConnexion.createStatement();
            ResultSet resultat = requete.executeQuery("select * from stages where id_utilisateur=" + id + " and nom='" + item + "'");
            if (resultat.next()) {
                Integer idS = resultat.getInt("id_stage");

                System.out.println("update stages set nom='" + "" + "' , description=\""
                        + jTextAreaDesc.getText() + "\"where id_stage=" + idS);
                requete.executeUpdate("update stages set nom='" + "" + "' , description=\""
                        + jTextAreaDesc.getText() + "\"where id_stage=" + idS);
            } else {
                String nouveauStage = jComboBox1.getSelectedItem().toString();
                System.out.println("INSERT INTO stages (id_stage, nom, description, id_utilisateur) VALUES "
                        + "(NULL, '" + nouveauStage + "', '" + jTextAreaDesc.getText() + "', '" + id + "');");
                requete.executeUpdate("INSERT INTO stages (id_stage, nom, description, id_utilisateur) VALUES "
                        + "(NULL, '" + nouveauStage + "', '" + jTextAreaDesc.getText() + "', '" + id + "');");
                
            }
            jLabel2.setVisible(true);
//            jLabelConf.setText("Modifications réussis");
        } catch (SQLException ex) {
            Logger.getLogger(ModifRole.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonValidActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        Integer id = gens.getId();
        jLabel2.setVisible(false);

        String item = jComboBox1.getSelectedItem().toString();
        try {
            Connection maConnexion = ConnexionBDD.getInstance();
            //requetes
            Statement requete = maConnexion.createStatement();
            System.out.println("select description from stages where id_utilisateur=" + id + " and stage ='" + item);
            ResultSet resultat = requete.executeQuery("select description from stages where id_utilisateur=" + id + " and nom ='" + item + "'");
            while (resultat.next()) {
//                String langue = resultat.getString("langue");
                String description = resultat.getString("description");

                jTextAreaDesc.setText(description);
            }
//            jLabelConf.setText("Modifications réussis");
        } catch (SQLException ex) {
            Logger.getLogger(ModifRole.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (jComboBox1.getSelectedItem().toString().equals("Ajouter stage")) {
            jComboBox1.setEditable(true);
            jTextAreaDesc.setText("");
            jTextAreaDesc.setEditable(true);
//            jComboBox1.setText();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Stages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stages.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Stages dialog = new Stages(new javax.swing.JFrame(), true, null);
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
    private javax.swing.JButton jButtonMod;
    private javax.swing.JButton jButtonValid;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDesc;
    // End of variables declaration//GEN-END:variables
}
