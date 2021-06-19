package com.demo.bottomnavigationviewdemo

import android.content.ContentValues.TAG
import android.util.Log
import androidx.fragment.app.Fragment

/**
 * Date：2021/6/19
 * Time：10:49
 * author:Stenven
 **/

abstract class LazyFragment : Fragment() {

    /**
     * 是否执行懒加载
     */
    private var isLoaded = false

    /**
     * 当前Fragment是否对用户可见
     */
    private var isVisibleToUser = false

    /**
     * 当使用ViewPager+Fragment形式会调用该方法时，setUserVisibleHint会优先Fragment生命周期函数调用，
     * 所以这个时候就,会导致在setUserVisibleHint方法执行时就执行了懒加载，
     * 而不是在onResume方法实际调用的时候执行懒加载。所以需要这个变量
     */
    private var isCallResume = false

    override fun onResume() {
        super.onResume()
        isCallResume = true
        judgeLazyInit()
    }


    private fun judgeLazyInit() {
        if (!isLoaded && isVisibleToUser && isCallResume) {
            lazyInit()
            Log.d(TAG, "lazyInit:!!!!!!!")
            isLoaded = true
        }
    }

    override fun onHiddenChanged(hidden: Boolean) {
        super.onHiddenChanged(hidden)
        isVisibleToUser = !hidden
        judgeLazyInit()
    }

    //在Fragment销毁View的时候，重置状态
    override fun onDestroyView() {
        super.onDestroyView()
        isLoaded = false
        isVisibleToUser = false
        isCallResume = false
    }

    override fun setUserVisibleHint(isVisibleToUser: Boolean) {
        super.setUserVisibleHint(isVisibleToUser)
        this.isVisibleToUser = isVisibleToUser
        judgeLazyInit()
    }

    abstract fun lazyInit()


}

/**
 *
 *
 *   优势 ：解决了问题
 *
 *   弊端 ： Androidx 下的懒加载
虽然之前的方案就能解决轻松的解决 Fragment 的懒加载，但这套方案有一个最大的弊端，就是不可见的 Fragment 执行了 onResume() 方法。onResume 方法设计的初衷，难道不是当前 Fragment 可以和用户进行交互吗？你他妈既不可见，又不能和用户进行交互，你执行 onResume 方法干嘛？

作者：AndyJennifer
链接：https://juejin.cn/post/6844904050698223624
来源：掘金
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */



