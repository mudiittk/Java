public class armstrong{
public static void main(String args[]){
int num=153,sum=0,rem,original=num;
while(num!=0)
{
rem=num%10;
sum=sum+rem*rem*rem;
num=num/10;
}
if(sum==original)
{
System.out.println("this is armstrong number");
}
else
{
System.out.println("NOT");
}
}
}