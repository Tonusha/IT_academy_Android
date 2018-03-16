package by.nca.domain.interactor;

import by.nca.domain.entity.UserEntity;
import by.nca.domain.executor.PostExecutionThread;
import by.nca.domain.repository.UserRepository;
import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/**
 * Created by user on 16.03.2018.
 */

public class GetUserByIdUseCase extends BaseUseCase {

    private UserRepository userRepository;

    public GetUserByIdUseCase(PostExecutionThread postExecutionThread, UserRepository userRepository) {
        super(postExecutionThread);
    }

    public Observable<UserEntity> get(String id) {
        return userRepository.get(id).subscribeOn(threadExecution)
                .observeOn(postExecutionThread);

    }

}

