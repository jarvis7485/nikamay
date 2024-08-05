import java.util.Scanner;

public class CapitalWordsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String line = sc.nextLine();
        
        int count = 0;
        String[] words = line.split(" ");
        for(String word : words) {
            if(Character.isUpperCase(word.charAt(0))) {
                count++;
            }
        }
        
        System.out.println("Words starting with capital letters: " + count);
    }
}
