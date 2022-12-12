package org.acme.travels.P04;

import static org.acme.travels.Rulese4c640a7434041788030f93d1c4ab69a.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequence0417D89B968CFB0C2EBBD3999A66F718 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.travels.Person>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "7D454CCC4A369E49EDC945CA20C25616";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatae4c640a7434041788030f93d1c4ab69a.org_acme_travels_Person_Metadata_INSTANCE, "adult");

    @Override()
    public void execute(org.drools.model.Drools drools, org.acme.travels.Person $person) throws java.lang.Exception {
        {
            {
                ($person).setAdult(true);
            }
            drools.update($person, mask_$person);
        }
    }
}
