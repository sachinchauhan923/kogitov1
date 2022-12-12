package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulesf1a55ed18bb74121bd04c8d851ce34a0.*;
import static org.acme.travels.Rulesf1a55ed18bb74121bd04c8d851ce34a0.*;

public class Rulesf1a55ed18bb74121bd04c8d851ce34a0_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadataf1a55ed18bb74121bd04c8d851ce34a0.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataf1a55ed18bb74121bd04c8d851ce34a0.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.PDE.LambdaPredicateDECB3E69F1C842AFB19619F264FCC8BC.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadataf1a55ed18bb74121bd04c8d851ce34a0.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P41.LambdaExtractor412FCA04E67A70D93B3A9E7715E0FF57.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P13.LambdaConsequence13C11576C6F37B58CA7F8A15B4AC45CD.INSTANCE));
        return rule;
    }
}
