package com.macro.mall.tiny.designPattern.抽象工厂.工厂;

import com.macro.mall.tiny.designPattern.抽象工厂.GUIFactory;
import com.macro.mall.tiny.designPattern.抽象工厂.产品.Button;
import com.macro.mall.tiny.designPattern.抽象工厂.产品.Checkbox;
import com.macro.mall.tiny.designPattern.抽象工厂.产品.WindowsButton;
import com.macro.mall.tiny.designPattern.抽象工厂.产品.WindowsCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}