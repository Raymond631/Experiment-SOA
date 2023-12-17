package org.example;

import net.sf.json.JSONObject;
import org.camunda.bpm.client.ExternalTaskClient;
import org.camunda.bpm.engine.variable.VariableMap;
import org.camunda.bpm.engine.variable.Variables;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class WeatherWorker {
    private final static Logger LOGGER = Logger.getLogger(WeatherWorker.class.getName());

    public static void main(String[] args) {
        ExternalTaskClient client = ExternalTaskClient.create()
                .baseUrl("http://localhost:8080/engine-rest")
                .asyncResponseTimeout(10000) // 长轮询超时时间
                .build();
        // 订阅外部任务topic
        client.subscribe("getWeather")
                .lockDuration(1000)
                .handler((externalTask, externalTaskService) -> {
                    String citycode = (String) externalTask.getVariable("citycode");
                    Map params = new HashMap();
                    params.put("citycode", citycode);
                    JSONObject result = APIConnector.query("weather", params);
                    String weather = (String) result.get("weather");
                    int temp1 = (int) result.get("temp1");

                    VariableMap variableMap = Variables.createVariables();
                    variableMap.putValue("weather", weather);
                    variableMap.putValue("temp1", temp1);

                    LOGGER.info(String.format("城市编号: %s, 天气: %s, 最低气温： %d", citycode, weather, temp1));
                    externalTaskService.complete(externalTask, variableMap);
                })
                .open();
        client.subscribe("upTemp")
                .lockDuration(1000)
                .handler((externalTask, externalTaskService) -> {
                    String id = (String) externalTask.getVariable("id");
                    Map params = new HashMap();
                    params.put("id", id);
                    params.put("temp", 20);

                    JSONObject result = APIConnector.query("setTemp", params);
                    int temp = (int) result.get("temp");

                    VariableMap variableMap = Variables.createVariables();
                    variableMap.putValue("temp", temp);

                    LOGGER.info(String.format("设备id: %s, 空调升温到%d度", id, temp));
                    externalTaskService.complete(externalTask, variableMap);
                })
                .open();
        client.subscribe("downTemp")
                .lockDuration(1000)
                .handler((externalTask, externalTaskService) -> {
                    String id = (String) externalTask.getVariable("id");
                    Map params = new HashMap();
                    params.put("id", id);
                    params.put("temp", 25);

                    JSONObject result = APIConnector.query("setTemp", params);
                    int temp = (int) result.get("temp");

                    VariableMap variableMap = Variables.createVariables();
                    variableMap.putValue("temp", temp);

                    LOGGER.info(String.format("设备id: %s, 空调降温到%d度", id, temp));
                    externalTaskService.complete(externalTask, variableMap);
                })
                .open();
        client.subscribe("closeWindow")
                .lockDuration(1000)
                .handler((externalTask, externalTaskService) -> {
                    String id = (String) externalTask.getVariable("id");
                    Map params = new HashMap();
                    params.put("id", id);
                    params.put("open", false);

                    JSONObject result = APIConnector.query("setWindow", params);
                    boolean open = (boolean) result.get("open");

                    VariableMap variableMap = Variables.createVariables();
                    variableMap.putValue("open", open);

                    LOGGER.info(String.format("设备id: %s, 关闭窗户", id));
                    externalTaskService.complete(externalTask, variableMap);
                })
                .open();
        client.subscribe("openWindow")
                .lockDuration(1000)
                .handler((externalTask, externalTaskService) -> {
                    String id = (String) externalTask.getVariable("id");
                    Map params = new HashMap();
                    params.put("id", id);
                    params.put("open", true);

                    JSONObject result = APIConnector.query("setWindow", params);
                    boolean open = (boolean) result.get("open");

                    VariableMap variableMap = Variables.createVariables();
                    variableMap.putValue("open", open);

                    LOGGER.info(String.format("设备id: %s, 打开窗户", id));
                    externalTaskService.complete(externalTask, variableMap);
                })
                .open();
    }
}
