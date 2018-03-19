package by.nca.it_academy.work.hw8;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import by.nca.it_academy.R;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public class OneFragment extends Fragment {
    private PublishContract publishContract;
    private TextView textView1;
    private Disposable disposable;

    public static OneFragment getInstance() {
        return new OneFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return getLayoutInflater().inflate(R.layout.fragment_one, container, false);
        //отвечает за создание view
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView1 = view.findViewById(R.id.textView1);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                subscribe();
            }
        });
        // инициализация UI
        //в этом методе гарантировано создано view, рекомендовано писать все этом методе, пред исп для созд вью только
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Activity activity = getActivity();
        if (activity != null) {
            publishContract = (PublishContract) activity;
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        publishContract = null;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
        if (disposable != null) {
            disposable.dispose();
        }
    }

    private void subscribe() {

        disposable = publishContract.getObservable()
              //  .filter(item -> item)
             //   .timeout(5000, TimeUnit.MILLISECONDS)

                .subscribe(new Consumer<Integer>() {
                    @Override
                    public void accept(Integer integer) throws Exception {
                        textView1.setText(String.valueOf(integer));
                        //сюда прилетают данные
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        //сюда прилетают ошибки
                    }
                });
    }
}
