package socialMedia;

public class TwitterIterator implements IIterator {

	private String[]red;
	private int position;
	
	public TwitterIterator(String[]redic){
		red=redic;
		position=0;
	}
	@Override
	public String First() {
	 return red[0];

	}

	@Override
	public String next() {
		return red[position++];
	}

	@Override
	public boolean end() {
		// TODO Auto-generated method stub
		return position>=red.length;
	}

	@Override
	public String currentItem() {
		// TODO Auto-generated method stub
		return red[position];
	}

}
