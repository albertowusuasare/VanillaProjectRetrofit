package OldModel;

import OldModel.Interface.MealPeriod;
import OldModel.Interface.Station;
import com.google.gson.annotations.SerializedName;

import java.util.EnumMap;
import java.util.List;

/**
 * Created by albertowusu-asare on 9/17/15.
 */
public class Dinner implements MealPeriod {

    private String mealPeriodName;
    @SerializedName("DESSERTS                 ")
    private List<Entree> desserts;
    @SerializedName("BREADS                   ")
    private List<Entree> breads;
    @SerializedName("SALADS                   ")
    private List<Entree> salads;
    @SerializedName("VEGAN SPECIAL")
    private List<Entree> veganSpecial;
    @SerializedName("STIR FRY STATION")
    private List<Entree> stirFryStation;
    @SerializedName("SOUPS                    ")
    private List<Entree> soups;
    @SerializedName("ROLLER GRILL")
    private List<Entree> rollerGrill;
    @SerializedName("PLAT DU JOUR")
    private List<Entree>  platDuJour;
    @SerializedName("PIZZA PARLOR")
    private List<Entree> pizzaParlor;
    @SerializedName("HUMMUS BAR")
    private List<Entree> hummusBar;
    @SerializedName("HONOR G GRILL")
    private List<Entree>  honorGGrill;
    @SerializedName("HALAL")
    private List<Entree> halal;
    @SerializedName("GLUTEN FREE")
    private List<Entree> gluttenFree;
    EnumMap<Utility.Stations, List<Entree>> stations;

    public Dinner(){
    }
    public Dinner(String dinner) {
        this.mealPeriodName = dinner;
    }



   // @Override
    public void setMealPeriodName(String mealPeriodName) {this.mealPeriodName = mealPeriodName;}

   // @Override
    public String getMealPeriodName() {return this.mealPeriodName;}

   // @Override
    public void setStations(EnumMap<Utility.Stations,List<Entree>> stations) {this.stations = stations;}

   // @Override
    public EnumMap<Utility.Stations,List<Entree>> getStations() {return populateStations();}

    public EnumMap<Utility.Stations,List<Entree>> populateStations(){
        this.stations.put(Utility.Stations.DESSERTS,this.desserts);
        this.stations.put(Utility.Stations.BREADS, this.breads);
        this.stations.put(Utility.Stations.SALADS, this.salads);
        this.stations.put(Utility.Stations.VEGAN_SPECIAL, this.veganSpecial);
        this.stations.put(Utility.Stations.STIR_FRY_STATION, this.stirFryStation);
        this.stations.put(Utility.Stations.SOUPS, this.soups);
        this.stations.put(Utility.Stations.ROLLER_GRILL, this.rollerGrill);
        this.stations.put(Utility.Stations.PLAT_DU_JOUR, this.platDuJour);
        this.stations.put(Utility.Stations.PIZZA_PARLOR, this.pizzaParlor);
        this.stations.put(Utility.Stations.HUMMUS_BAR, this.hummusBar);
        this.stations.put(Utility.Stations.HONOR_G_GRILL, this.honorGGrill);
        this.stations.put(Utility.Stations.HALAL, this.halal);
        this.stations.put(Utility.Stations.GLUTTEN_FREE,this.gluttenFree);
        return this.stations;
    }
}
