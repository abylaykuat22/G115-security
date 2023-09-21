package kz.bitlab.G115security.contoller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

  @GetMapping("/")
  @PreAuthorize("isAuthenticated()")
  public String homePage() {
    return "home";
  }

  @PreAuthorize("isAnonymous()")
  @GetMapping("/sign-in")
  public String signInPage() {
    return "sign-in";
  }

  @GetMapping("/forbidden")
  public String forbiddenPage() {
    return "forbidden";
  }

  @PreAuthorize("hasAnyRole('ROLE_ADMIN')")
  @GetMapping("/admin-panel")
  public String adminPanel() {
    return "admin-panel";
  }
}
