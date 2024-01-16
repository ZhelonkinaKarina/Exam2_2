package Exam2_2;

public class Main {
	public static void main(String[] args) {
        //Оголошення екземпляру класу з використанням першого конструктора
        One obj1 = new One("Наталія", 19);
        obj1.displayInfo();

        //Оголошення екземпляру класу з використанням другого конструктора
        One obj2 = new One("Ангеліна");
        obj2.displayInfo();
    }
}
