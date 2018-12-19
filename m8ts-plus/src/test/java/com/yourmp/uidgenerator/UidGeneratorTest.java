package com.yourmp.uidgenerator;

import com.yourmp.uidworker.service.UidGenService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class UidGeneratorTest {

    @Autowired
    private UidGenService uidGenService;

    /**
     * 测试预先缓存UID的生成器服务
     */
    @Test
    public void testGetCachedUid() {
        String cacheUid = String.valueOf(uidGenService.getCachedUid());
        System.out.println(cacheUid);
    }

    /**
     * 测试UID的生成器服务
     */
    @Test
    public void testSelect() {
        String defaultUid = String.valueOf(uidGenService.getDefaultUid());
        System.out.println(defaultUid);
    }
}
