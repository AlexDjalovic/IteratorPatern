package socialMedia;

public class Twitter implements SocialneMreze{

	private String[]clanovi={"mira","sanja ","jovana "};
	
	public Twitter(){
		
	}

	@Override
	public IIterator napraviIterator() {
		
		return new TwitterIterator(clanovi);
	}
}
