package hwk10;

public class GsmTest {
	public static void main(String[] args) {
		GSM mb1 = new GSM("Nokia");
		GSM mb2 = new GSM("LG");
		GSM mb3 = new GSM("Samsung");
		
		Call.setPriceForAMinute(2);
		
		mb1.insertSimCard(null);
		System.out.println(mb1.getSimMobileNumber());
		mb1.insertSimCard("12345687");
		System.out.println(mb1.getSimMobileNumber());
		mb1.insertSimCard("08123456789");
		System.out.println(mb1.getSimMobileNumber());
		mb1.insertSimCard("0885261513");
		System.out.println(mb1.getSimMobileNumber());
		
		mb2.insertSimCard("0878223322");
		
		mb2.call(mb1, 10);
		
		mb1.printInfoForTheLastIncomingCall();
		mb2.printInfoForTheLastOutgoingCall();
		
		System.out.println(mb2.getSumForCall());
		System.out.println(mb1.getSumForCall());
		
		mb3.call(mb1, 20);
		mb3.printInfoForTheLastIncomingCall();
		mb3.printInfoForTheLastOutgoingCall();
		
		System.out.println(mb3.getLastOutgoingCall());
		
		
	}
}
