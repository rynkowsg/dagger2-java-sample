package dagger2.demo;

import dagger2.demo.device.Computer;
import javax.inject.Inject;
import javax.inject.Named;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Comparision {
  private Computer expensiveComputer;
  private Computer cheapComputer;

  @Inject public Comparision(@Named("Cheap") Computer cheapComputer,
      @Named("Expensive") Computer expensiveComputer) {
    this.cheapComputer = cheapComputer;
    this.expensiveComputer = expensiveComputer;
  }

  public void run() {
    log.info("Start up of a cheap computer takes {} seconds.",
        cheapComputer.measureStartupTime());
    log.info("Start up of an expensive computer takes {} seconds.",
        expensiveComputer.measureStartupTime());
  }
}
