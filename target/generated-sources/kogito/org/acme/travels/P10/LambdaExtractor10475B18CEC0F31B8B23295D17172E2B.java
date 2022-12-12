package org.acme.travels.P10;

import static org.acme.travels.Rulesc8beadb612254cd8a29281a7b02194ff.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor10475B18CEC0F31B8B23295D17172E2B implements org.drools.model.functions.Function1<org.acme.travels.Person, Integer>, org.drools.model.functions.HashedExpression {

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
