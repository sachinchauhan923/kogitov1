package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rules6a2efd736a704460a51d18f40381a66f.*;
import static org.acme.travels.Rules6a2efd736a704460a51d18f40381a66f.*;

public class Rules6a2efd736a704460a51d18f40381a66f_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata6a2efd736a704460a51d18f40381a66f.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata6a2efd736a704460a51d18f40381a66f.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P63.LambdaPredicate63969E48B73C0028FCB977E913124873.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata6a2efd736a704460a51d18f40381a66f.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P53.LambdaExtractor53EDF11BD44A1F7374ABA46D87F679A4.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PBD.LambdaConsequenceBD9D325B69B7AB224132759522B1D8CD.INSTANCE));
        return rule;
    }
}
