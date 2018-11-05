package com.girish.daggerlearning;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModule {

    @Provides
    DataSource provideDataSource() {
        return new NetworkDataSource("network data");
    }
}
