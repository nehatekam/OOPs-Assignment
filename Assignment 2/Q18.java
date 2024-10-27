interface InterfaceOne {
    void methodOneA();
    void methodOneB();
}

interface InterfaceTwo {
    void methodTwoA();
    void methodTwoB();
}

interface InterfaceThree {
    void methodThreeA();
    void methodThreeB();
}
interface NewInterface extends InterfaceOne, InterfaceTwo, InterfaceThree {
    void newMethod();
}
class ConcreteClass {
    void concreteMethod() {
        System.out.println("ConcreteClass method");
    }
}

class MyClass extends ConcreteClass implements NewInterface {
    @Override
    public void methodOneA() {
        System.out.println("Method One A");
    }

    @Override
    public void methodOneB() {
        System.out.println("Method One B");
    }

    @Override
    public void methodTwoA() {
        System.out.println("Method Two A");
    }

    @Override
    public void methodTwoB() {
        System.out.println("Method Two B");
    }

    @Override
    public void methodThreeA() {
        System.out.println("Method Three A");
    }

    @Override
    public void methodThreeB() {
        System.out.println("Method Three B");
    }

    @Override
    public void newMethod() {
        System.out.println("New method from NewInterface");
    }
}
class InterfaceDemo {
    public static void useInterfaceOne(InterfaceOne obj) {
        obj.methodOneA();
        obj.methodOneB();
    }

    public static void useInterfaceTwo(InterfaceTwo obj) {
        obj.methodTwoA();
        obj.methodTwoB();
    }

    public static void useInterfaceThree(InterfaceThree obj) {
        obj.methodThreeA();
        obj.methodThreeB();
    }

    public static void useNewInterface(NewInterface obj) {
        obj.newMethod();
    }
}

public class Q18 {
    public static void main(String[] args) {
        
        MyClass myObject = new MyClass();
        
        InterfaceDemo.useInterfaceOne(myObject);
        InterfaceDemo.useInterfaceTwo(myObject);
        InterfaceDemo.useInterfaceThree(myObject);
        InterfaceDemo.useNewInterface(myObject);
        
                
        myObject.concreteMethod();
    }
}

