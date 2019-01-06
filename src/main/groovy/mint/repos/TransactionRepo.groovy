package mint.repos

import mint.models.Transaction
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TransactionRepo extends JpaRepository<Transaction, Long>{
}