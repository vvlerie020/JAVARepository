package basic_structure_and_syntax;

public class variable {
    public static void main(String[] args) {
        String name = "Gracey";
        int age = 17;
        final int score = 10;
        String subject; // declaring variables without inizializing
        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("score: " + score);
        age = 18; //reasigning the value of age
        System.out.println("updated age " + age);
        float height = 6.1f;
        System.out.println("height: " + height);
        char section = 'f';
        System.out.println("section: " + section);
        boolean regularStudent = true;
        System.out.println("Regular Student: " + regularStudent);        
        System.out.println("  ");
       
        
    }
}
