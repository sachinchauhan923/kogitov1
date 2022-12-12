package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulesd6a723d3ade342fdb4372cb84ec805cb.*;
import static org.acme.travels.Rulesd6a723d3ade342fdb4372cb84ec805cb.*;

public class Rulesd6a723d3ade342fdb4372cb84ec805cb_rule_Is_32adu {

    /**
     * Rule name: Is adu
     */
    public static org.drools.model.Rule rule_Is_32adu() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadatad6a723d3ade342fdb4372cb84ec805cb.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatad6a723d3ade342fdb4372cb84ec805cb.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adu")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.PBA.LambdaPredicateBA827F5870019B0B55CB37382B154E0E.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadatad6a723d3ade342fdb4372cb84ec805cb.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PC3.LambdaExtractorC3BAC31A27BAF82A661349C69701D266.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PCF.LambdaConsequenceCFF6CD35A6609E2C5F4A07ADED888B77.INSTANCE));
        return rule;
    }
}
