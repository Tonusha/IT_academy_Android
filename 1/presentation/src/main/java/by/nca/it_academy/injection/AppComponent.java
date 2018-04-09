package by.nca.it_academy.injection;

import javax.inject.Singleton;

import by.nca.it_academy.presentation.screen.UserViewModel;
import by.nca.it_academy.presentation.screen.usermvp.SigninUserPresenter;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(UserViewModel userViewModel);
    void inject(SigninUserPresenter userPresenter);
}