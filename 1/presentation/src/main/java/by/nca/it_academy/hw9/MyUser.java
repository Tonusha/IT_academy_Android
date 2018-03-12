package by.nca.it_academy.hw9;

import android.databinding.BindingAdapter;
import android.databinding.Observable;
import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

//import com.squareup.picasso.Picasso;

/**
 * Created by user on 05.03.2018.
 */
public class MyUser {
    public ObservableField<String> firstName = new ObservableField<>("Мирук");
    public ObservableField<String> lastName = new ObservableField<>("Антонина");
    public ObservableField<String> fatherName = new ObservableField<>("Николаевна");
    public ObservableInt age = new ObservableInt(34);
    public ObservableBoolean sex = new ObservableBoolean();
    public ObservableField<String> imageUrl = new ObservableField<>("https://i.imgur.com/7zoGwDg.jpg");

    public MyUser(String firstName, String lastName, String fatherName, Integer age, boolean sex, String imageURL) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
        this.fatherName.set(fatherName);
        this.age.set(age);
        this.sex.set(sex);
        this.imageUrl.set(imageURL);
    }

    @BindingAdapter({"bind:imageUrl"})
    public static void loadImage(ImageView view, String url) {
       // Picasso.with(view.getContext()).load(url).into(view);
    }
}