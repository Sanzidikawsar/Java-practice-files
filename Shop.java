public class Shop {
    public static void main(String[] args){
        Light l1 = new Light();
        Mobile m1 = new Mobile("Moto");

        l1.shine();
        m1.rigs();

        Info inf1 = new Light();
        inf1.showInfo();

        Info inf2 = m1;
        inf2.showInfo();

        outputInfo(m1);
        outputInfo(l1);
    }

    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
