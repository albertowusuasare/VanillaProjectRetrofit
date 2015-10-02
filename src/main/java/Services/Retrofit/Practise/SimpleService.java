package Services.Retrofit.Practise;/*
 * Copyright (C) 2012 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import java.io.IOException;
import java.util.List;

import OldModel.Response;
import retrofit.Call;
import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.http.GET;
import retrofit.http.Path;

public final class SimpleService {
    public static final String API_URL = "https://api.github.com";
    public static final String G_LICIOUS_URL = "https://appdev.grinnell.edu";

    public static class Contributor {
        public final String login;
        public final int contributions;

        public Contributor(String login, int contributions) {
            this.login = login;
            this.contributions = contributions;
        }
    }

    public interface Glicious {
        @GET("/glicious/{date}")
        Call<Response> getMeals(
                @Path("date") String date) ;
    }

    public interface GitHub {
        @GET("/repos/{owner}/{repo}/contributors")
        Call<List<Contributor>> contributors(
                @Path("owner") String owner,
                @Path("repo") String repo);
    }

    public static void main(String... args) throws IOException {
        // Create a very simple REST adapter which points the GitHub API.
       /* Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
                */

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(G_LICIOUS_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        // Create an instance of our GitHub API interface.
       // GitHub github = retrofit.create(GitHub.class);
          Glicious glicious = retrofit.create(Glicious.class);

        // Create a call instance for looking up Retrofit contributors.
      //  Call<List<Contributor>> call = github.contributors("square", "retrofit");
        Call<Response> call = glicious.getMeals("9-3-2015.json");

        // Fetch and print a list of the contributors to the library.
       // List<Contributor> contributors = call.execute().body();
        Response response = call.execute().body();
        System.out.println("Finished");
       /* for (Contributor contributor : contributors) {
            System.out.println(contributor.login + " (" + contributor.contributions + ")");
        }
        */
    }
}