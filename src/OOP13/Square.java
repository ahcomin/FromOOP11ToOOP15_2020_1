/**
 * <h1> Square </h1>
 * <p>
 *
 *
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 * @Compile : javac Square.java
 * @Run : java Square
 * Programming Assignment 1.
 * @since 06-11-2020
 */
package OOP13;

public class Square extends DrawableShape { //create class extends DrawableShape
    private int sideLength;

    public Square(int len) { //create constructor with no parameter
        super(0, 0, "Green");
        sideLength = len;
    }

    public int getLength() {
        return sideLength;
    }


    public void draw() {
        //moveBy(7,7)

        int xLeft = getX();
        int yTop = getY();
        // Get to the top of the square
        for (int i = 1; i < yTop; i++) {//높이 7칸 띄어주기.
            System.out.println();
        }

        // Build and draw the top
        String offset = "";
        for (int j = 1; j < xLeft; j++) {//오른쪽으로 7칸 띄어주기.
            offset = offset + " ";
        }

        String top = offset;
        for (int j = 0; j < sideLength; j++) { //"*"을 정사각형의 한 변의 길이 만큼 그리기.
            top = top + "*";
        }

        System.out.println(top);

        // Build and draw sides
        String side = offset + "*";
        for (int j = 0; j < sideLength - 2; j++) {
            side = side + " ";
        }
        side = side + "*";

        for (int i = 0; i < sideLength - 2; i++) {
            System.out.println(side);
        }

        // bottom is the same as the top
        System.out.println(top);
        System.out.println("- 정사각형의 색깔 : " + getColor());
    }

    public void area() { //넓이를 구해주는 메서드
        System.out.println(getLength() * getLength());
    }

    public void perimeter() {//둘레를 구해주는 메서드
        System.out.println(getLength() * 4);
    }

    public static void main(String[] args) {//main method is defined here.

        Square sq = new Square(5);
        sq.moveBy(7, 7); //x축 y축 으로 얼마나 옮길지.
        sq.draw(); // 정사각형 그리기.
        System.out.print("- 정사각형의 넓이 : ");
        sq.area(); //정사각형의 넓이.
        System.out.print("- 정사각형의 둘레 : ");
        sq.perimeter();//정사각형의 둘레.


    }
}
