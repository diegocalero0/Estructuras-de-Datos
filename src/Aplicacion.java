
public class Aplicacion {

	public static void main(String[] args) {
		miArraylist lista = new miArraylist();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		
		for(Object o:lista){
			System.out.println(o);
		}

	}

}
