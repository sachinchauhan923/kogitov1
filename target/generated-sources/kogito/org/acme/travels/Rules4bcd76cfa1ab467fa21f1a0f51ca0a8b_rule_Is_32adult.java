package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rules4bcd76cfa1ab467fa21f1a0f51ca0a8b.*;
import static org.acme.travels.Rules4bcd76cfa1ab467fa21f1a0f51ca0a8b.*;

public class Rules4bcd76cfa1ab467fa21f1a0f51ca0a8b_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata4bcd76cfa1ab467fa21f1a0f51ca0a8b.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata4bcd76cfa1ab467fa21f1a0f51ca0a8b.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.PC5.LambdaPredicateC5585C3A35438FDCBF7A742B06DF2E0F.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata4bcd76cfa1ab467fa21f1a0f51ca0a8b.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P69.LambdaExtractor69355CCE8FAB78A25D2199727A573B0F.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PF9.LambdaConsequenceF9DCC8D980266C631A6B88DF165B4F79.INSTANCE));
        return rule;
    }
}
