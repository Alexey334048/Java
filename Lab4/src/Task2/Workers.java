package Task2;

public abstract class Workers {
    public String name;

    public String getName() {
        return name;
    }

    public Workers(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println(name);
    }

    public abstract double calculate();

}
