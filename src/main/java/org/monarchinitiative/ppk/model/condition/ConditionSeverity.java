package org.monarchinitiative.ppk.model.condition;

import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

import org.monarchinitiative.ppk.model.ontology.ClassInstance;

import com.fasterxml.jackson.annotation.JsonPropertyDescription;

/**
 * the degree to which the phenotype or disease is manifest.
 * 
 * related to the concept of expressivity, see http://www.ncbi.nlm.nih.gov/books/NBK22090/
 * 
 * Note that this is modeled as in instance of a severity class, in which the class is taken
 * from an ontology such as PATO or HPO. Each condition has its own unique severity instance
 * 
 * @author cjm
 *
 */

@JsonldType("http://purl.obolibrary.org/obo/PATO_0000049")
public class ConditionSeverity extends ClassInstance {

}
