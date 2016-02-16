public class Parcel {
  private Integer mLength;
  private Integer mWidth;
  private Integer mHeight;
  private Integer mDistance;

  public Parcel(Integer length, Integer width, Integer height, Integer distance) {
    mLength = length;
    mWidth = width;
    mHeight = height;
    mDistance = distance;
  }

  public int getLength() {
    return mLength;
  }

  public int getWidth() {
    return mWidth;
  }

  public int getHeight() {
    return mHeight;
  }

  public int getDistance() {
    return mDistance;
  }

  public int getVolume() {
   return mLength * mWidth * mHeight;
 }

 public int getDistanceCost() {
   return mDistance / 10;
 }

  public int costToShip() {
    return (this.getVolume() + this.getDistanceCost()) /2;
    //  + (mDistance * .1)
  }
}
