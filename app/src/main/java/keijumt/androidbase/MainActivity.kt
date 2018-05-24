package keijumt.androidbase

import android.os.Bundle
import keijumt.androidbase.ui.main.BaseActivity
import keijumt.androidbase.ui.main.MainFragment

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        addFragment(MainFragment.newInstance(), R.id.linear_container_main)
    }

}
