package by.nca.it_academy.work.cw12;

import by.nca.it_academy.presentation.base.BaseViewModel;

/**
 * Created by user on 12.03.2018.
 */

public class MyEntity extends BaseViewModel {
    public String text;
    public String textButton;
    public boolean buttonVisible;

    public MyEntity() {
    }

    @Override
    public void createInject() {

    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getTextButton() {
        return textButton;
    }

    public void setTextButton(String textButton) {
        this.textButton = textButton;
    }

    public boolean isButtonVisible() {
        return buttonVisible;
    }

    public void setButtonVisible(boolean buttonVisible) {
        this.buttonVisible = buttonVisible;
    }

}
