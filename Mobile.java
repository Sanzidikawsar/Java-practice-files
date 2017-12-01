public class Mobile implements Info {
    int emi = 252627;
    String name;

    public Mobile(String name){
        this.name = name;
    }

    public void rigs() {
        System.out.println("Mobile rigns well!");
    }

    @Override
    public void showInfo() {
        System.out.println(emi);
    }
}