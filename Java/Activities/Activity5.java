package Activities;
//Abstract Class to show implementation of Abstraction

abstract class Book {
	
    String title;
	abstract void setTitle(String s);
	//Concrete Method
	String getTitle() {
		return title;
	}
}

class myBook extends Book {
	public void setTitle(String s) {
	    title = s;
}
}
public class Activity5 {

	 public static void main(String []args) {
		 String title = "Hover Car Racer";
	        //Create object for MyBook
	        Book newNovel = new myBook();
	        //Set title
	        newNovel.setTitle(title);
	        
	        //Print result
	        System.out.println("The title is: " + newNovel.getTitle());
	    }

}
