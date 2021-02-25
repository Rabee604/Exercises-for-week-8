public class Array2{


public static void main(String[] args) {
int [] myNumber = {10, 20, 30, 40};

 	
System.out.println(average(myNumber));
 } 



public static float average(int [] arr) {

float average =0;

for(int i =0; i<arr.length; i++){

average +=arr[i];

} 
 return average = average/arr.length;
}

}