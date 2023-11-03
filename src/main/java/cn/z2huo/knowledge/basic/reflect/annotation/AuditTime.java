package cn.z2huo.knowledge.basic.reflect.annotation;

import java.lang.annotation.*;

@Target(value = {ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface AuditTime {
}
