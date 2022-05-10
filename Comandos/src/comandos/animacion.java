
package comandos;

import static comandos.Estatico.walkings;

public class animacion extends Thread{

    int caminata=0; 
    @Override
    public void run() {
       //suspendidos listos -----> 50, 136    
       //listos ----------------->  125, 467
       //ejecucion -------------->  328, 131
       //bloqueado --------------> 485, 132
       //Suspendidos bloqueado --> 520, 360
       
     //De listos a Ejecucion
     if(Estatico.Camino[0]==true){ 
         //listos    -->  125, 467
         //ejecucion -->  328, 131
         int xi=125, yi=467, con=0,
             xf=329, yf=131;
         while(con<168){
             // walkings[caminata].setVisible(false);
             walkings[caminata].setBounds(xi, yi, 60, 60);
             walkings[caminata].setVisible(true);
             if(xf>xi)
                 xi+=2;
             if(yi>yf)
                 yi-=2; 
            // if(xf==(xi-2) && yi==(yf+2)){
           //     xi+=2; yi-=2; 
           // }
             if(caminata==7){
                 caminata=-1;
               }
             try {
                 Thread.sleep(50);
                } 
             catch (InterruptedException ie) {
                 System.out.println("Error");
               }
             caminata++; 
             con++;
             Arreglo();
            }
         for(int i=0; i<Estatico.Camino.length; i++)
          {Estatico.Camino[i]=false;} 
        }  
     
     //ejecucion a bloqueados
     if(Estatico.Camino[1]==true){ 
         //ejecucion --> 328, 131
         //bloqueado --> 485, 132
         int xi=328, yi=131, con=0,
             xf=486, yf=145;
         while(con<79){
             // walkings[caminata].setVisible(false);
             walkings[caminata].setBounds(xi, yi, 60, 60);
             walkings[caminata].setVisible(true);
             if(xf>xi)
                 xi+=2;
             if(yf>yi)
                 yi+=2; 
            // if(xf==(xi-2) && yi==(yf+2)){
           //     xi+=2; yi-=2; 
           // }
             if(caminata==7){
                 caminata=-1;
               }
             try {
                 Thread.sleep(50);
                } 
             catch (InterruptedException ie) {
                 System.out.println("Error");
               }
             caminata++; 
             con++;
             Arreglo();
            }
         for(int i=0; i<Estatico.Camino.length; i++)
          {Estatico.Camino[i]=false;}
        }
     
     
     
     
     //bloqueados a Susbloqueados
     if(Estatico.Camino[2]==true){ 
         //Bloqueado    --> 485, 132
         //Susbloqueado --> 520, 360
        /* int xi=485, yi=132, 
             xf=521, yf=360;*/
         Recorrido2(485, 132, 521, 360);
         for(int i=0; i<Estatico.Camino.length; i++)
          {Estatico.Camino[i]=false;}
        }  
     
     

     //ejecucion a bloqueados
     if(Estatico.Camino[1]==true){ 
         //ejecucion --> 328, 131
         //bloqueado --> 485, 132
         int xf=328, yf=131, 
             xi=485, yi=145;
         Recorrido(xi, yi, xf, yf);
         for(int i=0; i<Estatico.Camino.length; i++)
          {Estatico.Camino[i]=false;}
        }
     
     //bloqueados a Susbloqueados
     if(Estatico.Camino[5]==true){ 
         //Bloqueado    --> 485, 132
         //Susbloqueado --> 520, 360
         int xf=485, yf=132, 
             xi=521, yi=360;
         Recorrido2(xi, yi, xf, yf);
         for(int i=0; i<Estatico.Camino.length; i++)
          {Estatico.Camino[i]=false;}
       }
     
    }
    
    
    public void Recorrido(int xi, int yi, int xf, int yf){
        while( yi>yf || xi>xf){
             // walkings[caminata].setVisible(false);
             walkings[caminata].setBounds(xi, yi, 60, 60);
             walkings[caminata].setVisible(true);
                 xi-=2; 
                 yi-=2; 
             if(caminata==7){
                 //walkings[caminata].setVisible(false);
                 caminata=-1;
               }
             try {
                 Thread.sleep(50);
                } 
             catch (InterruptedException ie) {
                 System.out.println("Error");
               }
             caminata++; 
             Arreglo();
            }
    }
    
    public void Recorrido2(int xi, int yi, int xf, int yf){
        while( yi<yf || xi<xf){
             // walkings[caminata].setVisible(false);
             walkings[caminata].setBounds(xi, yi, 60, 60);
             walkings[caminata].setVisible(true);
                 xi+=2;
                 yi+=2;
             if(caminata==7){
                 //walkings[caminata].setVisible(false);
                 caminata=-1;
               }
             try {
                 Thread.sleep(50);
                } 
             catch (InterruptedException ie) {
                 System.out.println("Error");
               }
             caminata++; 
             Arreglo();
            }
    }
                        //(   125,    467,    329,    131);
    public void Recorrido3(int xi, int yi, int xf, int yf){
        //listos    -->  xi=125, yi=467
        //ejecucion -->  xf=329, yf=131
        System.out.println("--> xi = "+xi+" yi = "+yi+" xf = "+xf+" yf = "+yf+" <--");
        while( (yi>=yf) && (xf>=xi)){
             // walkings[caminata].setVisible(false);
             walkings[caminata].setBounds(xi, yi, 60, 60);
             walkings[caminata].setVisible(true);
             if(xf>xi)
                 xi+=2;
             if(yi>(yf+2))
                 yi-=2; 
             if(xf==(xi-2) && yi==(yf+2)){
                xi+=2; yi-=2; 
             }
             if(caminata==7){
                 caminata=-1;
               }
             try {
                 Thread.sleep(50);
                } 
             catch (InterruptedException ie) {
                 System.out.println("Error");
               }
             caminata++; 
             Arreglo();
             System.out.println("xi = "+xi+" yi = "+yi+" xf = "+xf+" yf = "+yf);
            }
    }
     
    public void Recorrido4(int xi, int yi, int xf, int yf){
        while( yi<yf || xi>xf){
             // walkings[caminata].setVisible(false);
             walkings[caminata].setBounds(xi, yi, 60, 60);
             walkings[caminata].setVisible(true);
                 xi-=2; 
                 yi+=2; 
             if(caminata==7){
                 //walkings[caminata].setVisible(false);
                 caminata=-1;
               }
             try {
                 Thread.sleep(50);
                } 
             catch (InterruptedException ie) {
                 System.out.println("Error");
               }
             caminata++; 
             Arreglo();
            }
    }
    
    public void Arreglo(){
        for(int i=0; i<walkings.length; i++){
          walkings[i].setVisible(false);   
        }
    }
    
}
