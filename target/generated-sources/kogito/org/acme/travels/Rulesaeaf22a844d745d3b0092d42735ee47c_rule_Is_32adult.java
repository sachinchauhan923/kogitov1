package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulesaeaf22a844d745d3b0092d42735ee47c.*;
import static org.acme.travels.Rulesaeaf22a844d745d3b0092d42735ee47c.*;

public class Rulesaeaf22a844d745d3b0092d42735ee47c_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadataaeaf22a844d745d3b0092d42735ee47c.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadataaeaf22a844d745d3b0092d42735ee47c.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P1F.LambdaPredicate1FA7D7DEE589FFDEBD8A8F5F70629A94.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadataaeaf22a844d745d3b0092d42735ee47c.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PEC.LambdaExtractorECDC415B35263ACBD6BC80F690F64F47.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PB4.LambdaConsequenceB4626FFB5C1295F2E48B38F83B29440D.INSTANCE));
        return rule;
    }
}
