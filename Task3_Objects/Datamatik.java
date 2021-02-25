public class Datamatik{


public static void main(String[] args) {


	Teacher teacher1 = new Teacher("Nadia", 50, true);
	
	Student student1 = new Student("Rabee", 48, false, "f");
	Student student2 = new Student("Mads", 40, false, "f");

	System.out.println(teacher1.getName());
	System.out.println(student1.getName());
	System.out.println(student2.getName());


	
	
}
}