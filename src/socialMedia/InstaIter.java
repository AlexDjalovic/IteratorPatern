package socialMedia;

import java.util.HashMap;

public class InstaIter implements IIterator {

	private HashMap <Integer,String>map;
	private int position;
	public InstaIter(HashMap <Integer,String>mapa){
		map=mapa;
		position=0;
	}
	@Override
	public String First() {
		// TODO Auto-generated method stub
		return map.get(0);
	}

	@Override
	public String next() {
		// TODO Auto-generated method stub
		return map.get(position++);
	}

	@Override
	public boolean end() {
		return position>=map.size();
	}

	@Override
	public String currentItem() {
		return map.get(position);
	}

}
