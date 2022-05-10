package comandos;

import MiniIDE.Lenguaje;
import MiniIDE.MiniIDE;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
//Clase Principal donde heredamos el JFrame para crear la ventana
//implementamos Runnable para poder crear un hilo
public class Comandos extends JFrame implements Runnable{
   //Creamos un hilo donde iremos modificando los label
    //donde mostraremos la memoria total, libre, ocupada y maxima
   
    @Override
    public void run(){
       while(true){
             try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Comandos.class.getName()).log(Level.SEVERE, null, ex);
            }
           //creamos un objeto de la clase Runtime
           //para saber cuanta memoria usa
           //el programa
            Runtime rt = Runtime.getRuntime();
            int dataSize = 1024*1024;//tamano en megabyte
            //aqui sabemos la memoria ocupada
            um.setText((rt.totalMemory()-rt.freeMemory())/dataSize+"MB");
            //aqui sabemos  la memoria libre
            fm.setText(rt.freeMemory()/dataSize+"MB");
            //aqui sabemos la memoria maxima
            mm.setText(rt.maxMemory()/dataSize+"MB");
            //aqui sabemos la memoria total
            tm.setText(rt.totalMemory()/dataSize+"MB");
            
       }
    }
    
    //inicializamos la ventana
    public Comandos(){
               //    1000, 800
        this.setSize(ancho, alto);
        //quitamos el layout para poder modifical los paneles
        this.setLayout(null);
        this.setTitle("Consolas");
        //lo centramos en la pantalla
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        //iniciamos los componentes
        IniCom();
        //posible buffer para modificar la imagen
        hilo = new Thread(this);
        bi = new BufferedImage(ancho, alto, BufferedImage.TYPE_INT_RGB);
        //utilizamos una herramienta para sacar una parte de sprite(imagenes con fotogramas)
        Toolkit herramienta = Toolkit.getDefaultToolkit();
        //ingresamos la imagen de los recursos del programa para poder seccionarla
        imagen = herramienta.getImage(getClass().getResource("/imagenes/walking.png"));
        //empezamos el hilo de la memoria
        hilo.start();
    }
    //iniciamos los datos del programa
    public void IniCom(){
        Consola();//donde digitaremos los comandos
        Grafico();//donde se vera el ensamblador
        Memoria();//donde se vera la memoria
        Proceso();//donde se vera dora
        //dora();
    }
    public void Consola(){
       
        JPanel PanelCon = new JPanel();
        PanelCon.setBounds(0, 0, 300, 600);
        ImageIcon imc = new ImageIcon("CMD.jpg");
        Icon cons = new ImageIcon(imc.getImage().getScaledInstance(300, 600, Image.SCALE_DEFAULT));
        JLabel img = new JLabel();
        
        img.setIcon(cons);
        llamar.incializar(ta, scta);
        PanelCon.add(img);
        scta.getViewport().setOpaque(false);
        this.getContentPane().add(scta);
        this.add(PanelCon);
    }
    
    public void Memoria(){
     JPanel PanelCon = new JPanel();
      PanelCon.setBounds(0, 600, 300, 200);
      ImageIcon imc = new ImageIcon("Memoria.jpg");
      Icon cons = new ImageIcon(imc.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT));
      JLabel img = new JLabel();
      img.setIcon(cons);
      PanelCon.add(img);
      iniMemoria();
     this.add(PanelCon);   
    }
    
    public void Proceso(){
        Proceso.setBounds(300, 0, 700, 600);
        ImageIcon imc = new ImageIcon("Proceso.jpg");
        Icon cons = new ImageIcon(imc.getImage().getScaledInstance(700, 600, Image.SCALE_DEFAULT));
        img.setBounds(300, 0, 700, 600);
        img.setIcon(cons);
        ImageIcon ic = new ImageIcon("doraEspera.png");
        Icon Icono = new ImageIcon(ic.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));
        
        es.dora( Proceso, img, Icono);
        
        Proceso.add(img);
        this.add(Proceso);
    }
    
    public void Grafico(){
        JPanel PanelCon = new JPanel();
        PanelCon.setBounds(300, 600, 700, 200);
        ImageIcon imc = new ImageIcon("Grafico.jpg");
        Icon cons = new ImageIcon(imc.getImage().getScaledInstance(700, 200, Image.SCALE_DEFAULT));
        JLabel img = new JLabel();
        llamar.incializarGrafico(vu, scvu);
        PanelCon.add(img);
        scvu.getViewport().setOpaque(false);
        img.setIcon(cons);
        PanelCon.add(img);
        this.getContentPane().add(scvu);
        this.add(PanelCon); 
    }
    
    
    public static void main(String[] args) {
     Comandos llamar = new Comandos();
      llamar.setVisible(true);
        /*Lenguaje len = new Lenguaje ();
        MiniIDE ide = new MiniIDE();
        len.setVisible(true);
        ide.setVisible(true);*/
    }
    
    // iniciamos los componentes de la memoria
    public void iniMemoria(){
        Runtime rt = Runtime.getRuntime();
            int dataSize = 1024*1024;//tamano en megabyte
            //ponemos donde ira los textos que
            //describiran las memoria
            umt.setBounds( 60,640,100, 20);
            fmt.setBounds(180,640,100, 20);
            mmt.setBounds( 60,720,100, 20);
            tmt.setBounds(180,720,100, 20);
            //ponemos el nombre que describira 
            //cada memoria
            umt.setText("Memoria Usada");
            fmt.setText("Memoria Libre");
            mmt.setText("Memoria Maxima");
            tmt.setText("Memoria Total");
            //ponemos las coordenadas donde 
            //iran los numeros de cada memoria
            um.setBounds( 60,660,100, 20);
            fm.setBounds(180,660,100, 20);
            mm.setBounds( 60,740,100, 20);
            tm.setBounds(180,740,100, 20);
            //sacamos cada memoria y los medimos en megabits
            um.setText((rt.totalMemory()-rt.freeMemory())/dataSize+"MB");
            fm.setText(rt.freeMemory()/dataSize+"MB");
            mm.setText(rt.maxMemory()/dataSize+"MB");
            tm.setText(rt.totalMemory()/dataSize+"MB");
            //los agregamos en la ventana
            this.add(um);  this.add(umt);
            this.add(fm);  this.add(fmt);
            this.add(mm);  this.add(mmt);        
            this.add(tm);  this.add(tmt);
            
    }
  
    Consola llamar = new Consola();
    //private int incremento = 0;
    private int ancho = 1017;//ancho de la ventana
    private int alto = 840;//añto de la ventana
    private Image imagen ;//imagen donde ira la animacion
    private int delantex=125, delantey=467, incremento=0;
    private BufferedImage bi;//buffer de la imagen
    
    private final JTextArea ta = new JTextArea();
    static JTextArea vu = new JTextArea();
    //scroll para elJTextArea para poder mover hacia abajo
    private final JScrollPane scta = new JScrollPane(ta,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    static JScrollPane scvu = new JScrollPane(vu,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    private Thread hilo;//hilo de la memoria
    JLabel img = new JLabel();//imagen del proceso 
    //JLabel doraparada = new JLabel();
    Estatico es = new Estatico();
    JPanel Proceso = new JPanel();
    private JLabel um = new JLabel();//numero de la memoria usada
    private JLabel fm = new JLabel();//numero de la memoria libre
    private JLabel mm = new JLabel();//numero de la memoria maxima
    private JLabel tm = new JLabel();//numero de la memoria total
    private JLabel umt = new JLabel();//texto  de la memoria usada
    private JLabel fmt = new JLabel();//texto de la memoria libre
    private JLabel mmt = new JLabel();//texto de la memoria maxima
    private JLabel tmt = new JLabel();//texto de la memoria total
    
}
