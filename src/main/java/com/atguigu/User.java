package com.atguigu;

public class User {
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new User().toString());
        System.out.println(new User().toString());
        System.out.println(new User().toString());
        System.out.println(new User().toString());
        System.out.println("sssss");
        System.out.println("sssss");
        System.out.println("sssss");
    }
}
