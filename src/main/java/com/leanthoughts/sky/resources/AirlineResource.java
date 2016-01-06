package com.leanthoughts.sky.resources;

/**
 * Created by sadath on 01-Jan-2016.
 */
public class AirlineResource extends BaseResource{
    private String name;
    private String code;
    private String currency;
    private String url;

    public AirlineResource() {
    }

    public String getName() {
        return this.name;
    }

    public String getCode() {
        return this.code;
    }

    public String getCurrency() {
        return this.currency;
    }

    public String getUrl() {
        return this.url;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof AirlineResource)) return false;
        final AirlineResource other = (AirlineResource) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.name;
        final Object other$name = other.name;
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$code = this.code;
        final Object other$code = other.code;
        if (this$code == null ? other$code != null : !this$code.equals(other$code)) return false;
        final Object this$currency = this.currency;
        final Object other$currency = other.currency;
        if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) return false;
        final Object this$url = this.url;
        final Object other$url = other.url;
        if (this$url == null ? other$url != null : !this$url.equals(other$url)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.name;
        result = result * PRIME + ($name == null ? 0 : $name.hashCode());
        final Object $code = this.code;
        result = result * PRIME + ($code == null ? 0 : $code.hashCode());
        final Object $currency = this.currency;
        result = result * PRIME + ($currency == null ? 0 : $currency.hashCode());
        final Object $url = this.url;
        result = result * PRIME + ($url == null ? 0 : $url.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof AirlineResource;
    }

    public String toString() {
        return "com.leanthoughts.sky.resources.AirlineResource(name=" + this.name + ", code=" + this.code + ", currency=" + this.currency + ", url=" + this.url + ")";
    }
}