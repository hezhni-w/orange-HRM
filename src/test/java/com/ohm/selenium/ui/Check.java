package com.ohm.selenium.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WrapsElement;

public class Check implements ICheck, WrapsElement {

    private  WebElement element;

    public Check(WebElement element) {
        this.element = element;
    }

    @Override
    public void check() {
        if(!isChecked()){
            element.click();
        }
    }

    @Override
    public void unCheck() {
        if(isChecked()){
            element.click();
        }
    }

    @Override
    public boolean isChecked() {
        return element.isSelected();
    }

    @Override
    public boolean isNotChecked() {
        return !isChecked();
    }

    @Override
    public boolean isEnabled() {
        return element.isEnabled();
    }
    @Override
    public boolean isDisabled() {
        return !isEnabled();
    }

    @Override
    public WebElement getWrappedElement() {
        return null;
    }

}
