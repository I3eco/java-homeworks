package hwk06;

public class ComputerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Computer c1 = new Computer();
		Computer c2 = new Computer();
		
		c1.year = 2005;
		c1.price = 120.20;
		c1.isNotebook = false;
		c1.hardDiskMemory = 1000;
		c1.freeMemory = 957;
		c1.operationSystem = "macOS";
		
		c2.year = 2015;
		c2.price = 2400.59;
		c2.isNotebook = true;
		c2.hardDiskMemory = 10000;
		c2.freeMemory = 7555;
		c2.operationSystem = "Linux";
		
		c1.useMemory(100);
		
		c2.changeOperationSystem("windows 10");
		
		System.out.println(c1.year);
		System.out.println(c1.price);
		System.out.println(c1.isNotebook);
		System.out.println(c1.hardDiskMemory);
		System.out.println(c1.freeMemory);
		System.out.println(c1.operationSystem);
		
		System.out.println();
		
		System.out.println(c2.year);
		System.out.println(c2.price);
		System.out.println(c2.isNotebook);
		System.out.println(c2.hardDiskMemory);
		System.out.println(c2.freeMemory);
		System.out.println(c2.operationSystem);

	}

}
