package cn.cout.newsapi.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class ResultVo {

    /**
     * 返回码
     */
    private String resultCode;
    /**
     * 返回消息
     */
    private String resultMsg;

    /**
     * 返回体
     */
    private Object resultData;

    /**
     * 返回时间戳
     */
    @JsonFormat(pattern = "yyyyMMddHHmmss", timezone="GMT+8")
    private Date resultTime;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }

    public Object getResultData() {
        return resultData;
    }

    public void setResultData(Object resultData) {
        this.resultData = resultData;
    }

    public Date getResultTime() {
        return resultTime;
    }

    public void setResultTime(Date resultTime) {
        this.resultTime = resultTime;
    }
}
