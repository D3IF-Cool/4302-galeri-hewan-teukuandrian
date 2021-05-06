package com.teukuandrian.galerihewan.ui.main
private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()
private const val BASE_URL = "https://dif.indraazimi.com/"
private val retrofit = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl(BASE_URL)
        .build()
interface HewanApiService {
    @GET("listhewan.json")
    suspend fun getHewan(): List<Hewan>

}
object HewanApi {
    val service: HewanApiService by lazy {
        retrofit.create(HewanApiService::class.java)
    }
    enum class ApiStatus { LOADING, SUCCESS, FAILED }
    fun getHewanUrl(nama: String): String {
        return BASE_URL + "hewan/$nama.jpg"
    }

}