package by.nca.it_academy.work.cw9;

import android.databinding.Observable;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 05.03.2018.
 */

public class MyEntity {
    public ObservableField<String> text = new ObservableField(null);
    public ObservableField<String> textButton = new ObservableField(null);
    public ObservableBoolean buttonVisible = new ObservableBoolean(true);

    public MyEntity(String text, String textButton) {
        this.text.set(text);
        this.textButton.set(textButton);
    }

    public void buttonClick (View view) {
        Log.e("AAAA", "buttonClick()");
        buttonVisible.set(false);
    }
}
