package dagger2.demo.internal.di;

import dagger.Module;
import dagger.Provides;
import dagger2.demo.device.Computer;
import dagger2.demo.device.Disk;
import dagger2.demo.device.HardDiskDrive;
import dagger2.demo.device.SolidStateDrive;
import javax.inject.Named;

@Module
public class ComparisionModule {

  @Provides @Named("HDD") Disk provideHardDiskDrive() {
    return new HardDiskDrive();
  }

  @Provides @Named("SSD") Disk provideSolidStateDrive() {
    return new SolidStateDrive();
  }

  @Provides @Named("Cheap") Computer provideCheapComputer(@Named("HDD") Disk disk) {
    return new Computer(disk);
  }

  @Provides @Named("Expensive") Computer provideExpensiveComputer(@Named("SSD") Disk disk) {
    return new Computer(disk);
  }
}
