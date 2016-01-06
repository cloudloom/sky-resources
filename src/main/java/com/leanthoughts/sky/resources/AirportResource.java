package com.leanthoughts.sky.resources;

/**
 * Created by sadath on 01-Jan-2016.
 */
public class AirportResource extends BaseResource {
    private String fs;
    private String iata;
    private String icao;
    private String name;
    private String street;
    private String city;
    private String cityCode;
    private String countryCode;
    private String countryName;
    private String regionName;
    private String timeZoneRegionName;
    private String localTime;
    private Double utcOffsetHours;
    private Double latitude;
    private Double longitude;
    private Integer elevationFeet;
    private Integer classification;
    private Boolean active;
    private String delayIndexUrl;
    private String weatherUrl;

    public AirportResource() {
    }

    public String getFs() {
        return this.fs;
    }

    public String getIata() {
        return this.iata;
    }

    public String getIcao() {
        return this.icao;
    }

    public String getName() {
        return this.name;
    }

    public String getStreet() {
        return this.street;
    }

    public String getCity() {
        return this.city;
    }

    public String getCityCode() {
        return this.cityCode;
    }

    public String getCountryCode() {
        return this.countryCode;
    }

    public String getCountryName() {
        return this.countryName;
    }

    public String getRegionName() {
        return this.regionName;
    }

    public String getTimeZoneRegionName() {
        return this.timeZoneRegionName;
    }

    public String getLocalTime() {
        return this.localTime;
    }

