package hwk13;

public interface INotepad {
	void insertText(String text, int pageNumber);
	void updateText(String text, int pageNumber);
	void deleteText(int pageNumber);
	void previewAllPages();
	boolean searchWord(String word);
	void printAllPagesWithDigits();
}
