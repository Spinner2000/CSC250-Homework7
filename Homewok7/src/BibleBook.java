public class BibleBook extends Object {
	private String name;
	private int chapters;
	private String description;
	
	public BibleBook(String name, int chapters,String description) {
		this.name=name;
		this.chapters=chapters;
		this.description=description;
	}
	
	public BibleBook(String commaDelimited)
	{
		String[] parts = commaDelimited.split(":");
		this.name = parts[0];
		this.chapters = Integer.parseInt(parts[1]);
		this.description = parts[2];
	}
	

	
	public void display() {
		System.out.println("\nBook: "+this.name+"\nNumber Of Chapters: "+this.chapters+"\nDescription: "+this.description);
	}
	

}

