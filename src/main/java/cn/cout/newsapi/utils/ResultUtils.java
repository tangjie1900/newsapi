package cn.cout.newsapi.utils;

import cn.cout.newsapi.entity.ResultVo;

import java.util.Date;

public class ResultUtils {

    /**
     * 返回成功接口，带数据
     *
     * @param o
     * @return
     */
    public static ResultVo getSuccessResult(Object o) {
        ResultVo resultVo = new ResultVo();
        resultVo.setResultCode(ResultCode.SUCCESS_0);
        resultVo.setResultData(o);
        resultVo.setResultTime(new Date());
        return resultVo;
    }

    public static ResultVo getSuccessResult(Object o, String msg) {
        ResultVo resultVo = new ResultVo();
        resultVo.setResultCode(ResultCode.SUCCESS_0);
        resultVo.setResultData(o);
        resultVo.setResultMsg(msg);
        resultVo.setResultTime(new Date());
        return resultVo;
    }

    /**
     * 返回成功，不带数据
     *
     * @param resultMsg
     * @return
     */
    public static ResultVo getSuccessResult(String resultMsg) {
        ResultVo resultVo = new ResultVo();
        resultVo.setResultCode(ResultCode.SUCCESS_0);
        resultVo.setResultMsg(resultMsg);
        resultVo.setResultTime(new Date());
        return resultVo;
    }

    /**
     * 返回成功，不带数据
     *
     * @return
     */
    public static ResultVo getSuccessResult() {
        ResultVo resultVo = new ResultVo();
        resultVo.setResultCode(ResultCode.SUCCESS_0);
        resultVo.setResultTime(new Date());
        return resultVo;
    }

    /**
     * 返回失败
     *
     * @param resultMsg
     * @return
     */
    public static ResultVo getFailResult(String resultMsg) {
        ResultVo resultVo = new ResultVo();
        resultVo.setResultCode(ResultCode.FAIL_1);
        resultVo.setResultMsg(resultMsg);
        resultVo.setResultTime(new Date());
        return resultVo;
    }



}
