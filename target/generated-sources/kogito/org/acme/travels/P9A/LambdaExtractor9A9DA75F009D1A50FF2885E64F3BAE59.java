package org.acme.travels.P9A;

import static org.acme.travels.Rulesc1fe190909df4ecd8367e5caee9d09d1.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor9A9DA75F009D1A50FF2885E64F3BAE59 implements org.drools.model.functions.Function1<org.acme.travels.Person, Integer>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "5304D0F915BA9118A48705AB560D2163";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public Integer apply(org.acme.travels.Person _this) {
        return _this.getAge();
    }
}
