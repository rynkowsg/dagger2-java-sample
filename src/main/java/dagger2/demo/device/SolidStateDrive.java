package dagger2.demo.device;

import javax.inject.Inject;

public class SolidStateDrive implements Disk {

  @Inject public SolidStateDrive() {
  }

  @Override public Integer getIOPS() {
    return 100000;
  }
}
