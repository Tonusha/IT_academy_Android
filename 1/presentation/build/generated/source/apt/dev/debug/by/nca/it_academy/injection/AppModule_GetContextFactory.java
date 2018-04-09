// Generated by Dagger (https://google.github.io/dagger).
package by.nca.it_academy.injection;

import android.content.Context;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class AppModule_GetContextFactory implements Factory<Context> {
  private final AppModule module;

  public AppModule_GetContextFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public Context get() {
    return Preconditions.checkNotNull(
        module.getContext(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static AppModule_GetContextFactory create(AppModule module) {
    return new AppModule_GetContextFactory(module);
  }

  public static Context proxyGetContext(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.getContext(), "Cannot return null from a non-@Nullable @Provides method");
  }
}