    public Double getUtcOffsetHours() {
        return this.utcOffsetHours;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public Integer getElevationFeet() {
        return this.elevationFeet;
    }

    public Integer getClassification() {
        return this.classification;
    }

    public Boolean getActive() {
        return this.active;
    }

    public String getDelayIndexUrl() {
        return this.delayIndexUrl;
    }

    public String getWeatherUrl() {
        return this.weatherUrl;
    }

    public void setFs(String fs) {
        this.fs = fs;
    }

    public void setIata(String iata) {
        this.iata = iata;
    }

    public void setIcao(String icao) {
        this.icao = icao;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public void setTimeZoneRegionName(String timeZoneRegionName) {
        this.timeZoneRegionName = timeZoneRegionName;
    }

    public void setLocalTime(String localTime) {
        this.localTime = localTime;
    }

    public void setUtcOffsetHours(Double utcOffsetHours) {
        this.utcOffsetHours = utcOffsetHours;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public void setElevationFeet(Integer elevationFeet) {
        this.elevationFeet = elevationFeet;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setDelayIndexUrl(String delayIndexUrl) {
        this.delayIndexUrl = delayIndexUrl;
    }

    public void setWeatherUrl(String weatherUrl) {
        this.weatherUrl = weatherUrl;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof AirportResource)) return false;
        final AirportResource other = (AirportResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$fs = this.fs;
        final Object other$fs = other.fs;
        if (this$fs == null ? other$fs != null : !this$fs.equals(other$fs)) return false;
        final Object this$iata = this.iata;
        final Object other$iata = other.iata;
        if (this$iata == null ? other$iata != null : !this$iata.equals(other$iata)) return false;
        final Object this$icao = this.icao;
        final Object other$icao = other.icao;
        if (this$icao == null ? other$icao != null : !this$icao.equals(other$icao)) return false;
        final Object this$name = this.name;
        final Object other$name = other.name;
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$street = this.street;
        final Object other$street = other.street;
        if (this$street == null ? other$street != null : !this$street.equals(other$street)) return false;
        final Object this$city = this.city;
        final Object other$city = other.city;
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) return false;
        final Object this$cityCode = this.cityCode;
        final Object other$cityCode = other.cityCode;
        if (this$cityCode == null ? other$cityCode != null : !this$cityCode.equals(other$cityCode)) return false;
        final Object this$countryCode = this.countryCode;
        final Object other$countryCode = other.countryCode;
        if (this$countryCode == null ? other$countryCode != null : !this$countryCode.equals(other$countryCode))
            return false;
        final Object this$countryName = this.countryName;
        final Object other$countryName = other.countryName;
        if (this$countryName == null ? other$countryName != null : !this$countryName.equals(other$countryName))
            return false;
        final Object this$regionName = this.regionName;
        final Object other$regionName = other.regionName;
        if (this$regionName == null ? other$regionName != null : !this$regionName.equals(other$regionName))
            return false;
        final Object this$timeZoneRegionName = this.timeZoneRegionName;
        final Object other$timeZoneRegionName = other.timeZoneRegionName;
        if (this$timeZoneRegionName == null ? other$timeZoneRegionName != null : !this$timeZoneRegionName.equals(other$timeZoneRegionName))
            return false;
        final Object this$localTime = this.localTime;
        final Object other$localTime = other.localTime;
        if (this$localTime == null ? other$localTime != null : !this$localTime.equals(other$localTime)) return false;
        final Object this$utcOffsetHours = this.utcOffsetHours;
        final Object other$utcOffsetHours = other.utcOffsetHours;
        if (this$utcOffsetHours == null ? other$utcOffsetHours != null : !this$utcOffsetHours.equals(other$utcOffsetHours))
            return false;
        final Object this$latitude = this.latitude;
        final Object other$latitude = other.latitude;
        if (this$latitude == null ? other$latitude != null : !this$latitude.equals(other$latitude)) return false;
        final Object this$longitude = this.longitude;
        final Object other$longitude = other.longitude;
        if (this$longitude == null ? other$longitude != null : !this$longitude.equals(other$longitude)) return false;
        final Object this$elevationFeet = this.elevationFeet;
        final Object other$elevationFeet = other.elevationFeet;
        if (this$elevationFeet == null ? other$elevationFeet != null : !this$elevationFeet.equals(other$elevationFeet))
            return false;
        final Object this$classification = this.classification;
        final Object other$classification = other.classification;
        if (this$classification == null ? other$classification != null : !this$classification.equals(other$classification))
            return false;
        final Object this$active = this.active;
        final Object other$active = other.active;
        if (this$active == null ? other$active != null : !this$active.equals(other$active)) return false;
        final Object this$delayIndexUrl = this.delayIndexUrl;
        final Object other$delayIndexUrl = other.delayIndexUrl;
        if (this$delayIndexUrl == null ? other$delayIndexUrl != null : !this$delayIndexUrl.equals(other$delayIndexUrl))
            return false;
        final Object this$weatherUrl = this.weatherUrl;
        final Object other$weatherUrl = other.weatherUrl;
        if (this$weatherUrl == null ? other$weatherUrl != null : !this$weatherUrl.equals(other$weatherUrl))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $fs = this.fs;
        result = result * PRIME + ($fs == null ? 0 : $fs.hashCode());
        final Object $iata = this.iata;
        result = result * PRIME + ($iata == null ? 0 : $iata.hashCode());
        final Object $icao = this.icao;
        result = result * PRIME + ($icao == null ? 0 : $icao.hashCode());
        final Object $name = this.name;
        result = result * PRIME + ($name == null ? 0 : $name.hashCode());
        final Object $street = this.street;
        result = result * PRIME + ($street == null ? 0 : $street.hashCode());
        final Object $city = this.city;
        result = result * PRIME + ($city == null ? 0 : $city.hashCode());
        final Object $cityCode = this.cityCode;
        result = result * PRIME + ($cityCode == null ? 0 : $cityCode.hashCode());
        final Object $countryCode = this.countryCode;
        result = result * PRIME + ($countryCode == null ? 0 : $countryCode.hashCode());
        final Object $countryName = this.countryName;
        result = result * PRIME + ($countryName == null ? 0 : $countryName.hashCode());
        final Object $regionName = this.regionName;
        result = result * PRIME + ($regionName == null ? 0 : $regionName.hashCode());
        final Object $timeZoneRegionName = this.timeZoneRegionName;
        result = result * PRIME + ($timeZoneRegionName == null ? 0 : $timeZoneRegionName.hashCode());
        final Object $localTime = this.localTime;
        result = result * PRIME + ($localTime == null ? 0 : $localTime.hashCode());
        final Object $utcOffsetHours = this.utcOffsetHours;
        result = result * PRIME + ($utcOffsetHours == null ? 0 : $utcOffsetHours.hashCode());
        final Object $latitude = this.latitude;
        result = result * PRIME + ($latitude == null ? 0 : $latitude.hashCode());
        final Object $longitude = this.longitude;
        result = result * PRIME + ($longitude == null ? 0 : $longitude.hashCode());
        final Object $elevationFeet = this.elevationFeet;
        result = result * PRIME + ($elevationFeet == null ? 0 : $elevationFeet.hashCode());
        final Object $classification = this.classification;
        result = result * PRIME + ($classification == null ? 0 : $classification.hashCode());
        final Object $active = this.active;
        result = result * PRIME + ($active == null ? 0 : $active.hashCode());
        final Object $delayIndexUrl = this.delayIndexUrl;
        result = result * PRIME + ($delayIndexUrl == null ? 0 : $delayIndexUrl.hashCode());
        final Object $weatherUrl = this.weatherUrl;
        result = result * PRIME + ($weatherUrl == null ? 0 : $weatherUrl.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof AirportResource;
    }

    public String toString() {
        return "com.leanthoughts.sky.resources.AirportResource(fs=" + this.fs + ", iata=" + this.iata + ", icao=" + this.icao + ", name=" + this.name + ", street=" + this.street + ", city=" + this.city + ", cityCode=" + this.cityCode + ", countryCode=" + this.countryCode + ", countryName=" + this.countryName + ", regionName=" + this.regionName + ", timeZoneRegionName=" + this.timeZoneRegionName + ", localTime=" + this.localTime + ", utcOffsetHours=" + this.utcOffsetHours + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", elevationFeet=" + this.elevationFeet + ", classification=" + this.classification + ", active=" + this.active + ", delayIndexUrl=" + this.delayIndexUrl + ", weatherUrl=" + this.weatherUrl + ")";
    }
}