class Main {
  public static void main(String[] args) {
    System.out.println(divBy3(500));
    System.out.println(divBy3(300));
    System.out.println(divBy3(2556));
    System.out.println(divBy3(12));
    System.out.println(divBy3(0));
    System.out.println(divBy3(316));
    System.out.println(divBy3(315));
    System.out.println(divBy3(200));
  }

  public static boolean divBy3(int a) {
    int b = 0;
    int r = 0;
       do {
    
    r = a % 10;
    b += r;
    a = a / 10;
  }
  while (a > 0);
    
    return b % 3 == 0;
    
  }
} 
