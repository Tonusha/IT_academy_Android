package by.nca.it_academy.work_mvvm.hw1;

/**
 * Created by miruk on 21.03.2018.
 */

public class MyEntity {
    private String text1;
    private String text2;

    public MyEntity(String text1, String text2) {
        this.text1 = text1;
        this.text2 = text2;
    }

    public MyEntity() {

    }

    public String getText1() {
        return text1;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public String getText2() {
        return text2;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }
}

