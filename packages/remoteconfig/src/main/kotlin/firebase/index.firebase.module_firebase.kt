@file:JsModule("firebase")
@file:JsNonModule
@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
    "OVERRIDING_FINAL_MEMBER",
    "RETURN_TYPE_MISMATCH_ON_OVERRIDE",
    "CONFLICTING_OVERLOADS",
    "EXTERNAL_DELEGATION"
)

package firebase

import firebase.app.App
import firebase.remoteconfig.RemoteConfig


external fun remoteConfig(app: App? = definedExternally): RemoteConfig
