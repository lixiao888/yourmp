package com.yourmp.mapper;

import com.yourmp.entity.Tenant;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class TenantMapperTest {
    @Autowired
    private TenantMapper tenantMapper;

    @Test
    public void aInsert() {
        Tenant tenant = new Tenant();
        tenant.setName("张三");
        Assert.assertTrue(tenantMapper.insert(tenant) > 0);
        tenant = tenantMapper.selectById(tenant.getId());
        Assert.assertTrue(1 == tenant.getTenantId());
    }

    @Test
    public void bDelete() {
        Assert.assertTrue(tenantMapper.deleteById(3L) > 0);
    }

    @Test
    public void cUpdate() {
        Assert.assertTrue(tenantMapper.updateById(new Tenant().setId(1L).setName("mp")) > 0);
    }

    @Test
    public void dSelect() {
        List<Tenant> userList = tenantMapper.selectList(null);
        userList.forEach(u -> Assert.assertTrue(1 == u.getTenantId()));
    }
}
