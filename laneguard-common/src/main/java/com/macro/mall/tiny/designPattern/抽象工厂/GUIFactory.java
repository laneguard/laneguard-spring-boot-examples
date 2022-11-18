package com.macro.mall.tiny.designPattern.抽象工厂;

import com.macro.mall.tiny.designPattern.抽象工厂.产品.Button;
import com.macro.mall.tiny.designPattern.抽象工厂.产品.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}