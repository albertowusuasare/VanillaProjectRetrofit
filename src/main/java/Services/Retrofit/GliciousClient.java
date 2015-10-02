package Services.Retrofit;

import Model.MenuResponseType;
import OldModel.*;
import OldModel.Response;
import com.google.gson.Gson;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.ResponseBody;
import retrofit.*;

import java.io.IOException;

/**
 * Created by albertowusu-asare on 9/8/15.
 */
public class GliciousClient {
    private static final String BASE_URL ="https://appdev.grinnell.edu/glicious/";
    private ClientServiceApi clientService;
    private Retrofit retrofit;
    private Response response= null;

    public GliciousClient(){
        initialiaze();
    }

    private  void initialiaze(){

        Gson gson = new Gson();


        retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


/*       retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .build();
                */
     /*  retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverter(Gson.class, gsonConverter)
                .build();*/

        clientService = retrofit.create(ClientServiceApi.class);
        // retrofit implemenation of our client Api interface class

    }

    public Response getMenuByDate(String date) throws IOException {

        Call<Response> call = clientService.getMenuData(date);

        call.enqueue(new Callback<Response>() {
            @Override
            public void onResponse(retrofit.Response<Response> response) {
                String str ="";
                try {
                    str = response.errorBody().string();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                setResponse(response.body());
            }

            @Override
            public void onFailure(Throwable t) {
                t.printStackTrace();
            }
        });
        return response;
    }

    public void setResponse(Response response){
        this.response = response;
    }

}
