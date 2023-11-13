import java.util.ArrayList; //import ArrayList class
 class Vowel {

    public static void main(String args[])
    {
       // System.out.println("hi");
    
    String input = new String("hello");
    int counter = 0;

    ArrayList<Character> vowels = new ArrayList<Character>();
    vowels.add('a');
    vowels.add('e');
    vowels.add('i');
    vowels.add('o');
    vowels.add('u');


for(int i=0; i<input.length(); i++){
    if(vowels.contains(input.charAt(i))){
        counter++;
    }
}

    System.out.println("Number of vowels in word: " + counter);
}
} //end of class
