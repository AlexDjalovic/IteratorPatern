package socialMedia;

import java.util.LinkedList;

public class Facebook implements SocialneMreze{

	private LinkedList<String>lista;
	
	public Facebook(){
		lista=new LinkedList<>();
		lista.add("Pera");
		lista.add("Joca ");
		lista.add("Aca");
	}

	
	public LinkedList<String> getLista() {
		return lista;
	}


	@Override
	public IIterator napraviIterator() {
		// TODO Auto-generated method stub
		return new FacebookIter(this);
	}
}
