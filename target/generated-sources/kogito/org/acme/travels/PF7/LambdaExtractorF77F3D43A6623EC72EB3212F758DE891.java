package org.acme.travels.PF7;

import static org.acme.travels.Rulesa96f01e9818448c49aed27ac532d5996.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractorF77F3D43A6623EC72EB3212F758DE891 implements org.drools.model.functions.Function1<org.acme.travels.Person, Integer>, org.drools.model.functions.HashedExpression {

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
