package com.example.nasa.data.repository

import com.example.nasa.data.BuildConfig
import com.example.nasa.data.network.api.NasaApi
import com.example.nasa.data.util.toDomain
import com.example.nasa.domain.model.Apod
import com.example.nasa.domain.repository.RemoteApodRepository
import kotlinx.coroutines.delay

internal class RemoteApodRepositoryImpl(private val nasaApi: NasaApi) : RemoteApodRepository {


    override suspend fun fetchPictureOfDay(): Result<Apod> = runCatching {
        delay(2000) //delay for testing
        nasaApi.getPictureOfDay(BuildConfig.NASA_API_KEY)
            .toDomain()
    }
}