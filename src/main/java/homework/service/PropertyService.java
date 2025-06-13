package homework.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class PropertyService {

    @Value("${1}")
    private String group1;

    @Value("${2}")
    private String group2;

    @Value("${3}")
    private String group3;

    public Map<List<Integer>, Integer> map = new HashMap<>();

    public void addMap() {
        map.put(parseNumbers(group1), 1);
        map.put(parseNumbers(group2), 2);
        map.put(parseNumbers(group3), 3);
    }

    private List<Integer> parseNumbers(String numbersStr) {
        return Arrays.stream(numbersStr.split(","))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public int getPoint(int i) {
        for (Map.Entry<List<Integer>, Integer> entry : map.entrySet()) {
            if (entry.getKey().contains(i)) {
                return entry.getValue();
            }
        }
        return 0;
    }

}
