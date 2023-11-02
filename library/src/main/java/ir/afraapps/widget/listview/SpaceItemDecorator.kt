package ir.afraapps.widget.listview

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

/**
 * In the name of Allah
 *
 * Created by Ali Jabbari on 12/11/2022.
 */
class SpaceItemDecorator(
    val left: Int,
    val top: Int,
    val right: Int,
    val bottom: Int
) : RecyclerView.ItemDecoration() {


    constructor(rect: Rect) : this(rect.left, rect.top, rect.right, rect.bottom)

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        outRect.left = this.left
        outRect.top = this.top
        outRect.right = this.right
        outRect.bottom = this.bottom
    }

}