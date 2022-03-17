import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * Сделайте методы типизированными (Используйте generics)
 */
public class UtilClass {
    /**
     * Возвращает true, если список равен null или если список пуст
     *
     * @param list список.
     * @return true, если список равен null или если список пуст
     */
    public static <E> Boolean isBlank(List<E> list) {
        return list == null || list.isEmpty();
    }

    /**
     * Получает последний элемент в коллекции
     * Если список равен null, то выбрасывается исключение IllegalArgumentException
     *
     * @param list список
     * @return последний элемент в коллекции
     */
    public static <E> E getLastElem(List<E> list) {
        if (list == null) {
            throw new IllegalArgumentException();
        } else {
            return list.get(list.size() - 1);
        }
    }

    /**
     * Получает элемент из списка.
     * Если в аргументах список или элемент равен null, то выбрасывается исключение IllegalArgumentException
     * Если элемент не найден, то возвращаем null
     *
     * @param name список, в котором ищем элемент
     * @param elem элемент, который ищется в списке.
     * @return элемент из списка.
     */
    public static <E> E findElem(List<E> name, E elem) {
        if ((name == null) || (elem == null)){
            throw new IllegalArgumentException();
        } else {
            for (E List: name){
                if (elem.equals(List)) {
                    return List;
                }
            }
            return null;
        }
    }

    /**
     * Объединяет два списка.
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     *
     * @param list1 первый список
     * @param list2 второй список
     * @return возвращает объединенный список.
     */
    public static<T> List union(List<T> list1, List<T> list2) {
        if ((list1 == null) || (list2 == null)){
            throw new IllegalArgumentException();
        } else{
            List<T> listUnion = new ArrayList<>();
            listUnion.addAll(list1);
            listUnion.addAll(list2);
            return listUnion;
        }
    }

    /**
     * Удаляет все элементы из списка list1, которые встречаются в списке list2
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     *
     * @param name1 первый список
     * @param name2 второй список
     * @return возвращает список, который содержит элементы из списка list1, в котором удалены все элементы из
     * списка list2.
     */
    public static<T> List removeAll(List<T> name1, List<T> name2) {
        if ((name1 == null) || (name2 == null)){
            throw new IllegalArgumentException();
        } else {
            List<T> newList = new ArrayList<>();
            boolean isNotCont = true;
            for(T List1: name1){
                for(T List2: name2){
                    if(List1.equals(List2)){
                        isNotCont = false;
                    }
                }
                if (isNotCont){
                    newList.add(List1);
                }
                isNotCont = true;
            }
            return newList;
        }
    }

    /**
     * Складывает числа из обоих списков и возвращает сумму.
     * Если хотя-бы один из аргументов равен null, то выбрасываем исключение IllegalArgumentException
     * Аргументы метода не меняются
     * Подсказка:
     * 1) Помните, что все объекты чисел (Integer, Double, Float и т.д) наследуются от общего предка Number.
     * 2) Используйте ограничения для типизации, чтобы списки могли содержать любые числа (Integer, Double, Float и т.д)
     * 3) Для приведения Number к double воспользуйтесь num.doubleValue();
     *
     * @param name1 первый список
     * @param name2 второй список
     * @return сумма чисел.
     */
    public static <N> double sum(List<? extends Number> name1, List<? extends Number> name2) {
        if ((name1 == null) || (name2 == null)){
            throw new IllegalArgumentException();
        } else {

            double sum = 0;
            for (Number num: name1){
                sum += num.doubleValue();
            }
            for (Number num: name2){
                sum += num.doubleValue();
            }

            return sum;
        }
    }
}

