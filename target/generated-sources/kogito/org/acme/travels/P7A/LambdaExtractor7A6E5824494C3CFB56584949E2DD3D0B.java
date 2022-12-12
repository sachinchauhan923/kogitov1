package org.acme.travels.P7A;

import static org.acme.travels.Rules163cb636071645eebae1456292ae037c.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaExtractor7A6E5824494C3CFB56584949E2DD3D0B implements org.drools.model.functions.Function1<org.acme.travels.Person, Integer>, org.drools.model.functions.HashedExpression {

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
