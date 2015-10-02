package ModelTest;

import OldModel.Breakfast;
import OldModel.Dinner;
import OldModel.Interface.MealPeriod;
import OldModel.Lunch;
import org.junit.*;
/**
 * Created by albertowusu-asare on 9/18/15.
 */
public class OldModelTest {

    private Breakfast breakfast;
    private Lunch lunch;
    private Dinner  dinner;

    @Before
    public void initialisation(){
        breakfast = new Breakfast("breakfast");
        lunch = new Lunch("lunch");
        dinner = new Dinner("dinner");
    }
    @Test
    public void testBreakfast(){

    }
    public void testLunch(){

    }

    public void testDinner(){

    }

}
