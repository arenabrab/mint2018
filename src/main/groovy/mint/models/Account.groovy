package mint.models

import groovy.transform.Canonical

import javax.persistence.Id

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.OneToMany
import javax.persistence.PrePersist

@Canonical
@Entity
class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long memberId

    String firstName, lastName
    BigDecimal amount

    @OneToMany(mappedBy = 'memberId')
    List<Transaction> transactionList

    @PrePersist
    void onPrePersist(){

    }
}