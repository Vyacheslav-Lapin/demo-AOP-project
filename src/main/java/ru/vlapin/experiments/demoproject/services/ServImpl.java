package ru.vlapin.experiments.demoproject.services;

import lombok.SneakyThrows;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;
import ru.vlapin.experiments.demoproject.aop.MyAnno;

@Service
public class ServImpl implements Serv {

  @MyAnno
  @Override
  @SneakyThrows
  @Contract(pure = true)
  public @NotNull String math(int x) {
    return Integer.toString(x);
  }

}
