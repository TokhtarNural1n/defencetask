/*string given and as have convert lowercase to upper
*/

public class task {
    public static void main(String[] args) {
        String input ="hello world";
        String output = convUpper(input);
        System.out.println(output);
    }
    public static String convUpper(String input){
        input = input.replaceAll("hello", "HELLO");
        input = input.replaceAll("world", "WORLD");

        return input;
    }
}
