package com.twg.redis.xianliu.annotation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

@Documented
@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD })
public @interface AccessLimit {

	/**
	 * 指定second时间内 API请求次数
	 * @return
	 */
	int maxCount() default 5; 

	/**
	 * 请求次数的指定范围时间：秒（redis的过期时间）
	 * @return
	 */
	int second() default 60;
}
