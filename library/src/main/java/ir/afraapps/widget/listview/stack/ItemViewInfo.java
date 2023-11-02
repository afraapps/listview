package ir.afraapps.widget.listview.stack;

/**
 * In the name of Allah
 * <p>
 * Created by Ali Jabbari on 12/19/2022.
 */
public class ItemViewInfo {
  private float mScaleXY;
  private float mLayoutPercent;
  private float mPositionOffset;
  private int mTop;
  private boolean mIsBottom;

  public ItemViewInfo(int top, float scaleXY, float positonOffset, float percent) {
    this.mTop = top;
    this.mScaleXY = scaleXY;
    this.mPositionOffset = positonOffset;
    this.mLayoutPercent = percent;
  }

  public ItemViewInfo setIsBottom() {
    mIsBottom = true;
    return this;
  }

  public float getScaleXY() {
    return mScaleXY;
  }

  public void setScaleXY(float mScaleXY) {
    this.mScaleXY = mScaleXY;
  }

  public float getLayoutPercent() {
    return mLayoutPercent;
  }

  public void setLayoutPercent(float mLayoutPercent) {
    this.mLayoutPercent = mLayoutPercent;
  }

  public float getPositionOffset() {
    return mPositionOffset;
  }

  public void setPositionOffset(float mPositionOffset) {
    this.mPositionOffset = mPositionOffset;
  }

  public int getTop() {
    return mTop;
  }

  public void setTop(int mTop) {
    this.mTop = mTop;
  }

}