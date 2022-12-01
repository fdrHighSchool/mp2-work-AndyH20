class Main {
  public static void main(String[] args) {
    fizzbuzz(3);
    fizzbuzz(5);
    fizzbuzz(15);
    fizzbuzz(18);
    fizzbuzz(19);
  }
  
  public static void fizzbuzz(int a) {
    
    if (a % 3 == 0 && a % 5 ==0) {
      System.out.println("FizzBuzz");
    }
    else if (a % 3 == 0) {
      System.out.println("Fizz");
    }
    else if (a % 5 == 0) {
      System.out.println("Buzz");
    }
    else {
      System.out.print(a);
    }
  }
}
