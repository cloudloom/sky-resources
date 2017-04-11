package com.leanthoughts.sky.resources.ebill;

import com.leanthoughts.sky.resources.email.EmailNotification;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.Map;

/**
 * Created by fahadfazil on 03/03/17.
 */
@ToString
@Getter
@Setter
@AllArgsConstructor
public class Ebill extends EmailNotification{
    public Ebill(String tenantId, String accountId, String templateId, String subject, String cc, String to,List<EbillLineItem> lineitems,String billno,String billdate,String passengerName,String flightno,String seatNo,String pnr,String tin,String empid,Double orderTotal) {
        super(tenantId, accountId, templateId, subject, cc, to);
        this.content.put("lineitems",lineitems);
        this.content.put("billno",billno);
        this.content.put("billdate",billdate);
        this.content.put("passengerName",passengerName);
        this.content.put("flightno",flightno);
        this.content.put("seatNo",seatNo);
        this.content.put("pnr",pnr);
        this.content.put("tin",tin);
        this.content.put("empid",empid);
        this.content.put("orderTotal",orderTotal);
    }

}
