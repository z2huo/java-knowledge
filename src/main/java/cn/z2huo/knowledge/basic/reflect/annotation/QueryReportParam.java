package cn.z2huo.knowledge.basic.reflect.annotation;

import lombok.Data;

@Data
class QueryReportParam {

    @AuditTime
    private Integer auditTime;

    @ConfNo
    private String serialNo;

    @ConfNo
    private String reportName;

}
