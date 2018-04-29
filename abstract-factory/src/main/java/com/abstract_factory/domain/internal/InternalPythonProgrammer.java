package com.abstract_factory.domain.internal;

import com.abstract_factory.common.ProgrammingLanguage;
import com.abstract_factory.domain.Programmer;
import com.abstract_factory.common.Source;

public class InternalPythonProgrammer extends Programmer {


    public InternalPythonProgrammer(long id) {
        super(id, Source.INTERNAL);
    }

    @Override
    protected ProgrammingLanguage getKnownLanguage() {
        return ProgrammingLanguage.PYTHON;
    }
}
