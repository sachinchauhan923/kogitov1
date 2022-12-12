package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulesb9b63fb7fc1a4a67aec4fda4b93e56e8.*;
import static org.acme.travels.Rulesb9b63fb7fc1a4a67aec4fda4b93e56e8.*;

public class Rulesb9b63fb7fc1a4a67aec4fda4b93e56e8_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadatab9b63fb7fc1a4a67aec4fda4b93e56e8.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatab9b63fb7fc1a4a67aec4fda4b93e56e8.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.PAC.LambdaPredicateAC8E6076D9CFDDD33899156851E5E20F.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadatab9b63fb7fc1a4a67aec4fda4b93e56e8.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PED.LambdaExtractorED6403A1506416D50C081FC8CB48CE18.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P12.LambdaConsequence1236AD2BB37BA583F71C7B6882AD565C.INSTANCE));
        return rule;
    }
}
