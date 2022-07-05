package ru.netology.sqr;

public class SQRService {

    public int calculateNumbSqrt(int bottomLine, int upperLine) {
//        int number = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= bottomLine && i * i <= upperLine) {
//                return number = number + i;
//                return i;
                System.out.println("Корень из " + i);
//                return i;
            }
        }
        return 0;
    }
}
