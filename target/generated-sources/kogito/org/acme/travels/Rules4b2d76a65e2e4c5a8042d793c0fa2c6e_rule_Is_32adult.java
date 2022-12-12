package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rules4b2d76a65e2e4c5a8042d793c0fa2c6e.*;
import static org.acme.travels.Rules4b2d76a65e2e4c5a8042d793c0fa2c6e.*;

public class Rules4b2d76a65e2e4c5a8042d793c0fa2c6e_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata4b2d76a65e2e4c5a8042d793c0fa2c6e.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata4b2d76a65e2e4c5a8042d793c0fa2c6e.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P47.LambdaPredicate47D4B45BC26561DFB48CD62B44B04F67.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata4b2d76a65e2e4c5a8042d793c0fa2c6e.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P85.LambdaExtractor851E71995E9CA37FFBEF8225C7B7450B.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P17.LambdaConsequence170AFCCDB2A7F1F70CE5219135CF0229.INSTANCE));
        return rule;
    }
}
