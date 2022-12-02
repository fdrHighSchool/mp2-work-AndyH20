class Main {
  public static void main(String[] args) {

  rectangle(4, 2);
  square(5);
  rightTriangle(8);
    
  }
  public static void square(int a) {
  for(int i = 0; i < a; i++) {
    for(int b = 0; b < a; b++) {
    System.out.print("* ");
  }
    System.out.println();
}
  }

  public static void rectangle(int b, int c) {
  for(int i = 0; i < c; i++) {
    for(int d = 0; d < b; d++) {
    System.out.print("* ");
  }
    System.out.println();
}
  }

  public static void rightTriangle(int s) {
    String y = "* ";
  for(int i = 0; i < s; i++) {
    System.out.print(y);
    y += "* ";
    for(int b = 0; b < 1; b++) {
    System.out.println();
  }
}
  }
  
}
