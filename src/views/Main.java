/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Main extends javax.swing.JFrame {
    
    //RedimencionarImagem resize = new RedimencionarImagem();

    private static Main instance;
    
    public static Main getInstance(){
        if(instance == null){
            instance = new Main();
        }
        
        return instance;
    }
    /**
     * Creates new form Principal
     */
    public Main() {
        initComponents();

        //Serve para buscar a imagem pelo caminho que ela fica dentro do programa
        ClassLoader cl = this.getClass().getClassLoader();
        ImageIcon icon = new ImageIcon(cl.getResource("views/imagens/gifs/deadpool_Hello.gif"));
        //Abaixo a imagem do seu rótulo é alterada pelo objeto rezise que recebe um parametro
        //do nome do seu jlabel, a largura e altura desejada.
        labelIconAnimado.setIcon(new ImageIcon(icon.getImage().getScaledInstance(labelIconAnimado.getWidth(), labelIconAnimado.getHeight(), Image.SCALE_DEFAULT)));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnDecks = new javax.swing.JButton();
        btnHistorico = new javax.swing.JButton();
        btnNovoDeck = new javax.swing.JButton();
        btnNovaPartida = new javax.swing.JButton();
        btnRegras = new javax.swing.JButton();
        btnSobre = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtPesquisar = new javax.swing.JTextField();
        btnPesquisar = new javax.swing.JButton();
        btnTodasCartas = new javax.swing.JButton();
        btnColecao = new javax.swing.JButton();
        labelIconAnimado = new javax.swing.JLabel();
        labelLogo = new javax.swing.JLabel();
        labelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Battle System");
        setResizable(false);
        setSize(new java.awt.Dimension(840, 500));

        jPanel2.setBackground(new java.awt.Color(52, 52, 52));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        btnDecks.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnDecks.setText("Decks");
        btnDecks.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDecks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDecksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDecksMouseExited(evt);
            }
        });

        btnHistorico.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnHistorico.setText("Histórico");
        btnHistorico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHistoricoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHistoricoMouseExited(evt);
            }
        });
        btnHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoricoActionPerformed(evt);
            }
        });

        btnNovoDeck.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnNovoDeck.setText("Novo Deck");
        btnNovoDeck.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoDeck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNovoDeckMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNovoDeckMouseExited(evt);
            }
        });

        btnNovaPartida.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnNovaPartida.setText("Nova Partida");
        btnNovaPartida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovaPartida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNovaPartidaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNovaPartidaMouseExited(evt);
            }
        });

        btnRegras.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnRegras.setText("Regras");
        btnRegras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegrasMouseExited(evt);
            }
        });

        btnSobre.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnSobre.setText("Sobre");
        btnSobre.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSobreMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSobreMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnDecks, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNovaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNovoDeck, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRegras, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(btnDecks, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(btnNovaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(btnNovoDeck, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(btnHistorico, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addComponent(btnRegras, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(160, 160, 160)
                    .addComponent(btnSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPesquisar.setBackground(new java.awt.Color(0, 0, 0));
        txtPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        txtPesquisar.setToolTipText("");
        txtPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPesquisar.setName(""); // NOI18N
        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });
        txtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPesquisarKeyPressed(evt);
            }
        });
        jPanel3.add(txtPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 440, -1));

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/icons/lupa.png"))); // NOI18N
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseExited(evt);
            }
        });
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel3.add(btnPesquisar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 40, -1));

        btnTodasCartas.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnTodasCartas.setText("Cartas do Jogo");
        btnTodasCartas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTodasCartas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTodasCartasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTodasCartasMouseExited(evt);
            }
        });
        jPanel3.add(btnTodasCartas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, 160, 40));

        btnColecao.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnColecao.setText("Minha Coleção");
        btnColecao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnColecao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnColecaoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnColecaoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnColecaoMouseExited(evt);
            }
        });
        btnColecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColecaoActionPerformed(evt);
            }
        });
        jPanel3.add(btnColecao, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 160, 40));

        labelIconAnimado.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(labelIconAnimado, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 122, 150));

        labelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/logoBS.png"))); // NOI18N
        labelLogo.setToolTipText("");
        labelLogo.setMaximumSize(new java.awt.Dimension(280, 110));
        labelLogo.setMinimumSize(new java.awt.Dimension(280, 110));
        labelLogo.setPreferredSize(new java.awt.Dimension(280, 110));
        jPanel3.add(labelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 347, 143));

        labelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/views/imagens/fundo.jpg"))); // NOI18N
        jPanel3.add(labelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 500));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnColecaoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnColecaoMouseEntered
        btnColecao.setBackground(Color.gray.darker());
    }//GEN-LAST:event_btnColecaoMouseEntered

    private void btnColecaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnColecaoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnColecaoMouseClicked

    private void btnColecaoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnColecaoMouseExited
        // TODO add your handling code here:
        btnColecao.setBackground(Color.gray.brighter());
    }//GEN-LAST:event_btnColecaoMouseExited

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void btnColecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColecaoActionPerformed
        // Teste para usar icone do deadpool na menssagem de erro.
        ClassLoader cl = this.getClass().getClassLoader();
        ImageIcon icone = new ImageIcon(cl.getResource("views/imagens/gifs/deadpoolErro.gif"));
        icone.setImage(new ImageIcon(icone.getImage().getScaledInstance(200, 150, Image.SCALE_DEFAULT)).getImage());
        JOptionPane.showMessageDialog(null, "Menssagem", "Mensagem", 0, icone);
    }//GEN-LAST:event_btnColecaoActionPerformed

    private void btnTodasCartasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTodasCartasMouseEntered
        btnTodasCartas.setBackground(Color.gray.darker());
    }//GEN-LAST:event_btnTodasCartasMouseEntered

    private void btnTodasCartasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTodasCartasMouseExited
        btnTodasCartas.setBackground(Color.gray.brighter());
    }//GEN-LAST:event_btnTodasCartasMouseExited

    private void btnDecksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecksMouseEntered
        btnDecks.setBackground(Color.gray.darker());
    }//GEN-LAST:event_btnDecksMouseEntered

    private void btnDecksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDecksMouseExited
        btnDecks.setBackground(Color.gray.brighter());

    }//GEN-LAST:event_btnDecksMouseExited

    private void btnNovaPartidaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovaPartidaMouseEntered
        btnNovaPartida.setBackground(Color.gray.darker());
    }//GEN-LAST:event_btnNovaPartidaMouseEntered

    private void btnNovaPartidaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovaPartidaMouseExited
        btnNovaPartida.setBackground(Color.gray.brighter());

    }//GEN-LAST:event_btnNovaPartidaMouseExited

    private void btnNovoDeckMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoDeckMouseEntered
        btnNovoDeck.setBackground(Color.gray.darker());

    }//GEN-LAST:event_btnNovoDeckMouseEntered

    private void btnNovoDeckMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNovoDeckMouseExited
        btnNovoDeck.setBackground(Color.gray.brighter());
    }//GEN-LAST:event_btnNovoDeckMouseExited

    private void btnHistoricoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistoricoMouseEntered
        btnHistorico.setBackground(Color.gray.darker());
    }//GEN-LAST:event_btnHistoricoMouseEntered

    private void btnHistoricoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHistoricoMouseExited
        btnHistorico.setBackground(Color.gray.brighter());
    }//GEN-LAST:event_btnHistoricoMouseExited

    private void btnRegrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegrasMouseEntered
        btnRegras.setBackground(Color.gray.darker());
    }//GEN-LAST:event_btnRegrasMouseEntered

    private void btnRegrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegrasMouseExited
        btnRegras.setBackground(Color.gray.brighter());
    }//GEN-LAST:event_btnRegrasMouseExited

    private void btnSobreMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSobreMouseEntered
        btnSobre.setBackground(Color.gray.darker());
    }//GEN-LAST:event_btnSobreMouseEntered

    private void btnSobreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSobreMouseExited
        btnSobre.setBackground(Color.gray.brighter());
    }//GEN-LAST:event_btnSobreMouseExited

    private void btnPesquisarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseEntered
        btnPesquisar.setBackground(Color.gray.darker());
    }//GEN-LAST:event_btnPesquisarMouseEntered

    private void btnPesquisarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseExited
        btnPesquisar.setBackground(Color.gray.brighter());
    }//GEN-LAST:event_btnPesquisarMouseExited

    private void btnPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseClicked
        //System.out.println("Pesquisar");
    }//GEN-LAST:event_btnPesquisarMouseClicked

    private void txtPesquisarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisarKeyPressed
        //Quando apertar 'ENTER' no texto de pesquisa, o botão será clicado para fazer a pesquisa.
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            btnPesquisar.doClick();
        }
    }//GEN-LAST:event_txtPesquisarKeyPressed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        System.out.println("Pesquisar");
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoricoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHistoricoActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnColecao;
    private javax.swing.JButton btnDecks;
    private javax.swing.JButton btnHistorico;
    private javax.swing.JButton btnNovaPartida;
    private javax.swing.JButton btnNovoDeck;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnRegras;
    private javax.swing.JButton btnSobre;
    private javax.swing.JButton btnTodasCartas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelFundo;
    private javax.swing.JLabel labelIconAnimado;
    private javax.swing.JLabel labelLogo;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables
}
