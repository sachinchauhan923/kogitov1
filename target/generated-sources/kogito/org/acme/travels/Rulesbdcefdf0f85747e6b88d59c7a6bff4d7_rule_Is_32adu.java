package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulesbdcefdf0f85747e6b88d59c7a6bff4d7.*;
import static org.acme.travels.Rulesbdcefdf0f85747e6b88d59c7a6bff4d7.*;

public class Rulesbdcefdf0f85747e6b88d59c7a6bff4d7_rule_Is_32adu {

    /**
     * Rule name: Is adu
     */
    public static org.drools.model.Rule rule_Is_32adu() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadatabdcefdf0f85747e6b88d59c7a6bff4d7.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatabdcefdf0f85747e6b88d59c7a6bff4d7.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adu")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P0F.LambdaPredicate0FCBDD63F81F9E493803547BD7F929E9.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadatabdcefdf0f85747e6b88d59c7a6bff4d7.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P84.LambdaExtractor84240639C4677C515F1899C90525599D.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P73.LambdaConsequence73FB64AC1271DD32FA4D8586DB62F9BF.INSTANCE));
        return rule;
    }
}
