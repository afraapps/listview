package ir.afraapps.widget.listview.stack;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

/**
 * In the name of Allah
 * <p>
 * Created by Ali Jabbari on 12/19/2022.
 */
public class SkidRightSnapHelper extends SnapHelper {
  private int mDirection;

  @Override
  public int[] calculateDistanceToFinalSnap(
    @NonNull RecyclerView.LayoutManager layoutManager, @NonNull View targetView) {

    if (layoutManager instanceof SkidRightLayoutManager) {
      int[] out = new int[2];
      if (layoutManager.canScrollHorizontally()) {
        out[0] = ((SkidRightLayoutManager) layoutManager).calculateDistanceToPosition(
          layoutManager.getPosition(targetView));
        out[1] = 0;
      } else {
        out[0] = 0;
        out[1] = ((SkidRightLayoutManager) layoutManager).calculateDistanceToPosition(
          layoutManager.getPosition(targetView));
      }
      return out;
    }
    return null;
  }

  @Override
  public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int velocityX,
                                    int velocityY) {
    if (layoutManager.canScrollHorizontally()) {
      mDirection = velocityX;
    } else {
      mDirection = velocityY;
    }
    return RecyclerView.NO_POSITION;
  }

  @Override
  public View findSnapView(RecyclerView.LayoutManager layoutManager) {
    if (layoutManager instanceof SkidRightLayoutManager) {
      int pos = ((SkidRightLayoutManager) layoutManager).getFixedScrollPosition(
        mDirection, mDirection != 0 ? 0.8f : 0.5f);
      mDirection = 0;
      if (pos != RecyclerView.NO_POSITION) {
        return layoutManager.findViewByPosition(pos);
      }
    }
    return null;
  }
}
