class Books {
	String title;
	String author;
}

class BooksTestDrive {
	public static void main(String[] args) {
		int x = 0;
		Books[] myBooks = new Books[3];
		myBooks[0] = new Books();
		myBooks[1] = new Books();
		myBooks[2] = new Books();
		myBooks[0].title = "The Grapes of Java";
		myBooks[1].title = "The Java Gatsby";
		myBooks[2].title = "The Java Cookbook";
		myBooks[0].author = "bob";
		myBooks[1].author = "sue";
		myBooks[2].author = "ian";
		
		while (x < 3) {
			System.out.println(myBooks[x].title + " by " + myBooks[x].author);
			x = x + 1;
		}
	}
}