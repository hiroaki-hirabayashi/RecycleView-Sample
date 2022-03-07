package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// データクラスに変更
// val 整数パラメータ stringResourceId を Affirmation クラスのコンストラクタに追加 これによりエラーを回避
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)