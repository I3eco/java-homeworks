package hwk13;

import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad {
	private String password;

	private SecuredNotepad(int pageNumber, String password) {
		super(pageNumber);
		if (isStrongPassword(password)) {
			this.password = password;
		}
	}
	
	public static SecuredNotepad createInstance(int pageNumber, String password) {
		if (isStrongPassword(password)) {
			return new SecuredNotepad(pageNumber, password);
		}
		return null;
	}


	public static boolean isStrongPassword(String password) {
		boolean check = false;
		if (password.length() < 5) {
			return check;
		}
		for (int i = 0; i < password.length(); i++) {
			if (Character.isUpperCase(password.charAt(i))) {
				check = true;
				break;
			}
		}
		if (check) {
			check = false;
			for (int i = 0; i < password.length(); i++) {
				if (Character.isLowerCase(password.charAt(i))) {
					check = true;
					break;
				}
			}
			if (check) {
				check = false;
				if (password.matches(".*\\d+.*")) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public void insertText(String text, int pageNumber) {
		if (validatePassword(enterPassword())) {
			super.insertText(text, pageNumber);
		} else {
			System.out.println("Invalid password");
		}
	}

	@Override
	public void updateText(String text, int pageNumber) {
		if (validatePassword(enterPassword())) {
			super.updateText(text, pageNumber);
		} else {
			System.out.println("Invalid password");
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if (validatePassword(enterPassword())) {
			super.deleteText(pageNumber);
		} else {
			System.out.println("Invalid password");
		}
	}

	@Override
	public void previewAllPages() {
		if (validatePassword(enterPassword())) {
			super.previewAllPages();
		} else {
			System.out.println("Invalid password");
		}
	}

	private boolean validatePassword(String inputPass) {
		return inputPass.equals(this.password);
	}

	private String enterPassword() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password:");
		return sc.nextLine();
	}

}