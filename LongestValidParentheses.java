/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class LongestValidParentheses {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		sc.nextLine();

    for(int i=0; i<c; i++) {
	    String s = sc.nextLine();
   		Stack<Integer> stack = new Stack<Integer>();

   		for(int j=0;j<s.length(); j++) {
   		    if ((!stack.isEmpty()) && (s.charAt(j) == ')') && (s.charAt(stack.peek())=='(')) {
   		        stack.pop();
   		    } else {
   		        stack.push(j);
   		    }
     		}
      	stack.push(s.length());

     		int result = 0;
     		while(!stack.isEmpty()) {
     		    int last = stack.pop();
     		    int beforeLast = !stack.isEmpty() ? stack.peek()+1 : 0;
     		    int diff = last - beforeLast;
     		    if (diff > result) {
     		        result = diff;
     		    }
     		}
      	System.out.println(result);
		}
	}
}
