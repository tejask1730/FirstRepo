package Relationship;
import java.util.Scanner;
public class BoxOffice {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		Theatre theatre = new Theatre("PVR",500);
		boolean flag = true;
		while(flag) {
			System.out.println("Enter 1. show seat availability /n 2. Book Ticket "+"3.to check ticket details 4. Cancel ticket, %. Exit");
			int n=sc.nextInt();
			switch(n) {
			case 1:{
				int number_of_seats = theatre.getNo_of_seats();
				System.out.println(number_of_seats + "seats are available");
			}
			break;
			case 2: {
				System.out.println("Enter the Movie name");
				String name = sc.next();
				System.out.println("Enter number of seats");
				int num = sc.nextInt();
				theatre.setTicket(new Ticket(name,num));
				int res= theatre.bookTicket();
				System.out.println("Successfully booked" + res + "tickets");
			}
			break;
			case 3 : {
				System.out.println("Ticket Details");
				Ticket t = theatre.getTicket();
				System.out.println(t.getMovie_name());
				System.out.println(t.getNo_of_tickets());
			}
			break;
			case 4 : {
				System.out.println("Number of ticket to be cancelled");
				int cancel = sc.nextInt();
				theatre.cancelTicket(cancel);
			}
			break;
			case 5 : {
				System.out.println("Exit");
				flag = false;
			}
			break;
			default : {
				System.out.println("Wrong input");
			}
			break;
			}
		}
		
	}

}
