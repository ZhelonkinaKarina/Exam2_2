package Exam2_2;

public class One {
	   private String name;
	   private int age;

	   //Перший конструктор
	   public One(String name, int age) {
	       this.name = name;
	       this.age = age;
	   }

	   //Другий конструктор, який викликає перший конструктор з одним параметром (перевантажений)
	   public One(String name) {
	       this(name, 0); 
	   }

	    public void displayInfo() {
	        System.out.println("Ім'я: " + name + ", Вік: " + age);
	   }

}
