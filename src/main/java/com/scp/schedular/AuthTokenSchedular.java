package com.scp.schedular;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AuthTokenSchedular {

    @Autowired
    private CacheManager cacheManager;

    @Scheduled(fixedRate = 10000)
    //@CacheEvict(value = "auth-token", allEntries = true)
    public void clearAuthTokenCache(){
        log.info("cache cleared");
        cacheManager.getCache("auth-token").clear();

    }
}
