package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rulesfbda3e9660c8408ea18cc79bcd86df4b.*;
import static org.acme.travels.Rulesfbda3e9660c8408ea18cc79bcd86df4b.*;

public class Rulesfbda3e9660c8408ea18cc79bcd86df4b_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadatafbda3e9660c8408ea18cc79bcd86df4b.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadatafbda3e9660c8408ea18cc79bcd86df4b.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.PE2.LambdaPredicateE271726B4A244FDA06C42EF7CF14D7E6.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadatafbda3e9660c8408ea18cc79bcd86df4b.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PFA.LambdaExtractorFAE609B875C13251AC2409B2F791BEB9.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.PD8.LambdaConsequenceD8F77F2DDFB92341CC0234DC4B0F97C6.INSTANCE));
        return rule;
    }
}
