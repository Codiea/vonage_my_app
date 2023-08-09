package com.companyname.packagename.myapp
import com.vonage.android_core.VGClientConfig
import com.vonage.clientcore.core.api.ClientConfigRegion
import com.vonage.voice.api.*
import io.flutter.embedding.engine.FlutterEngine
import android.util.Log
import io.flutter.embedding.android.FlutterActivity

class MainActivity : FlutterActivity() {

    private lateinit var client: VoiceClient
    var tag = "test_tag"

    override fun configureFlutterEngine(flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)

        Log.d(tag, "configureFlutterEngine")

        client = VoiceClient(this.application.applicationContext)

        val config = VGClientConfig(ClientConfigRegion.US)
        config.enableWebsocketInvites = true

        client.setConfig(config)
    }



}






