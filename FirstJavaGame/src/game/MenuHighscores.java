/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.IOException;

/**
 *
 * @author Steve Odai-Stephens
 */
public class MenuHighscores extends javax.swing.JPanel {

    /**
     * Creates new form MenuHighscores
     */
    public MenuHighscores() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        score = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        highscores = new javax.swing.JTextArea();

        setBackground(new java.awt.Color(0, 0, 0));

        score.setBackground(new java.awt.Color(0, 0, 0));
        score.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        score.setForeground(new java.awt.Color(255, 255, 255));
        score.setText("Show Scores");
        score.setBorderPainted(false);
        score.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreActionPerformed(evt);
            }
        });

        highscores.setColumns(20);
        highscores.setRows(5);
        jScrollPane1.setViewportView(highscores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(score)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(score)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void scoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreActionPerformed
        // TODO add your handling code here:
        String file_name = "sample.txt";
        try {
            ReadFile file = new ReadFile(file_name);
            String[] aryLines = file.OpenFile();

            int i;
            for (i = 0; i < aryLines.length; i++) {
                highscores.append(aryLines[i] + System.lineSeparator());
            }
        } catch (IOException e) {

//            highscores.setText(file_name);
        }
    }//GEN-LAST:event_scoreActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea highscores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton score;
    // End of variables declaration//GEN-END:variables
}