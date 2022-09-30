package gui_password_generator_java;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
            
    String[] combined_chars = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9","!","@","#","$","%","^","&","*","(",")","_","-","+","="};
            
    Random rand = new Random();
    private void initComponents() {

        for (int i = 0; i < combined_chars.length; i++) {
                int randomIndexToSwap = rand.nextInt(combined_chars.length);
                String temp = combined_chars[randomIndexToSwap];
                combined_chars[randomIndexToSwap] = combined_chars[i];
                combined_chars[i] = temp;
        }

        getContentPane().setBackground(new java.awt.Color(18,18,18));
        setResizable(false);
        jScrollPane1 = new javax.swing.JScrollPane();
        genArea = new javax.swing.JTextField();
        passwordLen = new javax.swing.JTextField();
        genPass = new javax.swing.JButton();
        copyPass = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUI Password Generator");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(18, 18, 18));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);

        genArea.setColumns(20);
        genArea.setEditable(false);
        genArea.setForeground(new java.awt.Color(255, 255, 255));
        genArea.setBackground(new java.awt.Color(28, 28, 39));
        jScrollPane1.setViewportView(genArea);

        passwordLen.setForeground(new java.awt.Color(255, 255, 255));
        passwordLen.setBackground(new java.awt.Color(28, 28, 39));
        passwordLen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent ke) {
               if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar()== java.awt.event.KeyEvent.VK_ENTER ||ke.getKeyChar()== java.awt.event.KeyEvent.VK_BACK_SPACE ) {
                  passwordLen.setEditable(true);
               } else {
                  passwordLen.setEditable(false);

               }
            }
        });
        
        genPass.setText("Generate");
        genPass.setForeground(new java.awt.Color(255, 255, 255));
        genPass.setFont(new java.awt.Font("Segoe UI", 0, 12));
        genPass.setBackground(new java.awt.Color(28, 28, 39));
        genPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed() {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                genActionPerformed();
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });

        copyPass.setText("Copy");
        copyPass.setForeground(new java.awt.Color(255, 255, 255));
        copyPass.setFont(new java.awt.Font("Segoe UI", 0, 12));
        copyPass.setBackground(new java.awt.Color(28, 28, 39));
        copyPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed() {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                copyActionPerformed();
                //throw new UnsupportedOperationException("Not supported yet.");
            }
        });

        clear.setText("Clear");
        clear.setForeground(new java.awt.Color(255, 255, 255));
        clear.setBackground(new java.awt.Color(28, 28, 39));
        clear.setFont(new java.awt.Font("Segoe UI", 0, 12));
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(genPass, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                                .addComponent(copyPass, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(passwordLen, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                                        .addComponent(genArea))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(passwordLen, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(genPass, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(copyPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(genArea, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(19, 19, 19))
        );

        pack();
    }

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        genArea.setText("");
    }
    private void genActionPerformed()
    {
        long len = Long.parseLong(passwordLen.getText());

        for (int i = 0; i < combined_chars.length; i++) {
            int randomIndexToSwap = rand.nextInt(combined_chars.length);
            String temp = combined_chars[randomIndexToSwap];
            combined_chars[randomIndexToSwap] = combined_chars[i];
            combined_chars[i] = temp;
	    }
        
        String result = "";
        
        for (long i = 0; i!= len;i++)
        {
            int randPos = rand.nextInt(combined_chars.length);
            result = result + combined_chars[randPos]; 
        }

        var letters = Arrays.asList(result.split(""));
        Collections.shuffle(letters);
        String shuffled = "";
        for (String letter : letters) {
          shuffled += letter;
        }
        
        result = shuffled;
        
        genArea.setText(result);

    }
    
    private void copyActionPerformed()
    {
        StringSelection stringSelection = new StringSelection(genArea.getText());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    private javax.swing.JButton copyPass;
    private javax.swing.JTextField genArea;
    private javax.swing.JButton genPass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField passwordLen;
    private javax.swing.JButton clear;
}
