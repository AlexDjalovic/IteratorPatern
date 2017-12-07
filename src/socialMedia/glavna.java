package socialMedia;

public class glavna {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SocialneMreze fb=new Facebook();
		SocialneMreze tw=new Twitter();
		SocialneMreze in=new Instagram();
		
		IIterator fbi=fb.napraviIterator();
		IIterator twi=tw.napraviIterator();
		IIterator ini=in.napraviIterator();
		
		printUsers(fbi);
		System.out.println("*******");
		printUsers(twi);
		System.out.println("*****");
		printUsers(ini);
	}

	public static void printUsers(IIterator iter){
		
		System.out.println("prvi u redu je: "+iter.First());
		System.out.println("\n");
		while(!iter.end()){
			//System.out.println("trenutni "+iter.currentItem());
			System.out.println(iter.next());
		}
	}
}
