package com.girish.daggerlearning;

import dagger.Component;

@Component(modules = {
        MyModule.class,
})

public interface MyComponent {
    void inject(MainActivity activity);
}
