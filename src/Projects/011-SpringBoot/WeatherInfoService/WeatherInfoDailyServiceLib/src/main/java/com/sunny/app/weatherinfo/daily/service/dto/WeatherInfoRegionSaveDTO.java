package com.sunny.app.weatherinfo.daily.service.dto;

import com.eager.ieu.weatherinfo.daily.data.entity.PlaceInfoRegion;
import com.fasterxml.jackson.annotation.JsonInclude;

public class WeatherInfoRegionSaveDTO {
    public double longitude;
    public String observation;
    public String icao;
    public String clouds;
    public String dewPoint;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String cloudsCode;
    public String dateTime;
    public String temperature;
    public int humidity;
    public String stationName;
    public String weatherCondition;
    public int windDirection;
    public String windSpeed;
    public double latitude;
    public PlaceInfoRegion placeInfoRegion;
}
