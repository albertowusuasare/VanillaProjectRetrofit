package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by albertowusu-asare on 9/7/15.
 */
public class MealPeriod {

    private String mealPeriodName ;
    private List<Station> availableStations ;

    public MealPeriod(String mealPeriodName,List<Station> availableStations){
        this.mealPeriodName =mealPeriodName;
        this.availableStations = availableStations;
    }

    public MealPeriod(){
        this.mealPeriodName = null;
        this.availableStations = new ArrayList<>();
    }

    public List<Station> getStations() { return this.availableStations;}
    public void setStations(List<Station> availableStations)
    {this.availableStations =availableStations;}

    public String getMealPeriodName() {return this.mealPeriodName;}
    public void setMealPeriodName(String periodName){this.mealPeriodName = periodName;}
}
