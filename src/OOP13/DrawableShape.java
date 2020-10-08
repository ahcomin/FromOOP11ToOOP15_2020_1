package OOP13;

abstract class DrawableShape {//create a abstract class

    public int xLocation;//x축.
    public int yLocation;//y축.
    public String color;//색갈.

    //create a new instance of DrawableShape.

    public DrawableShape(int x, int y, String theColor) { //create a constructor with three parameters.
        xLocation = x;
        yLocation = y;
        color = theColor;

    }

    public int getX() { //to return x location.
        return xLocation;
    }

    public int getY() { //to return y location.
        return yLocation;
    }

    public String getColor() { //to return color.
        return color;
    }

    public void moveBy(int xChange, int yChange) { //the method to change location.
        xLocation += xChange;
        yLocation += yChange;
    }


}

