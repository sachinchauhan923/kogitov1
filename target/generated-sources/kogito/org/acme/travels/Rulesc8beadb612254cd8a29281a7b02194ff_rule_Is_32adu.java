package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulesc8beadb612254cd8a29281a7b02194ff.*;
import static org.acme.travels.Rulesc8beadb612254cd8a29281a7b02194ff.*;

public class Rulesc8beadb612254cd8a29281a7b02194ff_rule_Is_32adu {

    /**
     * Rule name: Is adu
     */
    public static org.drools.model.Rule rule_Is_32adu() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadatac8beadb612254cd8a29281a7b02194ff.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatac8beadb612254cd8a29281a7b02194ff.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adu")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P53.LambdaPredicate53B396905D9D4CB775A66050B0B2E7C0.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadatac8beadb612254cd8a29281a7b02194ff.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P10.LambdaExtractor10475B18CEC0F31B8B23295D17172E2B.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PC4.LambdaConsequenceC470B7BF197C9E9B6757C818CFF87588.INSTANCE));
        return rule;
    }
}
