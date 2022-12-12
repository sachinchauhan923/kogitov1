package org.acme.travels.PA5;

import static org.acme.travels.Ruleseba99689836d4a0cb21006fed605762f.*;
import org.acme.travels.*;
import org.acme.travels.Person;
import org.drools.modelcompiler.dsl.pattern.D;

@org.drools.compiler.kie.builder.MaterializedLambda()
public enum LambdaConsequenceA515902D94BD21F5F35203640B656256 implements org.drools.model.functions.Block2<org.drools.model.Drools, org.acme.travels.Person>, org.drools.model.functions.HashedExpression {

    INSTANCE;

    public static final String EXPRESSION_HASH = "7D454CCC4A369E49EDC945CA20C25616";

    public java.lang.String getExpressionHash() {
        return EXPRESSION_HASH;
    }

    private final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataeba99689836d4a0cb21006fed605762f.org_acme_travels_Person_Metadata_INSTANCE, "adult");

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
