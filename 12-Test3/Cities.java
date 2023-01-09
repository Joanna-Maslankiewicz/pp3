import java.util.*;

public class Cities {
    private String[] cityNames;

    public Cities(String[] cityNames) {
        this.cityNames = cityNames;
    }

    Cities filter(char c) {
        ArrayList<String> cityList = new ArrayList<String>();
        for (String city : cityNames) {
            if (c == city.charAt(0)) {
                cityList.add(city);
            }
        }

        return new Cities(cityList.toArray(new String[cityList.size()]));
    }

    String cities() {
        String cityString = "";
        for (String city : cityNames) {
            cityString += city;
        }
        return cityString;
    }

    public static void main(String[] args) {
        String[] c = { "Warszawa", "Sopot", "Kielce", "Szczecin" };
        Cities cit = new Cities(c);
        System.out.println(cit.filter('S').cities());
    }
}
