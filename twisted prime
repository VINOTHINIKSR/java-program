import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int rev,sum=0;int count=0;
	    while(a!=0){
	        rev=a%10;
	        sum=sum*10+rev;
	        a/=10;
	    }
	    for(int i=2;i<=a;i++){
	        if(a%i==0){
	            count++;
	        }
	    }
	    if(count==0){
	        System.out.println("Twisted prime");
	    }
	    else{
	        System.out.println("not twisted prime");
	    }
		
	}
}
