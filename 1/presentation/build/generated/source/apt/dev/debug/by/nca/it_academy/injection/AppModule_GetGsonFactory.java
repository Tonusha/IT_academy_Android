// Generated by Dagger (https://google.github.io/dagger).
package by.nca.it_academy.injection;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class AppModule_GetGsonFactory implements Factory<Gson> {
  private final AppModule module;

  public AppModule_GetGsonFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Gson get() {
    return Preconditions.checkNotNull(
        module.getGson(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_GetGsonFactory create(AppModule module) {
    return new AppModule_GetGsonFactory(module);
  }

  public static Gson proxyGetGson(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.getGson(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
