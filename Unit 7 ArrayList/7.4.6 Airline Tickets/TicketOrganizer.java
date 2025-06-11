import java.util.ArrayList;

public class TicketOrganizer
{
    private ArrayList<AirlineTicket> tickets;
    private ArrayList<AirlineTicket> group1 = new ArrayList<AirlineTicket>();
    private ArrayList<AirlineTicket> group2 = new ArrayList<AirlineTicket>();
    private ArrayList<AirlineTicket> group3 = new ArrayList<AirlineTicket>();
    private ArrayList<AirlineTicket> group4 = new ArrayList<AirlineTicket>();
    private ArrayList<AirlineTicket> group5 = new ArrayList<AirlineTicket>();


    public TicketOrganizer(ArrayList<AirlineTicket> tickets) {
        this.tickets = tickets;
    }

    public ArrayList<AirlineTicket> getTickets() {
        return tickets;
    }

    private void fixGroups() {
        /* for(int gNum = 0; gNum <= 5; gNum++) {

            for(AirlineTicket ticket : tickets) {
                if(ticket.getBoardingGroup() == gNum) {
                    group.add(ticket);
                }
            }


        }*/

        for(AirlineTicket ticket : tickets) {
            if(ticket.getBoardingGroup() == 1) {
                group1.add(ticket);
            }
            if(ticket.getBoardingGroup() == 2) {
                group2.add(ticket);
            }
            if(ticket.getBoardingGroup() == 3) {
                group3.add(ticket);
            }
            if(ticket.getBoardingGroup() == 4) {
                group4.add(ticket);
            }
            if(ticket.getBoardingGroup() == 5) {
                group5.add(ticket);
            }
        }

    }

    public void printPassengersByBoardingGroup() {
        fixGroups();
        /* for(int i = 1; i <= 5; i++) {
            System.out.println("Boarding Group " + i + ":");
            for(AirlineTicket ticket : tickets) {
                if(ticket.getBoardingGroup() == i)
                    System.out.println(ticket.getName());
            }
        } */

        if(group1.isEmpty() == false) {
            System.out.println("Boarding Group 1:");
            for(AirlineTicket passenger : group1) {
                System.out.println(passenger.getName());
            }
        }
        if(group2.isEmpty() != true) {
            System.out.println("Boarding Group 2:");
            for(AirlineTicket passenger : group2) {
                System.out.println(passenger.getName());
            }
        }
        if(group3.isEmpty() != true) {
            System.out.println("Boarding Group 3:");
            for(AirlineTicket passenger : group3) {
                System.out.println(passenger.getName());
            }
        }
        if(group4.isEmpty() != true) {
            System.out.println("Boarding Group 4:");
            for(AirlineTicket passenger : group4) {
                System.out.println(passenger.getName());
            }
        }
        if(group5.isEmpty() != true) {
            System.out.println("Boarding Group 5:");
            for(AirlineTicket passenger : group5) {
                System.out.println(passenger.getName());
            }
        }
    }

    public void canBoardTogether() {
        int count = 0;
        for(int i = 0; i < tickets.size(); i++) {
            if(i == tickets.size()-1) {
                break;
            } else {
                if(tickets.get(i).getRow() == tickets.get(i+1).getRow() && tickets.get(i).getBoardingGroup() == tickets.get(i+1).getBoardingGroup()) {
                    count++;
                    System.out.println(tickets.get(i).getName() + " can board with " + tickets.get(i+1).getName() + ".");
                }
            }
        }
        if(count == 0) {
            System.out.println("There are no passengers with the same row and boarding group.");
        }
    }

}