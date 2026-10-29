            package io.flutter.plugins;

            import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
            import com.supercell.p007id.scid_plugin.ScidPlugin;
            import io.flutter.Log;
            import io.flutter.embedding.engine.FlutterEngine;
            import io.flutter.plugins.pathprovider.PathProviderPlugin;
            import io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin;
            import io.flutter.plugins.urllauncher.UrlLauncherPlugin;
            import p000.d12;
            import p000.hd2;
            import p000.hf2;
            import p000.o92;
            import p000.of2;
            import p000.pf2;
            import p000.ur1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class GeneratedPluginRegistrant {
                private static final String TAG = "GeneratedPluginRegistrant";

                public static void registerWith(FlutterEngine flutterEngine) {
                    try {
/* 12 */                flutterEngine.getPlugins().add(new InAppWebViewFlutterPlugin());
                    } catch (Exception e) {
/* 19 */                Log.m4586e(TAG, "Error registering plugin flutter_inappwebview_android, com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin", e);
                    }
                    try {
/* 31 */                flutterEngine.getPlugins().add(new PathProviderPlugin());
                    } catch (Exception e2) {
/* 38 */                Log.m4586e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e2);
                    }
                    try {
/* 50 */                flutterEngine.getPlugins().add(new ur1());
                    } catch (Exception e3) {
/* 57 */                Log.m4586e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e3);
                    }
                    try {
/* 69 */                flutterEngine.getPlugins().add(new d12());
                    } catch (Exception e4) {
/* 76 */                Log.m4586e(TAG, "Error registering plugin recaptcha_enterprise_flutter, com.google.flutter.recaptcha.RecaptchaEnterprisePlugin", e4);
                    }
                    try {
/* 88 */                flutterEngine.getPlugins().add(new ScidPlugin());
                    } catch (Exception e5) {
/* 95 */                Log.m4586e(TAG, "Error registering plugin scid_plugin, com.supercell.id.scid_plugin.ScidPlugin", e5);
                    }
                    try {
/* 107 */               flutterEngine.getPlugins().add(new o92());
                    } catch (Exception e6) {
/* 114 */               Log.m4586e(TAG, "Error registering plugin sensors_plus, dev.fluttercommunity.plus.sensors.SensorsPlugin", e6);
                    }
                    try {
/* 126 */               flutterEngine.getPlugins().add(new hd2());
                    } catch (Exception e7) {
/* 133 */               Log.m4586e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e7);
                    }
                    try {
/* 145 */               flutterEngine.getPlugins().add(new SharedPreferencesPlugin());
                    } catch (Exception e8) {
/* 152 */               Log.m4586e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e8);
                    }
                    try {
/* 164 */               flutterEngine.getPlugins().add(new hf2());
                    } catch (Exception e9) {
/* 171 */               Log.m4586e(TAG, "Error registering plugin smart_auth, fman.ge.smart_auth.SmartAuthPlugin", e9);
                    }
                    try {
/* 183 */               flutterEngine.getPlugins().add(new of2());
                    } catch (Exception e10) {
/* 190 */               Log.m4586e(TAG, "Error registering plugin snowplow_tracker, com.snowplowanalytics.snowplow_tracker.SnowplowTrackerPlugin", e10);
                    }
                    try {
/* 202 */               flutterEngine.getPlugins().add(new pf2());
                    } catch (Exception e11) {
/* 209 */               Log.m4586e(TAG, "Error registering plugin social_plugin, com.supercell.social.social_plugin.SocialPlugin", e11);
                    }
                    try {
/* 221 */               flutterEngine.getPlugins().add(new UrlLauncherPlugin());
                    } catch (Exception e12) {
/* 228 */               Log.m4586e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e12);
                    }
                }
            }
