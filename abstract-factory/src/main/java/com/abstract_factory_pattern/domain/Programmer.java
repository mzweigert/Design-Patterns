package com.abstract_factory_pattern.domain;

import com.abstract_factory_pattern.common.ProgrammingLanguage;
import com.abstract_factory_pattern.common.Source;

public abstract class Programmer {

    private final Long id;
    private final Source source;


    public Programmer(long id, Source source){
        this.id = id;
        this.source = source;
    }

    public final Long getId() {
        return id;
    }

    public Source getSource() {
        return source;
    }

    protected abstract ProgrammingLanguage getKnownLanguage();
}
