package com.leanthoughts.sky.resources;

/**
 * Created by sadath on 01-Jan-2016.
 */
public class PlaneResource extends BaseResource {
    private String type;
    private int maxEconomyClass;
    private int maxBusinessClass;
    private int maxFirstClass;
    private double avgConsumption;
    private String unitFuelConsumption;
    private double maxFuelCapacity;
    private String unitFuel;
    private double weight;
    private String unitWeight;
    private int span;
    private int lengthPlane;
    private String unitLength;
    private int speed;
    private String unitSpeed;
    private String manufacturer;
    private AirlineResource owner;

    public PlaneResource() {
    }

    public String getType() {
        return this.type;
    }

    public int getMaxEconomyClass() {
        return this.maxEconomyClass;
    }

    public int getMaxBusinessClass() {
        return this.maxBusinessClass;
    }

    public int getMaxFirstClass() {
        return this.maxFirstClass;
    }

    public double getAvgConsumption() {
        return this.avgConsumption;
    }

    public String getUnitFuelConsumption() {
        return this.unitFuelConsumption;
    }

    public double getMaxFuelCapacity() {
        return this.maxFuelCapacity;
    }

    public String getUnitFuel() {
        return this.unitFuel;
    }

    public double getWeight() {
        return this.weight;
    }

    public String getUnitWeight() {
        return this.unitWeight;
    }

    public int getSpan() {
        return this.span;
    }

    public int getLengthPlane() {
        return this.lengthPlane;
    }

    public String getUnitLength() {
        return this.unitLength;
    }

    public int getSpeed() {
        return this.speed;
    }

