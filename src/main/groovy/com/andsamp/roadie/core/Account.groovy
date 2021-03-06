package com.andsamp.roadie.core

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table


@Entity
@Table(name='account')
class Account {

    @Id
    @GeneratedValue
    Integer id

    String name

    @ManyToOne
    @JoinColumn(name='budget_id')
    Budget budget

    Integer getId() {
        return id
    }

    void setId(Integer id) {
        this.id = id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    Budget getBudget() {
        return budget
    }

    void setBudget(Budget budget) {
        this.budget = budget
    }
}
