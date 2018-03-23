package by.nca.domain.entity;

/**
 * Created by user on 12.03.2018.
 */

public class UserEntity {

    private String firstName;
    private String lastName;
    private String fatherName;
    private Integer age;
    private boolean isMan;
    private String imageUrl;

    public UserEntity(String firstName, String lastName, String fatherName, Integer age, boolean isMan, String imageURL) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fatherName = fatherName;
        this.age = age;
        this.isMan = isMan;
        this.imageUrl = imageURL;
    }

    public UserEntity() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public Integer getAge() {
        return age;
    }

    public boolean isMan() {
        return isMan;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}