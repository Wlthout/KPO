public abstract class Dish //блюдо
{
    protected String NameDish;
    protected double Price;
    public Dish (String name, double price)
    {
        NameDish = name;
        Price = price;
    }
    public double GetPrice()
    {
        return Price;
    }
    public abstract void Output();
    //добавить кбжу и граммовки
}
