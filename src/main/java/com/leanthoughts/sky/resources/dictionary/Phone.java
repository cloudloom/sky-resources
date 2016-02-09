package com.leanthoughts.sky.resources.dictionary;

/**
 * @author ffl
 * @since 11-04-2014
 */
public interface Phone {
	String getNumber();

	String getExtension();

	PhoneType getPhoneType();

	boolean isDefaultPhone();
}
