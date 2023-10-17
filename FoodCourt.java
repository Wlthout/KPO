import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

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
            for (Order j: i.OrderArray)
            {
                Arrays.sort(j.DishArray, Comparator.comparingDouble(Dish :: GetPrice));
                j.OutputEverything();
            }
        }
    }
}
