package janani;
import java.util.Scanner;
public class Sum2num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,sum=0,i,sum1=1;
System.out.println("enter the number");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
int []a=new int[n];
for(i=0;i<n;i++){
	a[i]=ja.nextInt();
}
for(i=0;i<n;i++){
	sum=sum+a[i];
	sum1=sum/n;
}
System.out.println(sum1);
	}

}
