package com.perou.quentin.quentinauperou;

/**
 * Created by quentin on 01/09/2017.
 */

public enum WeatherValues {
    SUNNY("Soleil", "sunny"),
    CLEAR_NIGHT("Nuit claire", "clear-night"),
    CLOUDY("Nuageux", "cloudy"),
    HAZY("Brouillard", "hazy"),
    MOST_CLOUDY_DAY("Partiellement nuageux", "most-cloudy-day"),
    MOST_CLOUDY_NIGHT("Nuit part. nuageuse", "most-cloudy-night"),
    RAIN_SNOW("Mélange pluie & neige", "rain-snow"),
    RAINY("Pluvieux", "rainy"),
    SHOWCASE("Irlande", "showcase"),
    SNOWY("Neigeux", "snowy"),
    STORMY("Tempête", "storm"),
    THUNDER("Foudre", "thunder"),
    UNKNOWN("Inconnu", "unknown"),
    WINDY("Venteux", "windy");

    public final String displayVal;
    public final String value;

    WeatherValues(String displayVal, String value) {
        this.displayVal = displayVal;
        this.value = value;
    }

    public static String getValue(String displayVal) {
        for (WeatherValues wv : WeatherValues.values()) {
            if (displayVal == wv.displayVal) {
                return wv.value;
            }
        }
        return "";
    }
}
