/* 

Find if one or more substrings has a particular property
Ah, this is a lot easier to read now. The other issue we’ve come across is that every e was somehow replaced with the symbol <. In order to take every < in our String and replace it with e, we’ll have to do the following:

1) Create a loop that iterates through every element of our String.
2) Check if the element is equivalent to the character we want to replace.
3) If the above condition is true, replace the element with a new value. To do this, we will update our String to equal the following: a substring of all the values before that element’s index value + the replacement value + a substring of all the values that appear after that element’s index.
4) Outside the loop, return the value of our String.

Complete the function replaceCharacter(). The function takes in three parameters: String text, char charToReplace, and char replacement.

The function must return text with every charToReplace value inside it replaced with replacement.

For example, if we called the function replaceCharacter("abracadabra", 'a', 'i'), the function should return "ibricidibri".

*/

class Replace {
  public static String replaceCharacter(String text, char charToReplace, char replacement) {
    // Add your code below
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == charToReplace) {
        text = text.substring(0, i) + replacement + text.substring(i+1);
      }
    }
    return text;
  }
 
  public static void main(String[] args) {
    String text = "Th<n this <bony bird b<guiling my sad fancy into smiling, By th< grav< and st<rn d<corum of th< count<nanc< it wor<,\"Though thy cr<st b< shorn and shav<n, thou,\" I said, \"art sur< no crav<n, Ghastly grim and anci<nt Rav<n wand<ring from th< Nightly shor<— T<ll m< what thy lordly nam< is on th< Night's Plutonian shor<!\" \nQuoth th< Rav<n \"N<v<rmor<.\"\n\nMuch I marv<ll<d this ungainly fowl to h<ar discours< so plainly, Though its answ<r littl< m<aning—littl< r<l<vancy bor<; For w< cannot h<lp agr<<ing that no living human b<ing <v<r y<t was bl<ss<d with s<<ing bird abov< his chamb<r door— Bird or b<ast upon th< sculptur<d bust abov< his chamb<r door, \nWith such nam< as \"N<v<rmor<.\"";
    System.out.println(replaceCharacter(text, '<', 'e'));
   
  }
}
/*
Explanation of approach: We have three parameters...

String text - This will hold a String value that we will iterate through.
char charToReplace - This is the character we will be searching for in order to replace it.
char replacement - This is the character we will use to replace charToReplace in our String.
First, we create a loop that loops from 0 until i < text.length(). Inside the loop, we use an if statement to check if the element at the index of the current iteration is equivalent to the value of charToReplace: text.charAt(i) == charToReplace

If the condition is true we need to update the value of text to replace the charToReplace value with replacement. For this, we use the code text = text.substring(0, i) + replacement + text.substring(i+1);.

We recreate text by concatenating three values. The first value, text.substring(0, i), will create a substring containing every element that came before the current index. The second value is replacement. The third value, text.substring(i+1) is a substring of every element in text that appears after the current index. By concatenating them with +, the charToReplace value at that index is replaced with replacement. Outside the loop, we return text.

Remember that Strings are immutable; this means that their value cannot be changed. Every time we replace a character, we are creating a brand new String.
*/
