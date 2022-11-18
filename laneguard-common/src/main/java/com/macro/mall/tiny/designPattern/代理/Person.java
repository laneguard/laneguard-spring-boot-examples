package com.macro.mall.tiny.designPattern.代理;

public class Person implements PersonInterface {

    @Override
    public void Morning() {
        System.out.println("上午：读书学习...");
    }

    @Override
    public void Afternoon() {
        System.out.println("下午：锻炼身体...");
    }

    @Override
    public void Evening() {
        System.out.println("傍晚：听歌娱乐...");
    }

    @Override
    public void Night() {
        System.out.println("夜里：早点睡觉...");
    }
}