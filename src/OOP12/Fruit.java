package OOP12;

//중요!!
public class Fruit implements Comparable {
    /*
    public int compareTo(Object other){
//오브젝트를 먼저 받아준다.
        if (other instanceof Fruit) { //other이 Fruit 타입인지? 체크.
            Fruit f = (Fruit) other;
            return this.fruitName.compareTo(f.getName());
            //만약에 fruitName과 getName이 같으면 출력.
        }
        return -1;
        }
        */
    /*
    public int compareTo(Object o){
        if ((o != null) && (o instanceof Fruit)){ //o가 Fruit의 인스턴스인지 아닌지 검사하는 연산자.
            Fruit otherFruit = (Fruit) o;
            return (fruitName.compareTo(otherFruit.fruitName));

        }
        return -1;
    }
    */
//이름의 길이로 순서를 정하기.
    public int compareTo(Object o) {
        if (o instanceof Fruit) {
            Fruit otherFruit = (Fruit) o;
            if (fruitName.length() > otherFruit.fruitName.length()) {
                return 1;
            } else if (fruitName.length() < otherFruit.fruitName.length()) {
                return -1;
            } else
                return 0;
        }
        return -1;
    }

    private String fruitName;

    public Fruit() {
        fruitName = "";
    }//생성자

    public Fruit(String name) {
        fruitName = name;
    }

    public void setName(String name) {
        fruitName = name;
    }

    public String getName() {
        return fruitName;
    }
}
