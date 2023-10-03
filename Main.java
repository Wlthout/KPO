public class Main {
    public static void main(String[] args)
    {
        Dish [] array = new Dish[3];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = new Dish();
        }
        array[0].Input("Burger", 6.50);
        array[1].Input("Salad", 8.0);
        array[2].Input("Kebab", 10.0);
        Order orderOne = new Order();
        orderOne.Input(array);
        Restaurant restaurant  = new Restaurant();
        restaurant.AddName("Texas Chicken");
        restaurant.AddOrder(orderOne);
        FoodCourt food = new FoodCourt();
        food.AddRestaurant(restaurant);
        food.Output();

    }
}