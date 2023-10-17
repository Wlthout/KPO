public class Factory
{
    public static Food CreateFood(String name, double price, int weight)
    {
        Food food = new Food(name, price, weight);
        return food;
    }
    public static Drinks CreateDrinks(String name, double price, int volume)
    {
        Drinks drink = new Drinks(name, price, volume);
        return drink;
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
