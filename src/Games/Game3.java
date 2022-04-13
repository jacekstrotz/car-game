/* Game3 
 * 
 * Description: A stricter version of Game2, with a message dialog that blocks
 * the user from answering more than one time. I used switch statements to
 * organize the answers. It seemed the easiest and simplest to me at the time.
 * Since I was using the Designer instead of writing the code myself, I figured
 * I would avoid editing the Code Generation done by the IDE. Therefore, I also
 * avoided a Java button array.
 */
package Games;

import Data.MultiCar;
import Data.Utility;
import Frames.FrameManager;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author strotz
 */
public class Game3 extends javax.swing.JFrame {
    String imageFileName;
    Image scaledImage;
    
    int correct_index;
    int correct_count, incorrect_count, answer_count;
    
    String answer;
    
    MyPanel myPanel;
    
    public Game3() {
        initComponents();
        
        MultiCar.Shuffle();
        
        answerLabel.setText("");
        
        answer = MultiCar.getIndex(0).getName();
        imageFileName = MultiCar.getIndex(0).getFile();
        try {
            scaledImage = ImageIO.read(new File(MultiCar.getIndex(0).getFile()))
                    .getScaledInstance( 150, 150, Image.SCALE_DEFAULT);
            
            this.repaint();
            
            correct_index = Utility.getRandomNumberUsingNextInt(1, 4);
            switch (correct_index) {
                case 1:
                    optionButton1.setText(MultiCar.getIndex(0).getName());
                    optionButton2.setText(MultiCar.getIndex(1).getName());
                    optionButton3.setText(MultiCar.getIndex(2).getName());
                    optionButton4.setText(MultiCar.getIndex(3).getName());
                    break;
                case 2:
                    optionButton2.setText(MultiCar.getIndex(0).getName());
                    optionButton3.setText(MultiCar.getIndex(1).getName());
                    optionButton4.setText(MultiCar.getIndex(2).getName());
                    optionButton1.setText(MultiCar.getIndex(3).getName());
                    break;
                case 3:
                    optionButton3.setText(MultiCar.getIndex(0).getName());
                    optionButton4.setText(MultiCar.getIndex(1).getName());
                    optionButton1.setText(MultiCar.getIndex(2).getName());
                    optionButton2.setText(MultiCar.getIndex(3).getName());
                    break;
                case 4:
                    optionButton4.setText(MultiCar.getIndex(0).getName());
                    optionButton1.setText(MultiCar.getIndex(1).getName());
                    optionButton2.setText(MultiCar.getIndex(2).getName());
                    optionButton3.setText(MultiCar.getIndex(3).getName());
                    break;
            }
        } catch (IOException e) {
            System.out.println("[DEBUG] file-read failure" + imageFileName);
        }

        myPanel = new MyPanel(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainLabel = new javax.swing.JLabel();
        returnButton = new javax.swing.JButton();
        stringLabel = new javax.swing.JLabel();
        optionButton1 = new javax.swing.JButton();
        optionButton3 = new javax.swing.JButton();
        optionButton2 = new javax.swing.JButton();
        optionButton4 = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        answerLabel = new javax.swing.JLabel();
        nextButton = new javax.swing.JButton();
        incorrectLabel = new javax.swing.JLabel();
        correctLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        resetButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 400));

        mainLabel.setFont(new java.awt.Font(".SF NS Text", 0, 24)); // NOI18N
        mainLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainLabel.setText("Game 3");

        returnButton.setText("<--");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        stringLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stringLabel.setText("Identify this car.");

