package java_homework_week9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Write a programme that tells you which line passes through particular stations. Just use Zone 1 stations name.
 */
public class Programme10 {
    public static void main(String[] args) {
        //Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter tube station name of Zone 1:");
        String stationName = scanner.nextLine();
        Programme10 t = new Programme10();
        t.stationList(stationName);
        //closing the scanner object
        scanner.close();
    }

    public void stationList(String stationName) {
        ArrayList<String> stationList = new ArrayList<>();
        stationList.add("Bond Street");
        stationList.add("Baker Street");
        stationList.add("Lonodon Bridge");
        stationList.add("Oxford Circus");
        stationList.add("Holborn");
        stationList.add("Green Park");
        stationList.add("Westminster");
        stationList.add("Victoria");

        //Hashmap created for map station line to line
        Map<String, String> tubeLine = new HashMap<>();
        tubeLine.put("Bond street", "Jubilee, Central");
        tubeLine.put("Baker Street", "Jubilee, Circle, Metropolitan, Hammersmith & City");
        tubeLine.put("London Bridge", "Jubilee, Northern");
        tubeLine.put("Oxford Circus", "Victoria, Central, Bakerloo");
        tubeLine.put("Holborn", "Piccadilly, Central");
        tubeLine.put("Green Park", "Jubilee, Piccadilly, Victoria");
        tubeLine.put("Westminster", "Jubilee, Circle, District");
        tubeLine.put("Victoria", "Circle, District, Victoria");

        //if  else
        if (stationList.contains(stationName)) {
            String line = tubeLine.get(stationName);
            System.out.println("Lines passing through " + stationName + " : " + line);
        } else {
            System.out.println(stationName + " station is NOT in Zone 1");
        }
    }
}