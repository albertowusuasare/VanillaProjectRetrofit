package ServiceTest;

import OldModel.Response;
import Services.OKHttp.OkHttpRestClient;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.*;



import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

/**
 * Created by albertowusu-asare on 9/18/15.
 */
public class OKHttpServiceTest {
    private OkHttpRestClient okHttpRestClient;
    private String BASE_URL ;
    private String responseJSON;
    Gson gson;

    @Before
    public void initialize(){
        this.okHttpRestClient = new OkHttpRestClient();
        gson = new GsonBuilder().create();
    }

    @Test
    public void responseJSONTest() throws Exception{
        responseJSON = okHttpRestClient.getResponseJSON();
        assertNotNull("JSON response not null",responseJSON);
        assertFalse("JSON response not empty",responseJSON.isEmpty());
        System.out.println(responseJSON);
        Response response = gson.fromJson(responseJSON,Response.class);
        assertNotNull("Response Object not Null",response);
    }



}
