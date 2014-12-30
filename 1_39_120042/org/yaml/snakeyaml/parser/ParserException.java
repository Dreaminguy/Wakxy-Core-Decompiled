package org.yaml.snakeyaml.parser;

import org.yaml.snakeyaml.error.*;

public class ParserException extends MarkedYAMLException
{
    private static final long serialVersionUID = -2349253802798398038L;
    
    public ParserException(final String context, final Mark contextMark, final String problem, final Mark problemMark) {
        super(context, contextMark, problem, problemMark, null, null);
    }
}
