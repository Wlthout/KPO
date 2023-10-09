import java.util.ArrayList;
public class FoodCourt
{
    ArrayList <Restaurant> RestaurantArray = new ArrayList <Restaurant>();
    public void AddRestaurant(Restaurant newRestaurant)
    {
        RestaurantArray.add(newRestaurant);
    }
    public void Output ()
    {
        for (Restaurant i: RestaurantArray)
        {
            System.out.println("Name of the restaurant is " + i.NameRestaurant());
            System.out.println("Amount of " + i.NameRestaurant() + " orders is " + i.SumOrders());
        }
    }
}
