package com.macro.mall.tiny.designPattern.抽象工厂.产品;

public class MacOSButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}