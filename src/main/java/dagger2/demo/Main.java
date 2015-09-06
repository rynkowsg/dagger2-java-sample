package dagger2.demo;

import dagger2.demo.internal.di.ComparisionComponent;
import dagger2.demo.internal.di.ComparisionModule;
import dagger2.demo.internal.di.DaggerComparisionComponent;

public class Main {
  public static void main(String[] args) {
    ComparisionComponent container = DaggerComparisionComponent.create();
    container.comparision().run();
  }
}
