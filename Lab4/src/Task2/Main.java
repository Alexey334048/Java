package Task2;

public class Main {
    public static void main(String[] args) {
        Workers worker = new WorkerFix(123.0, "Sasha");
        System.out.println(worker.calculate());
        worker.info();
        Workers worker2 = new WorkerHours(125.0, "Alex");
        System.out.println(worker2.calculate());
        worker2.info();
    }
}
