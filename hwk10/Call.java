package hwk10;

public class Call {
	private static double priceForAMinute;
	private GSM caller;
	private GSM receiver;
	private double duration;

	Call(GSM caller, GSM receiver, double duration) {
		setCaller(caller);
		setReceiver(receiver);
		setDuration(duration);
	}

	public static double getPriceForAMinute() {
		return priceForAMinute;
	}

	public static void setPriceForAMinute(double priceForAMinute) {
		if (priceForAMinute > 0) {
			Call.priceForAMinute = priceForAMinute;
		}
	}

	public GSM getCaller() {
		return caller;
	}

	public void setCaller(GSM caller) {
		this.caller = caller;
	}

	public GSM getReceiver() {
		return receiver;
	}

	public void setReceiver(GSM receiver) {
		this.receiver = receiver;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		if (duration > 0 && duration <= 120) {
			this.duration = duration;
		}
	}

}
