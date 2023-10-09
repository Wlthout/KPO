public class Main {
    public static void main(String[] args)
    {
        Dish [] array = new Dish[3];
        array[0] = new Dish("Burger", 6.50);
        array[1] = new Dish("Salad", 8.0);
        array[2] = new Dish("Kebab", 10.0);
        Order orderOne = new Order(array);
        Restaurant restaurant  = new Restaurant("Texas Chicken");
        restaurant.AddOrder(orderOne);
        FoodCourt food = new FoodCourt();
        food.AddRestaurant(restaurant);
        food.Output();
        Order.CountOrder();
    }
}