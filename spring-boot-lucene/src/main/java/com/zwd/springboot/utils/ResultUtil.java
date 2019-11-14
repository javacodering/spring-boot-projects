package com.zwd.springboot.utils;


import com.zwd.springboot.entity.ResultBean;
import com.zwd.springboot.entity.ResultEnum;

public class ResultUtil<T> {

    public static <T> ResultBean<T> success(T t){
    	ResultEnum successEnum = ResultEnum.SUCCESS;
    	return new ResultBean<T>(successEnum.getCode(),successEnum.getMsg(),t);
    }

    public static <T> ResultBean<T> success(){
        return success(null);
    }

    public static <T> ResultBean<T> error(ResultEnum Enum){
    	ResultBean<T> result = new ResultBean<T>();
        result.setCode(Enum.getCode());
        result.setMsg(Enum.getMsg());
        result.setData(null);
        return result;
    }
}
