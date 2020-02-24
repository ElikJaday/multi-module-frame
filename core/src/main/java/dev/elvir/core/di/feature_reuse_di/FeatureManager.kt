package dev.elvir.core.di.feature_reuse_di

interface FeatureManager {
    fun <T> getDependency(key: Class<T>?): T
}
