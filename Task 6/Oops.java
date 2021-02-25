public class Oops {
  static int smaller;
  public static void main(String[] args) {
  
    int a = 7, b = 42;
    minimum(a,b);
    if (smaller == a) {
      System.out.println("a is the smallest!");
    }
  }
  public static int minimum(int a, int b) {
    if (a < b) {
      smaller = a;
    } else  smaller = b;
    
     return -1;
    }
   
  }

