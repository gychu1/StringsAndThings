package io.zipcoder;


import java.util.Arrays;

/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input){
        //count words if length-1 is y or z
        //input.endsWith("y" && "z")
        //charAt(length-1)
        //regex (regular expression): searches a pattern provided.
        //Given a string of words, split it by the regex, in this case a space.
        //Declare a String[] variable named words, and then initialize it by splitting the input at regex.
        //when you split a string, it will split into one array.
        //a split will always need a regex.
        //because we want to return the result of countYZ as an Integer, we make an int variable.
        //words.length is the size of the array, in this case 2 because of "fez" and "day" given input is "fez day".

        String[] words = input.split(" ");
        int count = 0;
        for(int i = 0; i < words.length; i++) {
            //if array named words at index i ends with "y" or "z", run the body.
            //in this case count variable increase by 1.
            if(words[i].endsWith("y") || words[i].endsWith("z")) {
                count++;
            }
        }
        return count;

    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove){

        return base.replace(remove,"");
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input){
        boolean equalsOrNot;
        int isCount = (input.split("is", -1).length-1);
        int notCount = (input.split("not", -1).length-1);

        return isCount == notCount;
//        int isCounter = 0;
//        int notCounter = 0;
//
//        for (int i = 0; i < input.length() - 1; i++) {
//            if (input.charAt(i) == 'i' && input.charAt(i + 1) == 's') {
//                isCounter++;
//            }
//        }
//
//        for (int i = 0; i < input.length() - 2; i++) {
//            if (input.charAt(i) == 'n' && input.charAt(i + 1) == 'o' && input.charAt(i + 2) == 't') {
//                notCounter++;
//            }
//        }
//
//        return isCounter == notCounter;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        //length-1, because if g was at the end of the string, the condition is to check next letter.
        //but it can't, so it will return an error for index out of bound.
        for (int i = 0; i < input.length()-1; i++) {
            if (input.charAt(i) == 'g' && input.charAt(i + 1) == 'g') {
                return true;
            }
        }
        return false;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input){
        int count = 0;
        for(int i = 0; i <= input.length() - 3; i++) {
            if(input.charAt(i) == input.charAt(i+1) && input.charAt(i) == input.charAt(i+2))
                count++;
        }
        return count;
    }
}
