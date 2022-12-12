package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulesb6c3cab89cfe48faa9ac3784c6dcebf1.*;
import static org.acme.travels.Rulesb6c3cab89cfe48faa9ac3784c6dcebf1.*;

public class Rulesb6c3cab89cfe48faa9ac3784c6dcebf1_rule_Is_32adu {

    /**
     * Rule name: Is adu
     */
    public static org.drools.model.Rule rule_Is_32adu() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadatab6c3cab89cfe48faa9ac3784c6dcebf1.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatab6c3cab89cfe48faa9ac3784c6dcebf1.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adu")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P16.LambdaPredicate168F1B40824060BCF03971BBD564708A.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadatab6c3cab89cfe48faa9ac3784c6dcebf1.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PBF.LambdaExtractorBF6AE01AD5999F6A0F0D3C6E75E03E1B.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PD8.LambdaConsequenceD802CE53A56A35F0E65B07823D6D1CFC.INSTANCE));
        return rule;
    }
}
