# Generated components for Android classes

* `@InstallIn` annotation : injecting its bindings into the corresponding Android class.

# Hilt currently supports the following Android classes:
* `Application` (by using `@HiltAndroidApp`)
* `ViewModel` (by using `@HiltViewModel`)
* `Activity`
* `Fragment`
* `View`
* `Service`
* `BroadcastReceiver`

*Each Hilt component is considered a container with a different lifecycle, divided according to hierarchy, the component below can use the bindings of the component above it.*

*By default, all bindings in Hilt are unscoped, This means that each time your app requests the binding, Hilt creates a new instance of the needed type.*

*if you define a component as @Singleton,..., all bindings within that component will be scoped to singleton..... mean Hilt also allows a binding to be scoped to a particular component*
