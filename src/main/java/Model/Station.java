package Model;

import OldModel.Entree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by albertowusu-asare on 9/7/15.
 */
public class Station {

//    private String stationName;
    private ArrayList<Entree> entreeItems ;

    public Station(String stationName, ArrayList<Entree> foodItems){
        this.entreeItems = foodItems;
//        this.stationName = stationName;
    }

    public Station(String stationName){
        entreeItems = new ArrayList();
//        this.stationName = stationName;
    }


//    public void setStationName(String stationName){this.stationName= stationName;}
//    public String getStationName(){return this.stationName;}


    public List<Entree> getFoodItems() {
        return this.entreeItems;
    }

    public void setFoodItems(ArrayList<Entree> foodItems){
        this.entreeItems = foodItems;
    }

}
