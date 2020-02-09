package dev.elvir.core.di.module

import dagger.Module
import dagger.Provides

@Module
class NetworModule {

    @Provides
    fun provideFakeHttpClient(): HttpClient =
        HttpClient("Fake Http Client")

}

class HttpClient(var httpClient: String)