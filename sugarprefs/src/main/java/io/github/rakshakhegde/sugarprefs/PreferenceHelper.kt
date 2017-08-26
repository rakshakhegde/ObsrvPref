package io.github.rakshakhegde.sugarprefs

import android.content.SharedPreferences
import android.preference.PreferenceManager

/**
 * Created by rakshakhegde on 09/03/17.
 */

object PreferenceHelper {
	internal val defaultPrefs: SharedPreferences = PreferenceManager.getDefaultSharedPreferences(App.ctx)
}
