package dagger2.demo.device;

import javax.inject.Inject;

public class Computer {
  private Disk disk;

  @Inject public Computer(Disk disk) {
    this.disk = disk;
  }

  public Double measureStartupTime() {
    return 100 / Math.log10(disk.getIOPS());
  }
}
