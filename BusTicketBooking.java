import java.util.Date;
import java.util.Scanner;

interface BusInterface{
    public void Buses();
    public void Ticket();
    public void SourceAndDestination();
    public void Date();

String[] buses={"BUS_1","BUS_2","BUS_3"};
int[] prices={253,571,483};
    
}
class Buses implements BusInterface{
    String name;
    int age;
    String source;
    String destination;
    Date date;
    String bus;
    Scanner scn=new Scanner(System.in);
    public void Buses(){
        System.out.println("The Buses Available Are:");
        for(int i=0;i<buses.length;i++){
            System.out.println((i+1)+")"+buses[i]+":Rs "+prices[i]);
        }

    }   
    public void Ticket(){
        
        System.out.println("-->Name : "+this.name+"<--");
        System.out.println("-->Age : "+this.age+"<--");
        System.out.println("-->Boarding point : "+this.source+"<--");
        System.out.println("-->Destination : "+this.destination+"<--");
        System.out.println("-->Date of travel: "+this.date+"<--");
        System.out.println("-->Bus Name : "+this.bus+"<--");
      
   
}
    @Override
    public void SourceAndDestination() {
        
        System.out.println("Enter Source");
                this.source=scn.next();
                System.out.println("Enter destination");
                this.destination=scn.next();
        
    }
    @Override
    public void Date() {
        
        System.out.println("Enter date for travel");
                
        try{
            this.date=new Date(scn.next());
        }
        catch(Exception e){
            System.out.println("Enter date in proper format");
            return;
        }
        
    } 
}


public class BusTicketBooking extends Buses{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ch=2;
        Buses u=new Buses();


        do{     

                System.out.println("*****************Bus Booking System*****************");
                System.out.println("Please enter your name");
                u.name=sc.next();
                System.out.println("Please enter your age");
                u.age=sc.nextInt();
                u.SourceAndDestination();
                u.Date();
                u.Buses();
                System.out.println("Enter your Choice");
                int choice=sc.nextInt();
                u.bus=u.buses[choice-1];
                u.Ticket();
                System.out.println("1)Book another ticket");
                System.out.println("2)Exit");
                System.out.println("Enter your Choice");
                ch=sc.nextInt();


        }
        while(ch==1);
    }
}


