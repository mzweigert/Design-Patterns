package com.abstract_factory.factory;

import com.abstract_factory.common.ProgrammingLanguage;
import com.abstract_factory.common.AbstractProgrammerFactory;
import com.abstract_factory.common.IdGenerator;
import com.abstract_factory.domain.Programmer;
import com.abstract_factory.domain.internal.InternalCSharpProgrammer;
import com.abstract_factory.domain.internal.InternalJavaProgrammer;
import com.abstract_factory.domain.internal.InternalPythonProgrammer;

public class InternalProgrammerFactory implements AbstractProgrammerFactory {

    @Override
    public Programmer borrowProgrammer(ProgrammingLanguage type) {
        Long id = IdGenerator.nextId();
        switch (type) {
            case JAVA:
                return new InternalJavaProgrammer(id);
            case CSHARP:
                return new InternalCSharpProgrammer(id);
            case PYTHON:
                return new InternalPythonProgrammer(id);
        }
        return null;
    }
}
