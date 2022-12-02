class Main {
  public static void main(String[] args) {

  System.out.println(firstHalf("WooHoo"));
  System.out.println(firstHalf("HelloThere"));
  System.out.println(firstHalf("abcdef"));

  System.out.println(conCat("abc", "cat"));
  System.out.println(conCat("dog", "cat"));
  System.out.println(conCat("abc", ""));
  System.out.println(conCat("", "def"));

  repeatEnd("Hello", 3);
  repeatEnd("Hello", 2);
  repeatEnd("Hello", 1);

  System.out.println(countHi("abc hi ho"));
  System.out.println(countHi("ABChi hi"));
  System.out.println(countHi("hihi"));
  }

  public static String conCat(String b, String c) {
    int bleng = b.length();
    int cleng = c.length();
    
    if (cleng == 0 || bleng == 0) {
      String word2 = b + c;
      return word2;
    }
      
    else {
      String firstc = c.substring(0, 1);
      String lastb = b.substring(bleng - 1);

      if (lastb.equals(firstc)) {
      String word = b + c.substring(1);
      return word;
    }
        
    else {
      String word1 = b + c;
      return word1;
      }
      
    }
  }

  public static String firstHalf(String a) {
    int aleng = a.length();
    if (aleng%2 != 0) {
      return "Not an even string";
    }
      
    else {
      return a.substring(0, aleng/2);
    }
  }

  public static void repeatEnd(String a, int b) {
    int aleng = a.length();
    String c = a.substring(aleng - b);

    for (int i = 0; i < b; i++) {
      System.out.print(c);
    }
    System.out.println("");
  }
  
  public static int countHi(String str) {
    int count = 0;
    for(int i = 0; i <= str.length() - 2; i++) {
      if(str.substring(i, i+2).equals("hi")) {
        count++;
      }
    }
    return count;
  }

  

}
