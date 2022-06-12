/*You will be given a word 'w' and a group of words 'g'. 
check if 'w' can be broken into a space separated characters of one or more in the given group of words 'g'
Note the same word in the group of words may be re used multiple times in the breaking. 
The first line of input contains the group of words(g) followed by a word(w)
if it can done print true else print false
input=fleet gold
fleetgold
output=true
Explanation: prints true because fleetgold  can be broken as fleet gold
input=apple pen
applepenapple
output=true
Explanation: print true because "applepenapple" can be broken as "apple pen apple".
Note that you are allowed to reuse group of words
input=cats dogs and and cat
catsandog
output=false
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str[]=sc.nextLine().split(" ");
		String s=sc.next();
		System.out.println(wordSplit(str,s));
	}
	public static boolean wordSplit(String str[],String s){
	    List<String> l=new ArrayList<>();
	    List<String> ls=new ArrayList<>();
	    int flag=0;
	    for(int i=0;i<str.length;i++)
	    l.add(str[i]);
	    for(int i=0;i<s.length();i++){
	        for(int j=i+1;j<=s.length();j++){
	            ls.add(s.substring(i,j));
	        }
	    }
	        for(int i=0;i<l.size();i++){
	            if(ls.contains(l.get(i))){
	            flag=1;
	            ls.remove(ls.indexOf(l.get(i)));}
	            else{ 
	            flag=0;
	            break;}
	        }
	    if(flag==0)
	    return false;
	    else
	    return true;
	}
}
