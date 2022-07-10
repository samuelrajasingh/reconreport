package com.myspring.reconreport.model.temp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class TemperatureAlarm {

    private String version;
    private Event event;

}
