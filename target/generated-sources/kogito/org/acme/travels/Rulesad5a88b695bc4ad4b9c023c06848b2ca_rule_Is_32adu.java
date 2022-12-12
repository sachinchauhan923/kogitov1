package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulesad5a88b695bc4ad4b9c023c06848b2ca.*;
import static org.acme.travels.Rulesad5a88b695bc4ad4b9c023c06848b2ca.*;

public class Rulesad5a88b695bc4ad4b9c023c06848b2ca_rule_Is_32adu {

    /**
     * Rule name: Is adu
     */
    public static org.drools.model.Rule rule_Is_32adu() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadataad5a88b695bc4ad4b9c023c06848b2ca.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataad5a88b695bc4ad4b9c023c06848b2ca.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adu")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.PBC.LambdaPredicateBC62EE51E2E2F1B44B2F1F0D63ABAFE3.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadataad5a88b695bc4ad4b9c023c06848b2ca.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PB5.LambdaExtractorB5E1E3B5064A06773C0A0B86F1723125.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P95.LambdaConsequence95611F070EC043B384E2CB1829920899.INSTANCE));
        return rule;
    }
}
