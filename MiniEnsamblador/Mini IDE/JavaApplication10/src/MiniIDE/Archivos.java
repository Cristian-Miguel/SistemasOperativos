/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniIDE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 *
 * @author Nivak
 */
public class Archivos {
    private static  String FILENAME = "";
    
    Archivos(String archivo, String donde, String nombre){
        FILENAME = archivo;
         try (Writer writer = new BufferedWriter(new OutputStreamWriter(
              new FileOutputStream("ruta.txt"), "utf-8"))) {
                writer.write(donde+"#"+nombre);
            }catch (IOException e)
            {
             e.printStackTrace();
            }
    }
    
    Archivos(boolean que){
      //Sobre carga de constructores
    }
    
    public String leerArchivo(String dir){
        String archivo = "";
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

			String sCurrentLine;
                        int linea = 0;
                        String outputdirectory = dir.replace('\\', '/');
			while ((sCurrentLine = br.readLine()) != null) {
				archivo += sCurrentLine+"\n";
                                if(linea == 1) archivo += "OUTPUT_DIRECTORY=\""+outputdirectory+"\";\n";
                                linea++;
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
        return archivo;
    }
    
    public String leerRuta(){
        String archivo = "";
        try (BufferedReader br = new BufferedReader(new FileReader("ruta.txt"))) {

			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				archivo = sCurrentLine.trim();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
        return archivo;
    }
}
