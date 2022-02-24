/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import classi.Classifica;
import classi.Partita;
import classi.Squadra;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tss
 */
public class WinCalcio extends javax.swing.JFrame {

    // ATTRIBUTI
    static ArrayList<Squadra> elencoSquadre = new ArrayList<>();
    static ArrayList<Partita> elencoPartite = new ArrayList<>();
    static ArrayList<Classifica> elencoClassifica;

    /**
     * Creates new form WinCalcio
     */
    public WinCalcio() {
        initComponents();
        Csv.caricaSqaudraCsv();
        Csv.caricaPartiteCsv();
        aggiornaTabellaSquadre();
        aggiornaTabellaPartite();
        aggiornaTabellaClassifica();
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
        jLabel3 = new javax.swing.JLabel();
        jTextFieldNomeSqaudra = new javax.swing.JTextField();
        jTextFieldSede = new javax.swing.JTextField();
        bottoneNewSquadra = new javax.swing.JButton();
        UpdateSquadra = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabellaSqaudre = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldSquadraCasa = new javax.swing.JTextField();
        jTextFieldSquadraTrasferta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabellaPartite = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabellaClassifica = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        bottoneNewPartita = new javax.swing.JButton();
        jSpinnerGoalCasa = new javax.swing.JSpinner();
        jSpinnerGoalTrasferta = new javax.swing.JSpinner();
        jSpinnerGiornata = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Squadra");

        jLabel2.setText("Nome");

        jLabel3.setText("Sede");

        bottoneNewSquadra.setText("New");
        bottoneNewSquadra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneNewSquadraActionPerformed(evt);
            }
        });

        UpdateSquadra.setText("Update");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Elenco squadre");

        tabellaSqaudre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome ", "Sede"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabellaSqaudre);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Partita");

        jLabel6.setText("Giornata");

        jLabel7.setText("Squadra di casa");

        jLabel8.setText("Squadra in trasferta");

        jLabel9.setText("Goal casa");

        jLabel10.setText("Goal trasferta");

        tabellaPartite.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Giornata", "Squadra casa", "Squadra trasfferta", "Goal casa", "Goal trasferta"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tabellaPartite);

        tabellaClassifica.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Squadra", "Punti", "Goal fatti", "Goal subiti"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabellaClassifica);

        jLabel11.setText("Classifica");

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Elenco partite");

        bottoneNewPartita.setText("New");
        bottoneNewPartita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottoneNewPartitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bottoneNewSquadra, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UpdateSquadra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNomeSqaudra, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                                    .addComponent(jTextFieldSede))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextFieldSquadraCasa)
                                            .addComponent(jSpinnerGiornata, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldSquadraTrasferta, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSpinnerGoalCasa)
                                            .addComponent(jSpinnerGoalTrasferta)))
                                    .addComponent(bottoneNewPartita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(27, 27, 27)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextFieldNomeSqaudra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(jTextFieldSede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(bottoneNewSquadra)
                                    .addComponent(UpdateSquadra)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jSpinnerGiornata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldSquadraCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldSquadraTrasferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSpinnerGoalCasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSpinnerGoalTrasferta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bottoneNewPartita)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
        Quando premo il bottone new crea una nuova squadra se non esiste già
     */
    private void bottoneNewSquadraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneNewSquadraActionPerformed
        String nome = jTextFieldNomeSqaudra.getText();
        String sede = jTextFieldSede.getText();
        Squadra squadra = new Squadra(nome, sede);
        // controllo se una squara è già stata inserita
        for (Squadra s : elencoSquadre) {
            if (squadra.equals(s)) {
                JOptionPane.showMessageDialog(null, "Squadra già esistente!");
                jTextFieldNomeSqaudra.setText("");
                jTextFieldSede.setText("");
                return;
            }
        }
        elencoSquadre.add(squadra);
        Csv.salvaSquadraCsv();
        jTextFieldNomeSqaudra.setText("");
        jTextFieldSede.setText("");
        aggiornaTabellaSquadre();
    }//GEN-LAST:event_bottoneNewSquadraActionPerformed

    /*
        Quando premo il bottone new crea una nuova partita se non esiste già
     */
    private void bottoneNewPartitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottoneNewPartitaActionPerformed
        int giornata = (int) jSpinnerGiornata.getValue();
        String squadraCasa = jTextFieldSquadraCasa.getText();
        String squadraTrasferta = jTextFieldSquadraTrasferta.getText();
        if (squadraCasa.equalsIgnoreCase(squadraTrasferta)) {
            JOptionPane.showMessageDialog(null, "Una squadra non può giocare contro se stessa!");
            jTextFieldSquadraCasa.setText("");
            jTextFieldSquadraTrasferta.setText("");
            return;
        }

        int goalCasa = (int) jSpinnerGoalCasa.getValue();
        int goalTrasferta = (int) jSpinnerGoalTrasferta.getValue();

        Partita partita = new Partita(giornata, squadraCasa, squadraTrasferta, goalCasa, goalTrasferta);

        // controllo se una partita esiste già
        for (Partita p : elencoPartite) {
            if (p.equals(partita)) {
                JOptionPane.showMessageDialog(null, "La partita esiste già");
                jSpinnerGiornata.setValue(0);
                jTextFieldSquadraCasa.setText("");
                jTextFieldSquadraTrasferta.setText("");
                jSpinnerGoalCasa.setValue(0);
                jSpinnerGoalTrasferta.setValue(0);
                return;
            }
        }

        elencoPartite.add(partita);
        Csv.salvaPartiteCsv();
        aggiornaTabellaPartite();
        aggiornaTabellaClassifica();
        jSpinnerGiornata.setValue(0);
        jTextFieldSquadraCasa.setText("");
        jTextFieldSquadraTrasferta.setText("");
        jSpinnerGoalCasa.setValue(0);
        jSpinnerGoalTrasferta.setValue(0);

    }//GEN-LAST:event_bottoneNewPartitaActionPerformed

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
            java.util.logging.Logger.getLogger(WinCalcio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WinCalcio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WinCalcio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WinCalcio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WinCalcio().setVisible(true);
            }
        });
    }

    // METODI
    /**
     * serve a settare la tabella delle squadre con i dati
     */
    private void aggiornaTabellaSquadre() {
        DefaultTableModel modello = (DefaultTableModel) tabellaSqaudre.getModel();
        // pulire la tabella dai dati precedenti
        modello.setRowCount(0);
        Object datiRighe[] = new Object[2];
        for (Squadra s : elencoSquadre) {
            datiRighe[0] = s.getNome();
            datiRighe[1] = s.getSede();
            modello.addRow(datiRighe);
        }
    }

    /**
     * serve a settare la tabella delle partite con i dati
     */
    private void aggiornaTabellaPartite() {
        DefaultTableModel modello = (DefaultTableModel) tabellaPartite.getModel();
        // pulire la tabella dai dati precedenti
        modello.setRowCount(0);
        Object datiRighe[] = new Object[5];
        for (Partita p : elencoPartite) {
            datiRighe[0] = p.getGiornata();
            datiRighe[1] = p.getSquadraCasa();
            datiRighe[2] = p.getSquadraTrasferta();
            datiRighe[3] = p.getGoalCasa();
            datiRighe[4] = p.getGoalTrasferta();
            modello.addRow(datiRighe);
        }
    }

    /**
     * serve a visualizzare la classifica
     */
    private void aggiornaTabellaClassifica() {
        DefaultTableModel modello = (DefaultTableModel) tabellaClassifica.getModel();
        // pulire la tabella dai dati precedenti
        modello.setRowCount(0);
        Object datiRighe[] = new Object[4];
        setClassifica();
        Collections.sort(elencoClassifica);
        for (Classifica c : elencoClassifica) {
            datiRighe[0] = c.getNomeSquadra();
            datiRighe[1] = c.getPunti();
            datiRighe[2] = c.getGoalFatti();
            datiRighe[3] = c.getGoalSubiti();
            modello.addRow(datiRighe);
        }
    }

    /**
     * calcola i punti i goal fatti e subiti di ogni squadra
     */
    private void setClassifica() {
        elencoClassifica = new ArrayList<>();
        // scorro tutte le squadre
        for (Squadra s : elencoSquadre) {
            Classifica classifica = new Classifica(s);
            for (Partita p : elencoPartite) {
                // controllo se gioca in casa
                if (classifica.getSquadra().getNome().equals(p.getSquadraCasa())) {
                    // controllo il risultato
                    getPuntiGoalCasa(classifica, p);
                }
                // controllo se gioca in trasferta
                if (classifica.getSquadra().getNome().equals(p.getSquadraTrasferta())) {
                    getPuntiGoalTrasferta(classifica, p);
                }

            }
            elencoClassifica.add(classifica);
        }
    }

    /**
     * calcola il risultato in casa
     *
     * @param c
     * @param p
     */
    private void getPuntiGoalCasa(Classifica c, Partita p) {
        if (p.getGoalCasa() > p.getGoalTrasferta()) {
            c.addPunti(3);
            c.addGoalFatti(p.getGoalCasa());
            c.addGoalSubiti(p.getGoalTrasferta());
        } else if (p.getGoalCasa() == p.getGoalTrasferta()) {
            c.addPunti(1);
            c.addGoalFatti(p.getGoalCasa());
            c.addGoalSubiti(p.getGoalTrasferta());
        } else {
            c.addPunti(0);
            c.addGoalFatti(p.getGoalCasa());
            c.addGoalSubiti(p.getGoalTrasferta());
        }
    }

    /**
     * calcola il risultato quando gioca in trasferta
     *
     * @param c
     * @param p
     */
    private void getPuntiGoalTrasferta(Classifica c, Partita p) {
        if (p.getGoalTrasferta() > p.getGoalCasa()) {
            c.addPunti(3);
            c.addGoalFatti(p.getGoalTrasferta());
            c.addGoalSubiti(p.getGoalCasa());
        } else if (p.getGoalCasa() == p.getGoalTrasferta()) {
            c.addPunti(1);
            c.addGoalFatti(p.getGoalTrasferta());
            c.addGoalSubiti(p.getGoalCasa());
        } else {
            c.addPunti(0);
            c.addGoalFatti(p.getGoalTrasferta());
            c.addGoalSubiti(p.getGoalCasa());

        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateSquadra;
    private javax.swing.JButton bottoneNewPartita;
    private javax.swing.JButton bottoneNewSquadra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinnerGiornata;
    private javax.swing.JSpinner jSpinnerGoalCasa;
    private javax.swing.JSpinner jSpinnerGoalTrasferta;
    private javax.swing.JTextField jTextFieldNomeSqaudra;
    private javax.swing.JTextField jTextFieldSede;
    private javax.swing.JTextField jTextFieldSquadraCasa;
    private javax.swing.JTextField jTextFieldSquadraTrasferta;
    private javax.swing.JTable tabellaClassifica;
    private javax.swing.JTable tabellaPartite;
    private javax.swing.JTable tabellaSqaudre;
    // End of variables declaration//GEN-END:variables

}