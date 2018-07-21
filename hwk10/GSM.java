package hwk10;

public class GSM {
	private final String MODEL;
	private boolean hasSimCard;
	private String simMobileNumber;
	private double outgoingCallsDuration;
	private Call lastIncomingCall;
	private Call lastOutgoingCall;

	GSM(String model) {
		this.MODEL = model;
	}

	public String getSimMobileNumber() {
		return simMobileNumber;
	}

	public String getModel() {
		return MODEL;
	}

	public boolean isHasSimCard() {
		return hasSimCard;
	}

	public double getOutgoingCallsDuration() {
		return outgoingCallsDuration;
	}

	public Call getLastIncomingCall() {
		return lastIncomingCall;
	}

	public Call getLastOutgoingCall() {
		return lastOutgoingCall;
	}

	void insertSimCard(String simMobileNumber) {
		if (simMobileNumber != null && simMobileNumber.startsWith("08") && simMobileNumber.length() == 10) {
			this.simMobileNumber = simMobileNumber;
			this.hasSimCard = true;
		}
	}

	void removeSimCard() {
		this.hasSimCard = false;
		this.simMobileNumber = "";
	}

	void call(GSM receiver, double duration) {
		if (duration > 0 && 
			duration < 120 &&
			!receiver.simMobileNumber.equals(this.simMobileNumber) &&
			this.hasSimCard &&
			receiver.hasSimCard) {
			Call call = new Call(this, receiver, duration);
			this.lastOutgoingCall = call;
			receiver.lastIncomingCall = call;
			this.outgoingCallsDuration += duration;
		}
	}

	double getSumForCall() {
		return this.outgoingCallsDuration * Call.getPriceForAMinute();
	}

	void printInfoForTheLastOutgoingCall() {
		if (this.lastOutgoingCall != null) {
			System.out.println("Last call is made from: " + this.lastOutgoingCall.getCaller().MODEL);
			System.out.println("Last call is received from: " + this.lastOutgoingCall.getReceiver().MODEL);
			System.out.println("Last call duration is: " + this.lastOutgoingCall.getDuration());
			System.out.println("Price for a minute is: " + Call.getPriceForAMinute());
			System.out.println("______________________________________________________");
		}
	}

	void printInfoForTheLastIncomingCall() {
		if (this.lastIncomingCall != null) {
			System.out.println("Last call is made from: " + this.lastIncomingCall.getCaller().MODEL);
			System.out.println("Last call is received from: " + this.lastIncomingCall.getReceiver().MODEL);
			System.out.println("Last call duration is: " + this.lastIncomingCall.getDuration());
			System.out.println("Price for a minute is: " + Call.getPriceForAMinute());
			System.out.println("______________________________________________________");
		}
	}
}
