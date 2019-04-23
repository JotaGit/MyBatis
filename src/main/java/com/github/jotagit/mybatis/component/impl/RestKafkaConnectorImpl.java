package com.github.jotagit.mybatis.component.impl;

import com.github.jotagit.mybatis.component.RestConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Component
public class RestKafkaConnectorImpl implements RestConnector {

    @Autowired
    private LoadBalancerClient loadBalancer;

    @Autowired
    private RestTemplate restTemplate;

    @Value("/produtor/{msg}")
    private String endpoint;

    @Value("KAFKAPRODUTOR")
    private String servicoKafka;

    @Override
    public Boolean publicarEvento(String mensagem){

        Map<String, String> map = new HashMap<String, String>();
        map.put("msg", mensagem);

        ServiceInstance service = loadBalancer.choose(servicoKafka);
        ResponseEntity resposta =  restTemplate.postForEntity(service.getUri().toString().concat(endpoint),"", String.class, map);

        return 200 == resposta.getStatusCodeValue();
    }
}
