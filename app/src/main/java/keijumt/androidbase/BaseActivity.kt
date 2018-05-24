package keijumt.androidbase

import android.arch.lifecycle.ViewModelProvider
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import keijumt.androidbase.di.Injectable
import javax.inject.Inject

/**
 * Activityの基底クラス
 */
abstract class BaseActivity : AppCompatActivity(), HasSupportFragmentInjector, Injectable {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
    @Inject
    lateinit var androidInjector: DispatchingAndroidInjector<Fragment>

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

    override fun supportFragmentInjector(): AndroidInjector<Fragment> {
        return androidInjector
    }
}