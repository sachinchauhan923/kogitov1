package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulese9ab80fcf6d64205825e8832a2d6fac4.*;
import static org.acme.travels.Rulese9ab80fcf6d64205825e8832a2d6fac4.*;

public class Rulese9ab80fcf6d64205825e8832a2d6fac4_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadatae9ab80fcf6d64205825e8832a2d6fac4.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatae9ab80fcf6d64205825e8832a2d6fac4.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P39.LambdaPredicate39E81434649322B8B394389D1A0BE0FF.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadatae9ab80fcf6d64205825e8832a2d6fac4.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PDD.LambdaExtractorDD65EC919F5D00AD303B3EDED7AB30CB.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P18.LambdaConsequence18B9ADEAEAF48D93771E7E7C3EDDF1FF.INSTANCE));
        return rule;
    }
}
