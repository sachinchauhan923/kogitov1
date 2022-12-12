package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rules6a08b0c1dba04edabff5158b3ba8eb80.*;
import static org.acme.travels.Rules6a08b0c1dba04edabff5158b3ba8eb80.*;

public class Rules6a08b0c1dba04edabff5158b3ba8eb80_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata6a08b0c1dba04edabff5158b3ba8eb80.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata6a08b0c1dba04edabff5158b3ba8eb80.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P7B.LambdaPredicate7B65818377B3FAC73480A72A9D3B7FB9.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata6a08b0c1dba04edabff5158b3ba8eb80.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PC5.LambdaExtractorC5178D2A3B81487D0761EDA2BD8DA966.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P07.LambdaConsequence075BEEBC09A05FD5A684AB63DFC17A7E.INSTANCE));
        return rule;
    }
}
