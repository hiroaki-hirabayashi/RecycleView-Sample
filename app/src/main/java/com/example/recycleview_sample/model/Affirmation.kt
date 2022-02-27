package com.example.affirmations.model

// データクラスに変更
// val 整数パラメータ stringResourceId を Affirmation クラスのコンストラクタに追加 これによりエラーを回避
data class Affirmation(val stringResourceId: Int) {
}