class Digitcount{
public int countDigit(long n)
{
int count=0;
while(n!=0){
n=n/10;
++count;
}
return count;
}
public static void main(String args[])
{
Digitcount d= new Digitcount();
long n=1234567890;
System.out.println("number of digits are: " +d.countDigit(n));
}
}