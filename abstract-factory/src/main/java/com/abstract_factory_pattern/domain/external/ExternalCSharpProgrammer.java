package com.abstract_factory_pattern.domain.external;

import com.abstract_factory_pattern.common.ProgrammingLanguage;
import com.abstract_factory_pattern.domain.Programmer;
import com.abstract_factory_pattern.common.Source;

public class ExternalCSharpProgrammer extends Programmer {

    public ExternalCSharpProgrammer(long id) {
        super(id, Source.EXTERNAL);
    }

    @Override
    protected ProgrammingLanguage getKnownLanguage() {
        return ProgrammingLanguage.CSHARP;
    }
}
