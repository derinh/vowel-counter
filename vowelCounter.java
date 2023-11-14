class Vowel {

    public static void main(String[] args){ 
        String str = "HelloO1";  //Input String. Can be changed.
        str = str.toLowerCase(); //convert everything to lowercase to avoid checking fo capitalized vowels too
        char[] chars = str.toCharArray(); //necessary to hand in as parameter to counter function
        int result = 0;
        result = vowelCounter(chars); //get result from function
        System.out.println("Number of vowels: " + result); //print out result

    } //end of main

  //actual function to do the vowel-counting work
    public static int vowelCounter(char[] chars) { 
        int counter = 0; 
        for(int i=0; i<chars.length; i++){
            if(chars[i]=='a' || chars[i]=='e' || chars[i]=='i' || chars[i]=='o' || chars[i]=='u'){
                counter++; //if vowel found, increase counter
            }
        } 
        return counter; 
    } //end of function

} //end of class
