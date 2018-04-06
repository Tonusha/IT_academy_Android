package by.nca.data.repository;

import java.util.ArrayList;
import java.util.List;

import by.nca.data.entity.Image;
import by.nca.data.net.RestService;
import by.nca.domain.entity.ImageEntity;
import by.nca.domain.repository.ImageRepository;
import io.reactivex.Observable;
import io.reactivex.functions.Function;

/**
 * Created by miruk on 06.04.2018.
 */

public class ImageRepositoryImpl implements ImageRepository {

    private RestService restService;

    public ImageRepositoryImpl(RestService restService) {
        this.restService = restService;
    }

    @Override
    public Observable<List<ImageEntity>> search(String search) {
        return restService
                .searchImages(search)
                .map(new Function<List<Image>, List<ImageEntity>>() {
                    @Override
                    public List<ImageEntity> apply(List<Image> images) throws Exception {
                        List<ImageEntity> list = new ArrayList<>();
                        for(Image image: images) {
                            list.add(new ImageEntity(image.getUrl()));
                        }

                        return list;
                    }
                });
    }

    @Override
    public Observable<List<ImageEntity>> trending() {
        return restService
                .trendingImages()
                .map(new Function<List<Image>, List<ImageEntity>>() {
                    @Override
                    public List<ImageEntity> apply(List<Image> images) throws Exception {
                        List<ImageEntity> list = new ArrayList<>();
                        for(Image image: images) {
                            list.add(new ImageEntity(image.getUrl()));
                        }

                        return list;
                    }
                });
    }
}
