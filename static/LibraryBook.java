public class LibraryBook{
	
	static String libraryName;
    static String city;
    static int totalBooks;

    // Non-static variables
    String title;
    String author;
    int bookNo;
    int pages;

    static{

	libraryName = "City Library";
    city = "San Francisco";
    totalBooks = 5000;

    }

    public LibraryBook(String title, String author, int bookNo, int pages) {
        this.title = title;
        this.author = author;
        this.bookNo = bookNo;
        this.pages = pages;
    }

    public void printDetails(){
		System.out.println("libraryName: "+libraryName);
    	System.out.println("city: "+city);
    	System.out.println("totalBooks: "+totalBooks);
    	System.out.println("title: "+title);
    	System.out.println("author: "+author);
    	System.out.println("bookNo: "+bookNo);
    	System.out.println("pages: "+pages);


    	System.out.println("*****************************");

    }
}