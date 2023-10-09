import java.util.ArrayList;
public class Restaurant
{
    String NameRestaurant;
    ArrayList <Order> OrderArray;
    public Restaurant (String name)
    {
        NameRestaurant = name;
        if (OrderArray == null)
        {
            OrderArray = new ArrayList<Order>();
        }
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
