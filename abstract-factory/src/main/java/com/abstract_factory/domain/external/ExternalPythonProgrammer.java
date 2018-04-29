package com.abstract_factory.domain.external;

import com.abstract_factory.common.ProgrammingLanguage;
import com.abstract_factory.domain.Programmer;
import com.abstract_factory.common.Source;

public class ExternalPythonProgrammer extends Programmer {


    public ExternalPythonProgrammer(long id) {
        super(id, Source.INTERNAL);
    }

    @Override
    protected ProgrammingLanguage getKnownLanguage() {
        return ProgrammingLanguage.PYTHON;
    }
}
