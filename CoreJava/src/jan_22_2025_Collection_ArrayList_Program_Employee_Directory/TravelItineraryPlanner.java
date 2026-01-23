package jan_22_2025_Collection_ArrayList_Program_Employee_Directory;

public class TravelItineraryPlanner {
	void main() {
		ItineraryPlanner destination = new ItineraryPlanner();
		Destination paris = new Destination("Paris");
		Destination london = new Destination("London");

		Activity activity1 = new Activity(" Visit Eiffel Tower ", "(Morning)");
		Activity activity2 = new Activity("Louvre Museum", "(Afternoon)");

		paris.addActivities(activity1);
		paris.addActivities(activity2);

		destination.addDistination(paris);

		destination.viewDestination();

		Activity activity3 = new Activity(" British Museum ", "(Morning)");
		Activity activity4 = new Activity("London Eye", "(Afternoon)");

		london.addActivities(activity1);
		london.addActivities(activity2);

		destination.addDistination(london);

		destination.viewDestination();
	}
}
