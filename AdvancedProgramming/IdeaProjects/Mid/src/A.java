public class A {
    public void showA(){
        System.out.println("51 intake.. Best of luck for your exam.");
    }
}
interface C {
    void showA();
}

interface D{
    void showA();
}


class E extends A implements C,D{
    @Override
    public void showA() {
        super.showA();
    }
}

class Main {
    public static void main(String[] args) {
        E e = new E();
        e.showA();
    }
}
