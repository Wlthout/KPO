public class Order
{
    Dish [] DishArray;
    public void Input(Dish [] array)
    {
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
}
