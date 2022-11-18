package com.macro.mall.tiny.util.commons.beanUtils;

import lombok.Data;

@Data
public class Person {

 private String name;

 private int age;

 private String gender;

 private boolean bool;

@Override

 public String toString() {
 return "Person [name=" + name + ", age=" + age + ", gender=" + gender

     + "]";
 }

}