package StarWars;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.google.gson.Gson;


public class StarWarsService {

    private StarWarsAPI starWarsAPI;

    public StarWarsService(){
        starWarsAPI = initStarWarsAPI();
    }

    private StarWarsAPI initStarWarsAPI(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://swapi.dev/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(StarWarsAPI.class);
    }
   public People getPeople(String code){

        try {
            Call<People> cuerpo = starWarsAPI.people(code);
            People people = cuerpo.execute().body();
            return people;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    public Planet getPlanet(String code){

        try{
            Call<Planet> cuerpo = starWarsAPI.planet(code);
            Planet planet = cuerpo.execute().body();

            return planet;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
//C:\Users\Alejandra G\OneDrive\Escritorio\SW-BD
//mvn clean install
//mvn exec:java -Dexec.args="people 1"