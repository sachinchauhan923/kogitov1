package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulesb30f34b4c9df4cb1b1802a7a46da9566.*;
import static org.acme.travels.Rulesb30f34b4c9df4cb1b1802a7a46da9566.*;

public class Rulesb30f34b4c9df4cb1b1802a7a46da9566_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadatab30f34b4c9df4cb1b1802a7a46da9566.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatab30f34b4c9df4cb1b1802a7a46da9566.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.PDB.LambdaPredicateDB0F558E7EEF5ADA9FC0798D34AC03E2.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadatab30f34b4c9df4cb1b1802a7a46da9566.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P99.LambdaExtractor998A0685851CFA92F30F76EB31D4729C.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P19.LambdaConsequence19782F108637B1A660CC8E278B8CA2E6.INSTANCE));
        return rule;
    }
}
