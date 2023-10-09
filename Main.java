public class Main {
    public static void main(String[] args)
    {
        Dish [] array = new Dish[3];
        array[0] = Factory.CreateDish("Burger", 6.50);
        array[1] = Factory.CreateDish("Salad", 8.0);
        array[2] = Factory.CreateDish("Kebab", 10.0);
        Order orderOne = Factory.CreateOrder(array);
        Restaurant restaurant  = Factory.CreateRestaurant("Texas Chicken");
        restaurant.AddOrder(orderOne);
        FoodCourt food = Factory.CreateFoodCourt();
        food.AddRestaurant(restaurant);
        food.Output();
        Order.CountOrder();
    }
}