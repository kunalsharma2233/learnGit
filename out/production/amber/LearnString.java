public class LearnString {
    public static void main(String args[]) {
        String topic = " Java Programming";
        String topic1 = "Nice to learn about the Concepts in Java";
        System.out.println("String : " + topic);

//        String Operations
//        1. Length()

        int length = topic.length();
        System.out.println("Length : " + length);

//        2. Joining two strings (Concat)
        System.out.println("Joining two Strings : " + topic.concat(topic1));

//        3. Comparing two Strings
        String compare1 = "Java";
        String compare2 = "Java2";
        System.out.println("Comparing two strings : " + compare1.equals(compare2));

//        4. Escape Charachters in Java
        String escapeChar = "This is just a \" basic concepts \" regarding java";
        System.out.println("Escape Charachter in Strings : " + escapeChar);
    }
}
