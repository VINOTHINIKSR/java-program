import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int i=1,tem=0,b=0,count=0;
	    while(a>0){
	        b=a%2;
	        tem+=i*b;
	        a/=2;
	        i*=10;
	    }
		System.out.println(tem);
	}
}
