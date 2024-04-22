/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.estadis;
import java.util.Arrays;
/**
 *
 * @author ITALO
 */
public class estadistico extends javax.swing.JFrame {

    /**
     * Creates new form estadistico
     */
    public estadistico() {
        initComponents();
    }
     private double calcularMedia(double[] datos) {
        double suma = 0;
        for (double dato : datos) {
            suma += dato;
        }
        return suma / datos.length;
    }

    private int calcularModa(double[] datos) {
        int[] frecuencias = new int[datos.length];
        for (double dato : datos) {
            int indice = (int) dato;
            frecuencias[indice]++;
        }

        int moda = 0;
        int maxFrecuencia = 0;
        for (int i = 0; i < frecuencias.length; i++) {
            if (frecuencias[i] > maxFrecuencia) {
                moda = i;
                maxFrecuencia = frecuencias[i];
            }
        }

        return moda;
    }

    private double calcularMediana(double[] datos) {
        Arrays.sort(datos);
        int mitad = datos.length / 2;
        if (datos.length % 2 == 0) {
            return (datos[mitad - 1] + datos[mitad]) / 2;
        } else {
            return datos[mitad];
        }
    }

    private double calcularDesviacionEstandar(double[] datos, double media) {
        double sumaCuadradosDiferencias = 0;
        for (double dato : datos) {
            double diferencia = dato - media;
            sumaCuadradosDiferencias += diferencia * diferencia;
        }

        return Math.sqrt(sumaCuadradosDiferencias / (datos.length - 1));
    }

    private double calcularVarianza(double[] datos, double media) {
        return Math.pow(calcularDesviacionEstandar(datos, media), 2);
    }

    private void mostrar() {
        String Texto = txtDatos.getText().trim();
        String[] Arreglo = Texto.split("\n");
        double[] datos = new double[Arreglo.length];
        for (int i = 0; i < Arreglo.length; i++) {
            datos[i] = Double.parseDouble(Arreglo[i]);
        }

        double media = calcularMedia(datos);
        int moda = calcularModa(datos);
        double mediana = calcularMediana(datos);
        double desviacionEstandar = calcularDesviacionEstandar(datos, media);
        double varianza = calcularVarianza(datos, media);

        txtVista.setText("Media: " + media + "\n");
        txtVista.append("Moda: " + moda + "\n");
        txtVista.append("Mediana: " + mediana + "\n");
        txtVista.append("Desviación Estándar: " + desviacionEstandar + "\n");
        txtVista.append("Varianza: " + varianza + "\n");
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDatos = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtVista = new javax.swing.JTextArea();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 102, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("Operaciones Estadisticos");

        txtDatos.setColumns(20);
        txtDatos.setRows(5);
        jScrollPane1.setViewportView(txtDatos);

        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Registre los Numeros");

        txtVista.setColumns(20);
        txtVista.setRows(5);
        jScrollPane2.setViewportView(txtVista);

        btnRegistrar.setForeground(new java.awt.Color(255, 102, 0));
        btnRegistrar.setText("Calcular");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrar)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        mostrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(estadistico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(estadistico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(estadistico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(estadistico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new estadistico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtDatos;
    private javax.swing.JTextArea txtVista;
    // End of variables declaration//GEN-END:variables
}