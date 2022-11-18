package com.macro.mall.tiny.designPattern.工厂;

import com.macro.mall.tiny.designPattern.工厂.产品.Button;
import com.macro.mall.tiny.designPattern.工厂.产品.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}