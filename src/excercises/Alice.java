package excercises;

import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s ="Alice was beginning to get very tired of sitting by her " +
                "sister on the bank, and of having nothing to do: once or " +
                "twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is " +
                "the use of a book,' thought Alice 'without pictures or " +
                "conversation?'";
        System.out.println("Enter a string to search: ");
        String find = input.nextLine();
        int index = s.indexOf(find);
        if(index != -1){
            System.out.println("true");
            System.out.println("Index of this word is: "+ index+"\nLength of this word is: "+ find.length());
            String modifiedSentence = s.replace(find, "");
            System.out.println(modifiedSentence);
        }else {
            System.out.println("false");
        }



    }
}
