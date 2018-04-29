package com.abstract_factory_pattern.factory;

import com.abstract_factory_pattern.common.ProgrammingLanguage;
import com.abstract_factory_pattern.common.AbstractProgrammerFactory;
import com.abstract_factory_pattern.common.IdGenerator;
import com.abstract_factory_pattern.domain.Programmer;
import com.abstract_factory_pattern.domain.external.ExternalCSharpProgrammer;
import com.abstract_factory_pattern.domain.external.ExternalJavaProgrammer;
import com.abstract_factory_pattern.domain.external.ExternalPythonProgrammer;

public class ExternalProgrammerFactory  implements AbstractProgrammerFactory {

    @Override
    public Programmer borrowProgrammer(ProgrammingLanguage type) {
        Long id = IdGenerator.nextId();
        switch (type) {
            case JAVA:
                return new ExternalJavaProgrammer(id);
            case CSHARP:
                return new ExternalCSharpProgrammer(id);
            case PYTHON:
                return new ExternalPythonProgrammer(id);
        }
        return null;
    }
}
