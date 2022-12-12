package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rules4baa1f10474a4f7d8bc7c2727ac967cd.*;
import static org.acme.travels.Rules4baa1f10474a4f7d8bc7c2727ac967cd.*;

public class Rules4baa1f10474a4f7d8bc7c2727ac967cd_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata4baa1f10474a4f7d8bc7c2727ac967cd.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata4baa1f10474a4f7d8bc7c2727ac967cd.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P89.LambdaPredicate89F1E75546CBB4C9B9068149518622CB.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata4baa1f10474a4f7d8bc7c2727ac967cd.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PF9.LambdaExtractorF9991F06F559C9C7341C485837F3D577.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PB7.LambdaConsequenceB70DD540BB9019925D9FE58D76164A09.INSTANCE));
        return rule;
    }
}
