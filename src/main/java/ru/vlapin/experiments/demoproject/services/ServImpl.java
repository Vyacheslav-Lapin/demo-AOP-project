package ru.vlapin.experiments.demoproject.services;

import lombok.SneakyThrows;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

@Service
public class Serv {

  @SneakyThrows
  @Contract(pure = true)
  public @NotNull String math(int x) {
    return Integer.toString(x);
  }

}
