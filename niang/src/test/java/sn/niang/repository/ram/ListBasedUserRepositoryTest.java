package sn.niang.repository.ram;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sn.niang.domain.User;

import static org.junit.jupiter.api.Assertions.*;

class ListBasedUserRepositoryTest {

    ListBasedUserRepository listBasedUserRepository;
    @BeforeEach
    void setUp() {
        listBasedUserRepository =new ListBasedUserRepository();
    }

    @Test
    void getAllByProfil() {

    }

    @Test
    void findById() {
        User user=listBasedUserRepository.findById(1);
        assertNotNull(user);
    }
}
