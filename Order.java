public class Order
{
    Dish [] DishArray;
    static int id = 0;
    public Order (Dish [] array)
    {
        id++;
        DishArray = array;
    }
    public double SumOrder ()
    {
        double sumOrder = 0;
        for (int i = 0; i < DishArray.length; i++)
        {
            sumOrder += DishArray[i].Price;
        }
        return sumOrder;
    }
    public static void CountOrder()
    {
        System.out.println("Amount of orders is " + id);
        //DataBase
    }
}
