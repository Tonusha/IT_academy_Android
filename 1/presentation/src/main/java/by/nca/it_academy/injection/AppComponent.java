package by.nca.it_academy.injection;

import javax.inject.Singleton;

import by.nca.it_academy.work.cw12.UserViewModel;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent  {

    void inject(UserViewModel userViewModel);
}
