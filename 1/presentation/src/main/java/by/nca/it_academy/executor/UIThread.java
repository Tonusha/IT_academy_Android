package by.nca.it_academy.executor;

import by.nca.domain.executor.PostExecutionThread;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;

public class UIThread implements PostExecutionThread {

    @Override
    public Scheduler getScheduler() {
        return AndroidSchedulers.mainThread();
    }
}
