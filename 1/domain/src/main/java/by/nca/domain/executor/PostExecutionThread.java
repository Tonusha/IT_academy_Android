package by.nca.domain.executor;

import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by user on 16.03.2018.
 */

public interface PostExecutionThread {
    // этот интерфейс нужно реализовать в presentation слое
    public Scheduler getScheduler();
}
