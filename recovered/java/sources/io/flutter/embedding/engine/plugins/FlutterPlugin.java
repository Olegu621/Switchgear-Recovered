            package io.flutter.embedding.engine.plugins;

            import android.content.Context;
            import io.flutter.embedding.engine.FlutterEngine;
            import io.flutter.embedding.engine.FlutterEngineGroup;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.plugin.platform.PlatformViewRegistry;
            import io.flutter.view.TextureRegistry;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface FlutterPlugin {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface FlutterAssets {
                    String getAssetFilePathByName(String str);

                    String getAssetFilePathByName(String str, String str2);

                    String getAssetFilePathBySubpath(String str);

                    String getAssetFilePathBySubpath(String str, String str2);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static class FlutterPluginBinding {
                    private final Context applicationContext;
                    private final BinaryMessenger binaryMessenger;
                    private final FlutterAssets flutterAssets;
                    private final FlutterEngine flutterEngine;
                    private final FlutterEngineGroup group;
                    private final PlatformViewRegistry platformViewRegistry;
                    private final TextureRegistry textureRegistry;

                    public FlutterPluginBinding(Context context, FlutterEngine flutterEngine, BinaryMessenger binaryMessenger, TextureRegistry textureRegistry, PlatformViewRegistry platformViewRegistry, FlutterAssets flutterAssets, FlutterEngineGroup flutterEngineGroup) {
/* 4 */                 this.applicationContext = context;
/* 6 */                 this.flutterEngine = flutterEngine;
/* 8 */                 this.binaryMessenger = binaryMessenger;
/* 10 */                this.textureRegistry = textureRegistry;
/* 12 */                this.platformViewRegistry = platformViewRegistry;
/* 14 */                this.flutterAssets = flutterAssets;
/* 16 */                this.group = flutterEngineGroup;
                    }

                    public Context getApplicationContext() {
/* 1 */                 return this.applicationContext;
                    }

                    public BinaryMessenger getBinaryMessenger() {
/* 1 */                 return this.binaryMessenger;
                    }

                    public FlutterEngineGroup getEngineGroup() {
/* 1 */                 return this.group;
                    }

                    public FlutterAssets getFlutterAssets() {
/* 1 */                 return this.flutterAssets;
                    }

                    @Deprecated
                    public FlutterEngine getFlutterEngine() {
/* 1 */                 return this.flutterEngine;
                    }

                    public PlatformViewRegistry getPlatformViewRegistry() {
/* 1 */                 return this.platformViewRegistry;
                    }

                    public TextureRegistry getTextureRegistry() {
/* 1 */                 return this.textureRegistry;
                    }
                }

                void onAttachedToEngine(FlutterPluginBinding flutterPluginBinding);

                void onDetachedFromEngine(FlutterPluginBinding flutterPluginBinding);
            }
