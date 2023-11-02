package ir.afraapps.widget.listview

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.view.ViewGroup

/**
 * In the name of Allah
 *
 * Created by Ali Jabbari on 2/22/20.
 */

class ExtLayout {


    class _AdvancedRecyclerView(context: Context) : AdvancedRecyclerView(context) {

        inline fun <T : View> T.lparams(
            c: Context,
            attrs: AttributeSet,
            init: LayoutParams.() -> Unit = {}
        ): T {
            val layoutParams = LayoutParams(c, attrs)
            layoutParams.init()
            this@lparams.layoutParams = layoutParams
            return this
        }

        inline fun <T : View> T.lparams(
            width: Int = ViewGroup.LayoutParams.MATCH_PARENT,
            height: Int = ViewGroup.LayoutParams.WRAP_CONTENT,
            init: LayoutParams.() -> Unit = {}
        ): T {
            val layoutParams = LayoutParams(width, height)
            layoutParams.init()
            this@lparams.layoutParams = layoutParams
            return this
        }


        inline fun <T : View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: LayoutParams.() -> Unit = {}
        ): T {
            val layoutParams = LayoutParams(source!!)
            layoutParams.init()
            this@lparams.layoutParams = layoutParams
            return this
        }


        inline fun <T : View> T.lparams(
            source: MarginLayoutParams?,
            init: LayoutParams.() -> Unit = {}
        ): T {
            val layoutParams = LayoutParams(source!!)
            layoutParams.init()
            this@lparams.layoutParams = layoutParams
            return this
        }

    }


    class _HeaderRecyclerView(context: Context) : HeaderRecyclerView(context) {

        inline fun <T : View> T.lparams(
            c: Context,
            attrs: AttributeSet,
            init: LayoutParams.() -> Unit = {}
        ): T {
            val layoutParams = LayoutParams(c, attrs)
            layoutParams.init()
            this@lparams.layoutParams = layoutParams
            return this
        }

        inline fun <T : View> T.lparams(
            width: Int = ViewGroup.LayoutParams.MATCH_PARENT,
            height: Int = ViewGroup.LayoutParams.WRAP_CONTENT,
            init: LayoutParams.() -> Unit = {}
        ): T {
            val layoutParams = LayoutParams(width, height)
            layoutParams.init()
            this@lparams.layoutParams = layoutParams
            return this
        }


        inline fun <T : View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: LayoutParams.() -> Unit = {}
        ): T {
            val layoutParams = LayoutParams(source!!)
            layoutParams.init()
            this@lparams.layoutParams = layoutParams
            return this
        }


        inline fun <T : View> T.lparams(
            source: MarginLayoutParams?,
            init: LayoutParams.() -> Unit = {}
        ): T {
            val layoutParams = LayoutParams(source!!)
            layoutParams.init()
            this@lparams.layoutParams = layoutParams
            return this
        }

    }


    class _NestedScrollView(context: Context) : AdvancedScrollView(context) {

        inline fun <T : View> T.lparams(
            c: Context,
            attrs: AttributeSet,
            init: LayoutParams.() -> Unit = {}
        ): T {
            val layoutParams = LayoutParams(c, attrs)
            layoutParams.init()
            this@lparams.layoutParams = layoutParams
            return this
        }

        inline fun <T : View> T.lparams(
            width: Int = ViewGroup.LayoutParams.MATCH_PARENT,
            height: Int = ViewGroup.LayoutParams.MATCH_PARENT,
            init: LayoutParams.() -> Unit = {}
        ): T {
            val layoutParams = LayoutParams(width, height)
            layoutParams.init()
            this@lparams.layoutParams = layoutParams
            return this
        }


        inline fun <T : View> T.lparams(
            source: ViewGroup.LayoutParams?,
            init: LayoutParams.() -> Unit = {}
        ): T {
            val layoutParams = LayoutParams(source!!)
            layoutParams.init()
            this@lparams.layoutParams = layoutParams
            return this
        }


        inline fun <T : View> T.lparams(
            source: MarginLayoutParams?,
            init: LayoutParams.() -> Unit = {}
        ): T {
            val layoutParams = LayoutParams(source!!)
            layoutParams.init()
            this@lparams.layoutParams = layoutParams
            return this
        }

    }


}