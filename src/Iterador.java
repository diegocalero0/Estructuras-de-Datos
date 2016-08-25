import java.util.*;
public class Iterador implements Iterator {

	private int indice;
	private ArrayList<Object> miLista;
	private int repetido;
	public Iterador(ArrayList<Object> lista){
		miLista=lista;
		indice=miLista.size();
		repetido=1;
	}
	
	@Override
	public boolean hasNext() {
		if(indice>0){
			return true;
		}else if(repetido<1){
			repetido++;
			indice=miLista.size();
			return true;
		}else{
			return false;
		}
	}

	@Override
	public Object next() {
		Object aux=null;
		if(indice>0){
			aux=miLista.get(indice-1);
			indice--;
		}
		return aux;
	}

	
}
