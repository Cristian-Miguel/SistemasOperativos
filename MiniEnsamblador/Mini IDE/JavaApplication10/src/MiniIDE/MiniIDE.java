/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniIDE;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Nivak
 */
public class MiniIDE extends javax.swing.JFrame {

    /**
     * Creates new form MiniIDE
     */
    
    public MiniIDE() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jjEditor = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        consolaJJ = new javax.swing.JEditorPane();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        archivoMenu = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        openItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jjEditor.setColumns(20);
        jjEditor.setRows(5);
        jScrollPane1.setViewportView(jjEditor);

        consolaJJ.setContentType("text/html"); // NOI18N
        jScrollPane2.setViewportView(consolaJJ);

        jButton2.setText("javac");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("javacc");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Consola JavaCC");

        archivoMenu.setText("File");

        jMenuItem2.setText("New");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        archivoMenu.add(jMenuItem2);

        openItem.setText("Open");
        openItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openItemActionPerformed(evt);
            }
        });
        archivoMenu.add(openItem);

        jMenuItem1.setText("Save");
        archivoMenu.add(jMenuItem1);

        barraMenu.add(archivoMenu);

        editMenu.setText("Edit");
        barraMenu.add(editMenu);

        jMenu1.setText("Help");

        jMenuItem3.setText("Manual");
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("MiniIDE");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        barraMenu.add(jMenu1);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(614, 634));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void openItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openItemActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.addChoosableFileFilter(new ImageFilter());
        int returnVal = fc.showDialog(MiniIDE.this, "Abrir");
        
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            if(accept(file)){
                nombre = file.getName();
                dir = file.getAbsolutePath();
                archivo = file.getParent();
                Archivos arch = new Archivos(dir, archivo, nombre);
                String jj = arch.leerArchivo(archivo);
                jjEditor.setText(jj);
                System.out.println("Archivo leído correctamente");
                System.out.println("nombre = "+nombre);
                System.out.println("dir = "+dir);
                System.out.println("archivo="+archivo);
            }
            else{
                JOptionPane.showMessageDialog(null, "El archivo no tiene extensión jj o jjt.");
            }
        } else {
            System.out.println("Se cancelo abrir archivo.");
        }
      //abrirArchMI();
    }//GEN-LAST:event_openItemActionPerformed
        
    public void abrirArchMI(){
                nombre = "ensambler.jj";
                dir = "D:\\Portafolio\\BaseJava\\SitemasOperativos\\MiniEnsamblador\\Parser\\ensambler.jj";
                archivo = "D:\\Portafolio\\BaseJava\\SitemasOperativos\\MiniEnsamblador\\Parser";
                Archivos arch = new Archivos(dir, archivo, nombre);
                String jj = arch.leerArchivo(archivo);
                
                //jjEditor.setText(jj);
                 String arrjj [] = jj.split("\n");
             /*   System.out.println("Archivo leído correctamente");
                System.out.println("nombre = "+nombre);
                System.out.println("dir = "+dir);
                System.out.println("archivo="+archivo);*/
                String rectificar="";
                System.out.println("tamano = "+arrjj.length);
                 System.out.println("posicion 2"+arrjj[2]+"\n");
                for(int i=0; i<arrjj.length; i++){
                    if(arrjj[2].equals(arrjj[i])){
                        arrjj[i]="";
                    }
                    else{
                     //    System.out.println(arrjj[i]+"\n");
                         jjEditor.setText(jjEditor.getText()+arrjj[i]+"\n");
                        rectificar = rectificar+arrjj[i];
                    }
                }
             System.out.println("-------------> rectificar =\n"+jj);   
             
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(dir.length() != 0){
            Javacc cc = new Javacc();
            try {
                consolaJJ.setText(cc.javaccCMD("javacc "+dir, dir, jjEditor.getText(), true));
            } catch (IOException ex) {
                Logger.getLogger(MiniIDE.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed
  
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(dir.length() != 0){
            Javacc cc = new Javacc();
            try {
                consolaJJ.setText(cc.javaccCMD("javac -d "+archivo+" "+archivo+"\\*.java", dir, jjEditor.getText(), false));
            } catch (IOException ex) {
                Logger.getLogger(MiniIDE.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        JOptionPane.showMessageDialog(null,"MiniIDE v1.0\nDeveloper - CodeFreaky :D");
    }//GEN-LAST:event_jMenuItem4ActionPerformed
public boolean accept(File f) {
    if (f.isDirectory()) {
        return true;
    }

    String extension = Utils.getExtension(f);
    if (extension != null) {
        if (extension.equals(Utils.jj) ||
            extension.equals(Utils.jjt)) {
                return true;
        } else {
            return false;
        }
    }

    return false;
}
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
        UIManager.setLookAndFeel( "com.jtattoo.plaf.mint.MintLookAndFeel");
        }
        catch (ClassNotFoundException ex) {
        java.util.logging.Logger.getLogger(MiniIDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(MiniIDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(MiniIDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(MiniIDE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lenguaje().setVisible(true);
                new MiniIDE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu archivoMenu;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JEditorPane consolaJJ;
    private javax.swing.JMenu editMenu;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jjEditor;
    private javax.swing.JMenuItem openItem;
    // End of variables declaration//GEN-END:variables
    public String dir = "";
    public String archivo = "";
    public String nombre = "";
}
