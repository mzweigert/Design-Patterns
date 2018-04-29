package com.abstract_factory_pattern.domain.external;

import com.abstract_factory_pattern.common.ProgrammingLanguage;
import com.abstract_factory_pattern.domain.Programmer;
import com.abstract_factory_pattern.common.Source;

public class ExternalJavaProgrammer extends Programmer {


    public ExternalJavaProgrammer(long id) {
        super(id, Source.EXTERNAL);
    }

    @Override
    public ProgrammingLanguage getKnownLanguage() {
        return ProgrammingLanguage.JAVA;
    }
}
