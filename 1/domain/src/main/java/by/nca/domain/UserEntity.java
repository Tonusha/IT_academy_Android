package by.nca.domain;

/**
 * Created by user on 12.03.2018.
 */

public class UserEntity {
    private String username;
    private int age;
    private String profileUrl;


    public UserEntity(){

    };

    public UserEntity(String username, int age, String profileUrl) {
        this.username = username;
        this.age = age;
        this.profileUrl = profileUrl;
    };


    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public String getProfileUrl() {
        return profileUrl;
    }
}
