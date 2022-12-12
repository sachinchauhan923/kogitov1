package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulesc1cec2c5ece04e3d8d8bd8019e1cb491.*;
import static org.acme.travels.Rulesc1cec2c5ece04e3d8d8bd8019e1cb491.*;

public class Rulesc1cec2c5ece04e3d8d8bd8019e1cb491_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadatac1cec2c5ece04e3d8d8bd8019e1cb491.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatac1cec2c5ece04e3d8d8bd8019e1cb491.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.PDA.LambdaPredicateDAC7F47B638D5978E5839F442033A897.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadatac1cec2c5ece04e3d8d8bd8019e1cb491.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P6E.LambdaExtractor6ED88A62AFB323C8197A0EDEA729E47E.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PE5.LambdaConsequenceE5286C2BF29E1D6E1D2188A58F46927D.INSTANCE));
        return rule;
    }
}
