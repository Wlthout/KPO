public class Main {
    public static void main(String[] args)
    {
        Dish [] array = new Dish[6];
        array[0] = Factory.CreateFood("Burger", 6.50, 300);
        array[1] = Factory.CreateFood("Salad", 8.0, 400);
        array[2] = Factory.CreateFood("Kebab", 10.0, 500);
        array[3] = Factory.CreateDrinks("Fanta", 3.4,500);
        array[4] = Factory.CreateDrinks("Coca-cola", 3.4, 500);
        array[5] = Factory.CreateDrinks("Sprite",3.2 ,400);
        Order order = Factory.CreateOrder(array);
        Restaurant restaurant  = Factory.CreateRestaurant("Texas Chicken");
        restaurant.AddOrder(order);
        FoodCourt foodCourt = Factory.CreateFoodCourt();
        foodCourt.AddRestaurant(restaurant);
        foodCourt.Output();
        Order.CountOrder();
    }
}