package mint.repos

import mint.models.Account
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AccountRepo extends JpaRepository<Account, Long> {
    Account findByMemberId(id)
    List<Account> findByFirstNameAndLastName(firstName, lastName)
}
