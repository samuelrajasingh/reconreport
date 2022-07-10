package com.myspring.reconreport.commons;

public class Constants {
    public static final String COMMA=",";
    public static final String EMPTY_STRING="";
    public static final String ALARM = "alarm";
    public static final String WORK_ORDER = "workorder";
    public static final String WORK_ORDER_TIMER = "workorder-timer";
    public static final String END_TASK = "endtask";
    public static final String WO_COLLECTION = "emergency-alarms";
    public static final String TEMP_COLLECTION = "non-emergency-alarms";
    public static final String DM_VERTICAL_ID = "fixit";
    public static final String NM_USER_ID = "NMCONSUMER";
    public static final String DIRECT_ME_TITLE = "Cooler out of temp!";
    public static final String DIRECT_ME_VERTICAL_LABEL = "Refrigeration_Alarms";
    public static final String RACK_ID = "rack_id";
    public static final String TASK_LIST = "task_list";
    public static final String SENSOR_LABEL = "sensor_label";
    public static final String ALARM_TYPE = "alarm_type";
    public static final String TASK_ID = "task_id";
    public static final String EVENT_ID = "event_id";
    public static final String QUEUE_NUMBER = "queue_number";
    public static final String EARLIEST_START_TIME = "earliest_start_time";
    public static final String LATEST_END_TIME = "latest_end_time";
    public static final String EXPECTED_DURATION = "expected_duration_secs";
    public static final String PRIORITY_WITHIN_CATEGORY = "priority_within_category";
    public static final String TASK_CATEGORY = "refrigeration_alarm";
    public static final String TASK_VERSION = "1.0";
    public static final String DEFAULT_ALARM_PRIORITY = "4";
    public static final String STORE_NO = "STORENBR";
    public static final String ALERT_MSG = "ALERTMSG";
    public static final String EVENT_TIMESTAMP = "EVENTTIMESTAMP";
    public static final String RACKID = "RACKID";
    public static final String WO_CREATE_TS = "WOCREATETS";
    public static final String Q1="Q1";
    public static final String Q2="Q2";
    public static final String EMERGENCY_ALARM="emergency_alarm";
    public static final String SENSORLABEL="SENSORLABEL";

    // Db constants
    public static final String ID_DOT_EVENT_ID = "_id.eventId";
    public static final String ID_DOT_TASK_ID = "_id.taskId";
    public static final String ID_DOT_WO_NO = "_id.woNO";
    public static final String SUMO_RESP = "sumoResp";
    public static final String DIRECT_ME_RESP = "directMeResp";
    public static final String NM_TASK_STATUS = "nmTaskStatus";
    public static final String TASK_RESOLVED_USERID = "taskResolvedBy.userId";
    public static final String TASK_RESOLVED_UPDATED_TS = "taskResolvedBy.updatedTs";
    public static final String STORE_NO_DB = "storeNum";
    public static final String COUNTRY_CODE = "countryCode";

    //sumo silent payload
    public static final String REFRIGERATION_ALARM = "refrigeration_alarm";
    public static final String SCREEN_ID = "screen_id";
    public static final String FIXIT_ALARMS_DETAILS = "fixIt.alarms.details";
    public static final String STORE = "store";
    public static final String TASKS = "tasks";
    public static final String OK = "ok";
    public static final String ALERT_ID = "alert_id";
    public static final String DM_API_SUCCESS_FLAG = "DM_API_SUCCESS_FLAG";
    public static final String MSG_RECEIVED_TS = "msgReceivedTs";
}
