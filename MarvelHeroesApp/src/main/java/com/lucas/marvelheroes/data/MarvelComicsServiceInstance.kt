package com.lucas.marvelheroes.data

import com.lucas.marvelheroes.data.models.ComicResponse
import com.lucas.marvelheroes.util.MarvelComicsConstants
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelComicsServiceInstance {

    @GET("comics")
    suspend fun getMarvelComics(
        @Query("ts") ts: String = MarvelComicsConstants.TS,
        @Query("apikey") apiKey: String = MarvelComicsConstants.API_KEY,
        @Query("hash") hash: String = MarvelComicsConstants.hash(),
        @Query("limit") limit: String = MarvelComicsConstants.LIMIT,
        @Query("orderBy") orderBy: String = MarvelComicsConstants.GET_MOST_UP_TO_DATE
    ): Response<ComicResponse>
}