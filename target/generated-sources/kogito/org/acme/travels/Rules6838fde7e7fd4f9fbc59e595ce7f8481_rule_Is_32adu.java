package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rules6838fde7e7fd4f9fbc59e595ce7f8481.*;
import static org.acme.travels.Rules6838fde7e7fd4f9fbc59e595ce7f8481.*;

public class Rules6838fde7e7fd4f9fbc59e595ce7f8481_rule_Is_32adu {

    /**
     * Rule name: Is adu
     */
    public static org.drools.model.Rule rule_Is_32adu() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata6838fde7e7fd4f9fbc59e595ce7f8481.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata6838fde7e7fd4f9fbc59e595ce7f8481.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adu")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.PF3.LambdaPredicateF36D5387BE07DE4877DD6D07EDB40C26.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata6838fde7e7fd4f9fbc59e595ce7f8481.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PFE.LambdaExtractorFEA750BF659E6AC6C4A157F23B85BBD7.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P42.LambdaConsequence42B6E4709A456FEFD91B98A0FB91E97C.INSTANCE));
        return rule;
    }
}
