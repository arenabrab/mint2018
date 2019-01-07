package mint.repos

import mint.models.Transaction
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.query.Param
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = 'tran', path = 'tran')
interface TransactionRepo extends JpaRepository<Transaction, Long>{

    Transaction findByTransactionId(@Param('id') Long id)
    List<Transaction> findByMemberId(@Param('memberId') Long memberId)
}