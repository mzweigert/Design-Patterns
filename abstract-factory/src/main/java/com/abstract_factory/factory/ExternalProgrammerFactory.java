package com.abstract_factory.factory;

import com.abstract_factory.common.ProgrammingLanguage;
import com.abstract_factory.common.AbstractProgrammerFactory;
import com.abstract_factory.common.IdGenerator;
import com.abstract_factory.domain.Programmer;
import com.abstract_factory.domain.external.ExternalCSharpProgrammer;
import com.abstract_factory.domain.external.ExternalJavaProgrammer;
import com.abstract_factory.domain.external.ExternalPythonProgrammer;

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
