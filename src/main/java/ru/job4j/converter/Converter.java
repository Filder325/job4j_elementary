package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = ru.job4j.Converter.rubleToEuro(140);
        float dollar = ru.job4j.Converter.rubleToDollar(140);
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("140 rubles are " + euro + " euro.");
         in = 140;
         expected = 140 / 60;
         out = Converter.rubleToDollar(in);
         passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
    }
}
