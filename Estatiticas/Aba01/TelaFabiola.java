/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matematica;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.swing.RowFilter.Entry;

/**
 *
 * @author ADRIEL
 */
public class TelaFabiola extends javax.swing.JFrame {

    private static double media2;
    private static String moda2;
    public static double mediana2;
    public static double variancia2;
    public static double desviopadrao2;

    /**
     * Creates new form TelaFabiola
     */
    public TelaFabiola() {
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

        btSair = new javax.swing.JButton();
        lbMedia = new javax.swing.JLabel();
        lbModa = new javax.swing.JLabel();
        lbMediana = new javax.swing.JLabel();
        lbVariancia = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textMedia = new javax.swing.JTextField();
        textModa = new javax.swing.JTextField();
        textDesvioPadrao = new javax.swing.JTextField();
        textVariancia = new javax.swing.JTextField();
        textMediana = new javax.swing.JTextField();
        btCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btSair.setText("Sair");
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        lbMedia.setText("Média :");

        lbModa.setText("Moda :");

        lbMediana.setText("Mediana :");

        lbVariancia.setText("Variância :");

        jLabel1.setText("Desvio Padrão :");

        textMedia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textMediaActionPerformed(evt);
            }
        });

        textModa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textModaActionPerformed(evt);
            }
        });

        textDesvioPadrao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDesvioPadraoActionPerformed(evt);
            }
        });

        btCalcular.setText("Calcular");
        btCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btCalcular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                        .addComponent(btSair)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lbVariancia)
                            .addComponent(lbMedia)
                            .addComponent(lbModa)
                            .addComponent(lbMediana))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textVariancia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textDesvioPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMediana, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textModa, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMedia)
                    .addComponent(textMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbModa)
                    .addComponent(textModa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMediana)
                    .addComponent(textMediana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVariancia)
                    .addComponent(textVariancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(textDesvioPadrao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btSair)
                    .addComponent(btCalcular))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        System.exit(0);       
    }//GEN-LAST:event_btSairActionPerformed

    private void textMediaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textMediaActionPerformed

