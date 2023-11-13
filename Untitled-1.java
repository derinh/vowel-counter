 class Vowel {

    public static void main(String args[])
    {
    
    String input = new String("hElloO");
    String inputL = input.toLowerCase();
    int counter = 0;

for(int i=0; i<input.length(); i++){
    if(inputL.charAt(i)=='a' || inputL.charAt(i)=='e' || inputL.charAt(i)=='i' || inputL.charAt(i)=='o' || inputL.charAt(i)=='u'){
        counter++;
    }
}

    System.out.println("Number of vowels in word: " + counter);
}
} //end of class
