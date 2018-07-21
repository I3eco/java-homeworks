package hwk06;

public class TryZoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Zoo z1 = new Zoo();
		
		Monkey m1 = new Monkey();
		Monkey m2 = new Monkey();
		Monkey m3 = new Monkey();
		Monkey m4 = new Monkey();
		Monkey m5 = new Monkey();
		Monkey m6 = new Monkey();
		
		Lion l1 = new Lion();
		Lion l2 = new Lion();
		Lion l3 = new Lion();
		
		Eagle e1 = new Eagle();
		Eagle e2 = new Eagle();
		Eagle e3 = new Eagle();
		
		Snake sn1 = new Snake();
		Snake sn2 = new Snake();
		Snake sn3 = new Snake();
		
		Shark sh1 = new Shark();
		Shark sh2 = new Shark();
		Shark sh3 = new Shark();

		m1.isFish = false;
		m1.isMammal = true;
		m1.legsCount = 4;
		m1.speed = 55;

		m2.isFish = false;
		m2.isMammal = true;
		m2.legsCount = 2;
		m2.speed = 27;
		
		m3.isFish = false;
		m3.isMammal = true;
		m3.legsCount = 3;
		m3.speed = 7;
		
		m4.isFish = false;
		m4.isMammal = true;
		m4.legsCount = 2;
		m4.speed = 29;
		
		m5.isFish = false;
		m5.isMammal = true;
		m5.legsCount = 4;
		m5.speed = 48;
		
		m6.isFish = false;
		m6.isMammal = true;
		m6.legsCount = 8;
		m6.speed = 350;
		
		l1.isFish = false;
		l1.isMammal = true;
		l1.legsCount = 4;
		l1.speed = 50;
		
		l2.isFish = false;
		l2.isMammal = true;
		l2.legsCount = 3;
		l2.speed = 10;
		
		l3.isFish = false;
		l3.isMammal = true;
		l3.legsCount = 4;
		l3.speed = 70;
		
		e1.isFish = false;
		e1.isMammal = false;
		e1.legsCount = 2;
		e1.speed = 150;
		
		e2.isFish = false;
		e2.isMammal = false;
		e2.legsCount = 2;
		e2.speed = 160;
		
		e3.isFish = false;
		e3.isMammal = false;
		e3.legsCount = 2;
		e3.speed = 170;
		
		sn1.isFish = false;
		sn1.isMammal = false;
		sn1.legsCount = 0;
		sn1.speed = 25;
		
		sn2.isFish = false;
		sn2.isMammal = false;
		sn2.legsCount = 0;
		sn2.speed = 30;
		
		sn3.isFish = false;
		sn3.isMammal = false;
		sn3.legsCount = 0;
		sn3.speed = 35;
		
		sh1.isFish = true;
		sh1.isMammal = false;
		sh1.legsCount = 0;
		sh1.speed = 50;
		
		sh2.isFish = true;
		sh2.isMammal = false;
		sh2.legsCount = 0;
		sh2.speed = 30;
		
		sh3.isFish = true;
		sh3.isMammal = false;
		sh3.legsCount = 0;
		sh3.speed = 10;
		
		System.out.println("Test of animal methods here:");
		
		System.out.println();
		m1.eat();
		m1.getLegsCount();
		
		System.out.println();
		l1.eat();
		l1.getLegsCount();
		
		System.out.println();
		e1.eat();
		e1.getLegsCount();
		
		System.out.println();
		sn1.eat();
		sn1.getLegsCount();
		
		System.out.println();
		sh1.eat();
		sh1.getLegsCount();
		
		System.out.println();	
		System.out.println("Test of zoo methods here:");
		
		System.out.println();
		System.out.println("Let's add some monkeys...");
		
		z1.addMonkey(m1);
		z1.addMonkey(m2);
		z1.addMonkey(m3);
		z1.addMonkey(m4);
		z1.addMonkey(m5);
		z1.addMonkey(m5);
		z1.addMonkey(m4);
		z1.addMonkey(m3);
		z1.addMonkey(m2);
		z1.addMonkey(m1);
		
		System.out.println();
		System.out.println("The monkeys are:");
		System.out.println();

		for (int i = 0; i < z1.arrMonkey.length; i++) {
			
			System.out.print("Monkey " + (i+1) + ": ");
			System.out.print(z1.arrMonkey[i].isFish + " ");
			System.out.print(z1.arrMonkey[i].isMammal + " ");
			System.out.print(z1.arrMonkey[i].legsCount + " ");
			System.out.print(z1.arrMonkey[i].speed + " ");
			System.out.println();
		}
		
		System.out.println();
		System.out.print("If you try to add more monkeys than it's possible, you'll see that ");
		z1.addMonkey(m6);
		
		System.out.println();
		System.out.println("Now let's remove them...");
		
		z1.removeMonkey();
		z1.removeMonkey();
		z1.removeMonkey();
		z1.removeMonkey();
		z1.removeMonkey();
		z1.removeMonkey();
		z1.removeMonkey();
		z1.removeMonkey();
		z1.removeMonkey();
		z1.removeMonkey();
		
		System.out.println();
		System.out.print("If you try to remove a monkey, but you haven't any left, you'll see that ");
		z1.removeMonkey();
		
		System.out.println();
		System.out.println("Now let's add some more animals...");
		
		z1.addMonkey(m1);
		z1.addMonkey(m2);
		z1.addMonkey(m3);
		
		z1.addLion(l1);
		z1.addLion(l2);
		z1.addLion(l3);
		
		z1.addEagle(e1);
		z1.addEagle(e2);
		z1.addEagle(e3);
		
		z1.addSnake(sn1);
		z1.addSnake(sn2);
		z1.addSnake(sn3);
		
		z1.addShark(sh1);
		z1.addShark(sh2);
		z1.addShark(sh3);
		
		System.out.println();
		System.out.println("Let's count them all...");
		z1.getAnimalsCount();
		
		System.out.println();
		System.out.println("Now lets's see how many mammals we have...");
		z1.getMammalsCount();
		
		System.out.println();
		System.out.println("And at last!!! Are there any fishes in the zoo?...");
		z1.getFishesCount();
		
		System.out.println();
		System.out.println();
		System.out.println("PS: We didn't test all the similar methods, because we used copy-paste to make them. And we're pretty sure that the teacher should have time to look through homeworks of others.");

	}

}
