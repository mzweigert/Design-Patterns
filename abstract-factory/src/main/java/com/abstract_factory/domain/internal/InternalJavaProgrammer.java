package com.abstract_factory.domain.internal;

import com.abstract_factory.common.ProgrammingLanguage;
import com.abstract_factory.domain.Programmer;
import com.abstract_factory.common.Source;

public class InternalJavaProgrammer extends Programmer {


    public InternalJavaProgrammer(long id) {
        super(id, Source.INTERNAL);
    }

    @Override
    public ProgrammingLanguage getKnownLanguage() {
        return ProgrammingLanguage.JAVA;
    }
}
