package dagger2.demo.device;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Computer {

  private Disk disk;

  public Computer(Disk disk) {
    this.disk = disk;
  }

  public void benchmark() {
    log.info("Booting the {} takes {} seconds.",
        getClass().getSimpleName(), calcStartTimeInSec());
  }

  protected Double calcStartTimeInSec() {
    return 100 / Math.log10(disk.getIOPS());
  }
}
