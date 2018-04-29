package com.abstract_factory_pattern.common;

import com.abstract_factory_pattern.domain.Programmer;

public interface AbstractProgrammerFactory {
    Programmer borrowProgrammer(ProgrammingLanguage type);
}
