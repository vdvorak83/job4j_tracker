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

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        // if contains throw ElementAbuseException
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            FindEl.indexOf(new String[]{"value"}, "key");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
