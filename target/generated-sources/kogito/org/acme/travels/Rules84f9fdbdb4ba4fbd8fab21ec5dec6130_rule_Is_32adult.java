package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rules84f9fdbdb4ba4fbd8fab21ec5dec6130.*;
import static org.acme.travels.Rules84f9fdbdb4ba4fbd8fab21ec5dec6130.*;

public class Rules84f9fdbdb4ba4fbd8fab21ec5dec6130_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata84f9fdbdb4ba4fbd8fab21ec5dec6130.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata84f9fdbdb4ba4fbd8fab21ec5dec6130.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P10.LambdaPredicate105EDA6A397AEC16CA4EBE8BACB245A0.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata84f9fdbdb4ba4fbd8fab21ec5dec6130.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P31.LambdaExtractor31077D243EF602A230A98C65454BD9EE.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P55.LambdaConsequence55EFF2A8391ECF52AF52E2E72169E520.INSTANCE));
        return rule;
    }
}
