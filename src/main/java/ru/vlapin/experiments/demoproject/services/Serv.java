package ru.vlapin.experiments.demoproject.services;

import lombok.SneakyThrows;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;


public interface Serv {
  @SneakyThrows
  @Contract(pure = true)
  @NotNull String math(int x);

}
