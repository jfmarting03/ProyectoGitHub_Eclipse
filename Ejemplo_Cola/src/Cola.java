import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//borrar primero, segundo y volver a mostrar A,A ABCD, CD
public class Cola {

	public static void main(String[] args) {
		List<String> milista = new LinkedList<String>(); //Se crea la lista de tipo generico String
		milista.add("A");
		milista.add("B");
		milista.add("C");
		milista.add("D");
		System.out.println("head:" +((LinkedList<String>) milista).element()); //SE PUEDE HACER CON GETFIRST
		System.out.println("head:" + ((LinkedList<String>) milista).peek());
		Iterator itr=milista.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
	}

		System.out.println("Eliminar primero: " + ((LinkedList<String>) milista).remove());

		//System.out.println("Eliminar primero" + ((LinkedList<String>) milista).poll());
		Iterator itr1=milista.iterator();
		while(itr1.hasNext()) {
		System.out.println(itr1.next());
		}
		//Eliminar segundo
		System.out.println("Eliminar primero: " + ((LinkedList<String>) milista).remove());
		Iterator itr2=milista.iterator();
		while(itr2.hasNext()) {
		System.out.println(itr2.next());
		}
}
}
