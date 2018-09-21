package com.bdm.bpmshore.bdm.domain;

public class Address {

    private String streetAddressLine;
    private String city;
    private String state;
    private String postalCode;
    private String countryCode;
    private String countryCodeSystem;

    public Address(String streetAddressLine, String city, String state, String postalCode, String countryCode, String countryCodeSystem) {
        this.streetAddressLine = streetAddressLine;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.countryCode = countryCode;
        this.countryCodeSystem = countryCodeSystem;
    }

    public String getStreetAddressLine() {
        return streetAddressLine;
    }

    public void setStreetAddressLine(String streetAddressLine) {
        this.streetAddressLine = streetAddressLine;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryCodeSystem() {
        return countryCodeSystem;
    }

    public void setCountryCodeSystem(String countryCodeSystem) {
        this.countryCodeSystem = countryCodeSystem;
    }
}
