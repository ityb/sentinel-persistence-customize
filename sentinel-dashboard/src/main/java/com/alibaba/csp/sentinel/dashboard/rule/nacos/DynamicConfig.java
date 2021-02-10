package com.alibaba.csp.sentinel.dashboard.rule.nacos;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamicConfig {

    @Value("${spring.cloud.nacos.config.group}")
    private String group;

    @Value("${spring.cloud.nacos.config.degrade.dataid.postfix}")
    private String degradeDataIdPostfix;

    @Value("${spring.cloud.nacos.config.flow.dataid.postfix}")
    private String flowDataIdPostfix;

    @Value("${spring.cloud.nacos.config.paramFlow.dataid.postfix}")
    private String paramFlowDataIdPostfix;

    @Value("${spring.cloud.nacos.config.system.dataid.postfix}")
    private String systemDataIdPostfix;

    @Value("${spring.cloud.nacos.config.authority.dataid.postfix}")
    private String authorityDataIdPostfix;

    @Value("${spring.cloud.nacos.config.clusterMap.dataid.postfix}")
    private String clusterMapDataIdPostfix;

    @Value("${spring.cloud.nacos.config.dashboard.postfix}")
    private String dashboardPostfix;

    @Value("${spring.cloud.nacos.config.server-addr}")
    private String nacosConfigServerAddr;

    @Value("${spring.cloud.nacos.config.namespace}")
    private String nacosConfigNamespace;

    public String getGroup() {
        return group;
    }

    public String getDegradeDataIdPostfix() {
        return degradeDataIdPostfix;
    }

    public String getFlowDataIdPostfix() {
        return flowDataIdPostfix;
    }

    public String getParamFlowDataIdPostfix() {
        return paramFlowDataIdPostfix;
    }

    public String getSystemFuleDataIdPostfix() {
        return systemDataIdPostfix;
    }

    public String getAuthorityDataIdPostfix() {
        return authorityDataIdPostfix;
    }

    public String getClusterMapDataIdPostfix() {
        return clusterMapDataIdPostfix;
    }

    public String getDashboardPostfix() {
        return dashboardPostfix;
    }

    public String getNacosConfigServerAddr() {
        return nacosConfigServerAddr;
    }

    public String getNacosConfigNamespace() {
        return nacosConfigNamespace;
    }
}
