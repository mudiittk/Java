public class binary{
public static void main(String args[]){
int binary=0,i=1,rem,num=349;
while(num!=0)
{
rem=num%2;
binary=binary+rem*i;
i=i*10;
num=num/2;
}
System.out.println(binary);
}
}
