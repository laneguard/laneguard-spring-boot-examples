package com.macro.mall.tiny.designPattern.工厂;

import com.macro.mall.tiny.designPattern.工厂.产品.Button;
import com.macro.mall.tiny.designPattern.工厂.产品.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}