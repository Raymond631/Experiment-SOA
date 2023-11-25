package com.example.exp02.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author cEV
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Borrow {
    private String id;

    private String personId;

    private String thingId;

    private int thingQuantity;

    private LocalDateTime borrowTime;

    private LocalDateTime latestReturnTime;

    private Boolean isReturn;

    private LocalDateTime actualReturnTime;

}
