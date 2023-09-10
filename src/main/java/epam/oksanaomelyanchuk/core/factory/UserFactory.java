package epam.oksanaomelyanchuk.core.factory;

import epam.oksanaomelyanchuk.utils.StringGenerateUtils;
import epam.oksanaomelyanchuk.core.entityBuilders.builders.UserBuilder;
import epam.oksanaomelyanchuk.core.entityBuilders.entities.User;

public class UserFactory {
    public static User getStandartUser() {
        return new UserBuilder().setName("Name").setSurname("Surname").make();
    }
    public static User getEmailUser() {
        return new UserBuilder().setEmail(StringGenerateUtils.getEmail()).make();
    }
}
