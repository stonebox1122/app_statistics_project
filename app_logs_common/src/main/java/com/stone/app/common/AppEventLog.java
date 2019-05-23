package com.stone.app.common;

import java.util.Map;

/**
 * @author stone
 * @date 2019/5/23 08:43
 * description
 */
public class AppEventLog extends AppBaseLog {

    private String eventId;                         //事件唯一标识
    private Long eventDurationSecs;                 //事件持续时长
    private Map<String,String> paramKeyValueMap;    //参数名/值对

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public Long getEventDurationSecs() {
        return eventDurationSecs;
    }

    public void setEventDurationSecs(Long eventDurationSecs) {
        this.eventDurationSecs = eventDurationSecs;
    }

    public Map<String, String> getParamKeyValueMap() {
        return paramKeyValueMap;
    }

    public void setParamKeyValueMap(Map<String, String> paramKeyValueMap) {
        this.paramKeyValueMap = paramKeyValueMap;
    }
}
