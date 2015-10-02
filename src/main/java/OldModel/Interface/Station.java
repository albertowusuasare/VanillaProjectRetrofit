package OldModel.Interface;

import OldModel.Entree;

import java.util.List;

/**
 * Created by albertowusu-asare on 9/16/15.
 */
public interface Station {
    void setEntrees(List<Entree> entrees);
    List<Entree> geEntrees();
    void setStaionName(String stationName);
    String getStationName();
}
