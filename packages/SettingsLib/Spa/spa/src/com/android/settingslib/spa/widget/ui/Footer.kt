/*
 * Copyright (C) 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.settingslib.spa.widget.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.android.settingslib.spa.framework.theme.SettingsDimension
import com.android.settingslib.spa.framework.theme.SettingsTheme

@Composable
fun Footer(footerText: String) {
    if (footerText.isEmpty()) return
    Column(Modifier.padding(SettingsDimension.itemPadding)) {
        SettingsIcon(imageVector = Icons.Outlined.Info, contentDescription = null)
        Spacer(modifier = Modifier.height(SettingsDimension.itemPaddingVertical))
        SettingsBody(footerText)
    }
}

@Preview
@Composable
private fun FooterPreview() {
    SettingsTheme {
        Footer("Footer text always at the end of page.")
    }
}
