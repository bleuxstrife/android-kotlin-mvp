package br.com.liveo.mvp.data.remote.endpoint

import br.com.liveo.mvp.model.domain.UserResponse
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by rudsonlima on 8/29/17.
 */

interface EndPoint {

    @GET("api/users")
    fun fetchUsers(@Query("page") page: Int): Observable<UserResponse>
}
