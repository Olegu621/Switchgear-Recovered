            package com.appsflyer.internal;

            import android.os.Build;
            import com.appsflyer.AFKeystoreWrapper;
            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerProperties;
            import java.security.KeyStoreException;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\t\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\t\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\r\u0010\f"}, m6176d2 = {"Lcom/appsflyer/internal/AFa1vSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "Lcom/appsflyer/internal/AFc1hSDK;", "p0", "Lcom/appsflyer/internal/AFc1oSDK;", "p1", HttpUrl.FRAGMENT_ENCODE_SET, "getMonetizationNetwork", "(Lcom/appsflyer/internal/AFc1hSDK;Lcom/appsflyer/internal/AFc1oSDK;)V", HttpUrl.FRAGMENT_ENCODE_SET, "()Ljava/lang/String;", "getCurrencyIso4217Code"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 210 */   public final class AFa1vSDK {
                public static final AFa1vSDK INSTANCE = new AFa1vSDK();

                private AFa1vSDK() {
                }

                public static String getCurrencyIso4217Code() {
/* 7 */             return AppsFlyerProperties.getInstance().getString("KSAppsFlyerRICounter");
                }

                public static final void getMonetizationNetwork(AFc1hSDK p0, AFc1oSDK p1) {
/* 1 */             p0.getClass();
/* 4 */             p1.getClass();
/* 7 */             AppsFlyerProperties appsFlyerProperties = AppsFlyerProperties.getInstance();
/* 15 */            if (AFj1kSDK.getRevenue()) {
/* 19 */                AFLogger.afRDLog("OPPO device found");
                    }
/* 29 */            if (appsFlyerProperties.getBoolean(AppsFlyerProperties.DISABLE_KEYSTORE, true)) {
/* 208 */               AFLogger.afRDLog("OS SDK is=" + Build.VERSION.SDK_INT + "; no KeyStore usage");
/* 211 */               return;
                    }
/* 52 */            AFLogger.afRDLog("OS SDK is=" + Build.VERSION.SDK_INT + "; use KeyStore");
/* 59 */            AFKeystoreWrapper aFKeystoreWrapper = new AFKeystoreWrapper(p0.getMonetizationNetwork);
/* 66 */            if (aFKeystoreWrapper.AFAdRevenueData()) {
/* 87 */                String monetizationNetwork = aFKeystoreWrapper.getMonetizationNetwork();
                        synchronized (aFKeystoreWrapper.getMediationNetwork) {
/* 97 */                    aFKeystoreWrapper.AFAdRevenueData++;
/* 109 */                   AFLogger.afInfoLog("Deleting key with alias: ".concat(String.valueOf(monetizationNetwork)));
                            try {
                                synchronized (aFKeystoreWrapper.getMediationNetwork) {
/* 117 */                           aFKeystoreWrapper.getMonetizationNetwork.deleteEntry(monetizationNetwork);
                                }
                            } catch (KeyStoreException e) {
/* 132 */                       StringBuilder sb = new StringBuilder("Exception ");
/* 139 */                       sb.append(e.getMessage());
/* 144 */                       sb.append(" occurred");
/* 151 */                       AFLogger.afErrorLog(sb.toString(), e);
                            }
                        }
/* 159 */               aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.getMonetizationNetwork());
                    } else {
/* 74 */                aFKeystoreWrapper.getCurrencyIso4217Code = AFb1kSDK.getCurrencyIso4217Code(p1.getMediationNetwork);
/* 77 */                aFKeystoreWrapper.AFAdRevenueData = 0;
/* 83 */                aFKeystoreWrapper.getRevenue(aFKeystoreWrapper.getMonetizationNetwork());
                    }
/* 168 */           appsFlyerProperties.set("KSAppsFlyerId", aFKeystoreWrapper.getCurrencyIso4217Code());
/* 181 */           appsFlyerProperties.set("KSAppsFlyerRICounter", String.valueOf(aFKeystoreWrapper.getRevenue()));
                }

/* 211 */       public static String getMonetizationNetwork() {
/* 212 */           return AppsFlyerProperties.getInstance().getString("KSAppsFlyerId");
                }
            }
