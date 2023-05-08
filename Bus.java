
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

interface BusInterface{
    public void Buses();
    public void Ticket();
    public void SourceAndDestination();
    public void Date();
    
    List<String> busName=new ArrayList<>();
    List<Integer> busPrice=new ArrayList<>();
    //Map <String,Integer> buses=new HashMap<>();
    Stream<Integer> str=busPrice.stream();
}
class Buses implements BusInterface{
    Scanner scn=new Scanner(System.in);
    String name;
    String source;
    String destination;
    Date date;
    String selectedBus;

    public void Buses(){
        System.out.println("Buses:");
        for(int i=0;i<busName.size();i++){
        System.out.println(busName.get(i)+": Rs "+busPrice.get(i));
        }
    }

    
    public void Ticket(){
        
        System.out.println("-->Name : "+this.name);
        System.out.println("-->Boarding point : "+this.source);
        System.out.println("-->Destination : "+this.destination);
        System.out.println("-->Date of travel: "+this.date);
        System.out.println("-->Bus Name : "+this.selectedBus);
        
    }
    public void SourceAndDestination(){
        System.out.println("Enter Source");
                this.source=scn.next();
                System.out.println("Enter destination");
                this.destination=scn.next();
    }
    public void Date(){
        System.out.println("Enter date for travel");
                
                try{
                    this.date=new Date(scn.next());
                }
                catch(Exception e){
                    System.out.println("Invalid Format");
                    return;
                }
    }
} 

public class Bus extends Buses{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int ch=2;
        Buses user1=new Buses();
        busName.add("Bus 1");
        busName.add("Bus 2");
        busName.add("Bus 3");
        busPrice.add(100);
        busPrice.add(200);
        busPrice.add(300);
        int avg=(str.reduce(0, (p,q)->(p+q))/busPrice.size());

        do{     

                System.out.println("Bus Booking System");
                System.out.println("Enter your name");
                user1.name=scn.next();
                user1.getSourceDest();
                user1.getDate();
                user1.showBuses();
                System.out.println("Enter Choice");
                int choice=scn.nextInt();
                user1.selectedBus=busName.get((choice-1));
                user1.showTicket();
                System.out.println("1)Book another ticket");
                System.out.println("2)Exit");
                System.out.println("Enter Choice");
                ch=scn.nextInt();


        }
        while(ch==1);
    }
}