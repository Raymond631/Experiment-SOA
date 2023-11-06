package com.example;

import com.example.client.DomesticAirlineLocator;
import com.example.client.DomesticAirlineSoap_PortType;
import com.example.client.GetDomesticAirlinesTimeResponseGetDomesticAirlinesTimeResult;
import org.apache.axis.message.MessageElement;
import org.apache.commons.lang3.StringEscapeUtils;

import javax.xml.rpc.ServiceException;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ServiceException, IOException {
        System.out.println("请输入日期，如2023-11-11");
        Scanner in = new Scanner(System.in);
        String date = in.nextLine();

        DomesticAirlineLocator locator = new DomesticAirlineLocator();
        DomesticAirlineSoap_PortType service = locator.getDomesticAirlineSoap12();
        GetDomesticAirlinesTimeResponseGetDomesticAirlinesTimeResult response = service.getDomesticAirlinesTime("北京","长沙",date,"");

        // 解析返回数据
        MessageElement[] results = response.get_any();
        StringBuilder res = new StringBuilder();
        // 添加根节点
        res.append("<DataSet xmlns=\"http://WebXml.com.cn/\">");
        for (MessageElement result : results) {
            res.append(StringEscapeUtils.unescapeHtml4(result.toString()));  // HTML实体解码
        }
        res.append("</DataSet>");

        // 保存为xml
        saveXML(res.toString(),"result.xml");
    }

    public static void saveXML(String XMLString, String fileName) throws IOException {
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        if (file.canWrite()) {
            FileWriter fileOut = new FileWriter(file);
            fileOut.write(XMLString);
            fileOut.close();
        }
    }
}
