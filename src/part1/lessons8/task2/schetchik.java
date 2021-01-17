public class schetchik {

    public static void main(String[] args) {
        B someObject = new B();
        System.out.println("Создано объектов: " + B.count);

        B anotherObject = new B();
        System.out.println("Создано объектов: " + B.count);

        B theeObject = new B();
        System.out.println("Создано объектов: "+ B.count);

    }

}

class B {

    static int count;

    B() {
        count++;
    }
}