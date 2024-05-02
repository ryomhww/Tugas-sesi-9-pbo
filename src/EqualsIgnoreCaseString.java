public class EqualsIgnoreCaseString {

    public static void main(String[] args) {
      String string1 = "halo";
      String string2 = "halo";
      String string3 = "Halo";
      System.out.println("Hasilnya " + string1.equalsIgnoreCase(string2));
      System.out.println("Hasilnya " + string1.equalsIgnoreCase(string3));
    }
  }
  