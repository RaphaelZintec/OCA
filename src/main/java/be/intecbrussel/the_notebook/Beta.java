package be.intecbrussel.the_notebook;

class A{
    int var = 5;
    int getVar(){
        return var;
    }
}

class B extends A{
    int var = 20;
    int getVar(){
        return var;
    }

    public static void main(String[] args) {
        A objA = new A();
        A objAB = new B();
        B objB = new B();
        System.out.println(objA.var);
        System.out.println(objAB.var);
        System.out.println(objB.var);
    }
}
