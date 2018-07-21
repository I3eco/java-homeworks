package hwk13;

public class Page {
	private String title;
	private String text;
	
	public Page(String title) {
		this.title = title;
		this.text = "";
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void addText(String text) {
		this.text +=text;
	}
	public void deleteText() {
		this.text = "";
	}
	public String pagePreview() {
		return this.title+"\n"+this.text;
	}
	
	public boolean searchWord(String word)	{
		if (word == null) {
			return false;
		}
		if (this.text.contains(word)) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean containsDigits() {
		if (this.text.matches(".*\\d+.*")) {
			return true;
		} else {
			return false;
		}
	}	
}
