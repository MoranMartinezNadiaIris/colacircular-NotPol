/*
 * Notación prefija o Polaca es una
 * forma de escribir operaciones diferente a 
 * la ordinaria
 * Ejemplo 
 * 		Normal ==> Polaca
 * 		3 + 4  ==> + 3 4 
 * 
 * Siempre usamos un <espacio> entre los
 * operandos y la operación va al principio,
 * y se repite hasta terminar con los operandos
 * 
 *   + 3 10 
 *   13
 * Los operandos se toman de dos en dos
 * por lo que :
 * 
 *   + 4 5 6 7
 * 
 * implica primero resolver: 4 + 5 = 9
 * 
 * + 9 6 7
 * 
 * volvemos a tomar dos numeros: 9 + 6 = 15
 * 
 * + 15 7
 * 
 * repetimos hasta que no haya más: 15 + 7
 * 
 * 22
 * 
 * 
 * Nota:
 * La notacion polaca no funciona exactamente
 * como la describi aqui, en Automatas I y II
 * se vera a profundidad.
 * 
 * Ejercicio
 * Escribir una calculadora basica en notacion
 * polaca para aplicar operaciones basicas de
 * Suma, Resta, Multiplicacion y Division
 * que implemente una cola circular que
 * soporte 1 Operacion y 5 operandos.
 * Escriba el resultado e imprima.
 * 
 * Corrida de escritorio
 * 
 * Bienvenido a este programa!
 * Escribe tu operacion:
 * > +
 * Escribe el operando 1:
 * > 1
 * Escribe el operando 2:
 * > 2
 * Escribe el operando 3:
 * > 3
 * Escribe el operando 4:
 * > 4
 * Escribe el operando 5:
 * > 5
 * 
 * El resulado es 15
 * Notacion Polaca: + 1 2 3 4 5 
 */ 
import java.util.Scanner;
public class NotPol {
	public static void main(String args[]){
		double suma=0,resta=0,num=0,mult=0,div=0;
        Scanner sc= new Scanner(System.in);
        int n=5,c=0;
        colacircular<Double> cd= new<Double> colacircular(n);
        boolean v=false;
         System.out.println("Bienvenido a este programa!");
          //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
           try{
        do{
       System.out.println("Seleccione una opcion\nsuma +\nresta -\nmultiplicacion *\ndivicion / ");
       String sim=sc.next();
       switch(sim) {
       case "+":
    	   for(int i=0; i<cd.capacidad(); i++) {
    		   System.out.println("Ingrese el operando");
    		   num=sc.nextDouble();
    		   cd.encolar(num);
    	   }
    	   cd.imp();
    	   suma=cd.sum(cd);
    	   System.out.println();
    	   System.out.println("+ "+suma);
    	   break;
    	   ////////////////////////////////////////////////////////////////////
       case "-":
    	   for(int i=0; i<cd.capacidad(); i++) {
    		   System.out.println("Ingrese el operando");
    		   double num2=sc.nextDouble();
    		   cd.encolar(num2);
    	   }
    	   resta=cd.resta(cd);
    	   System.out.println();
    	   System.out.println("- "+resta);
    	   break;
    	   ///////////////////////////////////////////////////////////////////////
       case "*":
    	   for(int i=0; i<cd.capacidad(); i++) {
    		   System.out.println("Ingrese el operando");
    		   double num3=sc.nextDouble();
    		   cd.encolar(num3);
    	   }
    	   cd.imp();
    	   mult=cd.mult(cd);
    	   System.out.println();
    	   System.out.println("* "+mult);
    	   break;
    	   //////////////////////////////////////////////////////////////////////////
       case "/":
    	   for(int i=0; i<cd.capacidad(); i++) {
    		   System.out.println("Ingrese el operando");
    		   double num4=sc.nextDouble();
    		   cd.encolar(num4);
    	   }
    	   cd.imp();
    	   div=cd.div(cd);
    	   System.out.println();
    	   System.out.println("/ "+div);
    	   break;
    	   }
               }while(v==false);
       		
           }catch(ExcepcionColaLLena err) {
        	   System.out.println(err.getMessage());
           }
    }
}
        
