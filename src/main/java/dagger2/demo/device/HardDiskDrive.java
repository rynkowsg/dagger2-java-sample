package dagger2.demo.device;

import javax.inject.Inject;

public class HardDiskDrive implements Disk {

  @Inject public HardDiskDrive() {
  }

  @Override public Integer getIOPS() {
    return 100;
  }
}
