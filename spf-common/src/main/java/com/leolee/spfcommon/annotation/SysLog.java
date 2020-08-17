package com.leolee.spfcommon.annotation;


import com.leolee.spfcommon.sysEnum.SysLogEnum;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface SysLog {

    public String value() default "";

    public SysLogEnum type() default SysLogEnum.BUSSINESS;

}
