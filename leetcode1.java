package one ;

public class leetcode1 {
    public int minLength(String s){
    int [] freq = new int [26];
    

    for (char c : s.toCharArray()){
        freq[c - 'a']++;
       }
    
    

    int length = 0;

    for (int count : freq ){
        if(count % 2 == 1){
            length += 1;
        } else {
            length += Math.min(2,count);
        }
        }
        return length ;
       }
   
 
   public static void main(String args[]){

    String s1 = "aaabbbccd" ;

    leetcode1 sol = new leetcode1();
    int minL = sol.minLength(s1);
    System.out.println("Minimum length for \""+ s1 + "\" : "+ minL );
   }
}
    

