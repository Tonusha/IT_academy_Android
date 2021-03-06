// Generated by Dagger (https://google.github.io/dagger).
package by.nca.it_academy.injection;

import by.nca.domain.executor.PostExecutionThread;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class AppModule_GetUiThreadFactory implements Factory<PostExecutionThread> {
  private final AppModule module;

  public AppModule_GetUiThreadFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public PostExecutionThread get() {
    return Preconditions.checkNotNull(
        module.getUiThread(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_GetUiThreadFactory create(AppModule module) {
    return new AppModule_GetUiThreadFactory(module);
  }

  public static PostExecutionThread proxyGetUiThread(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.getUiThread(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
