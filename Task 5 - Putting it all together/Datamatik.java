public class Datamatik{
public static Student[] students= new Student[10];
public static void main(String[] args) {
	
	students[0] = new Student ("Rabee", 48,false, "f");
	students[1] = new Student ("Anni", 30,true, "f");
	students[2] = new Student ("Connie", 20,true, "f");
	students[3] = new Student ("Nadia", 21,true, "f");
	students[4] = new Student ("Carl", 22,false, "f");
	students[5] = new Student ("Heidi", 28,true, "f");
	students[6] = new Student ("Lise", 48,true, "f");
	students[7] = new Student ("Per", 22,false, "f");
	students[8] = new Student ("Martin", 48,false, "f");
	students[9] = new Student ("Helle", 48,true, "f");

	array(students,3);
	System.out.println(array1(students, "Helle" ));
}

 public static String array(Student[] s, int k ){
 System.out.print(s[k].getName());
 return s[k].getName();



 }
 public static int array1(Student[] s, String z ){

 	for(int i =0; i<s.length; i++){

	if(s[i].getName()==z){

		return i;

	} 	

 	}
 	return -1;


}
}