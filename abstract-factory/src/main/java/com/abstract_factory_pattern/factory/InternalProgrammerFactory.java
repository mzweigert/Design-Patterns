package com.abstract_factory_pattern.factory;

import com.abstract_factory_pattern.common.ProgrammingLanguage;
import com.abstract_factory_pattern.common.AbstractProgrammerFactory;
import com.abstract_factory_pattern.common.IdGenerator;
import com.abstract_factory_pattern.domain.Programmer;
import com.abstract_factory_pattern.domain.internal.InternalCSharpProgrammer;
import com.abstract_factory_pattern.domain.internal.InternalJavaProgrammer;
import com.abstract_factory_pattern.domain.internal.InternalPythonProgrammer;

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
