package org.example;

import net.sf.json.JSONObject;
import org.camunda.bpm.client.ExternalTaskClient;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class MathWorker {
    private final static Logger LOGGER = Logger.getLogger(MathWorker.class.getName());

    public static void main(String[] args) {
        ExternalTaskClient client = ExternalTaskClient.create()
                .baseUrl("http://localhost:8080/engine-rest")
                .asyncResponseTimeout(10000) // 长轮询超时时间
                .build();

        // 订阅外部任务topic
        client.subscribe("addEvent")
                .lockDuration(1000)
                .handler((externalTask, externalTaskService) -> {
                    Long a = (Long) externalTask.getVariable("a");
                    Long b = (Long) externalTask.getVariable("b");
                    Map params = new HashMap();
                    params.put("a", a);
                    params.put("b", b);

                    JSONObject result = APIConnector.query("add", params);
                    VariableMap variableMap = Variables.createVariables().putValue("c", result.get("res"));

                    LOGGER.info("add " + a + " and " + b);
                    externalTaskService.complete(externalTask, variableMap);
                })
                .open();

        client.subscribe("subEvent")
                .lockDuration(1000)
                .handler((externalTask, externalTaskService) -> {
                    Long a = (Long) externalTask.getVariable("a");
                    Long b = (Long) externalTask.getVariable("b");
                    Map params = new HashMap();
                    params.put("a", a);
                    params.put("b", b);

                    JSONObject result = APIConnector.query("sub", params);
                    VariableMap variableMap = Variables.createVariables().putValue("d", result.get("res"));

                    LOGGER.info("sub " + a + " with " + b);
                    externalTaskService.complete(externalTask, variableMap);
                })
                .open();

        client.subscribe("mulEvent")
                .lockDuration(1000)
                .handler((externalTask, externalTaskService) -> {
                    Long a = (Long) externalTask.getVariable("a");
                    Long b = (Long) externalTask.getVariable("b");
                    Map params = new HashMap();
                    params.put("a", a);
                    params.put("b", b);

                    JSONObject result = APIConnector.query("mul", params);
                    VariableMap variableMap = Variables.createVariables().putValue("d", result.get("res"));

                    LOGGER.info("multi " + a + " and " + b);
                    externalTaskService.complete(externalTask, variableMap);
                })
                .open();
    }
}
