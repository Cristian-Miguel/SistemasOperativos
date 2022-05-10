
package comandos;


import MiniIDE.Lenguaje;
import static comandos.Consola.Direccion;
import static comandos.Consola.Texto;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Estatico extends Thread{
    
    @Override
    public void run() {
     while(true){  
//------------------------------INICIO LISTOS      
      if(Consola.ejecucion.equals("") && Consola.Bloqueados.isEmpty() && contador==0){
             doraparada[0].setBounds(125, 467, 50, 50);//listos
             contador=1;
              mostrar();
              String tamano []= 
         {String.valueOf(Consola.Lista.size()),String.valueOf(Consola.Bloqueados.size()), 
          String.valueOf(Consola.SusBloqueado.size()), String.valueOf(Consola.SusLista.size())};
         for(int i=0; i<numeros.length; i++){
             numeros[i].setText(tamano[i]);
            }
         try {
             Thread.sleep(5000);
            } 
         catch (InterruptedException ie) {
             System.out.println("Error");
            }
            }
      
      if(!Consola.ejecucion.equals("")){
          String ejec = Consola.ejecucion;
          Consola.ejecucion="";
          String tamano1 []= 
         {String.valueOf(Consola.Lista.size()),String.valueOf(Consola.Bloqueados.size()), 
          String.valueOf(Consola.SusBloqueado.size()), String.valueOf(Consola.SusLista.size())};
         for(int i=0; i<numeros.length; i++){
             numeros[i].setText(tamano1[i]);
            }
             Camino[1]=true;
             mostrar();
             Thread hilo = new Thread(new animacion());
             hilo.start();
             try {
                 Thread.sleep(4050);
                } 
             catch (InterruptedException ie) {
                 System.out.println("Error");
                }
          Consola.Bloqueados.add(ejec);
          mostrar();
              String tamano []= 
         {String.valueOf(Consola.Lista.size()),String.valueOf(Consola.Bloqueados.size()), 
          String.valueOf(Consola.SusBloqueado.size()), String.valueOf(Consola.SusLista.size())};
              Comandos.vu.setText(Comandos.vu.getText()+"\nSe a bloqueado un proceso: " +ejec+"\n");
         for(int i=0; i<numeros.length; i++){
             numeros[i].setText(tamano[i]);
            }
         try {
             Thread.sleep(4641);
            } 
         catch (InterruptedException ie) {
             System.out.println("Error");
            }
        }
      
      
      if(Consola.ejecucion.equals("")){
          
       if(!Consola.Lista.isEmpty()){
         String listos = Consola.Lista.get(0).toString();
         Consola.Lista.remove(0);
         Camino[0]=true;
         for(int i=1; i<Camino.length; i++)
             Camino[i]=false;
           String tamano []= 
         {String.valueOf(Consola.Lista.size()),String.valueOf(Consola.Bloqueados.size()), 
          String.valueOf(Consola.SusBloqueado.size()), String.valueOf(Consola.SusLista.size())};
         for(int i=0; i<numeros.length; i++){
             numeros[i].setText(tamano[i]);
            }
         mostrar();
         Thread hilo = new Thread(new animacion());
         hilo.start();
           try {
             Thread.sleep(8691);
             Consola.ejecucion=listos;
              mostrar();
            } 
          catch (InterruptedException ie) {
             System.out.println("Error");
           }
         Camino[0]=false;
         manipular();
         Comandos.vu.setText(Comandos.vu.getText()+"\nSe esta ejecutando un proceso: "
                                    +Consola.ejecucion+"\n"+len.EjecutarCodigo(Texto));
            String tamano1 []= 
         {String.valueOf(Consola.Lista.size()),String.valueOf(Consola.Bloqueados.size()), 
          String.valueOf(Consola.SusBloqueado.size()), String.valueOf(Consola.SusLista.size())};
         for(int i=0; i<numeros.length; i++){
             numeros[i].setText(tamano1[i]);
            }
        }  
          
        if(!Consola.Bloqueados.isEmpty()){
         String Bloq = Consola.Bloqueados.get(0).toString();
         Consola.Bloqueados.remove(0);
         Consola.Lista.add(Bloq);
          mostrar();
              String tamano []= 
         {String.valueOf(Consola.Lista.size()),String.valueOf(Consola.Bloqueados.size()), 
          String.valueOf(Consola.SusBloqueado.size()), String.valueOf(Consola.SusLista.size())};
         for(int i=0; i<numeros.length; i++){
             numeros[i].setText(tamano[i]);
            }
         Comandos.vu.setText(Comandos.vu.getText()+"\nSe a creado un proceso: "
                                    +Bloq);
        }
        
        try {
             Thread.sleep(5000);
            } 
         catch (InterruptedException ie) {
             System.out.println("Error");
            }
         
      }
          

        }
    }
         
    public void mostrar(){
         if(Consola.SusBloqueado.isEmpty()){
           doraparada[4].setVisible(false);    
          }
          if(Consola.SusLista.isEmpty()){
           doraparada[3].setVisible(false);    
          }
          
          if(!Consola.SusBloqueado.isEmpty()){
          doraparada[4].setBounds(520, 360, 50, 50);//suspendidos bloqueados        
          doraparada[4].setVisible(true);    
          }
          if(!Consola.SusLista.isEmpty()){
          doraparada[3].setBounds( 50, 136, 50, 50);//suspendidos listos
          doraparada[3].setVisible(true);    
          }
          
          if(!Consola.ejecucion.equals("")){
           doraparada[2].setBounds(328, 131, 50, 50);//ejecucion
           doraparada[2].setVisible(true);
          }
          if(Consola.ejecucion.equals("")){
           doraparada[2].setVisible(false);
          }
          
          if(Consola.Bloqueados.isEmpty()){
           doraparada[1].setVisible(false);    
          }
          if(!Consola.Bloqueados.isEmpty()){
           doraparada[1].setBounds(485, 132, 50, 50);
           doraparada[1].setVisible(true);    
          }
          
          if(Consola.Lista.isEmpty()){
           doraparada[0].setVisible(false);    
          }
          if(!Consola.Lista.isEmpty()){
           doraparada[0].setBounds(125, 467, 50, 50);//listos
           doraparada[0].setVisible(true);    
          }
    }
    
    public void manipular(){
         FileReader fr = null;//creamos los lectores que crearemos
                     BufferedReader br = null;
                     try {
                     fr = new FileReader(Direccion+Consola.ejecucion+".txt");
                     br = new BufferedReader(fr);
                     Texto="";
                     String contenido = br.readLine();//leemos la primera linea hasta que que el contenido sea nulo
                     while(contenido != null){
                         System.out.println(contenido);
                         Texto=Texto+" "+contenido+"\n";//guardamos en el String todas las palabaras en el String text
                         contenido = br.readLine();
                        }
                    } catch (FileNotFoundException ex) {
                         System.out.println("No se encontro archivo");
                         JOptionPane.showMessageDialog(null, "No se encontro archivo \n"
                                 + Consola.ejecucion+".txt");
                    } catch (IOException ex) {
                     ex.printStackTrace();
                    }
             
                     try {
                     fr.close();
                      br.close();
                    } catch (IOException ex) {
                     Logger.getLogger(Consola.class.getName()).log(Level.SEVERE, null, ex);
                    }
    }
    
    
    public void dora(JPanel Proceso, JLabel img, Icon icono){
     
     for (int i=0; i<doraparada.length; i++) {
            doraparada[i] = new JLabel();
            doraparada[i].setIcon(icono);
            img.add(doraparada[i]);
        }
      for (int i=0; i<walkings.length; i++) {
            walkings[i] = new JLabel();
            ImageIcon imc = new ImageIcon(sprite[i]);
            Icon cons = new ImageIcon(imc.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
            walkings[i].setIcon(cons);
            img.add(walkings[i]);
        }
      String tamano []= 
      {String.valueOf(Consola.Lista.size()), String.valueOf(Consola.SusLista.size()),
       String.valueOf(Consola.Bloqueados.size()), String.valueOf(Consola.SusBloqueado.size())};
      for(int i=0; i<numeros.length; i++){
          numeros[i] = new JLabel();
          numeros[i].setText(tamano[i]);
          numeros[i].setBounds(x[i],y [i], 60, 60);
          img.add(numeros[i]);
        }
    }
   //arreglo 
   // [0]=Listos, [1]=Bloqueados, [2]=Ejecutar
   // [3]=Suspendidos Listos, [4]=Suspendidos Bloqueados 
   static JLabel doraparada [] = new JLabel[5];
   static JLabel walkings [] = new JLabel[8];
   // [0]=Listos, [1]=Bloqueados,
   // [2]=Suspendidos Bloqueados, [3]=Suspendidos Listos
   static JLabel numeros [] = new JLabel[4];
   static int contador=0, identificador=0; 
   static int x[] = {115,475,510,50};
   static int y[] = {467,132,360,136};
   private String [] sprite = 
   {"walking1.png","walking2.png","walking3.png","walking4.png",
    "walking5.png","walking6.png","walking7.png","walking8.png",};
   //1.-listos a ejecucion,         2.-ejecucion a bloqueados
   //3.-ejecucion a listos,         4.-bloqueados a ejecucion
   //5.-Susbloqueados a bloqueados, 6.-bloqueados a Susbloqueado
   //7.-SusListos a Listos,         7.-Listos a SusListos
   static boolean Camino [] = new boolean[8];
  static boolean caminocontrario = false;  
  Lenguaje len = new Lenguaje ();
    
}
