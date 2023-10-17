public class Food extends Dish
{
    int WeightFood;
    public Food (String nameFood, double price, int weightFood)
    {
        super(nameFood, price);
        WeightFood = weightFood;
    }
    @Override
    public void Output()
    {
        System.out.println(NameDish + " " + Price + " " + WeightFood + "g");
    }
}
