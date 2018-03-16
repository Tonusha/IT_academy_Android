package by.nca.domain.interactor;

import by.nca.domain.executor.PostExecutionThread;
import by.nca.domain.executor.ThreadExecutor;
import io.reactivex.Scheduler;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by user on 16.03.2018.
 */

public abstract class BaseUseCase {
    // поток в котором будем получать результаты в presentation слое
    protected Scheduler postExecutionThread;

    // поток в котором будем выполнять все сложные запросы
    protected Scheduler threadExecution;

    public BaseUseCase(PostExecutionThread postExecutionThread) {
        this.postExecutionThread = postExecutionThread.getScheduler();
        this.threadExecution = Schedulers.io();
    }

    public BaseUseCase(ThreadExecutor threadExecution, PostExecutionThread postExecutionThread) {
        this.threadExecution = Schedulers.from(threadExecution);
        this.postExecutionThread = postExecutionThread.getScheduler();
    }
}
