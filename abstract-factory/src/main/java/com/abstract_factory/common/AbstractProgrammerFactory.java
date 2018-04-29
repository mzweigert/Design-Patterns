package com.abstract_factory.common;

import com.abstract_factory.domain.Programmer;

public interface AbstractProgrammerFactory {
    Programmer borrowProgrammer(ProgrammingLanguage type);
}
