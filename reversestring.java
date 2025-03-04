public class Main {
    public static void main(String[] args) {
        String input = "I Love   Java Programming";
        String[] words = input.split("\\s+"); 
        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        result.deleteCharAt(result.length() - 1);
        System.out.println(result.toString());
}
}