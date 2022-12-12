package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulesac7ff63c95ff4ed6ad3aa7c94800a0b0.*;
import static org.acme.travels.Rulesac7ff63c95ff4ed6ad3aa7c94800a0b0.*;

public class Rulesac7ff63c95ff4ed6ad3aa7c94800a0b0_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadataac7ff63c95ff4ed6ad3aa7c94800a0b0.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataac7ff63c95ff4ed6ad3aa7c94800a0b0.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P7F.LambdaPredicate7FFA0ECDA43EC61A70353C3578A93E85.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadataac7ff63c95ff4ed6ad3aa7c94800a0b0.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P2A.LambdaExtractor2A37F00F0355886A6FF643C7569834EE.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P33.LambdaConsequence3383138ADAD2F8AA8F067D50C385FC16.INSTANCE));
        return rule;
    }
}
