package com.leanthoughts.sky.resources.partner;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.leanthoughts.sky.resources.BaseResource;

import java.util.Date;

/**
 * Created by sadath on 22-Jun-2015.
 */
//@CompareDates(before = "validFrom", after = "validTill")
public class DefaultValidityResource extends BaseResource {
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private Date validFrom;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss")
    private Date validTill;

    public Date getValidTill() {
        return validTill;
    }

    public void setValidTill(Date validTill) {
        this.validTill = validTill;
    }

    public Date getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(Date validFrom) {
        this.validFrom = validFrom;
    }
}