package by.nca.it_academy.cw10;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.util.Log;
import android.view.View;

import by.nca.presentation.base.BaseViewModel;

/**
 * Created by user on 12.03.2018.
 */

public class MyEntity extends BaseViewModel {
    private String text;
    private String textButton;
    private boolean buttonVisible;

    public MyEntity(String text, String textButton, boolean buttonVisible) {
        this.text = text;
        this.textButton = textButton;
        this.buttonVisible = buttonVisible;
    }

    public MyEntity() {

    }


    public String getText() {
        return text;
    }

    public String getTextButton() {
        return textButton;
    }

    public boolean isButtonVisible() {
        return buttonVisible;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTextButton(String textButton) {
        this.textButton = textButton;
    }

    public void setButtonVisible(boolean buttonVisible) {
        this.buttonVisible = buttonVisible;
    }
}
