package OldModel;

import OldModel.Interface.MealPeriod;
import OldModel.Interface.Station;
import com.google.gson.annotations.SerializedName;

import java.util.EnumMap;
import java.util.List;

/**
 * Created by albertowusu-asare on 9/16/15.
 */
public class Breakfast implements MealPeriod {

    private String mealPeriodName;
    @SerializedName("WAFFLE BAR")
    private List<Entree> waffleBar;
    @SerializedName("SMOOTHIE BAR")
    private List<Entree>  smoothieBar;
    @SerializedName("PLAT DU JOUR")
    private List<Entree> platDuJour;
    @SerializedName("GLUTEN FREE")
    private List<Entree> glutenFree;
    @SerializedName("EGG STATION")
    private List<Entree> eggStation;
    @SerializedName("BREAKFAST PASTRY")
    private List<Entree> breakfastPastry;

    private EnumMap<Utility.Stations,List<Entree>> stations;

    public Breakfast(String breakfast){
        this.mealPeriodName = breakfast;
    }

    public Breakfast(){
    }

    //@Override
    public void setMealPeriodName(String mealPeriodName) {
        this.mealPeriodName = mealPeriodName;
    }

   // @Override
    public String getMealPeriodName() {
        return mealPeriodName;
    }

   // @Override
    public void setStations(EnumMap<Utility.Stations,List<Entree>> stations) {
        this.stations = stations;
    }

   // @Override
    public EnumMap<Utility.Stations,List<Entree>> getStations() {
       return  populateStations();
    }

    private EnumMap<Utility.Stations, List<Entree>> populateStations(){
       // this.stations.put(Utility.Stations.WAFFLE_BAR,this.WAFFLE_BAR);
        this.stations.put(Utility.Stations.SMOOTHIE_BAR, this.smoothieBar);
        this.stations.put(Utility.Stations.PLAT_DU_JOUR, this.platDuJour);
        this.stations.put(Utility.Stations.GLUTTEN_FREE, this.glutenFree);
        this.stations.put(Utility.Stations.EGG_STATION, this.eggStation);
        this.stations.put(Utility.Stations.BREAKFAST_PASTRY, this.breakfastPastry);
        return this.stations;
    }

}
