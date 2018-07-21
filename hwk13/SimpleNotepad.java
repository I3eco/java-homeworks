package hwk13;

public class SimpleNotepad implements INotepad {
	private Page[] pages;

	SimpleNotepad(int pageCount) {
		this.pages = new Page[pageCount];
		for (int i = 0; i < pageCount; i++) {
			this.pages[i] = new Page("" + (i + 1));
		}
	}

	@Override
	public void insertText(String text, int pageNumber) {
		if (validatePageNumber(pageNumber)) {
			this.pages[pageNumber].addText(text);
		}
	}

	@Override
	public void updateText(String text, int pageNumber) {
		if (validatePageNumber(pageNumber)) {
			this.pages[pageNumber].deleteText();
			this.pages[pageNumber].addText(text);
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if (validatePageNumber(pageNumber)) {
			this.pages[pageNumber].deleteText();
		}
	}

	@Override
	public void previewAllPages() {
		System.out.println("Simple notepad preview pages");
		for (int i = 0; i < this.pages.length; i++) {
			System.out.println(this.pages[i].pagePreview());
		}
	}

	public boolean validatePageNumber(int number) {
		return number >= 0 && number < this.pages.length;
	}

	@Override
	public boolean searchWord(String word) {
		boolean check = false;
		for(int i = 0; i < this.pages.length; i++) {
			if (pages[i].searchWord(word)) {
				check = true;
				break;
			}
		}
		return check;
	}

	@Override
	public void printAllPagesWithDigits() {
		for(int i = 0; i < this.pages.length; i++) {
			if (pages[i].containsDigits()) {
				this.pages[i].pagePreview();
			}
		}

	}

}
