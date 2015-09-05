package dagger2.demo;

import dagger2.demo.device.Computer;
import dagger2.demo.internal.di.ComparisionComponent;
import dagger2.demo.internal.di.ComparisionModule;
import dagger2.demo.internal.di.DaggerComparisionComponent;
import javax.inject.Inject;
import javax.inject.Named;

public class Comparision {
  @Inject @Named("Expensive") Computer expensiveComputer;
  @Inject @Named("Cheap") Computer cheapComputer;

  public Comparision() {
    ComparisionComponent container = DaggerComparisionComponent.builder()
        .comparisionModule(new ComparisionModule())
        .build();
    container.inject(this);
  }

  public void run() {
    expensiveComputer.benchmark();
    cheapComputer.benchmark();
  }

  public static void main(String[] args) {
    new Comparision().run();
  }
}
