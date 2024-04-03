package com.ftc.rest.security.user;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Configuration
@NoArgsConstructor
public class UserRepository {

    private static ArrayList<User> lista = new ArrayList<User>();

    @Bean
    public User finByUserName(String username) {
        User usuario = null;
        for (User user : lista) {
            if (user.getUserName().equalsIgnoreCase(username)) {
                usuario = user;
                break;
            }
        }
        return usuario;
    }

    public void save(User user) {
        lista.add(user);
    }

    @Bean
    public static ArrayList<User> getLista() {
        return lista;
    }
    
}
