package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulesa0d41932c4d5457aa3cb55d209c30bf3.*;
import static org.acme.travels.Rulesa0d41932c4d5457aa3cb55d209c30bf3.*;

public class Rulesa0d41932c4d5457aa3cb55d209c30bf3_rule_Is_32adu {

    /**
     * Rule name: Is adu
     */
    public static org.drools.model.Rule rule_Is_32adu() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadataa0d41932c4d5457aa3cb55d209c30bf3.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataa0d41932c4d5457aa3cb55d209c30bf3.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adu")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P83.LambdaPredicate83BF519DAC82B5D4AD9F0FEB8B9A35C7.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadataa0d41932c4d5457aa3cb55d209c30bf3.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P5F.LambdaExtractor5FF61F309AFF403CB792732D6F6A1F24.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P31.LambdaConsequence3107C6C90331F2B304BE4E2E09A4AA9E.INSTANCE));
        return rule;
    }
}
