public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String s = "instance check";
        switch (s.getClass().getSimpleName()){
            case "String" -> System.out.println("String");
            case "int","Integer" -> System.out.println("Integer");
            default -> System.out.println("Never used");
        }
    }
}