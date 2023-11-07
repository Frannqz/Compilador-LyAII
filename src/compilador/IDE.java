/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package compilador;

import compilerTools.Functions;
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Franco - PC
 */
public class IDE extends javax.swing.JFrame {

    /**
     * Creates new form IDE
     */
    public IDE() {
        initComponents();
        setTitle("Proyecto Final - Compilador LyA II");
        setResizable(false);
        setLocationRelativeTo(null);
        Functions.setLineNumberOnJTextComponent(jTextCodigoEntrada); //Añadimos NO. de lineas al Campo de Codigo de entrada
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IMGTecnm = new javax.swing.JLabel();
        IMGTecCelaya = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        btnLéxico = new javax.swing.JButton();
        btnSemantico = new javax.swing.JButton();
        btnSintactico = new javax.swing.JButton();
        Analisis = new javax.swing.JLabel();
        jScrollEntrada = new javax.swing.JScrollPane();
        jTextCodigoEntrada = new javax.swing.JTextPane();
        jScrollSalida = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Salida = new javax.swing.JLabel();
        jScrollTablaId = new javax.swing.JScrollPane();
        jTableID = new javax.swing.JTable();
        Identificadores = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        MenuArchivos = new javax.swing.JMenu();
        PDFLexico = new javax.swing.JMenuItem();
        PDFSintactico = new javax.swing.JMenuItem();
        PDFSemantico = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        ManualUsuario = new javax.swing.JMenuItem();
        Documentacion = new javax.swing.JMenuItem();
        About = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IMGTecnm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/TecNM.png"))); // NOI18N

        IMGTecCelaya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/img/ITCelaya.png"))); // NOI18N

        Titulo.setFont(new java.awt.Font("Consolas", 1, 36)); // NOI18N
        Titulo.setText("Lenguajes y Autómatas II");

        btnLéxico.setText("Léxico");
        btnLéxico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLéxicoActionPerformed(evt);
            }
        });

        btnSemantico.setText("Semántico");
        btnSemantico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSemanticoActionPerformed(evt);
            }
        });

        btnSintactico.setText("Sintáctico");
        btnSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSintacticoActionPerformed(evt);
            }
        });

        Analisis.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Analisis.setText("Ejecución de Análisis");

        jScrollEntrada.setViewportView(jTextCodigoEntrada);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollSalida.setViewportView(jTextArea1);

        Salida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Salida.setText("Salida:");

        jTableID.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Token", "Línea"
            }
        ));
        jScrollTablaId.setViewportView(jTableID);

        Identificadores.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Identificadores.setText("Generación de Token´s");

        MenuArchivos.setText("Archivos");

        PDFLexico.setText("Análisis Léxico");
        PDFLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFLexicoActionPerformed(evt);
            }
        });
        MenuArchivos.add(PDFLexico);

        PDFSintactico.setText("Analisis Sintáctico");
        PDFSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFSintacticoActionPerformed(evt);
            }
        });
        MenuArchivos.add(PDFSintactico);

        PDFSemantico.setText("Analisis Semántico");
        PDFSemantico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFSemanticoActionPerformed(evt);
            }
        });
        MenuArchivos.add(PDFSemantico);

        Menu.add(MenuArchivos);

        MenuAyuda.setText("Ayuda");

        ManualUsuario.setText("Manual de Usuario");
        ManualUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ManualUsuarioActionPerformed(evt);
            }
        });
        MenuAyuda.add(ManualUsuario);

        Documentacion.setText("Documentación");
        Documentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DocumentacionActionPerformed(evt);
            }
        });
        MenuAyuda.add(Documentacion);

        Menu.add(MenuAyuda);

        About.setText("Acerca de");
        Menu.add(About);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(136, 136, 136)
                                    .addComponent(Analisis))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(77, 77, 77)
                                    .addComponent(btnLéxico)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSintactico)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnSemantico))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(54, 54, 54)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Salida)
                                        .addComponent(jScrollSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollTablaId, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Identificadores)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(IMGTecnm)
                        .addGap(88, 88, 88)
                        .addComponent(Titulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(IMGTecCelaya)))
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(IMGTecCelaya))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(IMGTecnm))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(Titulo)))
                .addGap(25, 25, 25)
                .addComponent(Analisis)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLéxico)
                            .addComponent(btnSemantico)
                            .addComponent(btnSintactico))
                        .addGap(59, 59, 59)
                        .addComponent(jScrollEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(Salida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(Identificadores)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollTablaId)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PDFLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFLexicoActionPerformed
//        Clase Desktop es capaz de abrir e imprimir cualquier tipo de fichero con la aplicación 
//        que haya sido definida por defecto en el SO para ese tipo de fichero.
        try {
            File path = new File ("src/assets/pdf/analisis lexico.pdf");
            Desktop.getDesktop().open(path);
        }catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_PDFLexicoActionPerformed

    private void PDFSemanticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFSemanticoActionPerformed
        try {
            File path = new File("src/assets/pdf/analisis semantico.pdf");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_PDFSemanticoActionPerformed

    private void PDFSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFSintacticoActionPerformed
        try {
            File path = new File("src/assets/pdf/analisis sintactico.pdf");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_PDFSintacticoActionPerformed

    private void ManualUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ManualUsuarioActionPerformed
         try {
            File path = new File("");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_ManualUsuarioActionPerformed

    private void DocumentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DocumentacionActionPerformed
         try {
            File path = new File("");
            Desktop.getDesktop().open(path);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_DocumentacionActionPerformed

    private void btnLéxicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLéxicoActionPerformed
        
        System.out.println("Bienvenido a Analisis Lexico");
    }//GEN-LAST:event_btnLéxicoActionPerformed

    private void btnSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSintacticoActionPerformed
        
        System.out.println("Bienvenido a Analisis Sintactico");
    }//GEN-LAST:event_btnSintacticoActionPerformed

    private void btnSemanticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSemanticoActionPerformed
        
        System.out.println("Bienvenido a Analisis Semantico");
    }//GEN-LAST:event_btnSemanticoActionPerformed

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
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IDE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu About;
    private javax.swing.JLabel Analisis;
    private javax.swing.JMenuItem Documentacion;
    private javax.swing.JLabel IMGTecCelaya;
    private javax.swing.JLabel IMGTecnm;
    private javax.swing.JLabel Identificadores;
    private javax.swing.JMenuItem ManualUsuario;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu MenuArchivos;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenuItem PDFLexico;
    private javax.swing.JMenuItem PDFSemantico;
    private javax.swing.JMenuItem PDFSintactico;
    private javax.swing.JLabel Salida;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnLéxico;
    private javax.swing.JButton btnSemantico;
    private javax.swing.JButton btnSintactico;
    private javax.swing.JScrollPane jScrollEntrada;
    private javax.swing.JScrollPane jScrollSalida;
    private javax.swing.JScrollPane jScrollTablaId;
    private javax.swing.JTable jTableID;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextPane jTextCodigoEntrada;
    // End of variables declaration//GEN-END:variables
}
