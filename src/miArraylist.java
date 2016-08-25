import java.util.ArrayList;
import java.util.Iterator;

public class miArraylist extends ArrayList<Object> implements Iterable<Object>{

	public miArraylist() {
		super();
	}
	
	@Override
	public Iterator<Object> iterator() {
		return new Iterador(this);
	}

}
