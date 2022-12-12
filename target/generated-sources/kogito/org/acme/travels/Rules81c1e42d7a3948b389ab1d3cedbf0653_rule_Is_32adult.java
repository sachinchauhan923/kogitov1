package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rules81c1e42d7a3948b389ab1d3cedbf0653.*;
import static org.acme.travels.Rules81c1e42d7a3948b389ab1d3cedbf0653.*;

public class Rules81c1e42d7a3948b389ab1d3cedbf0653_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata81c1e42d7a3948b389ab1d3cedbf0653.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata81c1e42d7a3948b389ab1d3cedbf0653.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P9C.LambdaPredicate9C1920E8FB1244448CDB2884BCD422D9.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata81c1e42d7a3948b389ab1d3cedbf0653.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P64.LambdaExtractor64BD88EDA745C0E5BCCE9D55BEA515AB.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P8D.LambdaConsequence8DC8C9F73BAE2D63A50AE3F43EA94C4F.INSTANCE));
        return rule;
    }
}
