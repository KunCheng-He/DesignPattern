package cn.byack.simplefactory;

import cn.byack.simplefactory.operation.BaseOperation;
import java.util.Scanner;

public class OperationTest {
    public static void main(String[] args) {
        // 获取用户输入
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        double numberA = scan.nextDouble();
        System.out.println("请输入第二个数字：");
        double numberB = scan.nextDouble();
        String operation;
        do {
            System.out.println("请输入运算符(+、-、*、/)：");
            operation = scan.next();
            if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/"))
                break;
            System.out.println("输入的运算符有误，请重新输入！");
        } while (true);

        // 简单工厂模式
        BaseOperation oper = OperationFactory.createOperation(operation);
        oper.setNumberA(numberA);
        oper.setNumberB(numberB);
        System.out.println(oper.getResult());
    }
}
