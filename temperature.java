

import java.util.Scanner;

public class temperature {

     public static void main(String[] args) {

// объект для считывания с входного потока
        Scanner in= new Scanner(System.in);
        System.out.println("Введите температуру:");
        int n1=in.nextInt();
        System.out.println("Введите направление преобразование - F (Фаренгейт) или C (градусы цельсия):");
        String n=in.next();
        char n2=n.charAt(0);

        TemperatureConverter tempConvertor = new TemperatureConverter();
        System.out.println("Температура составляет " + tempConvertor.convertTemp(n1, n2) + " " + n2);
    }
}

class TemperatureConverter{

    public String convertTemp (int temperature, char convertTo){

        if(convertTo=='F')
        {
            temperature=temperature *9/5 +32;
        }
        else if(convertTo=='C')
        {
            temperature=(temperature);
        }

        return String.valueOf(temperature);
    }
}