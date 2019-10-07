package com.lqx.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

@Configuration
@RefreshScope
public class IdWorkerProperties {

    /**
     * 当前机器id
     */
    @Value("${lqx.worker.workerId}")
    private long workerId;

    /**
     * 序列号
     */
    @Value("${lqx.worker.dataCenterId}")
    private long dataCenterId;

    public long getWorkerId() {
        return workerId;
    }

    public void setWorkerId(long workerId) {
        this.workerId = workerId;
    }

    public long getDataCenterId() {
        return dataCenterId;
    }

    public void setDataCenterId(long dataCenterId) {
        this.dataCenterId = dataCenterId;
    }
}