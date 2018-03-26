// Generated by Dagger (https://google.github.io/dagger).
package by.nca.it_academy.injection;

import by.nca.data.net.RestService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class AppModule_GetRestServiceFactory implements Factory<RestService> {
  private final AppModule module;

  public AppModule_GetRestServiceFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public RestService get() {
    return Preconditions.checkNotNull(
        module.getRestService(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_GetRestServiceFactory create(AppModule module) {
    return new AppModule_GetRestServiceFactory(module);
  }

  public static RestService proxyGetRestService(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.getRestService(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
