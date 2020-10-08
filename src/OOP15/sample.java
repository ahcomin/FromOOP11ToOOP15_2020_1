package OOP15;

import java.awt.image.SampleModel;
//Generics <일반화>
public class sample<T> { //type을 아직 정해주지 않았을때 클래스에 <T>를 추가해준다.
    private T data;

    public void setData(T newValue) {
        data = newValue;
    }

    public T getData() {
        return data;
    }

    public static void main(String[] args) {
        sample<String> sample1 = new sample<String>();
        sample1.setData("item 1");

        sample<String> sample2 = new sample<String>();
        sample1.setData("item 2");


    }

}
