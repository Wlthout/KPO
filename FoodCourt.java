import java.util.ArrayList;
public class FoodCourt
{
    ArrayList <Restaurant> RestaurantArray;
    public void AddRestaurant(Restaurant newRestaurant)
    {
        if (RestaurantArray == null)
        {
            RestaurantArray = new ArrayList <Restaurant>();
        }
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
