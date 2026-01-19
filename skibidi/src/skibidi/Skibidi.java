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
    }
    
}
