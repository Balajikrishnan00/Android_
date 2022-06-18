import com.balaji_2_2_0_5.retrofitmvvm.User
import com.balaji_2_2_0_5.retrofitmvvm.UserList
import com.balaji_2_2_0_5.retrofitmvvm.UserResponse
import retrofit2.Call
import retrofit2.http.*

interface RetroServices {


    @GET("{page}/users")
    @Headers("Accept:application/json","Content-Type:application/json"
        ,"Authorization: Bearer 62564d1b2d7e146cce5ab6a596479367df0f06b5f502073dd40fdb6a9842ac91")
    fun apiGetPostsList(@Path("page") page:String):Call<UserList?>


    @GET("{page}/users")
    @Headers("Accept:application/json","Content-Type:application/json"
        ,"Authorization: Bearer 62564d1b2d7e146cce5ab6a596479367df0f06b5f502073dd40fdb6a9842ac91")
    fun apiSearchUsers(@Path("page") page: String ,@Query("name") searchText:String) :Call<UserList?>


    @POST("users")
    @Headers("Accept:application/json","Content-Type:application/json"
        ,"Authorization: Bearer 62564d1b2d7e146cce5ab6a596479367df0f06b5f502073dd40fdb6a9842ac91")
    fun apiCreateUser(@Body params: User):Call<UserResponse>


    @PATCH("{page}/users/{user_id}")
    @Headers("Accept:application/json","Content-Type:application/json"
        ,"Authorization: Bearer 62564d1b2d7e146cce5ab6a596479367df0f06b5f502073dd40fdb6a9842ac91")
    fun apiUpdate(@Path("page")page:String,@Path("user_id")user_id:Int,@Body params: User):Call<UserResponse>


    @DELETE("{page}/users/{user_id}")
    @Headers("Accept:application/json","Content-Type:application/json"
        ,"Authorization: Bearer 62564d1b2d7e146cce5ab6a596479367df0f06b5f502073dd40fdb6a9842ac91")
    fun apiDelete(@Path("page") page:String,@Path("user_id")user_id:Int):Call<UserResponse>


}