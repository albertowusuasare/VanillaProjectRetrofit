package ServiceTest;

/**
 * Created by albertowusu-asare on 9/29/15.
 */
import OldModel.Response;
import Services.Retrofit.GliciousClient;
import org.junit.*;
import org.junit.Assert.*;

import java.io.IOException;

import static junit.framework.TestCase.assertNotNull;

public class RetroFitServiceTest {
    private GliciousClient gliciousClient;
    @Before
    public void initialize(){
        gliciousClient = new GliciousClient();
    }

    @Test
    public void setGliciousClientTest(){

        Response response = null;
        try {
            response = gliciousClient.getMenuByDate("9-3-2015.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertNotNull(response);
    }
}
