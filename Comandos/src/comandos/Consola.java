
package comandos;

import MiniIDE.Lenguaje;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Consola{
    //iniciamos las parte del text area de la consola
 public void incializar(JTextArea ta, JScrollPane scta){
     //scta.getViewport().setBackground(Color.yellow);
     //ta.setEditable(true);
     ta.setLineWrap(true);//para que salte linea
     ta.setWrapStyleWord(true);//para que no se recorra hacia la derecha
     //ta.setAutoscrolls(true);
     scta.setBounds(48,50, 220, 490);
     lectura(ta);//Evento del text area
 }
 
 public void incializarGrafico(JTextArea vu, JScrollPane scvu){
     //scta.getViewport().setBackground(Color.yellow);
     vu.setEditable(false);
     vu.setLineWrap(true);//para que salte linea
     vu.setWrapStyleWord(true);//para que no se recorra hacia la derecha
     //ta.setAutoscrolls(true);
     scvu.setBounds(320,620, 665, 170);
 }
 
 public void lectura(JTextArea ta){
     //Evento para escuchar el teclado
     ta.addKeyListener(new KeyListener(){
         @Override
         public void keyTyped(KeyEvent ke) {}

         @Override
         public void keyPressed(KeyEvent ke) {
             // si apachoramos enter
         if(ke.getKeyCode()==10){
             String fila [];
             String comando[];
             
             //leemos lo que se ha escrito en el 
             //text area y lo introducimos en un
             //arreglo string
             fila = ta.getText().trim().split("\n");
             comando = fila[fila.length-1].trim().split(" ");
             //imprimimos la ultima palabra escrita
             System.out.println(fila[fila.length-1]);
             System.out.println("comando1 = "+comando[comando.length-1]);
             System.out.println("comando2 = "+comando[comando.length-2]);
             orden=comando[comando.length-2];
             nombre=comando[comando.length-1];
             //creamos una clase animacion donde se
             //controlara la animacion de dora
             animacion an = new animacion();
             //creamos una clase con hilo 
             //donde modificaremos la posicion de dora
             Estatico es = new Estatico();
             Listas manipular = new Listas();
             Lenguaje len = new Lenguaje ();
             int con=0;
             switch (orden) {
                 case "kill":
                 while(con<Lista.size()){
                     if((Lista.get(con).toString()).equals(nombre)){
                      Lista.remove(con);
                     Comandos.vu.setText(Comandos.vu.getText()+"\nSe a matado un proceso: "+nombre);
                     }
                      con++;
                    }
                 con=0;
                 while(con<SusLista.size()){
                      if((SusLista.get(con).toString()).equals(nombre)){
                      SusLista.remove(con);}
                      con++;
                    }
                 con=0;
                 while(con<Bloqueados.size()){
                      if((Bloqueados.get(con).toString()).equals(nombre)){
                      Bloqueados.remove(con);
                      Comandos.vu.setText(Comandos.vu.getText()+"\nSe a matado un proceso: "+nombre);
                      }
                      con++;
                    }
                 con=0;
                 while(con<SusBloqueado.size()){
                      if((SusBloqueado.get(con).toString()).equals(nombre)){
                      SusBloqueado.remove(con);
                      Comandos.vu.setText(Comandos.vu.getText()+"\nSe a matado un nuevo proceso: "+nombre);
                      }
                      con++;
                    }
                 con=0;
                 if(ejecucion.equals(nombre)){
                 ejecucion="";
                 Comandos.vu.setText(Comandos.vu.getText()+"\nSe a matado un nuevo proceso: "+nombre);
                 }
                 System.out.println(Lista.isEmpty());
                 break;
///RUN----------                 
                 case "run":
                     //pasa de listo o bloqueados a ejecutados
                     FileReader fr = null;//creamos los lectores que crearemos
                     BufferedReader br = null;
                     try {
                     fr = new FileReader(Direccion+nombre+".txt");
                     br = new BufferedReader(fr);
                     Texto="";
                     String contenido = br.readLine();//leemos la primera linea hasta que que el contenido sea nulo
                     while(contenido != null){
                         System.out.println(contenido);
                         Texto=Texto+" "+contenido+"\n";//guardamos en el String todas las palabaras en el String text
                         contenido = br.readLine();
                        }
                     manipular.Agregar(nombre,Lista);
                     Thread hiloRun = new Thread(new Estatico());
                     if(entro == true){//para que el hilo no se vuelva a iniciar
                         hiloRun.start();
                         entro=false;
                        Comandos.vu.setText("Ya pasenos maestra :)"); 
                       }
                     Comandos.vu.setText(Comandos.vu.getText()+"\nSe a creado un nuevo proceso: "+nombre);
                    } catch (FileNotFoundException ex) {
                         System.out.println("No se encontro archivo");
                         JOptionPane.showMessageDialog(null, "No se encontro archivo");
                    } catch (IOException ex) {
                     ex.printStackTrace();
                    }
             
                     try {
                     fr.close();
                      br.close();
                    } catch (IOException ex) {
                     Logger.getLogger(Consola.class.getName()).log(Level.SEVERE, null, ex);
                    }
             
                 break;
                 
                 case "stop":
                         //si esta en listos pasa a suspendidos litos
                         //si esta en bloqueados pasa a suspendidos bloqueados
                 while(con<Lista.size()){
                     if((Lista.get(con).toString()).equals(nombre)){ 
                         String nompro = Lista.get(con).toString();
                         SusLista.add(nompro);
                         Lista.remove(con);
                         Comandos.vu.setText(Comandos.vu.getText()+"\nSe paso a Suspendidos Listos: "+nompro);
                        }
                      con++;
                    }
                 con=0;
                 while(con<Bloqueados.size()){
                     if((Bloqueados.get(con).toString()).equals(nombre)){
                         String nompro = Bloqueados.get(con).toString();
                         SusBloqueado.add(nompro);
                         Bloqueados.remove(con);
                          Comandos.vu.setText(Comandos.vu.getText()+"\nSe paso a Suspendidos Bloqueados: "+nompro);
                        }
                      con++;
                    }
                 con=0;
                 break;
                 
                 case "start":
                         //si esta en suspendidos listos pasa a listos
                         //si esta en suspendido bloqueado a bloqueado
                 while(con<SusLista.size()){
                      if((SusLista.get(con).toString()).equals(nombre)){ 
                         String nompro = SusLista.get(con).toString();
                         Lista.add(nompro);
                         SusLista.remove(con);
                         Comandos.vu.setText(Comandos.vu.getText()+"\nSe paso a Listos: "+nompro);
                        }
                      con++;
                    }
                 con=0;
                 while(con<SusBloqueado.size()){
                     if((SusBloqueado.get(con).toString()).equals(nombre)){
                         String nompro = SusBloqueado.get(con).toString();
                         Bloqueados.add(nompro);
                         SusBloqueado.remove(con);
                         Comandos.vu.setText(Comandos.vu.getText()+"\nSe paso a Bloqueados : "+nompro);
                     }
                      con++;
                    }
                 con=0;
                 break;
                 case "priotity":
                 break;
             }
         }
         }

         @Override
         public void keyReleased(KeyEvent ke) {}
         
     });
 }
     static String orden="", nombre="", ejecucion="";
     static List Lista = new ArrayList();
     static List SusLista = new ArrayList();
     static List Bloqueados = new ArrayList();
     static List SusBloqueado = new ArrayList();
     public static String Archivo="",
                   Direccion="D:\\Portafolio\\BaseJava\\SitemasOperativos\\Archivos\\",
                   Texto="";
     boolean entro=true;
}
