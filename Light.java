public class Light implements Info {
    int watt = 25;

    public void shine() {
        System.out.println("Light shines well!");
    }

    @Override
    public void showInfo() {
        System.out.println(watt);
    }
}
