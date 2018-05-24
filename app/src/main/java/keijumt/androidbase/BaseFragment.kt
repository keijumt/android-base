package keijumt.androidbase

import android.arch.lifecycle.ViewModelProvider
import android.support.v4.app.Fragment
import keijumt.androidbase.di.Injectable
import javax.inject.Inject

/**
 * Fragmentの基底クラス
 */
abstract class BaseFragment : Fragment(), Injectable {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory
}

