package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulesc1fe190909df4ecd8367e5caee9d09d1.*;
import static org.acme.travels.Rulesc1fe190909df4ecd8367e5caee9d09d1.*;

public class Rulesc1fe190909df4ecd8367e5caee9d09d1_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadatac1fe190909df4ecd8367e5caee9d09d1.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatac1fe190909df4ecd8367e5caee9d09d1.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.PFB.LambdaPredicateFB9D22ED0E4484C4EF59C3A0D6510C95.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadatac1fe190909df4ecd8367e5caee9d09d1.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P9A.LambdaExtractor9A9DA75F009D1A50FF2885E64F3BAE59.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P7F.LambdaConsequence7F4D08A172D778FD6FC6F5AAEED3673A.INSTANCE));
        return rule;
    }
}
