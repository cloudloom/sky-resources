package com.leanthoughts.sky.resources.ebill;

import lombok.*;

/**
 * Created by fahadfazil on 03/03/17.
 */
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EbillLineItem {
    private String productName;
    private Integer qty;
    private Double price;
    private Double total;
}
