interface one{
    public void print_one();
}
interface two{
    public void print_two();
}
interface three{
    public void print_three();
}
class child implements one,two,three{
    @Override public void print_one()
    {
        System.out.println("I am one.");
    }
    public void print_two(){System.out.println("I am two.");}
    public void print_three(){System.out.println("I am three.");}
}
public class MultipleInheritance{
    public static void main(String [] args){
        child c= new child();
        c.print_one();
        c.print_two();
        c.print_three();
    }
}