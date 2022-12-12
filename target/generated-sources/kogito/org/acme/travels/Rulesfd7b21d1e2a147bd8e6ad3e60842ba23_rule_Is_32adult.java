package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulesfd7b21d1e2a147bd8e6ad3e60842ba23.*;
import static org.acme.travels.Rulesfd7b21d1e2a147bd8e6ad3e60842ba23.*;

public class Rulesfd7b21d1e2a147bd8e6ad3e60842ba23_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadatafd7b21d1e2a147bd8e6ad3e60842ba23.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatafd7b21d1e2a147bd8e6ad3e60842ba23.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P3F.LambdaPredicate3FF98BF7560AEBC61C7E59A3CB34F203.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadatafd7b21d1e2a147bd8e6ad3e60842ba23.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PFB.LambdaExtractorFB2DA1B1CD3A43A492B7C79454C081E7.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P50.LambdaConsequence5048FC28C54A0055E5A65E40769EBCFB.INSTANCE));
        return rule;
    }
}
