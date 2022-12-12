package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rules28666a0fd2634a84a2f49c05988f8ec5.*;
import static org.acme.travels.Rules28666a0fd2634a84a2f49c05988f8ec5.*;

public class Rules28666a0fd2634a84a2f49c05988f8ec5_rule_Is_32adu {

    /**
     * Rule name: Is adu
     */
    public static org.drools.model.Rule rule_Is_32adu() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata28666a0fd2634a84a2f49c05988f8ec5.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata28666a0fd2634a84a2f49c05988f8ec5.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adu")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.PB0.LambdaPredicateB01D285D1F871D962E4C4226BF0851EF.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata28666a0fd2634a84a2f49c05988f8ec5.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PED.LambdaExtractorED3ABA0C4BEF92D0ECA8AE9AB9870466.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P64.LambdaConsequence644301D0A2761D5A64F4D78D3B56439B.INSTANCE));
        return rule;
    }
}
