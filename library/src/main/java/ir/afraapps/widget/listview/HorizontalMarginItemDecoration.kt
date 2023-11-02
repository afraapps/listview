package ir.afraapps.widget.listview

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class HorizontalMarginItemDecoration(private val itemMargin: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        /*val itemCount = parent.adapter?.itemCount ?: return
        when (parent.getChildAdapterPosition(view)) {
            0 -> if (parent.isRTL()) outRect.left = itemMargin else outRect.right = itemMargin
            itemCount - 1 -> if (parent.isRTL()) outRect.right = itemMargin else outRect.left = itemMargin
            else -> {
                outRect.right = itemMargin
                outRect.left = itemMargin
            }
        }*/

        outRect.right = itemMargin
        outRect.left = itemMargin
    }
}