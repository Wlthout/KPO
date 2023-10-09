import java.util.ArrayList;
public class Restaurant
{
    String NameRestaurant;
    ArrayList <Order> OrderArray = new ArrayList<Order>();
    public Restaurant (String name)
    {
        NameRestaurant = name;
    }
    public void AddOrder (Order NewOrder)
    {
        OrderArray.add(NewOrder);
    }
    public double SumOrders ()
    {
        double counter = 0;
        for (Order i: OrderArray)
        {
            counter += i.SumOrder();
        }
        return counter;
    }
    public String NameRestaurant()
    {
        return NameRestaurant;
    }
}
