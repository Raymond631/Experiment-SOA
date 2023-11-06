package com.example;

import com.example.client.LetterServiceServiceLocator;
import com.example.client.LetterService_PortType;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws ServiceException, RemoteException {
        // 输入
        Scanner in = new Scanner(System.in);
        String digits = in.nextLine();
        // 调用
        LetterServiceServiceLocator locator = new LetterServiceServiceLocator();
        LetterService_PortType service = locator.getLetterService();
        Object[] result = service.letterCombinations(digits);
        // 输出
        for (Object a : result) {
            System.out.println(a);
        }
    }
}
