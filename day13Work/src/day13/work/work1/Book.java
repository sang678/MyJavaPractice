package day13.work.work1;


public class Book {
	
	//Field
	
	private int category;
	private String title;
	private String author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	public Book(int category, String title, String author)
	{
		this.category = category;
		this.title = title;
		this.author = author;
	}
	
	public String getAuthor() {
		return author;
	}
	public int getCategory() {
		return category;
	}
	public String getTitle() {
		return title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "category : " + category + " title : " + title + " author : " + author;
	}
	
	

}
