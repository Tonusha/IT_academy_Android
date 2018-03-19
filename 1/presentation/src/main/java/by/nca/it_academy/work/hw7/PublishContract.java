package by.nca.it_academy.work.hw7;

import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

/**
 * Created by user on 02.03.2018.
 */

public interface PublishContract {
    Observable<Integer> getObservable();
}
