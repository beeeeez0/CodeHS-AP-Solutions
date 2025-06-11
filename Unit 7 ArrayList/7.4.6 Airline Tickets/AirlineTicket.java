public class AirlineTicket
{
    private String[] seats = {"A","B","C","D","E","F"};
    private String name;
    private String seat;
    private int boardingGroup;
    private int row;

    public AirlineTicket(String name, String seat, int row)
    {
        this.name = name;
        if(isValidSeat(seat))
        {
            this.seat = seat;
        }
        this.row = row;
        if (row <= 2) {
            this.boardingGroup = 5;
        } else if (row <= 4) {
            this.boardingGroup = 4;
        } else if (row <= 6) {
            this.boardingGroup = 3;
        } else if (row <= 8) {
            this.boardingGroup = 2;
        } else {
            this.boardingGroup = 1;
        }
    }

    private boolean isValidSeat(String seat)
    {
        boolean isValidSeat = false;
        for(String elem: seats)
        {
            if(seat.equals(elem))
            {
                isValidSeat = true;
            }
        }
        return isValidSeat;
    }

    public String getSeat()
    {
        return this.seat;
    }

    public String getName()
    {
        return this.name;
    }

    public int getBoardingGroup()
    {
        return this.boardingGroup;
    }

    public int getRow()
    {
        return this.row;
    }

    public String toString()
    {
        return name + " Seat: " + seat + " Row: " + row + " Boarding Group: " + boardingGroup;
    }
}