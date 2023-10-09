public class Factory
{
    public static Dish CreateDish(String name, double price)
    {
        Dish dish = new Dish(name, price);
        return dish;
    }
    public static Order CreateOrder(Dish [] array)
    {
        Order order = new Order(array);
        return order;
    }
    public static Restaurant CreateRestaurant(String name)
    {
        Restaurant restaurant = new Restaurant(name);
        return restaurant;
    }
    public static FoodCourt CreateFoodCourt()
    {
        FoodCourt foodCourt = new FoodCourt();
        return foodCourt;
    }
}
