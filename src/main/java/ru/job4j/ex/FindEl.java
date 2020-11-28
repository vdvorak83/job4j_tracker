package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int item = 0; item < value.length; item++) {
            if (value[item].equals(key)) {
                rsl = item;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Элемента нет");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            FindEl.indexOf(new String[]{"value"}, "key");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
