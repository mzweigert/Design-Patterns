package com.abstract_factory.domain.external;

import com.abstract_factory.common.ProgrammingLanguage;
import com.abstract_factory.domain.Programmer;
import com.abstract_factory.common.Source;

public class ExternalCSharpProgrammer extends Programmer {

    public ExternalCSharpProgrammer(long id) {
        super(id, Source.EXTERNAL);
    }

    @Override
    protected ProgrammingLanguage getKnownLanguage() {
        return ProgrammingLanguage.CSHARP;
    }
}
