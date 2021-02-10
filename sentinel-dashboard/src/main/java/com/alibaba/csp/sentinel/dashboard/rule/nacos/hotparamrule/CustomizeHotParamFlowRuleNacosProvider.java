package com.alibaba.csp.sentinel.dashboard.rule.nacos.hotparamrule;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.ParamFlowRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRuleProvider;
import com.alibaba.csp.sentinel.dashboard.rule.nacos.DynamicConfig;
import com.alibaba.csp.sentinel.dashboard.rule.nacos.NacosConfigUtil;
import com.alibaba.nacos.api.config.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("customizeHotParamFlowRuleNacosProvider")
public class CustomizeHotParamFlowRuleNacosProvider implements DynamicRuleProvider<List<ParamFlowRuleEntity>> {

    @Autowired
    private ConfigService configService;

    @Autowired
    private DynamicConfig dynamicConfig;

    @Autowired
    private NacosConfigUtil nacosConfigUtil;

    @Override
    public List<ParamFlowRuleEntity> getRules(String appName) throws Exception {
        return nacosConfigUtil.getRuleEntitiesFromNacos(configService, appName, dynamicConfig.getParamFlowDataIdPostfix(),
                ParamFlowRuleEntity.class);
    }
}
