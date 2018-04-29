package abstract_factory_pattern;

import com.abstract_factory_pattern.common.AbstractProgrammerFactory;
import com.abstract_factory_pattern.common.ProgrammingLanguage;
import com.abstract_factory_pattern.common.Source;
import com.abstract_factory_pattern.domain.Programmer;
import com.abstract_factory_pattern.domain.external.ExternalJavaProgrammer;
import com.abstract_factory_pattern.domain.internal.InternalJavaProgrammer;
import com.abstract_factory_pattern.factory.ExternalProgrammerFactory;
import com.abstract_factory_pattern.factory.InternalProgrammerFactory;
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
