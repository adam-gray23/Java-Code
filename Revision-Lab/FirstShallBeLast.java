public class FirstShallBeLast {
    public static void main(String[] args) {
        String s = "abcdef";
        String newString = Test.firstShallBeLast(s);
        System.out.println("Test.firstShallBeLast(" + s + ") is " + newString);
    }
}

class Test {
    public static String firstShallBeLast(String s){
        int len = s.length() - 1;
        return (s.substring(len) + s.substring(1, len) + s.substring(0, 1));
    }
}
