package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rules5b11bcca02ff48c6aecf8dba0d87c302.*;
import static org.acme.travels.Rules5b11bcca02ff48c6aecf8dba0d87c302.*;

public class Rules5b11bcca02ff48c6aecf8dba0d87c302_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata5b11bcca02ff48c6aecf8dba0d87c302.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata5b11bcca02ff48c6aecf8dba0d87c302.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.PEB.LambdaPredicateEBA4943B0954173491E4BB65E8991219.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata5b11bcca02ff48c6aecf8dba0d87c302.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P9C.LambdaExtractor9C864DF3B91DCBC05A67103CF410B846.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PBF.LambdaConsequenceBF50AB9CBF16CEDD8BF9CEA571432E9C.INSTANCE));
        return rule;
    }
}
