import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
 static boolean flag = true; 
static int B,H;

static{

Scanner scan = new Scanner(System.in);
B = scan.nextInt();
scan.nextLine();
H = scan.nextInt();
scan.close();
if(B>0 && H>0){
    flag = true;

}else if(B<=0 || H<=0){
    flag=false;
    System.out.println("java.lang.Exception: Breadth and height must be positive");
}
}

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

