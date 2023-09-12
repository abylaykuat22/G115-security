package kz.bitlab.G115security.service;

import kz.bitlab.G115security.entity.User;
import kz.bitlab.G115security.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
  private final UserRepository userRepository;

  public User getUserByEmail(String email) {
    return userRepository.findByEmail(email);
  }
}
