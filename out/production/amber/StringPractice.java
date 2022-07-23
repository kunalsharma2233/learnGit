public class StringPractice {
    public static void main(String[] args) {
        String sentence = "Java Programming";

//        Length()
        int size = sentence.length();
        System.out.println("Length : " + size);

//      Concatenation
        String sentence2 = " Nice to meet you";
        System.out.println("Concatenation : " + sentence.concat(sentence2));

//        Comparing two Strings
        System.out.println("Check if two strings are equal are not : " +sentence.equals(sentence2));

//        EscapeCharachters
        String sentence3 = "Let's learn about the \"Java Strings\" class";
        System.out.println("Learn about the Java classes : "+sentence3);
    }
}
