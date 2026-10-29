            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public final class AFa1uSDK {
                private final AFa1tSDK AFAdRevenueData = new AFa1tSDK() { // from class: com.appsflyer.internal.AFa1uSDK.1
                    @Override // com.appsflyer.internal.AFa1uSDK.AFa1tSDK
                    public final Class<?> getRevenue(String str) throws ClassNotFoundException {
/* 1 */                 return Class.forName(str);
                    }
                };

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface AFa1tSDK {
                    Class<?> getRevenue(String str) throws ClassNotFoundException;
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public enum AFa1ySDK {
                    ADOBE_AIR("android_adobe_air", "com.appsflyer.adobeair.AppsFlyerExtension"),
                    ADOBE_MOBILE_SDK("android_adobe_mobile", "com.appsflyer.adobeextension.AppsFlyerAdobeExtension"),
                    COCOS2DX("android_cocos2dx", "org.cocos2dx.lib.Cocos2dxActivity"),
                    CORDOVA("android_cordova", "com.appsflyer.cordova.plugin.AppsFlyerPlugin"),
                    DEFAULT("android_native", "android_native"),
                    FLUTTER("android_flutter", "com.appsflyer.appsflyersdk.AppsflyerSdkPlugin"),
                    M_PARTICLE("android_mparticle", "com.mparticle.kits.AppsFlyerKit"),
                    NATIVE_SCRIPT("android_native_script", "com.tns.NativeScriptActivity"),
                    EXPO("android_expo", "expo.modules.devmenu.react.DevMenuAwareReactActivity"),
                    REACT_NATIVE("android_reactNative", "com.appsflyer.reactnative.RNAppsFlyerModule"),
                    UNITY("android_unity", "com.appsflyer.unity.AppsFlyerAndroidWrapper"),
                    UNREAL_ENGINE("android_unreal", "com.epicgames.ue4.GameActivity"),
                    XAMARIN("android_xamarin", "mono.android.Runtime"),
                    CAPACITOR("android_capacitor", "capacitor.plugin.appsflyer.sdk.AppsFlyerPlugin");

                    final String getCurrencyIso4217Code;
                    final String getMediationNetwork;

                    AFa1ySDK(String str, String str2) {
/* 4 */                 this.getCurrencyIso4217Code = str;
/* 6 */                 this.getMediationNetwork = str2;
                    }
                }

                private boolean getCurrencyIso4217Code(String str) {
                    try {
/* 7 */                 this.AFAdRevenueData.getRevenue(str);
/* 12 */                StringBuilder sb = new StringBuilder("Class: ");
/* 15 */                sb.append(str);
/* 20 */                sb.append(" is found.");
/* 27 */                AFLogger.afRDLog(sb.toString());
/* 4 */                 return true;
                    } catch (ClassNotFoundException e) {
/* 45 */                StringBuilder sb2 = new StringBuilder("Class: ");
/* 48 */                sb2.append(str);
/* 53 */                sb2.append(" is  not found. (Platform extension)");
/* 60 */                AFLogger.afErrorLogForExcManagerOnly(sb2.toString(), e, true);
/* 3 */                 return false;
                    } catch (Throwable th) {
/* 39 */                AFLogger.afErrorLog(th.getMessage(), th);
/* 3 */                 return false;
                    }
                }

                public final String AFAdRevenueData() {
/* 7 */             for (AFa1ySDK aFa1ySDK : AFa1ySDK.values()) {
/* 17 */                if (getCurrencyIso4217Code(aFa1ySDK.getMediationNetwork)) {
/* 19 */                    return aFa1ySDK.getCurrencyIso4217Code;
                        }
                    }
/* 27 */            return AFa1ySDK.DEFAULT.getCurrencyIso4217Code;
                }
            }
