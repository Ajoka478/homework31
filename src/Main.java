

// import static java.util.stream.Collectors.*;
// import static java.util.Comparator.*;

// используя статические imports
// мы импортируем *всё* из Collectors и Comparator.
// теперь нам доступны такие операции как
// toList(), toSet() и прочие, без указания уточняющего слова Collectors. или Comparator.
// вот так было до импорта Collectors.toList(), теперь стало просто toList()


import domain.Item;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        var orders = RestaurantOrders.read("orders_100.json").getOrders();
        List<Item> items = new ArrayList<>();
        var total = items.stream()
                .mapToDouble(Item::getPrice)
                .sum();
        //System.out.println(total);
    }
}
