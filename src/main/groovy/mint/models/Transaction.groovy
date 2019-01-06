package mint.models

import groovy.transform.Canonical

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Canonical
class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long transactionId

    String transactionType
    BigDecimal  transactionAmount
    Long memberId
}