        optionButton1.setText("[OPTION 1]");
        optionButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionButton1ActionPerformed(evt);
            }
        });

        optionButton3.setText("[OPTION 3]");
        optionButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionButton3ActionPerformed(evt);
            }
        });

        optionButton2.setText("[OPTION 2]");
        optionButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionButton2ActionPerformed(evt);
            }
        });

        optionButton4.setText("[OPTION 4]");
        optionButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionButton4ActionPerformed(evt);
            }
        });

        label1.setText("Answer:");

        answerLabel.setText("[PLACEHOLDER]");

        nextButton.setText(">");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        incorrectLabel.setText("Incorrect: 0");

        correctLabel.setText("Correct: 0");

        jLabel1.setText("---");

        resetButton.setFont(new java.awt.Font(".SF NS Text", 1, 13)); // NOI18N
        resetButton.setText("RESET");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stringLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(resetButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(returnButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mainLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(optionButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(optionButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 14, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(optionButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(optionButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(answerLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(correctLabel)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(incorrectLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(returnButton)
                    .addComponent(mainLabel))
                .addGap(202, 202, 202)
                .addComponent(stringLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionButton1)
                    .addComponent(optionButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optionButton2)
                    .addComponent(optionButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(answerLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correctLabel)
                    .addComponent(incorrectLabel)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nextButton)
                    .addComponent(resetButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        FrameManager.displayFrame(this, "Main");
    }//GEN-LAST:event_returnButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        answer_count = 0;
        MultiCar.Shuffle();
        
        answerLabel.setText("");
        
        answer = MultiCar.getIndex(0).getName();
        imageFileName = MultiCar.getIndex(0).getFile();
        try {
            scaledImage = ImageIO.read(new File(MultiCar.getIndex(0).getFile()))
                    .getScaledInstance( 150, 150, Image.SCALE_DEFAULT);
            
            this.repaint();
            
            correct_index = Utility.getRandomNumberUsingNextInt(1, 4);
            switch (correct_index) {
                case 1:
                    optionButton1.setText(MultiCar.getIndex(0).getName());
                    optionButton2.setText(MultiCar.getIndex(1).getName());
                    optionButton3.setText(MultiCar.getIndex(2).getName());
                    optionButton4.setText(MultiCar.getIndex(3).getName());
                    break;
                case 2:
                    optionButton2.setText(MultiCar.getIndex(0).getName());
                    optionButton3.setText(MultiCar.getIndex(1).getName());
                    optionButton4.setText(MultiCar.getIndex(2).getName());
                    optionButton1.setText(MultiCar.getIndex(3).getName());
                    break;
                case 3:
                    optionButton3.setText(MultiCar.getIndex(0).getName());
                    optionButton4.setText(MultiCar.getIndex(1).getName());
                    optionButton1.setText(MultiCar.getIndex(2).getName());
                    optionButton2.setText(MultiCar.getIndex(3).getName());
                    break;
                case 4:
                    optionButton4.setText(MultiCar.getIndex(0).getName());
                    optionButton1.setText(MultiCar.getIndex(1).getName());
                    optionButton2.setText(MultiCar.getIndex(2).getName());
                    optionButton3.setText(MultiCar.getIndex(3).getName());
                    break;
            }
        } catch (IOException e) {
            System.out.println("[DEBUG] file-read failure" + imageFileName);
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void optionButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionButton1ActionPerformed
        answer_count++;
        if (answer_count > 1) {
            JOptionPane.showMessageDialog(this, 
                    "The current question has already been attempted.\n\nCorrect answer: " 
                    + answer);
        }
        else if (correct_index == 1) {
            answerLabel.setText("CORRECT");
            answerLabel.setForeground(Color.GREEN);
            
            correct_count++;
            correctLabel.setText("Correct: " + correct_count);
        } else {
            answerLabel.setText("INCORRECT");
            answerLabel.setForeground(Color.RED);
            
            incorrect_count++;
            incorrectLabel.setText("Incorrect: " + incorrect_count);
        }
    }//GEN-LAST:event_optionButton1ActionPerformed

    private void optionButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionButton2ActionPerformed
        answer_count++;
        if (answer_count > 1) {
            JOptionPane.showMessageDialog(this, 
                    "The current question has already been attempted.\n\nCorrect answer: " 
                    + answer);
        }
        else if (correct_index == 2) {
            answerLabel.setText("CORRECT");
            answerLabel.setForeground(Color.GREEN);
            
            correct_count++;
            correctLabel.setText("Correct: " + correct_count);
        } else {
            answerLabel.setText("INCORRECT");
            answerLabel.setForeground(Color.RED);
            
            incorrect_count++;
            incorrectLabel.setText("Incorrect: " + incorrect_count);
        }
    }//GEN-LAST:event_optionButton2ActionPerformed

    private void optionButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionButton3ActionPerformed
        answer_count++;
        if (answer_count > 1) {
            JOptionPane.showMessageDialog(this, 
                    "The current question has already been attempted.\n\nCorrect answer: " 
                    + answer);
        }
        else if (correct_index == 3) {
            answerLabel.setText("CORRECT");
            answerLabel.setForeground(Color.GREEN);
            
            correct_count++;
            correctLabel.setText("Correct: " + correct_count);
        } else {
            answerLabel.setText("INCORRECT");
            answerLabel.setForeground(Color.RED);
            
            incorrect_count++;
            incorrectLabel.setText("Incorrect: " + incorrect_count);
        }
    }//GEN-LAST:event_optionButton3ActionPerformed

    private void optionButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionButton4ActionPerformed
        answer_count++;
        if (answer_count > 1) {
            JOptionPane.showMessageDialog(this, 
                    "The current question has already been attempted.\n\nCorrect answer: " 
                    + answer);
        }
        else if (correct_index == 4) {
            answerLabel.setText("CORRECT");
            answerLabel.setForeground(Color.GREEN);
            
            correct_count++;
            correctLabel.setText("Correct: " + correct_count);
        } else {
            answerLabel.setText("INCORRECT");
            answerLabel.setForeground(Color.RED);
            
            incorrect_count++;
            incorrectLabel.setText("Incorrect: " + incorrect_count);
        }
    }//GEN-LAST:event_optionButton4ActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        incorrect_count = 0;
        correct_count = 0;
        answer_count = 0;
        
        correctLabel.setText("Correct: " + correct_count);
        incorrectLabel.setText("Incorrect: " + incorrect_count);
        answerLabel.setText("");
    }//GEN-LAST:event_resetButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Game3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game3().setVisible(true);
            }
        });
    }
    
    class MyPanel extends JPanel {

        MyPanel(JFrame theFrame) {
            this.setSize(420, 300);
            this.setLocation(127, 55);
            this.setBackground(Color.white);

            theFrame.add(this);
        }

        public void paintComponent(Graphics g) {
            if (scaledImage == null)
                return;

            g.setColor(Color.BLACK);
            g.fillRect(4,4,152,152);
            g.drawImage(scaledImage, 5, 5, this);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answerLabel;
    private javax.swing.JLabel correctLabel;
    private javax.swing.JLabel incorrectLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel mainLabel;
    private javax.swing.JButton nextButton;
    private javax.swing.JButton optionButton1;
    private javax.swing.JButton optionButton2;
    private javax.swing.JButton optionButton3;
    private javax.swing.JButton optionButton4;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel stringLabel;
    // End of variables declaration//GEN-END:variables
}