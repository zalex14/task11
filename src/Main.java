import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Задача билета 11
 * Дан массив строк. Необходимо удалить из него все дубли, оставшиеся строки объединить в одну в порядке следования
 * в массиве
 */
public class Main {
    public static void main(String[] args) {

        String[] words = {"строка1", "строка2", "строка3", "строка4", "строка5",
                "строка2", "строка4", "строка1", "строка3", "строка5",
                "строка5", "строка4", "строка3", "строка2", "строка1"};

        Set<String> unique = new LinkedHashSet<>(List.of(words));
        System.out.println(" Задача билета 11: массиы строк без дублей в порядке следования в массиве\n\n" + unique);
    }
}