    public String getUnitSpeed() {
        return this.unitSpeed;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public AirlineResource getOwner() {
        return this.owner;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMaxEconomyClass(int maxEconomyClass) {
        this.maxEconomyClass = maxEconomyClass;
    }

    public void setMaxBusinessClass(int maxBusinessClass) {
        this.maxBusinessClass = maxBusinessClass;
    }

    public void setMaxFirstClass(int maxFirstClass) {
        this.maxFirstClass = maxFirstClass;
    }

    public void setAvgConsumption(double avgConsumption) {
        this.avgConsumption = avgConsumption;
    }

    public void setUnitFuelConsumption(String unitFuelConsumption) {
        this.unitFuelConsumption = unitFuelConsumption;
    }

    public void setMaxFuelCapacity(double maxFuelCapacity) {
        this.maxFuelCapacity = maxFuelCapacity;
    }

    public void setUnitFuel(String unitFuel) {
        this.unitFuel = unitFuel;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setUnitWeight(String unitWeight) {
        this.unitWeight = unitWeight;
    }

    public void setSpan(int span) {
        this.span = span;
    }

    public void setLengthPlane(int lengthPlane) {
        this.lengthPlane = lengthPlane;
    }

    public void setUnitLength(String unitLength) {
        this.unitLength = unitLength;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setUnitSpeed(String unitSpeed) {
        this.unitSpeed = unitSpeed;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setOwner(AirlineResource owner) {
        this.owner = owner;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof PlaneResource)) return false;
        final PlaneResource other = (PlaneResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$type = this.type;
        final Object other$type = other.type;
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        if (this.maxEconomyClass != other.maxEconomyClass) return false;
        if (this.maxBusinessClass != other.maxBusinessClass) return false;
        if (this.maxFirstClass != other.maxFirstClass) return false;
        if (Double.compare(this.avgConsumption, other.avgConsumption) != 0) return false;
        final Object this$unitFuelConsumption = this.unitFuelConsumption;
        final Object other$unitFuelConsumption = other.unitFuelConsumption;
        if (this$unitFuelConsumption == null ? other$unitFuelConsumption != null : !this$unitFuelConsumption.equals(other$unitFuelConsumption))
            return false;
        if (Double.compare(this.maxFuelCapacity, other.maxFuelCapacity) != 0) return false;
        final Object this$unitFuel = this.unitFuel;
        final Object other$unitFuel = other.unitFuel;
        if (this$unitFuel == null ? other$unitFuel != null : !this$unitFuel.equals(other$unitFuel)) return false;
        if (Double.compare(this.weight, other.weight) != 0) return false;
        final Object this$unitWeight = this.unitWeight;
        final Object other$unitWeight = other.unitWeight;
        if (this$unitWeight == null ? other$unitWeight != null : !this$unitWeight.equals(other$unitWeight))
            return false;
        if (this.span != other.span) return false;
        if (this.lengthPlane != other.lengthPlane) return false;
        final Object this$unitLength = this.unitLength;
        final Object other$unitLength = other.unitLength;
        if (this$unitLength == null ? other$unitLength != null : !this$unitLength.equals(other$unitLength))
            return false;
        if (this.speed != other.speed) return false;
        final Object this$unitSpeed = this.unitSpeed;
        final Object other$unitSpeed = other.unitSpeed;
        if (this$unitSpeed == null ? other$unitSpeed != null : !this$unitSpeed.equals(other$unitSpeed)) return false;
        final Object this$manufacturer = this.manufacturer;
        final Object other$manufacturer = other.manufacturer;
        if (this$manufacturer == null ? other$manufacturer != null : !this$manufacturer.equals(other$manufacturer))
            return false;
        final Object this$owner = this.owner;
        final Object other$owner = other.owner;
        if (this$owner == null ? other$owner != null : !this$owner.equals(other$owner)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $type = this.type;
        result = result * PRIME + ($type == null ? 0 : $type.hashCode());
        result = result * PRIME + this.maxEconomyClass;
        result = result * PRIME + this.maxBusinessClass;
        result = result * PRIME + this.maxFirstClass;
        final long $avgConsumption = Double.doubleToLongBits(this.avgConsumption);
        result = result * PRIME + (int) ($avgConsumption >>> 32 ^ $avgConsumption);
        final Object $unitFuelConsumption = this.unitFuelConsumption;
        result = result * PRIME + ($unitFuelConsumption == null ? 0 : $unitFuelConsumption.hashCode());
        final long $maxFuelCapacity = Double.doubleToLongBits(this.maxFuelCapacity);
        result = result * PRIME + (int) ($maxFuelCapacity >>> 32 ^ $maxFuelCapacity);
        final Object $unitFuel = this.unitFuel;
        result = result * PRIME + ($unitFuel == null ? 0 : $unitFuel.hashCode());
        final long $weight = Double.doubleToLongBits(this.weight);
        result = result * PRIME + (int) ($weight >>> 32 ^ $weight);
        final Object $unitWeight = this.unitWeight;
        result = result * PRIME + ($unitWeight == null ? 0 : $unitWeight.hashCode());
        result = result * PRIME + this.span;
        result = result * PRIME + this.lengthPlane;
        final Object $unitLength = this.unitLength;
        result = result * PRIME + ($unitLength == null ? 0 : $unitLength.hashCode());
        result = result * PRIME + this.speed;
        final Object $unitSpeed = this.unitSpeed;
        result = result * PRIME + ($unitSpeed == null ? 0 : $unitSpeed.hashCode());
        final Object $manufacturer = this.manufacturer;
        result = result * PRIME + ($manufacturer == null ? 0 : $manufacturer.hashCode());
        final Object $owner = this.owner;
        result = result * PRIME + ($owner == null ? 0 : $owner.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof PlaneResource;
    }

    public String toString() {
        return "com.leanthoughts.sky.resources.PlaneResource(type=" + this.type + ", maxEconomyClass=" + this.maxEconomyClass + ", maxBusinessClass=" + this.maxBusinessClass + ", maxFirstClass=" + this.maxFirstClass + ", avgConsumption=" + this.avgConsumption + ", unitFuelConsumption=" + this.unitFuelConsumption + ", maxFuelCapacity=" + this.maxFuelCapacity + ", unitFuel=" + this.unitFuel + ", weight=" + this.weight + ", unitWeight=" + this.unitWeight + ", span=" + this.span + ", lengthPlane=" + this.lengthPlane + ", unitLength=" + this.unitLength + ", speed=" + this.speed + ", unitSpeed=" + this.unitSpeed + ", manufacturer=" + this.manufacturer + ", owner=" + this.owner + ")";
    }
}
