package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulesa337fdc895894e6fb5741a5d7eddb7e4.*;
import static org.acme.travels.Rulesa337fdc895894e6fb5741a5d7eddb7e4.*;

public class Rulesa337fdc895894e6fb5741a5d7eddb7e4_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadataa337fdc895894e6fb5741a5d7eddb7e4.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataa337fdc895894e6fb5741a5d7eddb7e4.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.PD2.LambdaPredicateD2173670CE83BCEA74D0300D28A19B95.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadataa337fdc895894e6fb5741a5d7eddb7e4.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P5B.LambdaExtractor5BF2A806ECDB5223BDF4CA2744C36545.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P33.LambdaConsequence337B7A6953E4E2AE98ABE61FC5FA0BA5.INSTANCE));
        return rule;
    }
}
