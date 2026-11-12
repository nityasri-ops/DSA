import java.util.Scanner;
class SumofEven{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0,pos=1;
while(n>0){
int digit=n%10;
if(pos%2==0){
sum=sum+digit;
}
n=n/10;
pos++;
}
System.out.println(sum);
}
}