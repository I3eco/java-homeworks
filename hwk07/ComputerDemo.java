package hwk07;

public class ComputerDemo {

	public static void main(String[] args) {
		Computer c1 = new Computer(2005, 750, false, 4000, 3500, "Windows XP");
		Computer c2 = new Computer(2015, 2400, true, 16000, 1500, "Windows 10");
		Computer c3 = new Computer(2011, 750, false, 10000, 9000, "Windows 7");
		
		System.out.println(c1.comparePrice(c2));
		System.out.println(c2.comparePrice(c3));
		System.out.println(c3.comparePrice(c1));
	}

}
