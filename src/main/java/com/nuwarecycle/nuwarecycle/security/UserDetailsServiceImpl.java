package com.nuwarecycle.nuwarecycle.security;

import com.nuwarecycle.nuwarecycle.models.User;
import com.nuwarecycle.nuwarecycle.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {


    private final UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepo.findOneByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("El usuario con el email: " + email + " no existe."));

        return new UserDetailsImpl(user);
    }
}
