//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Carolyn Savas

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class PostFix
{
 private Stack<Double> stack;
 private String expr;
 private Double out;

 public PostFix()
 {
   setExpression("");
 }

 public PostFix(String exp)
 {
   setExpression(exp);
 }

 public void setExpression(String exp)
 {
   stack = new Stack<Double>();
   expr = exp;
   out = 0.0;
 }

 public double calc(double one, double two, char op)
 {
   out =0.0;
   if(op == '*')
     out = one * two;
   else if(op == '+')
     out = one + two;
   else if(op == '-')
     out = two-one;
   else if(op == '/')
     out=two/one;
  return out;
 }

 public void solve()
 {
   for(char ch : expr.toCharArray()){
     if(ch == '1' || ch == '2' || ch == '3' || ch == '4' || ch == '5' || ch == '6' || ch == '7' || ch == '8' || ch == '9'){
       if(ch == '1')
         stack.push(1.0);
       if(ch == '2')
         stack.push(2.0);
       if(ch == '3')
         stack.push(3.0);
       if(ch == '4')
         stack.push(4.0);
       if(ch == '5')
         stack.push(5.0);
       if(ch == '6')
         stack.push(6.0);
       if(ch == '7')
         stack.push(7.0);
       if(ch == '8')
         stack.push(8.0);
       if(ch == '9')
         stack.push(9.0);
     }
     else{
       double one = stack.pop();
       double two = stack.pop();
       stack.push(calc(one, two, ch));
     }
   }
 }

 public String toString(){
   return "" + expr + " = " + out;
 }
}