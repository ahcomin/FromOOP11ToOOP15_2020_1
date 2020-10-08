package OOP12;

public class MovablePoint implements Movable {
    private int x;
    private int y;

    public MovablePoint(int x, int y) { //생성자 먼저 만들기.
        this.x = x;
        this.y = y;

    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override //이거 꼭 붙여주는 습관 중요.
    public void moveUp() {
        y++;
    }

    @Override
    public void moveDown() {
        y--;
    }

    @Override
    public void moveRight() {
        x++;
    }

    @Override
    public void moveLeft() {
        x--;
    }
}
