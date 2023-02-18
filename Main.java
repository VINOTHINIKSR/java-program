import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a,sum=0,temp;
        temp=n;
        while(n>0){
            a=n%10;
            sum*=10+a;
            n/=10;
        }
        if(temp==sum)
        System.out.println("palindrome number");
        else
        System.out.println("not palindrome number");
    }
}

