package task_02;

// Должно быть: вывод фруктов, потом овощей
public class Main {

    public static void main(String[] arg) throws InterruptedException {

        Fruits fruits = new Fruits();
        fruits.start();
        fruits.join();

        showVeges(getVeges());
    }

    private static String[] getVeges() {
        return new String[]{"tomato", "cucumber", "carrot"};
    }

    private static void showVeges(String[] veges) {
        for (String veg : veges) System.out.println(veg);
    }
}
