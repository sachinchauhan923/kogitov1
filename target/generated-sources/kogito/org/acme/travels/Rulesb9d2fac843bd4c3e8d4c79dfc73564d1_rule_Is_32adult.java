package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulesb9d2fac843bd4c3e8d4c79dfc73564d1.*;
import static org.acme.travels.Rulesb9d2fac843bd4c3e8d4c79dfc73564d1.*;

public class Rulesb9d2fac843bd4c3e8d4c79dfc73564d1_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadatab9d2fac843bd4c3e8d4c79dfc73564d1.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatab9d2fac843bd4c3e8d4c79dfc73564d1.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P7B.LambdaPredicate7B29B1DE5874EDDBC3D53233B3C90736.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadatab9d2fac843bd4c3e8d4c79dfc73564d1.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PD8.LambdaExtractorD8E7A73156874553077622AEC6AB9C0D.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PFB.LambdaConsequenceFB965F70920F167FD60A74D6489B3F71.INSTANCE));
        return rule;
    }
}
