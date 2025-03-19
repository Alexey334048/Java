import java.util.Random;
public class Dwarf {
    private int height;
    private String clan;
    private String beard;
    private int age;

    public Dwarf(int height, String clan, String beard, int age){
        this.height = height;
        this.clan = clan;
        this.beard = beard;
        this.age = age;
    }
    //мето для добычи от 1 до 15 самоцветов
    public int mineGems(){
        Random random = new Random();
        return random.nextInt(15) + 1;
    }
    //метод для питья от 1 до 5 кружек пива
    public int drinkBeer(){
        Random random = new Random();
        int beersDrink = random.nextInt(5) + 1;
        return beersDrink;
    }
    public int getHeight() {
        return height;
    }
    public String getClan() {
        return clan;
    }
    public String getBeard() {
        return beard;
    }
    public int getAge() {
        return age;
    }

}