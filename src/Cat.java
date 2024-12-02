
public class Cat
{
    public static int deadCats = 0;
    private boolean alive = true;
    private double originWeight;
    private double weight;

    private double minWeight;
    private double maxWeight;
    //Кол.во съеденных грамм еды/воды
    private double eatenGrams;

    public Cat()
    {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;

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