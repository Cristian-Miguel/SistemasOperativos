/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniIDE;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;

/**
 *
 * @author Nivak
 */
public class Javacc {
    
     public String javaccCMD(String cmd, String donde, String code, boolean escribe) throws UnsupportedEncodingException, IOException{
        String resultado = "<span style='color: green;'>****** Compilación de clases JAVA correctas ******</span>";
        
        if(escribe){
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
              new FileOutputStream(donde), "utf-8"))) {
                writer.write(code);
             }catch (IOException e)
            {
                e.printStackTrace();
            }
        resultado = "";
        }

        try
        {
           Runtime rt = Runtime.getRuntime();
            String[] commands = {"cmd","/c", cmd};
            Process proc = rt.exec(commands);

            BufferedReader stdInput = new BufferedReader(new 
                 InputStreamReader(proc.getInputStream()));

            BufferedReader stdError = new BufferedReader(new 
                 InputStreamReader(proc.getErrorStream()));

            String s = null;
            //Estas son etiquetas HTML para jEditorPane, modificar el tipo de formato que permite.
            while ((s = stdInput.readLine()) != null) {
                resultado += ("<br><span style='color: green;'>"+s+"</span>");
            }
            
            while ((s = stdError.readLine()) != null) {
                resultado += ("<br><span style='color: red;'>Error: "+s+"</span>");
            }
            
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return resultado;
    }
     
    public String compilarLenguaje(String code, String donde[]) throws UnsupportedEncodingException, IOException{
        String resultado = "";
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
              new FileOutputStream(donde[0]+"\\codigo.txt"), "utf-8"))) {
                writer.write(code);
             }catch (IOException e)
            {
                e.printStackTrace();
            }
        
        
        try
        {
           String f = donde[1].replaceAll(".jj", "").replaceAll(".jjt","");
           Runtime rt = Runtime.getRuntime();
            String[] commands = {"cmd","/c","java -cp "+donde[0]+" "+f.trim()+"  < "+donde[0]+"\\codigo.txt"};
            Process proc = rt.exec(commands);

            BufferedReader stdInput = new BufferedReader(new 
                 InputStreamReader(proc.getInputStream()));

            BufferedReader stdError = new BufferedReader(new 
                 InputStreamReader(proc.getErrorStream()));

            String s = null;
            //Estas son etiquetas HTML para jEditorPane, modificar el tipo de formato que permite.
            while ((s = stdInput.readLine()) != null) {
                resultado += ("<br><span style='color: green;'>"+s+"</span>");
            }
            
            while ((s = stdError.readLine()) != null) {
                resultado += ("<br><span style='color: red;'>Error: "+s+"</span>");
            }
            
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return resultado;
    }
}
