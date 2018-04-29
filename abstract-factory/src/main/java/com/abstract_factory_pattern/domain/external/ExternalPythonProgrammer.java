package com.abstract_factory_pattern.domain.external;

import com.abstract_factory_pattern.common.ProgrammingLanguage;
import com.abstract_factory_pattern.domain.Programmer;
import com.abstract_factory_pattern.common.Source;

public class ExternalPythonProgrammer extends Programmer {


    public ExternalPythonProgrammer(long id) {
        super(id, Source.INTERNAL);
    }

    @Override
    protected ProgrammingLanguage getKnownLanguage() {
        return ProgrammingLanguage.PYTHON;
    }
}
