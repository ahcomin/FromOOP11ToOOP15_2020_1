package OOP12;

public class TestMovable {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 5);  // upcast
        System.out.println(m1); // (5,5)
        moveDown(m1); // (5,6)
        moveRight(m1);// (6,6)
    }

    public static void moveDown(Movable m) {
        m.moveDown();
        System.out.println(m);
    }
    public static void moveRight(Movable m) {
        m.moveRight();
        System.out.println(m);
    }
}
