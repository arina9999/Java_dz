// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке.

package third_dz;

import java.util.*;

public class task3 {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Сатурн");
        planets.add("Юпитер");
        planets.add("Марс");
        planets.add("Земля");
        planets.add("Венера");
        System.out.printf("Список планет : %s\n", planets);
        System.out.println("Земля = " + Collections.frequency(planets, "Земля"));
        System.out.println("Марс = " + Collections.frequency(planets, "Марс"));
        System.out.println("Сатурн = " + Collections.frequency(planets, "Сатурн"));
        System.out.println("Юпитер = " + Collections.frequency(planets, "Юпитер"));
        System.out.println("Венера = " + Collections.frequency(planets, "Венера"));
    }
}