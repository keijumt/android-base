package keijumt.androidbase.ui.main

import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

/**
 * Activityの基底クラス
 */
abstract class BaseActivity : AppCompatActivity() {

    /**
     * Fragmentを指定のViewに貼り付ける。
     * 再生成時には何もしない
     *
     * @param fragment 貼り付けるFragment
     * @param containerViewId コンテナViewのID
     */
    protected fun addFragment(fragment: Fragment, containerViewId: Int) {
        supportFragmentManager.findFragmentById(containerViewId)?.let {
            //すでにAddされている
            return
        }
        supportFragmentManager
                .beginTransaction()
                .add(containerViewId, fragment)
                .commit()
    }
}