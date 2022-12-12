package org.acme.travels.P03;

import static org.acme.travels.Rules5b794ed76fa649738c8561eb3140384c.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicate03C0E9F48FF7F3A33DB811C6A92F8597 implements org.drools.model.functions.Predicate1<org.acme.travels.Person>, org.drools.model.functions.HashedExpression {

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
