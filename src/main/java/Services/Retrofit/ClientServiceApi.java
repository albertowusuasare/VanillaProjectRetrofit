package Services.Retrofit;


import OldModel.Response;
import retrofit.Call;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

/**
 * Created by albertowusu-asare on 9/8/15.
 */
public interface ClientServiceApi {
    // Get information about the current menu
    @GET("https://appdev.grinnell.edu/glicious/9-3-2015.json")
   // @GET("{date}.json")
    Call<Response> getMenuData (@Path("date") String date);

}
