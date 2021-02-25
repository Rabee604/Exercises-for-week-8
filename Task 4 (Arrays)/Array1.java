public class Array1{

public static void main(String[] args) {
	
int [] myNumber = {10, 20, 30, 40};
System.out.println(sum(myNumber));

}


public static int sum(int [] number){

int sum= 0;
for (int i =0; i<number.length; i++){

sum+= number[i];

}
return sum;
}

}