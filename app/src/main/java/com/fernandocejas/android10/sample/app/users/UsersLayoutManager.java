/**
 * Copyright (C) 2014 android10.org. All rights reserved.
 * @author Fernando Cejas (the android10 coder)
 */
package com.fernandocejas.android10.sample.app.users;

import android.content.Context;

import androidx.recyclerview.widget.LinearLayoutManager;

/**
 * Layout manager to position items inside a {@link androidx.recyclerview.widget.LinearLayoutManager}.
 */
class UsersLayoutManager extends LinearLayoutManager {
  UsersLayoutManager(Context context) {
    super(context);
  }
}
