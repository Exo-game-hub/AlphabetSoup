public class Soup {
    //these are instance variables 
    private String letters;
    private String company;

    // Precondition: none.
    // Postcondition: letters is initialized to an empty string and company is set to "none".
    public Soup(){
        letters ="";
        company = "none";
    }


    // Precondition: company is a valid String value.
    // Postcondition: the instance variable company is set to the provided company name.
    public void setCompany(String company){
        this.company = company;
    }

    // Precondition: none.
    // Postcondition: returns the current company name stored in the object.
    public String getCompany(){
        return company;
    }

    // Precondition: none.
    // Postcondition: returns the current letters string stored in the object.
    public String getLetters(){
        return letters;
    }

//below are the functions you'll be writing.

    // Precondition: word is a valid String value.
    // Postcondition: the given word has been appended to the end of the letters string.
    public void add(String word){
        letters += word;
    }


    // Precondition: letters is not empty.
    // Postcondition: returns one random character from the letters string.
    public char randomLetter(){
    int numRandom = (int)(Math.random()*letters.length());
        char randomC = letters.charAt(numRandom);
    return randomC;
    }


    // Precondition: none.
    // Postcondition: returns the letters string with the company name inserted in the middle.
    public String companyCentered(){
        int middle = (int)(letters.length()/2);
        String lettersleft = letters.substring(0,middle);
        String lettersRight = letters.substring(middle);
        return lettersleft + company + lettersRight;
    }


    // Precondition: letters may contain any characters.
    // Postcondition: the first vowel in letters has been removed if one exists; otherwise, letters is unchanged.
    public void removeFirstVowel(){
        String regex = "[aeiouAEIOU]";
        letters = letters.replaceFirst(regex,"");
    }

    // Precondition: num is a non-negative integer that does not exceed the length of letters.
    // Postcondition: num letters are removed from a random position in letters.
    public void removeSome(int num){
        int index = (int)Math.random()*((letters.length()-num));
        letters= letters.substring(0,index)+ letters.substring(index+num);
    }

    // Precondition: word is a valid String value.
    // Postcondition: the first occurrence of word is removed from letters if present; otherwise, letters remains unchanged.
    public void removeWord(String word){
        letters = letters.replace("word","");
    }
}
