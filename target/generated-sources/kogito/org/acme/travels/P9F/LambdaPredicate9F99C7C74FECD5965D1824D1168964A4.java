package org.acme.travels.P9F;

import static org.acme.travels.Rulesfac94a9bef2448de875f8a20ab6d2e47.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate9F99C7C74FECD5965D1824D1168964A4 implements org.drools.model.functions.Predicate1<org.acme.travels.Person>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "A14534181BDAB950D84BDF78ACC34B55";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    @Override()
    public boolean test(org.acme.travels.Person _this) throws java.lang.Exception {
        return org.drools.modelcompiler.util.EvaluationUtil.greaterThanNumbers(_this.getAge(), 18);
    }

    @Override()
    public org.drools.model.functions.PredicateInformation predicateInformation() {
        org.drools.model.functions.PredicateInformation info = new org.drools.model.functions.PredicateInformation("age > 18");
        info.addRuleNames("Is adu", "/Users/sachinchauhan/Downloads/kogito-examples-stable 3/kogito-springboot-examples/process-business-rules-springboot/src/main/resources/org/acme/travels/M1Addon-rules.drl", "Is adult", "/Users/sachinchauhan/Downloads/kogito-examples-stable 3/kogito-springboot-examples/process-business-rules-springboot/src/main/resources/org/acme/travels/person-rules.drl");
        return info;
    }
}
