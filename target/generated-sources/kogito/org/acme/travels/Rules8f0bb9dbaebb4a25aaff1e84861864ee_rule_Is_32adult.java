package org.acme.travels;

import org.drools.modelcompiler.dsl.pattern.D;
import org.drools.model.Index.ConstraintType;
import org.acme.travels.Person;
import static org.acme.travels.Rules8f0bb9dbaebb4a25aaff1e84861864ee.*;
import static org.acme.travels.Rules8f0bb9dbaebb4a25aaff1e84861864ee.*;

public class Rules8f0bb9dbaebb4a25aaff1e84861864ee_rule_Is_32adult {

    /**
     * Rule name: Is adult
     */
    public static org.drools.model.Rule rule_Is_32adult() {
        final org.drools.model.Variable<org.acme.travels.Person> var_$person = D.declarationOf(org.acme.travels.Person.class,
                                                                                               DomainClassesMetadata8f0bb9dbaebb4a25aaff1e84861864ee.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                               "$person");
        final org.drools.model.BitMask mask_$person = org.drools.model.BitMask.getPatternMask(DomainClassesMetadata8f0bb9dbaebb4a25aaff1e84861864ee.org_acme_travels_Person_Metadata_INSTANCE,
                                                                                              "adult");
        org.drools.model.Rule rule = D.rule("org.acme.travels",
                                            "Is adult")
                                      .attribute(org.drools.model.Rule.Attribute.RULEFLOW_GROUP,
                                                 "person")
                                      .build(D.pattern(var_$person).expr("GENERATED_6F251A649871E8072C2937D82BA1FABD",
                                                                         org.acme.travels.P52.LambdaPredicate52C3EB1BB104CE1E4669CC653031F59F.INSTANCE,
                                                                         D.alphaIndexedBy(int.class,
                                                                                          org.drools.model.Index.ConstraintType.GREATER_THAN,
                                                                                          DomainClassesMetadata8f0bb9dbaebb4a25aaff1e84861864ee.org_acme_travels_Person_Metadata_INSTANCE.getPropertyIndex("age"),
                                                                                          org.acme.travels.PBF.LambdaExtractorBF76E1DB2C9D78F2A7047F8DC96980E9.INSTANCE,
                                                                                          18),
                                                                         D.reactOn("age")),
                                             D.on(var_$person).execute(org.acme.travels.P0C.LambdaConsequence0C31B06C331A7D6E98DFC1DAA56E841D.INSTANCE));
        return rule;
    }
}
