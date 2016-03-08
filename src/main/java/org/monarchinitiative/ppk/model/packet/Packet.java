package org.monarchinitiative.ppk.model.packet;

import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldId;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldProperty;

import java.util.ArrayList;
import java.util.List;

import org.monarchinitiative.ppk.model.condition.DiseaseOccurrenceAssociation;
import org.monarchinitiative.ppk.model.condition.PhenotypeAssociation;
import org.monarchinitiative.ppk.model.environment.EnvironmentAssociation;
import org.monarchinitiative.ppk.model.genome.Variant;
import org.monarchinitiative.ppk.model.meta.Association;
import org.monarchinitiative.ppk.model.meta.Entity;
import org.monarchinitiative.ppk.model.organism.Organism;
import org.monarchinitiative.ppk.model.organism.Person;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Top level container
 * 
 * @author cjm
 *
 */
public class Packet {
	
	@JsonProperty("id")
	@JsonldId
	String id;
	
	@JsonProperty("title")
	@JsonldProperty("http://purl.org/dc/elements/1.1/title")
	String title;
	
	//TODO - have a distinct list for each type
	@JsonProperty("entities")
	private List<Entity> entities;

	@JsonProperty("variants")
	private List<Variant> variants;

	@JsonProperty("persons")
	private List<Person> persons;

	@JsonProperty("organisms")
	private List<Organism> organisms;

	@JsonProperty("phenotype_profile")
	private List<PhenotypeAssociation> phenotypeAssociationList;
	
	@JsonProperty("diagnosis_profile")
	private List<DiseaseOccurrenceAssociation> diseaseOccurrenceAssociationList;

	@JsonProperty("environment_profile")
	private List<EnvironmentAssociation> environmentAssociationList;

	public Packet(Builder builder) {
		id = builder.id;
		title = builder.title;
	}

	public Packet() {
	}
	
	

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the entities
	 */
	public List<Entity> getEntities() {
		return entities;
	}

	/**
	 * @param entities the entities to set
	 */
	public void setEntities(List<Entity> entities) {
		this.entities = entities;
	}

	public void addEntity(Entity entity) {
		if (entities == null)
			entities = new ArrayList<Entity>();
		entities.add(entity);
	}
	
	

	/**
	 * @return the variants
	 */
	public List<Variant> getVariants() {
		return variants;
	}

	/**
	 * @param variants the variants to set
	 */
	public void setVariants(List<Variant> variants) {
		this.variants = variants;
	}

	/**
	 * @return the persons
	 */
	public List<Person> getPersons() {
		return persons;
	}

	/**
	 * @param persons the persons to set
	 */
	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	/**
	 * @return the organisms
	 */
	public List<Organism> getOrganisms() {
		return organisms;
	}

	/**
	 * @param organisms the organisms to set
	 */
	public void setOrganisms(List<Organism> organisms) {
		this.organisms = organisms;
	}

	/**
	 * @return the diseaseOccurrenceAssociationList
	 */
	public List<DiseaseOccurrenceAssociation> getDiseaseOccurrenceAssociationList() {
		return diseaseOccurrenceAssociationList;
	}

	/**
	 * @param diseaseOccurrenceAssociationList the diseaseOccurrenceAssociationList to set
	 */
	public void setDiseaseOccurrenceAssociationList(
			List<DiseaseOccurrenceAssociation> diseaseOccurrenceAssociationList) {
		this.diseaseOccurrenceAssociationList = diseaseOccurrenceAssociationList;
	}

	/**
	 * @return the phenotype_profile
	 */
	@JsonProperty("phenotype_profile")
	public List<PhenotypeAssociation> getPhenotypeAssociationList() {
		return phenotypeAssociationList;
	}

	/**
	 * @param phenotype_profile the phenotype_profile to set
	 */
	@JsonProperty("phenotype_profile")
	public void setPhenotypeAssociationList(List<PhenotypeAssociation> phenotype_profile) {
		this.phenotypeAssociationList = phenotype_profile;
	}

	@JsonProperty("phenotype_profile")
	public void addPhenotypeAssociation(PhenotypeAssociation a) {
		if (phenotypeAssociationList == null)
			phenotypeAssociationList = new ArrayList<PhenotypeAssociation>();
		phenotypeAssociationList.add(a);
	}

	public static class Builder {
		private String id;
		private String title;
		
		public Builder() {
			
		}
		
		public Builder id(String id) {
			this.id = id;
			return this;
		}
		public Builder title(String title) {
			this.title = title;
			return this;
		}
		
		public Packet build() {
			return new Packet(this);
		}
	}
	

}
