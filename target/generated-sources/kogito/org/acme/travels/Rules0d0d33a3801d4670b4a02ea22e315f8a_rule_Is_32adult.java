package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rules0d0d33a3801d4670b4a02ea22e315f8a.*;
import static org.acme.travels.Rules0d0d33a3801d4670b4a02ea22e315f8a.*;

public class Rules0d0d33a3801d4670b4a02ea22e315f8a_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata0d0d33a3801d4670b4a02ea22e315f8a.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata0d0d33a3801d4670b4a02ea22e315f8a.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P8E.LambdaPredicate8E2F991D64DDD66AC254881B40CF8CCA.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata0d0d33a3801d4670b4a02ea22e315f8a.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PDE.LambdaExtractorDE0B5CC2D7C6FE7BD36B470FD06EE38F.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P39.LambdaConsequence39B154D431019BFBFBEF82FB6AC8B183.INSTANCE));
        return rule;
    }
}
