// Sample sandbox for Java codes and algorithms
// Ethan Devarapalli

import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;


public class Sandbox {
    ArrayList<Integer> sampleList = new ArrayList<Integer>();

public void addToList(ArrayList<Integer> aList) {
    for (int i = 0; i<aList.size;i++) {
        sampleList.add(i);
    }
}

public int size() {
    return sampleList.size;
}

public boolean find(int a) {
    for (int i = 0;i<sampleList.size;i++) {
        if (sampleList.get(i) == a) {
            return true;
        }
    }
    return false;
}

public int findMax() {
    int maxElement = 0;
    for (int i = 0;i<sampleList.size;i++) }{
        if (maxElement < sampleList.get(i)) {
            maxElement = sampleList.get(i);
        }
    return maxElement;
    }
public int sumList() {
    int sum = 0;
    for (int i = 0;i<sampleList.size;i++) {
        sum += sampleList.get(i);
    }
    return sum;
}


// main method

public static void main(String[] args) {
    System.out.println(
        "hello world"
    );
}
}
