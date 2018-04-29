package abstract_factory;

import com.abstract_factory.common.AbstractProgrammerFactory;
import com.abstract_factory.common.ProgrammingLanguage;
import com.abstract_factory.common.Source;
import com.abstract_factory.domain.Programmer;
import com.abstract_factory.domain.external.ExternalJavaProgrammer;
import com.abstract_factory.domain.internal.InternalJavaProgrammer;
import com.abstract_factory.factory.ExternalProgrammerFactory;
import com.abstract_factory.factory.InternalProgrammerFactory;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AbstractProgrammerFactoryTest {

    @Test
    public void testInternalProgrammerFactory(){
        // GIVEN
        AbstractProgrammerFactory factory = new InternalProgrammerFactory();
        // WHEN
        Programmer programmer = factory.borrowProgrammer(ProgrammingLanguage.JAVA);
        // THEN
        assertThat(programmer).isNotNull();
        assertThat(programmer.getId()).isNotNull();
        assertThat(programmer.getSource()).isEqualTo(Source.INTERNAL);
        assertThat(programmer.getClass()).isEqualTo(InternalJavaProgrammer.class);
    }

    @Test
    public void testExternalProgrammerFactory(){
        // GIVEN
        AbstractProgrammerFactory factory = new ExternalProgrammerFactory();
        // WHEN
        Programmer programmer = factory.borrowProgrammer(ProgrammingLanguage.JAVA);
        // THEN
        assertThat(programmer).isNotNull();
        assertThat(programmer.getId()).isNotNull();
        assertThat(programmer.getSource()).isEqualTo(Source.EXTERNAL);
        assertThat(programmer.getClass()).isEqualTo(ExternalJavaProgrammer.class);
    }
}
