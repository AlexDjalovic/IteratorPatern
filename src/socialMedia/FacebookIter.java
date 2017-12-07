package socialMedia;

import java.util.LinkedList;

public class FacebookIter implements IIterator {

	//LinkedList<String>lista;
	Facebook lista;
	private int position;
	public FacebookIter(Facebook facebook){
		lista=facebook;
		position=0;
	}
	@Override
	public String First() {
		return lista.getLista().get(0);

	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		return lista.getLista().get(position++);
	}

	@Override
	public boolean end() {
		// TODO Auto-generated method stub
		return position>=lista.getLista().size();
	}

	@Override
	public String currentItem() {
		// TODO Auto-generated method stub
		return lista.getLista().get(position);
	}

}
