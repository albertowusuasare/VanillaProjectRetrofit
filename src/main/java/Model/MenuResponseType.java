package Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by albertowusu-asare on 9/7/15.
 */
public class MenuResponseType {

    private List<MealPeriod> mealPeriods;

    public MenuResponseType(){
        this.mealPeriods = new ArrayList();
    }

    public List<MealPeriod> getMealPeriods(){return this.mealPeriods;}
    public void setMealPeriods(List<MealPeriod> mealPeriods) {
        this.mealPeriods = mealPeriods;
    }


/*
    public MenuResponseType(MealPeriod breakfast, MealPeriod lunch, MealPeriod dinner){
        this.BREAKFAST = breakfast;
        this.LUNCH = lunch;
        this.DINNER = dinner;
    }

    public MenuResponseType(){
        this.BREAKFAST = this.LUNCH = this.DINNER = null;
    }

    public void setBreakfast(MealPeriod breakfast){
        this.BREAKFAST = breakfast;
    }

    public MealPeriod getBreakfast(){return this.BREAKFAST;}

    public void setLunch(MealPeriod lunch) {this.LUNCH = lunch;}
    public MealPeriod getLunch(){return this.LUNCH;}

    public void setDinner(MealPeriod dinner){this.DINNER = dinner;}
    public MealPeriod getDinner(){ return this.DINNER;}
*/

}
