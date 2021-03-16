//© A+ Computer Science  -  www.apluscompsci.com
//Name - Carolyn Savas
//Date - 11/14/18
//Class - B2
//Lab  - 7C

import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;

public class PostFixRunner
{
 public static void main ( String[] args )
 {
  PostFix test = new PostFix("27+12++");
  test.solve();
  System.out.println(test);

  test.setExpression("1234+++");
  test.solve();
  System.out.println(test);

  test.setExpression("93*8/4+");
  test.solve();
  System.out.println(test);

  test.setExpression("33+7*92/+");
  test.solve();
  System.out.println(test);

  test.setExpression("93/2*79*+4-");
  test.solve();
  System.out.println(test);
  
  test.setExpression("55+2*4/9+");
  test.solve();
  System.out.println(test);  
 }
}