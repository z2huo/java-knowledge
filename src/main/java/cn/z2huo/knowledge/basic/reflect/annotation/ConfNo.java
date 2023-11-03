package cn.z2huo.knowledge.basic.reflect.annotation;

import java.lang.annotation.*;

@Target(value = {ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface ConfNo {



}
