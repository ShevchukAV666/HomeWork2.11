package work.home.home_work_2_11.services;


import org.springframework.stereotype.Service;
import work.home.home_work_2_11.exceptions.NotParametersException;

@Service
public class CalculatorImpl implements Calculator {

    public String helloCalculator() {

        return "Добро пожаловать в калькулятор";
    }

    public String plus(String num1, String num2) {
        if ((num1.isEmpty()) || (num2.isEmpty())) {
            throw new NotParametersException("Введены не все необходимые данные");
        } else return num1 + " + " + num2 + " = " + (Integer.parseInt(num1) + Integer.parseInt(num2));
    }

    public String minus(String num1, String num2) {
        if ((num1.isEmpty()) || (num2.isEmpty())) {
            throw new NotParametersException("Введены не все необходимые данные");
        } else return num1 + " - " + num2 + " = " + (Integer.parseInt(num1) - Integer.parseInt(num2));
    }

    public String multi(String num1, String num2) {
        if ((num1.isEmpty()) || (num2.isEmpty())) {
            throw new NotParametersException("Введены не все необходимые данные");
        } else return num1 + " * " + num2 + " = " + (Integer.parseInt(num1) * Integer.parseInt(num2));
    }

    public String delenie(String num1, String num2) {
        if ((num1.isEmpty()) || (num2.isEmpty())) {
            throw new NotParametersException("Введены не все необходимые данные");
        } else {
            if (Integer.parseInt(num2) == 0) {
                throw new IllegalArgumentException("Деление на ноль запрещено!");
            } else return num1 + " / " + num2 + " = " + (Double.parseDouble(num1) / Double.parseDouble(num2));
        }
    }
}

