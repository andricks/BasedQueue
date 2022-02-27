package cola;

public class List {
	private nodo inicio;
	 private nodo termino;
	 public static void main(String[] args) 
	 {
		 
		 List cola1 =new List();
	  cola1.insertar(46);
	  cola1.insertar(12);
	  cola1.insertar(87);
	  cola1.insertar(125);
	  cola1.insertar(30);
	  cola1.extraer();
	  cola1.estaVacia();
	  cola1.contar();
	  System.out.println(cola1.toString());
	 }
	
	 public List()
	 {
	 inicio=null;
	 termino=null;
	 }
	 
	
	 public void insertar(int dato)
	 {
	 nodo i=new nodo(dato);
	 i.setNext(null);
	 if(inicio==null & termino==null)
	 {
	 inicio=i;
	 termino=i;
	 }
	 termino.setNext(i);
	 termino=termino.getNext();
	 }
	 
	 //Metodo extraer dato
	 public int extraer()
	 {
	 int dato=inicio.getDato();
	 inicio=inicio.getNext();
	 return dato;
	 }
	 
	 //Metodo para comprobar que la cola no esta vacia
	 public boolean estaVacia()
	 {
	 boolean cola=false;
	 if(inicio==null & termino==null)
	 {
	 cola=true;
	 System.out.println("La cola esta vacia");
	 }
	 else
	 {
	 System.out.println("La cola no esta vacia");
	 cola=false;
	 }
	 return cola;
	 }
	 
	 //Metodo para contar los elementos de la cola
	 public int contar()
	 {
	 int contador=0;
	 nodo c=this.inicio;
	 while(c!=null)
	 {
	 contador++;
	 c=c.getNext();
	 }
	 System.out.println("Numero de datos en la cola: "+contador);
	 return contador;
	 }
	//Metodo toString
		 public String toString()
		 {
		 nodo c=this.inicio;
		 String s="";
		 while(c!=null)
		 {
		 s=s+c.toString();
		 c=c.getNext();
		 }
		 return s;
		 } 
	 
	 


}

	 
	 
	

	

	
