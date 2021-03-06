/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import city.cs.engine.SoundClip;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * @author Steve Odai-Stephens
 */
public class MenuEnd extends javax.swing.JPanel {

    /**
     * variable of SoundClip class 
     */
    private SoundClip gameMusic;

    /**
     * Creates new form MenuEnd
     */
    public MenuEnd() {
        initComponents();
        try {
            gameMusic = new SoundClip("data/menuend.mp3");
            gameMusic.loop();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        restart = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        gameover = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(532, 483));
        setLayout(null);

        restart.setBackground(new java.awt.Color(0, 0, 0));
        restart.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        restart.setForeground(new java.awt.Color(255, 255, 255));
        restart.setText("RESTART");
        restart.setBorderPainted(false);
        restart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restartActionPerformed(evt);
            }
        });
        add(restart);
        restart.setBounds(0, 390, 190, 45);

        exit.setBackground(new java.awt.Color(0, 0, 0));
        exit.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("EXIT");
        exit.setBorderPainted(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        add(exit);
        exit.setBounds(390, 390, 120, 47);

        gameover.setBackground(new java.awt.Color(0, 0, 0));
        gameover.setFont(new java.awt.Font("Perpetua Titling MT", 0, 36)); // NOI18N
        gameover.setForeground(new java.awt.Color(255, 255, 255));
        gameover.setText("GAME OVER");
        add(gameover);
        gameover.setBounds(150, 300, 220, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/game/gameover.gif"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, -60, 510, 440);
    }// </editor-fold>//GEN-END:initComponents

    private void restartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restartActionPerformed
        gameMusic.stop();
        try {
            // TODO add your handling code here:
            Game game = new Game();
        } catch (IOException ex) {
            Logger.getLogger(MenuEnd.class.getName()).log(Level.SEVERE, null, ex);
        }
        Game.menuend.dispose();
    }//GEN-LAST:event_restartActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel gameover;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton restart;
    // End of variables declaration//GEN-END:variables
}
