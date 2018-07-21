//package hwk13;
//
//import java.util.Scanner;
//
//public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice{
//	private boolean isStarted;
//
//	public ElectronicSecuredNotepad(int pageNumber, String password) {
//		super.createInstance(pageNumber, password);
//	}
//
//	@Override
//	public void start() {
//		this.isStarted = true;		
//	}
//
//	@Override
//	public void stop() {
//		this.isStarted = false;		
//	}
//
//	@Override
//	public boolean isStarted() {
//		return this.isStarted;
//	}
//	
//	@Override
//	public void insertText(String text, int pageNumber) {
//		if (isStarted) {
//			super.insertText(text, pageNumber);
//		}
//	}
//
//	@Override
//	public void updateText(String text, int pageNumber) {
//		if (isStarted) {
//			super.updateText(text, pageNumber);
//		}
//	}
//
//	@Override
//	public void deleteText(int pageNumber) {
//		if (isStarted) {
//			super.deleteText(pageNumber);
//		}
//	}
//
//	@Override
//	public void previewAllPages() {
//		if (isStarted) {
//			super.previewAllPages();
//		}
//	}
//	
//}
