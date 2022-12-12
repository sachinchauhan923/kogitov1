package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rules1c37e43ad4994c5cb9ece6ce7ef3ba31.*;
import static org.acme.travels.Rules1c37e43ad4994c5cb9ece6ce7ef3ba31.*;

public class Rules1c37e43ad4994c5cb9ece6ce7ef3ba31_rule_Is_32adu {

    /**
     * Rule name: Is adu
     */
    public static org.drools.model.Rule rule_Is_32adu() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata1c37e43ad4994c5cb9ece6ce7ef3ba31.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata1c37e43ad4994c5cb9ece6ce7ef3ba31.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adu")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P81.LambdaPredicate81CE45CD4382A28D6F24B3D74A42E4B3.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata1c37e43ad4994c5cb9ece6ce7ef3ba31.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P4C.LambdaExtractor4C2915058222982D30546A7194217955.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P83.LambdaConsequence8367F9A5F5B145E7DE4349ECFB5B1077.INSTANCE));
        return rule;
    }
}
