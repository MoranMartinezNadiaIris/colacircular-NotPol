
public class colacircular <T> {
		private T Esquina [];
		private int Entrada; 
		private int Salida; 
		
		public colacircular(int n) {
		         Esquina = (T[]) new Object [n];
		    Entrada=0;
		    Salida=1;
		    }
		    public boolean colaLlena(){
		        if(Entrada==Esquina.length) {
		                return true;
		        }else {
		                return false;
		        }
		    }
		     public void encolar(T N)throws ExcepcionColaLLena {
		      if(colaVacia()){
		           Entrada=0;
		          Salida=-1;
		      }
		      if(colaLlena()){
		            throw new ExcepcionColaLLena();
		        }
		        int mod=Entrada%Esquina.length;
		        Esquina[mod]=N;
		        Entrada ++;
		        if(Entrada==1) {
		        	Salida=0;
		        }
		     }
		      public T sacar()throws ExcepcionColaVacia{
		        if(colaVacia()){
		            throw new ExcepcionColaVacia();
		        }
		        T valor=Esquina[Salida];
		        Salida=Salida%Esquina.length;
		        Salida++;
		        return valor;
		      }
		         public int capacidad() {
		        	 return Esquina.length;
		    }
		         public boolean colaVacia() {
		        	 if(Salida==Entrada) {
		        		 return true;
		        	 }else if(Salida==-1) {
		        		 return true;
		        	 }else {
		        		 return false;
		        	 }
		        	 }
		         public double sum(colacircular<Double>cd) {
		        	 double acum=0;
		        	 for(int i=0; i< cd.capacidad(); i++) {
		        		 try {
		        			 acum=(Double)acum+cd.sacar();
		        		 }catch(ExcepcionColaVacia e) {
		        			 System.out.println(e.getMessage());
		        		 }
		        	 }
		        	 return acum;
		         }
		         public double resta(colacircular<Double>d) {
		        	 double acum=0;
		        	 try {
		        		 acum=d.sacar();
		        		 for(int i=0; i< d.capacidad(); i++) {
		        			 acum=acum-d.sacar();
		        		 }
		        		}catch(ExcepcionColaVacia e) {
		        			System.out.println(e.getMessage());
		        		}
		        	 return acum;
		         }
		         public double mult(colacircular<Double>d) {
		        	 double acum=0;
		        	 try {
		        		 acum=d.sacar();
		        		 for(int i=0; i< d.capacidad(); i++) {
		        			 acum=acum*d.sacar();
		        		 }
		        		 }catch(ExcepcionColaVacia e) {
		        			 System.out.println(e.getMessage());
		        		 }
		        	 return acum;
		         }
		         public double div(colacircular<Double>d) {
		        	 double acum=0;
		        	 try {
		        		 acum=d.sacar();
		        		 for(int i=0; i< d.capacidad(); i++) {
		        			 acum=acum/d.sacar();
		        			 System.out.print(acum);
		        		 } 
		        	 }catch(ExcepcionColaVacia e) {
		        		 System.out.println(e.getMessage());
		        	 }
		        	 return acum;
		         }
		         public void imp() {
		        	 for(int i=0; i< Esquina.length; i++) {
		        		 System.out.print(" "+Esquina[i]);
		        	 }
		         }
		}