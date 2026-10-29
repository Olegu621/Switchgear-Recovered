            package com.appsflyer.internal.platform_extension;

            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018"}, m6176d2 = {"Lcom/appsflyer/internal/platform_extension/Plugin;", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "pluginName", "Ljava/lang/String;", "getPluginName", "()Ljava/lang/String;", "NATIVE", "UNITY", "FLUTTER", "REACT_NATIVE", "ADOBE_AIR", "ADOBE_MOBILE", "COCOS_2DX", "CORDOVA", "MPARTICLE", "NATIVE_SCRIPT", "EXPO", "UNREAL", "XAMARIN", "CAPACITOR", "SEGMENT"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public enum Plugin {
                NATIVE("android_native"),
                UNITY("android_unity"),
                FLUTTER("android_flutter"),
                REACT_NATIVE("android_react_native"),
                ADOBE_AIR("android_adobe_air"),
                ADOBE_MOBILE("android_adobe_mobile"),
                COCOS_2DX("android_cocos2dx"),
                CORDOVA("android_cordova"),
                MPARTICLE("android_mparticle"),
                NATIVE_SCRIPT("android_native_script"),
                EXPO("android_expo"),
                UNREAL("android_unreal"),
                XAMARIN("android_xamarin"),
                CAPACITOR("android_capacitor"),
                SEGMENT("android_segment");

                private final String pluginName;

                Plugin(String str) {
/* 4 */             this.pluginName = str;
                }

                public final String getPluginName() {
/* 1 */             return this.pluginName;
                }
            }
