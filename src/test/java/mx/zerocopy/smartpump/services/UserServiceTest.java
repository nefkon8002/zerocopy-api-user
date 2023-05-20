package mx.zerocopy.smartpump.services;

import mx.zerocopy.smartpump.TestConfig;
import mx.zerocopy.smartpump.data.model.Role;
import mx.zerocopy.smartpump.data.model.User;
import mx.zerocopy.smartpump.services.UserService;
import mx.zerocopy.smartpump.services.exceptions.ForbiddenException;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertThrows;

@TestConfig
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    void testCreateUserForbidden() {
        User user = User.builder().mobile("666000666").firstName("k").role(Role.ADMIN).build();
        assertThrows(ForbiddenException.class, () -> this.userService.createUser(user, Role.MANAGER));
    }
}
