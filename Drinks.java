public class Drinks extends Dish
{
    int VolumeDrink;
    public Drinks (String nameDrink, double price, int volumeDrink)
    {
        super(nameDrink, price);
        VolumeDrink = volumeDrink;
    }
}
