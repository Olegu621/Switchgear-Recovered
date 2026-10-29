            package com.appsflyer.internal;

            import android.content.Context;
            import android.content.pm.PackageItemInfo;
            import android.content.pm.PackageManager;
            import android.content.pm.ProviderInfo;
            import android.os.Build;
            import com.appsflyer.AFLogger;
            import com.huawei.appgallery.serviceverifykit.api.ServiceVerifyKit;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class AFj1xSDK implements AFj1vSDK {
                /* JADX INFO: renamed from: A_ */
                private static ProviderInfo m1852A_(Context context) {
                    try {
                        return Build.VERSION.SDK_INT >= 33 ? context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", PackageManager.ComponentInfoFlags.of(0L)) : context.getPackageManager().resolveContentProvider("com.huawei.appmarket.commondata", 0);
                    } catch (Throwable th) {
/* 35 */                AFLogger aFLogger = AFLogger.INSTANCE;
/* 37 */                AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
/* 39 */                String message = th.getMessage();
/* 43 */                if (message == null) {
/* 45 */                    message = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 55 */                AFh1ySDK.e$default(aFLogger, aFg1cSDK, message, th, false, false, false, false, 96, null);
/* 58 */                return null;
                    }
                }

                @Override // com.appsflyer.internal.AFj1vSDK
                public final boolean getCurrencyIso4217Code(Context context) {
/* 1 */             context.getClass();
                    return m1852A_(context) != null;
                }

                @Override // com.appsflyer.internal.AFj1vSDK
                public final boolean getRevenue(Context context) {
/* 3 */             context.getClass();
/* 6 */             ProviderInfo providerInfoM1852A_ = m1852A_(context);
/* 11 */            if (providerInfoM1852A_ == null) {
/* 10 */                return false;
                    }
                    try {
/* 49 */                return new ServiceVerifyKit.PkgVerifyBuilder(context).setPackageName(((PackageItemInfo) providerInfoM1852A_).packageName).setCertChainKey("com.huawei.appgallery.sign_certchain").setCertSignerKey("com.huawei.appgallery.fingerprint_signature").addLegacyInfo("com.huawei.appmarket", "FFE391E0EA186D0734ED601E4E70E3224B7309D48E2075BAC46D8C667EAE7212").addLegacyInfo("com.huawei.appmarket", "3BAF59A2E5331C30675FAB35FF5FFF0D116142D3D4664F1C3CB804068B40614F").isValidPkg();
                    } catch (Throwable th) {
/* 57 */                AFLogger aFLogger = AFLogger.INSTANCE;
/* 59 */                AFg1cSDK aFg1cSDK = AFg1cSDK.REFERRER;
/* 61 */                String message = th.getMessage();
/* 65 */                if (message == null) {
/* 67 */                    message = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 77 */                AFh1ySDK.e$default(aFLogger, aFg1cSDK, message, th, false, false, false, false, 96, null);
/* 10 */                return false;
                    }
                }
            }
