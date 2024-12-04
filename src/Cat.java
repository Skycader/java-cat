
public class Cat
{
    public static int deadCats = 0;
    private boolean alive = true;
    private static final double originWeight = 1500.0 + 3000.0 * Math.random();
    private double weight;
    private Colors color;
    public String name;
    public static final double minWeight = 1000.0;
    public static final double maxWeight = 9000.0;
    //Кол.во съеденных грамм еды/воды
    private double eatenGrams;

    public Cat(String name)
    {
        this.name = name;
        weight = 1500.0 + 3000.0 * Math.random();
    }

    public void setCatColor(Colors color) {
        this.color = color;
    }

    public Colors getCatColor() {
        return color;
}

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        eatenGrams += amount;
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
        eatenGrams += amount;
    }

    public Double getWeight()
    {
        return weight;
    }

    public void goToTray() {
        weight-=100;
    }
    public Double eatenGrams() {
        return eatenGrams;
    }
    public String getStatus()
    {
        if(weight < minWeight) {
            if (alive) deadCats += 1;
            alive = false;
            return "Dead";
        }
        else if(weight > maxWeight) {
            if (alive) deadCats += 1;
            alive = false;
            return "Exploded";
        }
        else if(weight > originWeight) {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }
}