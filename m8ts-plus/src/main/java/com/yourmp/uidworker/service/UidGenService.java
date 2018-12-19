package com.yourmp.uidworker.service;

import io.prong.uid.UidGenerator;
import io.prong.uid.worker.DisposableWorkerIdAssigner;
import io.prong.uid.worker.WorkerIdAssigner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class UidGenService {

	@Autowired
    private UidGenerator cachedUidGenerator;

	@Autowired
    private UidGenerator defaultUidGenerator;

    @Bean
    @ConditionalOnMissingBean
    WorkerIdAssigner workerIdAssigner() {
        return new DisposableWorkerIdAssigner();
    }

    public long getCachedUid() {
        return cachedUidGenerator.getUID();
    }

    public long getDefaultUid() {
        return defaultUidGenerator.getUID();
    }
}
