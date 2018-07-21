package hwk16;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CheckPictures {
	private static void compareImages(File p1, File p2) {
		try {
			FileInputStream fis1 = new FileInputStream(p1);
			FileInputStream fis2 = new FileInputStream(p2);
			int c1;
			int c2 = 0;
			while ((c1 = fis1.read()) != -1 && (c2 = fis2.read()) != -1) {
				if (c1 != c2) {
					System.out.println("Images are not the same");
					return;
				}
			}
			if (c1 == -1) {
				c2 = fis2.read();
			}
			if (c1 == c2) {
				System.out.println("Files are equal");
			} else {
				System.out.println("Files are not equal");
			}
			fis1.close();
			fis2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		File parent = new File("./src/hwk16");
		File p1 = new File(parent, "soft-academy-logo-1.png");
		File p2 = new File(parent, "soft-academy-logo-2.png");
		File p3 = new File(parent, "veliko-velikov.jpg");

		CheckPictures.compareImages(p1, p2);
		CheckPictures.compareImages(p1, p3);
		CheckPictures.compareImages(p2, p3);
	}

}
