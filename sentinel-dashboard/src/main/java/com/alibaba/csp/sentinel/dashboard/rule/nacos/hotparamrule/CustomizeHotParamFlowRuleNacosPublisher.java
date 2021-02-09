package com.alibaba.csp.sentinel.dashboard.rule.nacos.hotparamrule;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.ParamFlowRuleEntity;
import com.alibaba.csp.sentinel.dashboard.rule.DynamicRulePublisher;
import com.alibaba.csp.sentinel.dashboard.rule.nacos.NacosConfigUtil;
import com.alibaba.nacos.api.config.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("customizeHotParamFlowRuleNacosPublisher")
public class CustomizeHotParamFlowRuleNacosPublisher implements DynamicRulePublisher<List<ParamFlowRuleEntity>> {

    @Autowired
    private ConfigService configService;


    @Override
    public void publish(String app, List<ParamFlowRuleEntity> rules) throws Exception {
        NacosConfigUtil.setRuleString2Nacos(
                configService,
                app,
                NacosConfigUtil.PARAM_FLOW_DATA_ID_POSTFIX,
                rules
        );
    }
}
