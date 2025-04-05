public class Reverse{
    
    public static String reverse(String s){
        return new StringBuilder(s).reverse().toString();

    }
    
    public static void main(String[] args){
        String input ="Azeno";
        System.out.println(reverse(input));

    }
}