package StarWars;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface StarWarsAPI {
    @GET("people/{code}")
    Call<People> people(@Path("code") String code);

    @GET("planets/{code}")
    Call<Planet> planet(@Path("code") String code);


}
