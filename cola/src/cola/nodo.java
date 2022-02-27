package cola;

public class nodo {
	
	private int dato;
	 private nodo next;
	//Constructor
	 public nodo(int dato){
	 this.dato=dato;
	 }
	 
	
	 public int getDato() 
	 {
	 return dato;
	 }
	 public void setDato(int dato) 
	 {
	 this.dato = dato;
	 }
	 public nodo getNext() 
	 {
	 return next;
	 }
	 public void setNext(nodo next) 
	 {
	 this.next = next;
	 }
	 

	 public String toString()
	 {
	 String s=" "+dato+" ";
	 return s;
	 }
	 


}