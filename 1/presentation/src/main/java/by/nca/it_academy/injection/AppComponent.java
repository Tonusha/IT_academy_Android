package by.nca.it_academy.injection;

import javax.inject.Singleton;

import by.nca.it_academy.presentation.screen.UserViewModel;
import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    public void inject(UserViewModel userViewModel);

}
