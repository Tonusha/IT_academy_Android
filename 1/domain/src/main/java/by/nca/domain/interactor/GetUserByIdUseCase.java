package by.nca.domain.interactor;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import by.nca.domain.entity.UserEntity;
import by.nca.domain.executor.PostExecutionThread;
import by.nca.domain.repository.UserRepository;
import io.reactivex.Observable;

public class GetUserByIdUseCase extends BaseUseCase {

    private UserRepository userRepository;

    @Inject
    public GetUserByIdUseCase(PostExecutionThread postExecutionThread,
                              UserRepository userRepository) {
        super(postExecutionThread);
        this.userRepository = userRepository;
    }

    public Observable<UserEntity> get(String id) {
        return userRepository
                .get(id)
                .subscribeOn(threadExecution)
                .observeOn(postExecutionThread);
    }
}
