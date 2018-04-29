package com.abstract_factory.domain.external;

import com.abstract_factory.common.ProgrammingLanguage;
import com.abstract_factory.domain.Programmer;
import com.abstract_factory.common.Source;

public class ExternalJavaProgrammer extends Programmer {


    public ExternalJavaProgrammer(long id) {
        super(id, Source.EXTERNAL);
    }

    @Override
    public ProgrammingLanguage getKnownLanguage() {
        return ProgrammingLanguage.JAVA;
    }
}
