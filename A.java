class A {
    int x = 10;

    public void methodA() {
        System.out.println("methodA");
    }
}

class B extends A {
    int y = 20;

    public void methodB() {
        System.out.println("methodB");
    }
}

class C extends B {
    int z = x + y;

    public void methodC() {
        System.out.println("methodC");
    }

}

    public static void main(String args[]) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
        obj.methodC();
        System.out.println(obj.z);
    }

    public void displayB() {

    }

    public void displayA() {
    }

public void displayC(){

}
