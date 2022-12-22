package org.springframework.samples.petclinic.care;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;

import org.hibernate.validator.constraints.Length;
import org.junit.validator.ValidateWith;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.pet.Visit;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class CareProvision extends BaseEntity{   


    @Column(name = "^Care rated with [0-9] stars.*$")
    String userRating;

    @ManyToOne(optional = true)
    Visit visit;

    @ManyToOne(optional = false)
    private Care care;
}
