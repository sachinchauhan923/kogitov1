package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rules64ec124638a44ea19f9d20bfb6e7412e.*;
import static org.acme.travels.Rules64ec124638a44ea19f9d20bfb6e7412e.*;

public class Rules64ec124638a44ea19f9d20bfb6e7412e_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata64ec124638a44ea19f9d20bfb6e7412e.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata64ec124638a44ea19f9d20bfb6e7412e.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P24.LambdaPredicate24A9FD6D6FABBE2FC8AE55CA552D648F.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata64ec124638a44ea19f9d20bfb6e7412e.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PD7.LambdaExtractorD789FF46B2E4A6CCE512B1972BB98C9A.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PFB.LambdaConsequenceFBF3D144E47CE6C49480B8B5F427B3E8.INSTANCE));
        return rule;
    }
}
