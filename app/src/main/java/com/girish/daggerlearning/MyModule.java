package com.girish.daggerlearning;

import dagger.Module2;
import dagger.Provides2;

@Module2
public class MyModule {

    @Provides2
    DataSource provideDataSource() {
        return new NetworkDataSource("network data");
    }
}
