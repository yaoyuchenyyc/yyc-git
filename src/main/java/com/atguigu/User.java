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

    public static void main(String[] args) {
        System.out.println(new User().toString());
        System.out.println(new User().toString()+"2");
        System.out.println(new User().toString()+"3");
        System.out.println(new User().toString()+"4");
        System.out.println(new User().toString()+"a");
        System.out.println(new User().toString()+"5");
        System.out.println(new User().toString()+"a");
        System.out.println(new User().toString()+"a");
        System.out.println(new User().toString()+"b");
        System.out.println(new User().toString()+"b");

    }
}
