package com.abstract_factory_pattern.domain.internal;

import com.abstract_factory_pattern.common.ProgrammingLanguage;
import com.abstract_factory_pattern.domain.Programmer;
import com.abstract_factory_pattern.common.Source;

public class InternalJavaProgrammer extends Programmer {


    public InternalJavaProgrammer(long id) {
        super(id, Source.INTERNAL);
    }

    @Override
    public ProgrammingLanguage getKnownLanguage() {
        return ProgrammingLanguage.JAVA;
    }
}
