package talks.conductor.di.helpers

interface HasComponent<T> {
    fun getComponent(): T
}
