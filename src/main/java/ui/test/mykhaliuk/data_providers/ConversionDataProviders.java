package ui.test.mykhaliuk.data_providers;

import org.testng.annotations.DataProvider;
import ui.test.common.Base;

import java.util.ArrayList;
import java.util.Collections;

public class ConversionDataProviders extends Base {
    protected static final int AMOUNT = 100;

    protected static final ArrayList<Integer> numbers = new ArrayList<>();

    @DataProvider
    public static Object[][] randomWeightData() {
        ArrayList<Integer> list;
        return new Object[][]{{list = fill(numbers), toKilograms(list)}};
    }

    public static ArrayList<Integer> fill(ArrayList<Integer> list) {
        for (int i = 0; i < AMOUNT; i++) {
            list.add(i);
        }
        Collections.shuffle(list);
        return list;
    }

    public static ArrayList<Double> toKilograms(ArrayList<Integer> list) {
        final double LBS_TO_KG_MULTIPLAYER = 0.45359237;
        ArrayList<Double> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(i) * LBS_TO_KG_MULTIPLAYER);
        }
        return result;
    }
}