//        int resultado = 1 + 2;
//
//        textMedia.setText(String.valueOf(resultado));
        // textMedia.setText(media2);
        //textMedia.setText(media2);
        //.setText(String.valueOf(media2));

    }//GEN-LAST:event_textMediaActionPerformed

    private void btCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCalcularActionPerformed
        
        textMedia.setText(String.format("%.2f", media2));
       
        textModa.setText(String.format( moda2) );
                    
        textMediana.setText(String.format("%.2f", mediana2));

        textVariancia.setText(String.format("%.2f", variancia2));

        textDesvioPadrao.setText(String.format("%.2f", desviopadrao2));

    }//GEN-LAST:event_btCalcularActionPerformed

    private void textDesvioPadraoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDesvioPadraoActionPerformed
       
    }//GEN-LAST:event_textDesvioPadraoActionPerformed
    private void textModaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textModaActionPerformed
           
       
       
    }//GEN-LAST:event_textModaActionPerformed

    public static void main(String args[]) {

        //=============================================================
        double valoresVenda[] = {1, 46, 49, 51, 54, 54, 59, 59, 60, 60, 61, 61, 62, 65, 66, 66, 67, 67, 69, 70, 70, 71,
        72, 74, 74, 76, 79, 80, 82, 87, 88};

        System.out.print("\nQuantidades de vendas: " + "\n");
        Arrays.sort(valoresVenda);
        for (int i = 0; i < valoresVenda.length; i++) {

            System.out.printf("%.0f%n", valoresVenda[i], "\n");
        }

        System.out.print("\nNúmeros Xi: " + "\n");

        // compiar o array e remover os números repetidos
        double[] unicos = new double[valoresVenda.length];
        int qtde = 0;
        for (int i = 0; i < valoresVenda.length; i++) {
            boolean existe = false;
            for (int j = 0; j < qtde; j++) {

                if (unicos[j] == valoresVenda[i]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                unicos[qtde++] = valoresVenda[i];
            }
        }
        // retirar as posições do array que não foram usadas
        unicos = Arrays.copyOf(unicos, qtde);

        // imprime o resultado
        for (int i = 0; i < unicos.length; i++) {
            System.out.printf("%.0f%n", unicos[i]);

        }
        // Codigo para os calculos de quantas vezes o numero de vendas se repetiu
        System.out.println("\nQuantidades Ni:");
        int cont = 1;
        int soma = 0;
        int soma1 = 0;
        double numeros = 0;
        double vetCONTADOR[] = new double[valoresVenda.length]; // criando vetor CONTADOR com o
        // //tamanho de 31 que é a quantidade
        // //de valores

        for (int i = 0; i < unicos.length; i++) {
            cont = 0;

            for (int j = 0; j < valoresVenda.length; j++) {
                if (unicos[i] == valoresVenda[j]) {
                    cont++;

                }
            }
            System.out.println(cont); // imprime a qtde de vezes que o número de vendas se repetiu

            vetCONTADOR[i] = cont; // vetor CONTADOR recebendo cada posição do cont

            soma += cont;
        }
        System.out.println("Total: " + soma);// imprime o soma da qtdede vezes que o numero se repetiu

        // Codigo para os calculos de Xi vezes Ni
        System.out.println("\nXi x Ni:");
        for (int i = 0; i < unicos.length; i++) {
            cont = 0;

            for (int j = 0; j < valoresVenda.length; j++) {
                if (unicos[i] == valoresVenda[j]) {
                    cont++;
                    numeros = unicos[i] * cont;
                }
            }
            System.out.println(numeros);// imprime a multiplicaçao de Xi vezes Ni
            soma1 += numeros;
        }
        System.out.println("Total: " + soma1);// imprime a soma de Xi vezes Ni

        // Calculos para achar as porcentagens de Ni dividido pelo o total vezes 100
        System.out.println("\nPorcentagens de valores:");
        double somaPercent = 0;
        int vetcontador = vetCONTADOR.length; // jogando o tamanho do vetor na variável
        double vetPorcentagem[] = new double[unicos.length];

        for (int i = 0; i < unicos.length; i++) {

            vetPorcentagem[i] = (vetCONTADOR[i] / soma) * 100; // fazendo a conta do 100*fi

            System.out.printf("%.2f %%\n", vetPorcentagem[i]);// imprimindo as porcentagens

            somaPercent += vetPorcentagem[i];

        }
        System.out.printf("Total: %.2f %%", somaPercent);// imprimindo o total das porcentagens
        System.out.println("\n");
        
        // calculo para média
        double media = 0;
        for (int i = 0; i < valoresVenda.length; i++) {
            media += valoresVenda[i] / soma;

        }

        // Calculos finais: pegar a media menos o Xi elevado a 2 vezes Ni
        System.out.println("Valores Finais:");
        double somaFinal = 0;
        double[] vetFinal = new double[unicos.length];
        for (int i = 0; i < unicos.length; i++) {
            vetFinal[i] = ((media - unicos[i]) * (media - unicos[i]) * vetCONTADOR[i]);

            System.out.printf("%.0f\n", vetFinal[i]);// imprimindo o resultado
            somaFinal += vetFinal[i];
        }

        System.out.printf("Total: %.0f", somaFinal);// imprimindo o total
        System.out.println("\n");
        
        // imprime a média 
        System.out.printf("Média: %.2f\n", media);
        
        System.out.println("Moda: ");

//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
//         int i = 0 ;
//           int j = 0;
//           double moda = valoresVenda[0];
// 
//  String modaInterface[] = new String [valoresVenda.length];
//  
//  String modaInterface2 = "";
//
//
//        for(int i = 0 ; i < valoresVenda.length -1 ; i++){
//      
//                   
//            if (valoresVenda[i] == valoresVenda[i+1]){
//
//                moda = valoresVenda[i];
//                modaInterface[i] = String.valueOf(moda);
//                
//                 System.out.println(moda);   
//                    
//                 modaInterface2 = modaInterface[i];
//            }
//        
//  
//        }
        
//        moda2 = moda;
//------------------------------------------------------------------------------
   // calculo para achar a moda
  // nessa parte imprime os numeros com duas ou mais repetições 
    double [] vet = new double [valoresVenda.length];
    int cont2 = 0;       
            
            
    double moda = valoresVenda[0];
        for (int i = 0; i < valoresVenda.length - 1; i++) {
            if (valoresVenda[i] == valoresVenda[i + 1]) {
                if(moda != valoresVenda[i]){
                    moda = valoresVenda[i]; 
                    vet[i] = moda; //posição i do vetor recebe moda corrente
                    cont2 = cont2 + 1; //achando a quantidade de números q se repetem e jogando essa quantidade na variável cont
                   System.out.println(vet[i]); //mostrando todas as modas de cada posição do vetor
               
                   
                }
                    
           }   
       } 
        
        System.out.printf("\n\n");
        System.out.printf("O contador é: %d", cont2); //imprimindo na tela o valor do contador
        System.out.printf("\n");
        
        
        
        
         String modaCompleta = " "; //criando variável modaCompleta para pegar todas as modas
                                    // para ficar na mesma linha e jogar na INTERFACE
         
        for (int i = 0; i < valoresVenda.length - 1; i++) {//mesmo código da parte de cima
            if (valoresVenda[i] == valoresVenda[i + 1]) { //mesmo código da parte de cima
                if(moda != valoresVenda[i]){ //mesmo código da parte de cima
                    moda = valoresVenda[i]; //mesmo código da parte de cima
                    vet[i] = moda; //mesmo código da parte de cima
        
    
                   for( int i3 = 0 ; i3 < 1; i3++ ){ // 
                    modaCompleta = modaCompleta + vet[i] + " || "; // jogando todas as modas dentro de uma String só
                       System.out.printf("\n%s",modaCompleta);
                     }
                   
                }
                    
            }
        }  
        
             

//       moda2 = moda;
//     ===============================================================================

     
        System.out.printf("\n");       
//        System.out.println(modaCompleta);
        moda2 = (modaCompleta);
        System.out.printf("\n");       
       
       

//         0   1  2   3   4
//        {1, 46, 49, 51, 54, 54, 59, 59, 
//        60, 60, 61, 61, 62, 65, 66, 66, 67, 67, 69, 
//        70, 70, 71, 72, 74, 74, 76, 79,
//        80, 82, 87, 88};
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
        // calculos para achar a mediana
        int valoresNumeros = valoresVenda.length % 2;
        double mediana = 0;
        double mediana1 = 0;

        if (valoresNumeros == 1) {
            mediana = valoresVenda[((valoresVenda.length + 1) / 2) - 1];
            System.out.println("Mediana: " + mediana);
        } else {
            int num = valoresVenda.length / 2;
            mediana1 = (valoresVenda[num - 1] + valoresVenda[num]) / 2;
            System.out.println("Mediana: " + mediana1);
        }
        double variancia = 0;
        double desvioPadrao = 0;
        variancia = somaFinal / soma;
        System.out.printf("Variância: %.2f ", variancia);
        
        // calculo para o desvio padrão
        desvioPadrao  = Math.sqrt(variancia);
        System.out.printf("\nDesvio Padrão: %.2f ", desvioPadrao);
        

       
        media2 = media;
//      moda2 = moda;
        mediana2 = mediana;
        variancia2 = variancia;
        desviopadrao2 = desvioPadrao;
        
        //======================================================================
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFabiola().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCalcular;
    private javax.swing.JButton btSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbMedia;
    private javax.swing.JLabel lbMediana;
    private javax.swing.JLabel lbModa;
    private javax.swing.JLabel lbVariancia;
    private javax.swing.JTextField textDesvioPadrao;
    private javax.swing.JTextField textMedia;
    private javax.swing.JTextField textMediana;
    private javax.swing.JTextField textModa;
    private javax.swing.JTextField textVariancia;
    // End of variables declaration//GEN-END:variables

  








}
























