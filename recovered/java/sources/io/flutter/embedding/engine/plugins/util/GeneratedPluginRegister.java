            package io.flutter.embedding.engine.plugins.util;

            import io.flutter.Log;
            import io.flutter.embedding.engine.FlutterEngine;
            import io.flutter.plugins.GeneratedPluginRegistrant;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class GeneratedPluginRegister {
                private static final String TAG = "GeneratedPluginsRegister";

                public static void registerGeneratedPlugins(FlutterEngine flutterEngine) {
                    try {
/* 20 */                GeneratedPluginRegistrant.class.getDeclaredMethod("registerWith", FlutterEngine.class).invoke(null, flutterEngine);
                    } catch (Exception e) {
/* 46 */                Log.m4585e(TAG, "Tried to automatically register plugins with FlutterEngine (" + flutterEngine + ") but could not find or invoke the GeneratedPluginRegistrant.");
/* 51 */                Log.m4586e(TAG, "Received exception while registering", e);
                    }
                }
            }
