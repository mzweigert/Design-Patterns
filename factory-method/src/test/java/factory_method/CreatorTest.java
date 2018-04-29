package factory_method;

import com.factory_method.creator.BurgerCreator;
import com.factory_method.creator.Creator;
import com.factory_method.creator.PizzaCreator;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CreatorTest {

    @Test
    public void testCreatorFastFood_andCreateBurger() {
        // GIVEN
        Creator creator = new BurgerCreator();
        // WHEN
        String info = creator.createAndGetInfo();
        // THEN
        assertThat(info).isEqualTo(String.format(Creator.MESSAGE, "burger", "500"));
    }


    @Test
    public void testCreatorFastFood_andCreatePizza() {
        // GIVEN
        Creator creator = new PizzaCreator();
        // WHEN
        String info = creator.createAndGetInfo();
        // THEN
        assertThat(info).isEqualTo(String.format(Creator.MESSAGE, "pizza", "1000"));
    }
}
