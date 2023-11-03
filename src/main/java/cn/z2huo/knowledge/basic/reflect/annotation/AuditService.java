package cn.z2huo.knowledge.basic.reflect.annotation;

import lombok.extern.slf4j.Slf4j;

@Slf4j
class AuditService {

    @OperateVariable
    public void listFlows(String confNo, String version) {
        log.info("confNo is {}", confNo);
    }

    @OperateVariable
    public void listAuditors(AuditorParam param) {
        log.info("confNo is {}", param.getConfNo());
    }

    public void getReport(@ConfNo String serialNo) {
//        log.info("confNo is {}", serialNo);
        System.out.println("confNo is " + serialNo);
    }

    public void queryReport(QueryReportParam param) {
        log.info("confNo is {}", param.getSerialNo());
    }

}
