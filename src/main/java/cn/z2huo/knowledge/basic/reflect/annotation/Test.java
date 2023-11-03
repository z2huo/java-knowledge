package cn.z2huo.knowledge.basic.reflect.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;

class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<AuditService> clazz = AuditService.class;
        AuditService auditService = clazz.getDeclaredConstructor().newInstance();

        System.out.println("===== listFlows =====");
        Method listFlowsMethod = clazz.getDeclaredMethod("listFlows", String.class, String.class);
        methodInfo(listFlowsMethod);

        System.out.println("===== listAuditors =====");
        Method listAuditorsMethod = clazz.getDeclaredMethod("listAuditors", AuditorParam.class);
        methodInfo(listAuditorsMethod);

        System.out.println("===== getReport =====");
        Method getReportMethod = clazz.getDeclaredMethod("getReport", String.class);
        methodInfo(getReportMethod);
        getReportMethod.invoke(auditService, "SerialNo20231031000001");

        for (Parameter parameter : getReportMethod.getParameters()) {
            ConfNo confNo = parameter.getAnnotation(ConfNo.class);
            if (confNo != null) {
                System.out.println("find @confNo on parameter: " + parameter.getName());
//                parameter.get
            }
        }

        System.out.println("===== queryReport =====");
        Method queryReportMethod = clazz.getDeclaredMethod("queryReport", QueryReportParam.class);
        methodInfo(queryReportMethod);
        for (Parameter parameter : queryReportMethod.getParameters()) {
            System.out.println(Arrays.toString(parameter.getAnnotations()));
            System.out.println(Arrays.toString(parameter.getDeclaredAnnotations()));
            System.out.println(parameter.getAnnotation(ConfNo.class));
            Class clazz2 = parameter.getType();
            System.out.println(clazz2);
            System.out.println(parameter.getParameterizedType());
        }
    }

    public static void methodInfo(Method method) {
        System.out.println(method.getParameterCount());
        System.out.println(Arrays.toString(method.getParameters()));
        System.out.println(Arrays.toString(method.getDeclaredAnnotations()));
        System.out.println(Arrays.deepToString(method.getParameterAnnotations()));
//        System.out.println();
    }

}
