// Generated by Dagger (https://google.github.io/dagger).
package by.nca.it_academy.injection;

import by.nca.data.net.RestApi;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

public final class AppModule_GetRestApiFactory implements Factory<RestApi> {
  private final AppModule module;

  private final Provider<Retrofit> retrofitProvider;

  public AppModule_GetRestApiFactory(AppModule module, Provider<Retrofit> retrofitProvider) {
    this.module = module;
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public RestApi get() {
    return Preconditions.checkNotNull(
        module.getRestApi(retrofitProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_GetRestApiFactory create(
      AppModule module, Provider<Retrofit> retrofitProvider) {
    return new AppModule_GetRestApiFactory(module, retrofitProvider);
  }

  public static RestApi proxyGetRestApi(AppModule instance, Retrofit retrofit) {
    return Preconditions.checkNotNull(
        instance.getRestApi(retrofit), "Cannot return null from a non-@Nullable @Provides method");
  }
}
