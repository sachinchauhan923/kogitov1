package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rules8fccaa12128143be94706e12f7220171.*;
import static org.acme.travels.Rules8fccaa12128143be94706e12f7220171.*;

public class Rules8fccaa12128143be94706e12f7220171_rule_Is_32adu {

    /**
     * Rule name: Is adu
     */
    public static org.drools.model.Rule rule_Is_32adu() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata8fccaa12128143be94706e12f7220171.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata8fccaa12128143be94706e12f7220171.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adu")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P7A.LambdaPredicate7AF75C9DEED92E93251CF2BE2CA67591.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata8fccaa12128143be94706e12f7220171.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P56.LambdaExtractor5616BB5EE27CF06E4CAA435CF2CB034D.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PAE.LambdaConsequenceAE7EC68615E0D1933CA59583A2DEFD34.INSTANCE));
        return rule;
    }
}
