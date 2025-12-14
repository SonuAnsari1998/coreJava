package dec_13_2025_Test_Assignmet;

public class EmailNotification implements NotificationHub{
	@Override
	public void sendAlert(){
	IO.println("Email Alert Sent");
	}
	@Override
	public void sendReport(){
	IO.println("Email Report Generated");
	}
}
