package org.example;

import org.camunda.bpm.client.ExternalTaskClient;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;

import java.util.logging.Logger;

public class AddService {
    private final static Logger LOGGER = Logger.getLogger(AddService.class.getName());

    public static void main(String[] args) {
        ExternalTaskClient client = ExternalTaskClient.create()
                .baseUrl("http://localhost:8080/engine-rest") //流程运行地址
                .asyncResponseTimeout(10000) //轮询间隔
                .build();

        // subscribe to an external task topic as specified in the process
        client.subscribe("addEvent").lockDuration(1000)
                // the default lock duration is 20 seconds, but you can override this
                .handler((externalTask, externalTaskService) -> {
                    // Get a process variable
                    Long a = (Long) externalTask.getVariable("a");
                    Long b = (Long) externalTask.getVariable("b");
                    VariableMap variableMap = Variables.createVariables().putValue("temp", a + b);
                    LOGGER.info("add " + a + " and " + b);
                    // Complete the task
                    externalTaskService.complete(externalTask, variableMap);
                })
                .open();
    }
}