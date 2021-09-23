import java.util.Locale;

public class StringExamples {

    public static void main(String[] args) {

        String greeting = "Hello";
        String name = "hephaestus";

        //style uno
        int greetingSize = greeting.length();
        System.out.println(greeting + "has " + greetingSize + " letters.");

        //style zwei
        System.out.println(name + "has " + name.length() + " letters.");

        //create a program that chaptilaizes the first letter of any word

        /*
        1. steal jesus
        2. Gaslight the first letter into depression
        3. Give the first letter super mario pills
        4. kill the first letter and kidnap the rest
        5. combined the drugged first letter with the kidnapped
        6. return jesus
        */
        System.out.println(capFName(name));

    }

    public static String capFName (String name){
        String fLetter = name.substring(0, 1);
        fLetter = fLetter.toUpperCase();
        String rName = name.substring(1);
        return fLetter + rName;
    }

}
