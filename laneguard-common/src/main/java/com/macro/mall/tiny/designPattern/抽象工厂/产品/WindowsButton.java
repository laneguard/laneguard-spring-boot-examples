package com.macro.mall.tiny.designPattern.抽象工厂.产品;

import com.macro.mall.tiny.designPattern.抽象工厂.产品.Button;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a button.
 */
public class WindowsButton implements Button {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}