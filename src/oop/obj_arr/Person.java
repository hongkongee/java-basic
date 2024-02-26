package oop.obj_arr;

public class Person {

    private String name;
    private int age;
    private String gender;

    public Person() {}

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(!gender.equals("남성") && !gender.equals("여성")) {
            System.out.println("올바르지 않은 성별 표시입니다.");
            return;
        }
        this.gender = gender;
    }

    public void personInfo() {
        System.out.printf("이름: %s\n나이: %d세\n성별: %s\n",
                this.name, this.age, this.gender);
        System.out.println("-----------------------------------------------");
    }
}
