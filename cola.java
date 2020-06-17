
public class cola<T> {
private T Esquina [];
private int Frente; 
private int Maximo;
private int n; 


    public cola(int N){
        Maximo=N;
      Esquina = (T[]) new Object [Maximo];
         Frente=0;
         n=0;
     
    }
     public boolean colaLlena(){
        if(Frente==Esquina.length){
            return true;
        }else{
            return false;
        }
    }
  public void encolar(T Num)throws ExcepcionColaLLena {
      if(ColaVacia()){
          
      }
      if(colaLlena()){
            throw new ExcepcionColaLLena();
        }
      int ubicacion=(Frente+n)%Maximo;
       Esquina [ubicacion] = Num; 
       n++;
  }
     public boolean ColaVacia(){
        if(n==Maximo){
            return true;
        }else if(n==0){
             return true;
        }else{
            return false;    
           }
    }
      public T sacar()throws ExcepcionColaVacia{
        if(ColaVacia()){
            throw new ExcepcionColaVacia();
        }
        T aux=Esquina[Frente];
        Frente=(Frente+1)%Maximo;
        n--;
        return aux;
      }
     /*public int suma(int n,int n2,int n3,int n4,int n5){
         int aux,aux2,aux3,aux4;
         aux=n+n2;
         aux2=aux+n3;
         aux3=aux2+n4;
         aux4=aux3+n5;
         return aux4;
     }
     public int resta(int n,int n2,int n3,int n4,int n5){
         int aux,aux2,aux3,aux4;
         aux=n-n2;
         aux2=aux-n3;
         aux3=aux2-n4;
         aux4=aux3-n5;
         return aux4;
     }
     public int divicion(int n,int n2,int n3,int n4,int n5){
         int aux,aux2,aux3,aux4;
         aux=n/n2;
         aux2=aux/n3;
         aux3=aux2/n4;
         aux4=aux3/n5;
         return aux4;
     }
     public int multiplicacion(int n,int n2,int n3,int n4,int n5){
         int aux,aux2,aux3,aux4;
         aux=n*n2;
         aux2=aux*n3;
         aux3=aux2*n4;
         aux4=aux3*n5;
         return aux4;*/
     }
