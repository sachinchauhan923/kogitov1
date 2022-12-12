package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rules2722aa2a9da944f6acad463ea213d599.*;
import static org.acme.travels.Rules2722aa2a9da944f6acad463ea213d599.*;

public class Rules2722aa2a9da944f6acad463ea213d599_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata2722aa2a9da944f6acad463ea213d599.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata2722aa2a9da944f6acad463ea213d599.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P1E.LambdaPredicate1E4F37CCA8C47E54311F4028E7919847.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata2722aa2a9da944f6acad463ea213d599.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P90.LambdaExtractor901D46E85852D0B430324CBE49342812.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PA5.LambdaConsequenceA5981AF6A4662829622BCD62CB0A7F73.INSTANCE));
        return rule;
    }
}
