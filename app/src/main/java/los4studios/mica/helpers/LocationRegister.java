package los4studios.mica.helpers;

import java.util.Date;

/**
 * Created by root on 26/04/17.
 */

public class LocationRegister {

    String lat,lon;

    boolean rape;

    public LocationRegister(String lat, String lon, boolean rape) {
        this.lat = lat;
        this.lon = lon;

        this.rape = rape;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }




    public boolean isRape() {
        return rape;
    }

    public void setRape(boolean rape) {
        this.rape = rape;
    }
}
