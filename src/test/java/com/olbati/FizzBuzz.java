package com.olbati;


import com.google.common.base.Preconditions;

import java.util.HashMap;
import java.util.Map;

public class FizzBuzz {

    private Map<Integer, String> config = new HashMap<>();

    public FizzBuzz() {
        config.put(3, "fizz");
        config.put(5, "buzz");
        config.put(7, "olbati");
    }

    public String process(int input) {
        Preconditions.checkArgument(input >= 1);
        Preconditions.checkArgument(input <= 100);

        StringBuilder result = new StringBuilder();
        for (Integer key : config.keySet()) {
            appendResultIfInputMultipleOfKey(result, input, key);
        }
        if (result.length() == 0) {
            result.append(Integer.toString(input));
        }
        return result.toString();
    }

    private void appendResultIfInputMultipleOfKey(StringBuilder result, int input, Integer key) {
        if (input % key == 0) {
            result.append(config.get(key));
        }
    }


}
