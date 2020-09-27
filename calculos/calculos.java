package calculos;
import java.util.Scanner;
import logica.operaciones;

public class calculos {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
          operaciones operacion= new operaciones();
         int opc,op;
         String resp="si";
         System.out.println("Ingrese el numero de la operacion a realizar: ");
         System.out.println("1.-Suma");
         System.out.println("2.-Resta");
         System.out.println("3.-Multiplicacion");
         System.out.println("4.-Division");
         System.out.println("5.-Salir");
         opc=leer.nextInt();


         switch (opc){
             case 1:
                 operacion.suma();
               
                 break;
             case 2:
                 operacion.resta();
                 
                 break;
             case 3:
                 operacion.mul();
               
                 break;
             case 4:
                 operacion.division();
                 
                 break;
             case 5:
             
                     System.out.println("PROGRAMA FINALIZADO.");
                     System.exit(0);
                 
                     break;  
                 default:
                     System.out.println("La opcion no es valida, digite otro numero: ");

         }
         System.out.println("\" Desea continuar?  1.-Si  / X numero.- No\"");
                 op=leer.nextInt();
                 if(op==1){
                     calculos.main(args);
                 } 
                 
                 else{
                     System.out.println("PROGRAMA FINALIZADO.");
                     System.exit(0);                     
                 }

    }

    private static void main() {
        throw new UnsupportedOperationException("Not supported yet."); 

    }

}
