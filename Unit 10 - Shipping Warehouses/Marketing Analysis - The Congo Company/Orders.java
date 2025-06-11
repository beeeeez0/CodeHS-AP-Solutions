import java.util.*;

public class Orders
{
    private ArrayList<GeoLocation> addresses;


    // Add additional locations for testing
    private double[][] addressesIn =
            {
                    {37.773797, -122.412952},  //San Fransisco
                    {38.897699, -77.036565},   //Washington, DC
                    {38.741525, 9.143767},
                    {49.850708, 97.062422}


            };

    public Orders(){
        addresses = new ArrayList<GeoLocation>();

        for (double[] pair : addressesIn){
            addresses.add(new GeoLocation("address",pair[0],pair[1]));
        }

    }

    // This returns all of your addresses
    public ArrayList<GeoLocation> getOrders(){
        return addresses;
    }


}