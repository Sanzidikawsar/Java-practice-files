class info {
    String name;
    int meal;
    boolean morning;
    boolean non;
    boolean night;

    public void setMeal(int meal) {
        this.meal = meal;
    }

    public int getMeal() {
        return meal;
    }

    public void getMeal(int date, boolean morning, boolean noon, boolean night) {

    }
}

public class meal_counter {
    public static void main(String[] args){
        info p1 = new info();
        info p2 = new info();

        p1.getMeal(1, false, true, true);
        p1.getMeal(2, false, false, true);

        p1.setMeal(12);
        System.out.println(p1.getMeal());
    }
}
