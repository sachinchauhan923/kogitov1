package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulesbbe3bb61b7cb4bc086fe4af0862951be.*;
import static org.acme.travels.Rulesbbe3bb61b7cb4bc086fe4af0862951be.*;

public class Rulesbbe3bb61b7cb4bc086fe4af0862951be_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadatabbe3bb61b7cb4bc086fe4af0862951be.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatabbe3bb61b7cb4bc086fe4af0862951be.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P36.LambdaPredicate36C213D8ACC5B1F41149A142AE4DE0F1.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadatabbe3bb61b7cb4bc086fe4af0862951be.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.P76.LambdaExtractor760254A06B4470DAECD814649F7C7074.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PBE.LambdaConsequenceBE442804B724D3DEE865147A2E201E1A.INSTANCE));
        return rule;
    }
}
