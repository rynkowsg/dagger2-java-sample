package dagger2.demo.internal.di;

import dagger.Component;
import dagger2.demo.Comparision;

@Component(modules = ComparisionModule.class)
public interface ComparisionComponent {
  Comparision comparision();
}
