package com.leanthoughts.sky.resources.dictionary;


/**
 * @author ffl
 * @since 11-04-2014
 */
public interface Address {
	String getName();

	String getBuilding();

	String getStreet();

	String getRegion();

	String getCity();

	String getDistrict();

	String getState();

	String getCountry();

	String getZip();

	AddressType getAddressType();

	boolean isDefaultAddress();
}
