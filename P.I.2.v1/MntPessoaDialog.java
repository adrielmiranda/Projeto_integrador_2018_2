package agendatelefonica;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class MntPessoaDialog extends javax.swing.JDialog
{
 // operacao feita pelo usuario
 public static final int OPERACAO_OK = 0;
 public static final int OPERACAO_ELIMINAR = 1;
 public static final int OPERACAO_CANCELAR = 2;
 
 private Connection bdConnection;
 private Pessoa pCurrent; // dados da pessoa corrente
 private int operacao;
 private boolean estaInserindo;
 private final FramePrincipal janelaPai;

 public MntPessoaDialog(java.awt.Frame parent, boolean modal)
 {
 super(parent, modal);
 initComponents();

 pCurrent = new Pessoa();
 estaInserindo = true;
 janelaPai = (FramePrincipal)parent;

 bdConnection = null;

 // centraliza janela na tela
 this.setLocationRelativeTo(null);
 }

 public void setConnection(Connection bdConnection)
 {
 this.bdConnection = bdConnection;
 }

 public int getOperacao()
 {
 return operacao;
 }

 public Pessoa getPessoa()
 {
 return pCurrent;
 }

 public void setPessoa(Pessoa p)
 {
 if(p != null)
 {
 pCurrent = new Pessoa(p.getId(), p.getNome(), p.getFone());
 nomeTextField.setText(p.getNome());
 foneTextField.setText(p.getFone());
 }
 }

 public void inserindoNovo(boolean novaPessoa)
 {
 estaInserindo = novaPessoa;

 if (novaPessoa)
 {
 eliminaButton.setEnabled(false);
 }
 else
 {
 nomeTextField.setEditable(false);
 nomeTextField.setFocusable(false);
 eliminaButton.setEnabled(true);
 }
 }
 
 
    /**
     * This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeTextField = new javax.swing.JTextField();
        foneTextField = new javax.swing.JTextField();
        okButton = new javax.swing.JButton();
        eliminaButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Nome:");

        jLabel2.setText("Telefone:");

        foneTextField.addKeyListener(new java.awt.event.KeyAdapter()
        {
            public void keyTyped(java.awt.event.KeyEvent evt)
            {
                foneTextFieldKeyTyped(evt);
            }
        });

        okButton.setText("Ok");
        okButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                okButtonActionPerformed(evt);
            }
        });

        eliminaButton.setText("Eliminar");
        eliminaButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                eliminaButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(nomeTextField))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(foneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(okButton, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(eliminaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cancelButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nomeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(foneTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(okButton)
                    .addComponent(cancelButton)
                    .addComponent(eliminaButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void foneTextFieldKeyTyped(java.awt.event.KeyEvent evt)//GEN-FIRST:event_foneTextFieldKeyTyped
    {//GEN-HEADEREND:event_foneTextFieldKeyTyped
        // permitir que somente números sejam digitados no campo telefone
 char c = evt.getKeyChar();
 if(!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) ||
 (c == KeyEvent.VK_DELETE)))
 {
 evt.consume();
 }

    }//GEN-LAST:event_foneTextFieldKeyTyped

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_cancelButtonActionPerformed
    {//GEN-HEADEREND:event_cancelButtonActionPerformed
 operacao = OPERACAO_CANCELAR;
 setVisible(false);
 dispose();
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_okButtonActionPerformed
    {//GEN-HEADEREND:event_okButtonActionPerformed
      // valida dados
 if(estaInserindo)
 {
 try
 {
 pCurrent.setNome(nomeTextField.getText());
 }
 catch(IllegalArgumentException ex)
 {
 String msg = "Nome não pode ser vazio e deve conter somente letras";
 JOptionPane.showMessageDialog(this, msg,
 "Dados das Pessoas",
 JOptionPane.ERROR_MESSAGE);
 nomeTextField.requestFocus();
 return;
 }
 }
 try
 {
 pCurrent.setFone(foneTextField.getText());
 }
 catch(IllegalArgumentException ex)
 {
 String msg = "Telefone Inválido.\n" +
 "Formatos Válidos:\n" +
 " Sem DDD: 9999-9999 ou 99999-9999\n" +
 " Com DDD: 99 9999-9999 ou 99 99999-9999";
 JOptionPane.showMessageDialog(this, msg,
 "Dados das Pessoas",
 JOptionPane.ERROR_MESSAGE);
 foneTextField.requestFocus();
 return;
 }

 // verifica se nome já foi inserido
 if(estaInserindo)
 {
 ArrayList<Pessoa> pessoas =
janelaPai.buscaNomesTelefones(nomeTextField.getText());
 if((pessoas != null) && (pessoas.size() > 0))
 {
 JOptionPane.showMessageDialog(this, "Pessoa já cadastrada!",
 "Dados das Pessoas",
 JOptionPane.ERROR_MESSAGE);
 nomeTextField.requestFocus();
 return;
 }
 }

 // adiciona ou atualiza dados pessoa na base de dados
 if (estaInserindo)
 {
 int id = DadosPessoas.inserirPessoa(bdConnection, nomeTextField.getText(),
 foneTextField.getText());
 if(id < 0)
 return;
 // atualiza ID da pessoa inserida na base de dados
 pCurrent.setId(id);
 }
 else
 {
 DadosPessoas.alterarTelefone(bdConnection, pCurrent);
 }

 // indica que operação de inserção foi feita e fecha janaela
 operacao = OPERACAO_OK;
 setVisible(false);
 dispose();
    }//GEN-LAST:event_okButtonActionPerformed

    
    
    private void eliminaButtonActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_eliminaButtonActionPerformed
    {//GEN-HEADEREND:event_eliminaButtonActionPerformed
        
 // elimina pessoa da base de dados
 DadosPessoas.eliminarPessoa(bdConnection, pCurrent);

 // indica que operação de inserção foi feita e fecha janela
 operacao = OPERACAO_ELIMINAR;
 setVisible(false);
 dispose();
    }//GEN-LAST:event_eliminaButtonActionPerformed

    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(MntPessoaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MntPessoaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MntPessoaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MntPessoaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                MntPessoaDialog dialog = new MntPessoaDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton eliminaButton;
    private javax.swing.JTextField foneTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nomeTextField;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables
}
