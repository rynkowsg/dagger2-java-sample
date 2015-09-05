package dagger2.demo.device;

import javax.inject.Inject;

public class CheapComputer extends Computer {

  @Inject public CheapComputer(Disk disk) {
    super(disk);
  }
}
