package dec_13_2025_Test_Assignmet;

public class SMSNotification implements NotificationHub{
	@Override
	public void sendAlert(){
	IO.println("SMS Alert Sent");
	}
	@Override
	public void sendReport(){
	IO.println("SMS Report Generated");
	}
}
