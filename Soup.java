// Name: Robel Genetu
// Date: 09/25/25
// Description: This class creates and modifies a collection of letters for an alphabet soup.

public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    //this is a constructor it sets the instance variables (more on this later in the year)
    public Soup(){
        letters ="BigMac";
        company = "Mc Donalds";
    }


    //sets the name of the company to the provided name
    public void setCompany(String company){
        this.company = company;
    }

    //returns the company name
    public String getCompany(){
        return company;
    }

    //returns letters
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    //adds a word to the pool of letters known as "letters"
    // Input: a String word
    // Output: nothing
    // Precondition: word is a String
    // Postcondition: word is added to the end of letters
    public void add(String word){
    letters+= word;
    }


    //Use Math.random() to get a random character from the letters string and return it.
    // Input: none
    // Output: a random character from letters
    // Precondition: letters contains at least one character
    // Postcondition: returns one randomly selected character from letters
    public char randomLetter(){
        int index = (int)(Math.random() * letters.length());
        return letters.charAt(index);
    }


    //returns the letters currently stored with the company name placed directly in the center of all
    //the letters
    // Input: none
    // Output: letters with the company name placed in the center
    // Precondition: letters contains characters
    // Postcondition: returns a new String with company inserted in the center of letters
    public String companyCentered(){
    int middle=letters.length()/2; 
    return letters.substring(0, middle) + company + letters.substring(middle);
    }


    //should remove the first available vowel from letters. If there are no vowels this method has no effect.
    // Input: none
    // Output: nothing
    // Precondition: letters is a String
    // Postcondition: removes the first vowel from letters, or makes no change if there are no vowels
    public void removeFirstVowel(){
    int removeFirstVowel = letters.indexOf(letters.replaceFirst("[aeiouAEIOU]", ""));
    letters = letters.substring(0, removeFirstVowel) 
            + letters.substring(removeFirstVowel + 1);
}

    //should remove "num" letters from a random spot in the string letters. You may assume num never exceeds the length of the string.
    // Input: an integer num
    // Output: nothing
    // Precondition: num is not greater than the length of letters
    // Postcondition: removes num letters from a random location in letters
    public void removeSome(int num){
    int removeSome=(int)(Math.random() * (letters.length() - num + 1));
    letters=letters.substring(0, removeSome) + letters.substring(removeSome + num);
    }

    //should remove the word "word" from the string letters. If the word is not found in letters then it does nothing.
    // Input: a String word
    // Output: nothing
    // Precondition: word is a String
    // Postcondition: removes word from letters if it is found
    public void removeWord(String word){
        letters = letters.replace(word,"");
    }
}
