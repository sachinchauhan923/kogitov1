package org.acme.travels.P53;

import static org.acme.travels.Rules6a2efd736a704460a51d18f40381a66f.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor53EDF11BD44A1F7374ABA46D87F679A4 implements org.drools.model.functions.Function1<org.acme.travels.Person, Integer>, org.drools.model.functions.HashedExpression {

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
