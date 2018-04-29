package observer;

import observer.observable.InternetShop;
import observer.observable.Observable;
import observer.observer.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ObserverTest {

    @Test
    public void testObservers() {
        // GIVEN
        List<User> users = createUsersList();
        InternetShop shop = new InternetShop();
        new Billboard(shop);
        new PhoneNotificator(users.get(0), shop);
        new PhoneNotificator(users.get(1), shop);
        new PhoneNotificator(users.get(2), shop);
        new MailSender(users, shop);

        // WHEN
        shop.lowerThePrice();

        // THEN
        assertThat(shop.sizeOfObservers()).isEqualTo(5);
    }
    private List<User> createUsersList(){
        List<User> list = new ArrayList<>();
        for(int i=0; i<3; i++){
            list.add(new User("user" + i));
        }
        return list;
    }
}
