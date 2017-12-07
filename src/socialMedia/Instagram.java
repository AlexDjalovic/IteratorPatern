package socialMedia;

import java.util.HashMap;

public class Instagram implements SocialneMreze {

	HashMap<Integer,String>mapa;
	public Instagram(){
		mapa=new HashMap<>();
		mapa.put(0, "abc");
		mapa.put(1, "cde");
		mapa.put(2, "fff");
	}
	@Override
	public IIterator napraviIterator() {
		// TODO Auto-generated method stub
		return new InstaIter(mapa);
	}

}
