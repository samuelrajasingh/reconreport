package com.myspring.reconreport.model.temp;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@ToString
public class  Event {

    @NotEmpty(message = "taskId cannot be null or empty")
    @NotBlank(message = "taskId cannot be null or whitespace")
    @NonNull
    private String taskId;
    @NotEmpty(message = "eventId cannot be null or empty")
    @NotBlank(message = "eventId cannot be null or whitespace")
    @NonNull
    private String eventId;
    private String priority;
    private String rackId;
    private String sensorLabel;
    private String eventTimestamp;
    @NotEmpty(message = "countryCode cannot be null or empty")
    @NotBlank(message = "countryCode cannot be null or whitespace")
    @NonNull
    private String countryCode;
    @NotEmpty(message = "queueNumber cannot be null or empty")
    @NotBlank(message = "queueNumber cannot be null or whitespace")
    @NonNull
    private String queueNumber;
    private String alertMsg;
    private String timeZone;
    @NonNull
    private Integer storeNumber;

}
