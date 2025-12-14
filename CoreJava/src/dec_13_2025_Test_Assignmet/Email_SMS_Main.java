package dec_13_2025_Test_Assignmet;

public class Email_SMS_Main {
	NotificationHub n;

	void main() {
		processNotification(n);
	}

	public static void processNotification(NotificationHub msg) {
		IO.println("Enter email/sms");
		String msgtype = IO.readln();
		if (msgtype.equalsIgnoreCase("email")) {
			msg = new EmailNotification();
			msg.sendAlert();
			msg.sendReport();
		} else if (msgtype.equalsIgnoreCase("sms")) {
			msg = new SMSNotification();
			msg.sendAlert();
			msg.sendReport();
		} else {
			System.err.println("Invalid Input");
		}
	}
}
