public class ReplaceString {
    public static void main(String[] args) {
        String string1 = "Hello How Are You";
        String Gantikarakter = string1.replace('H', 'T');
        String Gantikalimat = string1.replace("Hello", "Good Morning");
        System.out.println("Untuk replace karakter: " + Gantikarakter);
        System.out.println("Untuk replace kalinat: " + Gantikalimat);
    }
}