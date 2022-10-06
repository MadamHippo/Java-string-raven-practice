/* 

".<romr<v<N" sa <man hcus htiW            
,rood r<bmahc sih <voba tsub d<rutplucs <ht nopu tsa<b ro driB
—rood r<bmahc sih <voba drib gni<<s htiw d<ss<lb saw t<y r<v<    
gni<b namuh gnivil on taht gni<<rga pl<h tonnac <w roF    
;<rob ycnav<l<r <lttil—gnina<m <lttil r<wsna sti hguohT
,ylnialp os <sruocsid ra<h ot lwof ylniagnu siht d<ll<vram I hcuM    
 
".<romr<v<N" n<vaR <ht htouQ            
"!<rohs nainotulP s'thgiN <ht no si <man yldrol yht tahw <m ll<T
—<rohs ylthgiN <ht morf gnir<dnaw n<vaR tn<icna dna mirg yltsahG
,n<varc on <rus tra" ,dias I ",uoht ,n<vahs dna nrohs <b ts<rc yht hguohT"
,<row ti <cnan<tnuoc <ht fo muroc<d nr<ts dna <varg <ht yB
,gnilims otni ycnaf das ym gniliug<b drib ynob< siht n<hT


This c+p has a lot of problems, let's use string traversal to fix it

*/


/* String Traversal Reversal
The first known issue is that the poem text became reversed.

1) Declare a new, empty String to store the reversed text.
2) Create a for loop that will iterate through every value of our String.
3) Inside the loop, grab a single element at the String index of the current iteration.
4) Also within the loop, update the new String by prepending the current element’s value to the current String value.
5) Return the new String once the loop is complete.

Complete the function reverseString() which has one parameter: String text. The function must return a String which stores the characters of text in reverse. For example, if the method is called with the argument "abc", it should return "cba".

To accomplish this, you will need to use a for loop to traverse text.

*/

class Reverse {
  public static String reverseString(String text) {
    // Add your code below
    String reversed = new String("");
    for (int i = 0; i < text.length(); i++) {
      char letter = text.charAt(i);
      reversed = letter + reversed;
    }
  return reversed;
   
  }
  
