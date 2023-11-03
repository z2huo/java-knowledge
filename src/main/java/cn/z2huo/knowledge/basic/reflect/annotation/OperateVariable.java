package cn.z2huo.knowledge.basic.reflect.annotation;

import java.lang.annotation.*;

@Target(value = {ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface OperateVariable {
}
