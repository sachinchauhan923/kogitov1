package org.acme.travels.PF6;

import static org.acme.travels.Rules670952c8df664a4691631166dffd4315.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateF65A0C2CAEAD1759F1B1BB9C54D94CCC implements org.drools.model.functions.Predicate1<org.acme.travels.Person>, org.drools.model.functions.HashedExpression {

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
        info.addRuleNames("Is adult", "/Users/sachinchauhan/Downloads/kogito-examples-stable 3/kogito-springboot-examples/process-business-rules-springboot/src/main/resources/org/acme/travels/person-rules.drl");
        return info;
    }
}
