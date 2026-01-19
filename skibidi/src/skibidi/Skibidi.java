/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package skibidi;

/**
 *
 * @author USER
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
public class Skibidi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        sn.useDelimiter("\n");
        String nombre;
        System.out.println("ingrese su skibidi nombre");
        nombre=sn.next();
        System.out.println("su nombre es: "+ nombre);
        System.out.println("hola");
        
        
        
        
        
        
    }
    
    
    public static boolean passwordCheck(JPasswordField passwordfield){
        //Verificadores 
        boolean ver1=false;//length
        boolean ver3=false;//charsespeciales
        boolean ver4=false;//no espacios
        boolean ver5=false;//verificacion de caracteres normales
        
        char[] contra= passwordfield.getPassword();
        int lengthpss = contra.length;
        
        
        //check de longitud
        if(lengthpss==5){
            ver1=true;   
        }
        
        //verificar que contenga caracteres especiales
        String specialChars ="!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        for(int i=0; i<contra.length; i++){
            String stChar = Character.toString(contra[i]);
            if(specialChars.contains(stChar)){
                ver3=true;
                break;   
            }
        }
        
        
        
        //Verificar que no tiene espacios en blanco
        boolean checkSpaces=false;
        for(int i=0; i<contra.length; i++){
            char letra = contra[i];
            if(letra==' '){
                checkSpaces=true;
               // System.out.println("Se encontro un espacio en blanco");
                break;
            }
        }
        if(checkSpaces!=true){
            ver4=true;
        }
        
        
        
        //verificar que contenga caracter normal
        String abc="abcdefghijklmnñopqrstuvwxyz";
        String ABC="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        for(int i=0;i<contra.length; i++){
            String stChar = Character.toString(contra[i]);
            if(abc.contains(stChar) || ABC.contains(stChar)){
                ver5=true;
                break;
            }
        }
        
        
        //checkeo de cada una de las condiciones
        if(ver1==true && ver3==true && ver4==true && ver5==true){
            return true;
        }else{
             if(ver1==false){
                 JOptionPane.showMessageDialog(null, "La contraseña debe tener una longitud exact a de 5 caracteres");
             }
             
             if(ver3==false){
                 JOptionPane.showMessageDialog(null, "La contraseña debe contener por lo menos un caracter especial");
             }
             
             if(ver4==false){
                 JOptionPane.showMessageDialog(null, "La contraseña no puede contener espacios en blanco");
             }
             
             if(ver5==false){
                 JOptionPane.showMessageDialog(null, "La contraseña debe tener por lo menos una letra");
             }
            
        }
        
        return false;
    }
    
    
    
    
    
}
