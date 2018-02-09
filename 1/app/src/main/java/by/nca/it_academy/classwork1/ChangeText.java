package by.nca.it_academy.classwork1;

import android.view.View;
import android.widget.TextView;

class ChangeText {
    public void clickListener(final TextView textView1, final TextView textView2) {
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String textViewText1 = textView1.getText().toString();
                textView1.setText(textView2.getText().toString());
                textView2.setText(textViewText1);
            }
        });
    }
}
