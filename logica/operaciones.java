/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Scanner;

/**
 *
 * @author PC1
 */
public class operaciones {
    
    public void suma (){
        int a,b,c;
        Scanner leer=new Scanner (System.in);
        System.out.println("eligió la suma de 2 numeros.....");
        System.out.println("");
        System.out.println("introduce un numero: ");
        a=leer.nextInt();
        System.out.println("introduce otro numero; ");
        b=leer.nextInt();
        c=a+b;
        System.out.println("la suma es: "+c);
        
    }
    public void resta(){
        int a,b,c;
        Scanner leer=new Scanner (System.in);
        System.out.println("eligió la resta de 2 numeros.....");
        System.out.println("");
        System.out.println("introduce un numero: ");
        a=leer.nextInt();
        System.out.println("introduce otro numero");
        b=leer.nextInt();
        c=a-b;
        System.out.println("la resta es: "+c);
        
        
    }
    public void mul(){
        int a,b,c;
        Scanner leer=new Scanner (System.in);
        System.out.println("eligió la multiplicacion.....");
        System.out.println("");
        System.out.println("introduce un numero: ");
        a=leer.nextInt();
        System.out.println("introduce otro numero: ");
        b=leer.nextInt();
        c=a*b;
        System.out.println("la multiplicacion es: "+c);
        
    }
    public void division (){
        double a,b,c;
        Scanner leer=new Scanner (System.in);
        System.out.println("eligió dividir.....");
        System.out.println("ingresa el numero a dividir; ");
        a=leer.nextDouble();
        System.out.println("ingrese el numero por el cual va a dividir: ");
        b=leer.nextDouble();
        c=a*b;
        System.out.println("la division es: "+c);   
    }
}
