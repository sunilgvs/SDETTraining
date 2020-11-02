abstract class Book{
	String title ;
	
	abstract void settitle(String s);
	
	 String gettitle() {
		return title;
		}
	
}

class MyBook extends Book{
	
	public void settitle(String s) {
		
		title = s;
	}
	
	
	
	
}