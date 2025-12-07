package sprint01.JavaCollections.level02B;

import java.util.*;

public class MainRestauranT {
    public static void main(String[] args) {

        Set<RestauranT> restauranTSet = createInitialRestauranTs();

        printCollection("RestauranTs inside HashSet (no order guaranteed)", restauranTSet);

        List<RestauranT> sortedList = new ArrayList<>(restauranTSet);

        Collections.sort(sortedList);

        printCollection("RestauranTs sorted by name, then score DESC (Comparable)", sortedList);

        List<RestauranT> sortedWithComparator = new ArrayList<>(restauranTSet);

        sortedWithComparator.sort(
                Comparator

                        .comparing(RestauranT::getName, String.CASE_INSENSITIVE_ORDER)
                        .thenComparing(Comparator.comparingInt(RestauranT:: getScore).reversed())

        );

        printCollection("RestauranTs sorted with Comparator.comparing(...)",
                sortedWithComparator
        );
    }


    private static Set<RestauranT> createInitialRestauranTs() {
        Set<RestauranT> restauranTs = new LinkedHashSet<>();

        restauranTs.add(new RestauranT("Restaurant A", 9));
        restauranTs.add(new RestauranT("Restaurant A", 7));
        restauranTs.add(new RestauranT("Restaurant B", 8));
        restauranTs.add(new RestauranT("Restaurant C", 5));

        restauranTs.add(new RestauranT("RestauranT A", 9));

        restauranTs.add(new RestauranT("Another Place", 9));

        return restauranTs;

    }


    private static void printCollection(String title, Iterable<RestauranT> restauranTs) {
        System.out.println("\n--- " + title + " ---");
        for (RestauranT restauranT : restauranTs) {
            System.out.println(restauranT);
        }
    }
}

