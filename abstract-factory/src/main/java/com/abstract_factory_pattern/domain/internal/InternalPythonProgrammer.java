package com.abstract_factory_pattern.domain.internal;

import com.abstract_factory_pattern.common.ProgrammingLanguage;
import com.abstract_factory_pattern.domain.Programmer;
import com.abstract_factory_pattern.common.Source;

public class InternalPythonProgrammer extends Programmer {


    public InternalPythonProgrammer(long id) {
        super(id, Source.INTERNAL);
    }

    @Override
    protected ProgrammingLanguage getKnownLanguage() {
        return ProgrammingLanguage.PYTHON;
    }
}
