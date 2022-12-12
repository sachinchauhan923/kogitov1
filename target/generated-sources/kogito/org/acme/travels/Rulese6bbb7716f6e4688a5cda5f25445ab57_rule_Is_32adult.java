package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulese6bbb7716f6e4688a5cda5f25445ab57.*;
import static org.acme.travels.Rulese6bbb7716f6e4688a5cda5f25445ab57.*;

public class Rulese6bbb7716f6e4688a5cda5f25445ab57_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadatae6bbb7716f6e4688a5cda5f25445ab57.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatae6bbb7716f6e4688a5cda5f25445ab57.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.PEF.LambdaPredicateEF3A10E152F49238A0E9026D78811ADF.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadatae6bbb7716f6e4688a5cda5f25445ab57.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P14.LambdaExtractor14475ABBF89DEFEBCCFE36F603B0D206.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P1C.LambdaConsequence1CC677C33C44C5F7BBC1AA51E3DD9332.INSTANCE));
        return rule;
    }
}
