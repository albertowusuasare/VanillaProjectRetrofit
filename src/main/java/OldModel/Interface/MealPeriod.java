package OldModel.Interface;

import OldModel.Entree;
import OldModel.Utility;

import java.util.EnumMap;
import java.util.List;

/**
 * Created by albertowusu-asare on 9/16/15.
 */
public interface MealPeriod {
    void setMealPeriodName(String mealPeriodName);
    String getMealPeriodName();
    void setStations(EnumMap<Utility.Stations,List<Entree>> stations);
    EnumMap<Utility.Stations,List<Entree>> getStations ();
}
