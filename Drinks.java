import javax.lang.model.element.Name;

public class Drinks extends Dish
{
    int VolumeDrink;
    public Drinks (String nameDrink, double price, int volumeDrink)
    {
        super(nameDrink, price);
        VolumeDrink = volumeDrink;
    }
    @Override
    public void Output()
    {
        System.out.println(NameDish + " " + Price + " " + VolumeDrink + "ml");
    }
}
