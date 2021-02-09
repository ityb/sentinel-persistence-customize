package com.alibaba.csp.sentinel.dashboard.rule.nacos.systemrule;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.SystemRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRulePublisher;
import com.alibaba.csp.sentinel.dashboard.rule.nacos.NacosConfigUtil;
import com.alibaba.nacos.api.config.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("customizeSysRuleNacosPublisher")
public class CustomizeSysRuleNacosPublisher implements DynamicRulePublisher<List<SystemRuleEntity>> {

    @Autowired
    private ConfigService configService;

    @Override
    public void publish(String app, List<SystemRuleEntity> rules) throws Exception {
        NacosConfigUtil.setRuleString2Nacos(
                configService,
                app,
                NacosConfigUtil.SYSTEM_FULE_DATA_ID_POSTFIX,
                rules
        );
    }
}
