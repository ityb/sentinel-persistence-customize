package com.alibaba.csp.sentinel.dashboard.rule.nacos.systemrule;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.SystemRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRuleProvider;
import com.alibaba.csp.sentinel.dashboard.rule.nacos.DynamicConfig;
import com.alibaba.csp.sentinel.dashboard.rule.nacos.NacosConfigUtil;
import com.alibaba.nacos.api.config.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("customizeSysRuleNacosProvider")
public class CustomizeSysRuleNacosProvider implements DynamicRuleProvider<List<SystemRuleEntity>> {

    @Autowired
    private ConfigService configService;

    @Autowired
    private DynamicConfig dynamicConfig;

    @Autowired
    private NacosConfigUtil nacosConfigUtil;

    @Override
    public List<SystemRuleEntity> getRules(String appName) throws Exception {
        return nacosConfigUtil.getRuleEntitiesFromNacos(
                configService,
                appName,
                dynamicConfig.getSystemFuleDataIdPostfix(),
                SystemRuleEntity.class
        );
    }
}
