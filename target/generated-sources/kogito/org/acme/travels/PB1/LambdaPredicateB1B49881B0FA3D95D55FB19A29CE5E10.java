package org.acme.travels.PB1;

import static org.acme.travels.Rulesb7868edfadb341e49ba6ec9bbcf8df74.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaPredicateB1B49881B0FA3D95D55FB19A29CE5E10 implements org.drools.model.functions.Predicate1<org.acme.travels.Person>, org.drools.model.functions.HashedExpression {

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
