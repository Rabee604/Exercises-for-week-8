public class Arrays{

public static void main(String[] args) {
 String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
 for(int i = 0; i<cars.length; i++){
 System.out.println(cars[i]);
}


int [] number= {10, 20, 30, 40};
int sum= 0;
 for(int j = 0; j<number.length; j++){
 sum+=number[j];
}
 System.out.println(sum);


 int [] numbers= {10, 20, 30, 40};
int summ= 0;
float average=0;
 for(int k = 0; k<numbers.length; k++){
 summ+=numbers[k];
}
average = summ/numbers.length;
 System.out.println(average);


int [] mynumbers= {20, 10, 40, 30};
mynumbers.sort(function(a, b){return b-a});


}


}