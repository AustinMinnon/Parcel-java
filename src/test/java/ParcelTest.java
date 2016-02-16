
import org.junit.*;
import static org.junit.Assert.*;

public class ParcelTest {

  @Test
  public void newParcel_VolumeLxWxH_8() {
    Parcel testParcel = new Parcel(2, 2, 2, 2);
    assertEquals(8, testParcel.getVolume());
  }

  @Test
  public void newParcel_costToShip_10() {
    Parcel testParcel = new Parcel(2,2,2,20);
    assertEquals(5, testParcel.costToShip());
  }
}
