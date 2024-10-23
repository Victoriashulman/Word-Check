import java.util.ArrayList;
public class Main {
public static void main(String[] args)
    {
        //test case 1// 
        WordChecker w = new WordChecker();
           ArrayList<String> words = new ArrayList<String>();{
           words.add("an");
           words.add("band");
           words.add("band");
           words.add("abandon");
           System.out.println(words);
           WordChecker x = new WordChecker();
        System.out.println(x.isWordChain());
           }
        //test case 2//
        WordChecker x = new WordChecker();
        ArrayList<String> letters = new ArrayList<String>();{
        letters.add("to");
        letters.add("too");
        letters.add("stool");
        letters.add("tools");
        System.out.println(letters);
        WordChecker y = new WordChecker(letters);
        System.out.println(y.isWordChain());
    }
    //test case 3//
    WordChecker p = new WordChecker();
ArrayList<String> word = new ArrayList<String>();{
    word.add("catch");
    word.add("bobcat");
    word.add("catchacat");
    word.add("cat");
    word.add("at");
    System.out.println(word);
    WordChecker a = new WordChecker(word);
    System.out.println(a.isWordChain());
    WordChecker b = new WordChecker(word);
    System.out.println(b.createList("cat"));
    //test case 4//
    WordChecker c = new WordChecker(word);
    System.out.println(c.createList("catch"));
    //test case 5//
    WordChecker d = new WordChecker(word);
    System.out.println(d.createList("dog"));
}
}
}