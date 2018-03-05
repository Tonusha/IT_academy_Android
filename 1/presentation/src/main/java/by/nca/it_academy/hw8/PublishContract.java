package by.nca.it_academy.hw8;

import io.reactivex.Observable;

/**
 * Created by user on 02.03.2018.
 */

public interface PublishContract {
    Observable<Integer> getObservable();
}
