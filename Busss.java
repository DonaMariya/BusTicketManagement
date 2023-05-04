import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

interface BusBooking {
void bookTicket();
}

class Bus implements BusBooking {
    Map<String, String> busChoices;

    public Bus(Map<String, String> busChoices) 
    {
    this.busChoices = busChoices;
    }

    public void bookTicket() {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String name = sc.nextLine();

System.out.print("Enter the source: ");
String source = sc.nextLine();

System.out.print("Enter the destination: ");
String destination = sc.nextLine();

System.out.print("Enter the date of travel (dd/mm/yyyy): ");
String date = sc.nextLine();

System.out.println("Choose a bus:");
for (Map.Entry<String, String>entry : busChoices.entrySet()) {
System.out.println(entry.getKey()+ "."+entry.getValue());
}

int choice = -1;
boolean validChoice = false;

while (!validChoice) {
System.out.print("Enter bus choice (1-" + busChoices.size() + "): ");
try {
choice = Integer.parseInt(sc.nextLine());
if (busChoices.containsKey(choice)) {
validChoice = true;
} else {
System.out.println("Invalid choice. Please choose again.");
}
} catch (NumberFormatException e) {
System.out.println("Error. Please choose again.");
}
}

System.out.println("\nBooking Done.");
System.out.println("\n Here are the details:");
System.out.println("Name: " + name);
System.out.println("Source: " + source);
System.out.println("Destination: " + destination);
System.out.println("Date of Travel: " + date);
System.out.println("Bus Choice: " + busChoices.get(choice));
}
}

public class Busss {
public static void main(String[] args) {
    Map<String, String> busChoices = new HashMap<>();
    busChoices.put("Bus 1","  Rs. 234.00");
    busChoices.put("Bus 2","  Rs. 338.00");
    busChoices.put("Bus 3","  Rs. 400.00");
// String[] busChoices = {"Bus 1", "Bus 2", "Bus 3"};
Bus bus = new Bus(busChoices);
bus.bookTicket();
}
}
