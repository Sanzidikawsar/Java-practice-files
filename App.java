public class App {
    public static void main(String[] args){
        String[] name = new String[3];
        name[0] = "Sanzid";
        name[1] = "Mou";
        name[2] = "Jessan";

        for(int i = 0; i < 3; i++){
            System.out.println(name[i]);
        }
        System.out.println("\n");

        String[] fruits = {"Apple", "Banana", "Mango", "Jackfruit"};

        for(String i: name){
            System.out.println(i);
        }
    }
}
