package dagger2.demo.device;

import javax.inject.Inject;

public class ExpensiveComputer extends Computer {

  @Inject public ExpensiveComputer(Disk disk) {
    super(disk);
  }
}
