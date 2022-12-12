package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulesdbef3db6ce4a43ea9aed163b6145d8f1.*;
import static org.acme.travels.Rulesdbef3db6ce4a43ea9aed163b6145d8f1.*;

public class Rulesdbef3db6ce4a43ea9aed163b6145d8f1_rule_Is_32adu {

    /**
     * Rule name: Is adu
     */
    public static org.drools.model.Rule rule_Is_32adu() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadatadbef3db6ce4a43ea9aed163b6145d8f1.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatadbef3db6ce4a43ea9aed163b6145d8f1.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adu")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P2D.LambdaPredicate2D37631B675584572E01C66F28ED3221.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadatadbef3db6ce4a43ea9aed163b6145d8f1.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P2B.LambdaExtractor2BCE709030D2FED7471AB634A65780BD.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PB2.LambdaConsequenceB23FA2A6E9245A5A8F2BD07A8BE10B89.INSTANCE));
        return rule;
    }
}
