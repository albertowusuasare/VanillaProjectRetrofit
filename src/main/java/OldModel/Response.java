package OldModel;


import OldModel.Interface.MealPeriod;
import com.google.gson.annotations.SerializedName;

/**
 * Created by albertowusu-asare on 9/13/15.
 */
public class Response {

    @SerializedName("BREAKFAST")
    private Breakfast breakfast;

    private Lunch LUNCH;

    private Dinner DINNER;
    boolean passover ;

    Response(Breakfast food,Lunch lunch,Dinner dinner,boolean passover){
        this.breakfast = breakfast;
        this.LUNCH = lunch;
        this.DINNER = dinner;
        this.passover =passover;
    }
}
