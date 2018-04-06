package by.nca.domain.repository;

import java.util.List;

import by.nca.domain.entity.ImageEntity;
import io.reactivex.Observable;

public interface ImageRepository {

    Observable<List<ImageEntity>> search(String search);
    Observable<List<ImageEntity>> trending();
}
