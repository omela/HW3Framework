package epam.oksanaomelyanchuk.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class StringGenerateUtils {
    public static String getEmail() {
        StringBuilder str = new StringBuilder();
        str.append(RandomStringUtils.randomAlphabetic(5)).append("@").append(RandomStringUtils.randomAlphabetic(3)).append(".com");
        return str.toString();
    }
}
