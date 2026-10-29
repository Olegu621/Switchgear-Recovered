            package com.appsflyer.internal;

            import java.security.SecureRandom;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r"}, m6176d2 = {"Lcom/appsflyer/internal/AFb1kSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "Lcom/appsflyer/internal/AFc1qSDK;", "p0", HttpUrl.FRAGMENT_ENCODE_SET, "getCurrencyIso4217Code", "(Lcom/appsflyer/internal/AFc1qSDK;)Ljava/lang/String;", "p1", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;Lcom/appsflyer/internal/AFc1qSDK;)V", "getMonetizationNetwork", "Ljava/lang/String;"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 74 */    public final class AFb1kSDK {
                public static final AFb1kSDK INSTANCE = new AFb1kSDK();

                /* JADX INFO: renamed from: getMonetizationNetwork, reason: from kotlin metadata */
                private static String getCurrencyIso4217Code;

                private AFb1kSDK() {
                }

                public static final synchronized String getCurrencyIso4217Code(AFc1qSDK p0) {
                    String str;
                    try {
/* 4 */                 p0.getClass();
/* 9 */                 if (getCurrencyIso4217Code == null) {
/* 14 */                    String monetizationNetwork = p0.getMonetizationNetwork("AF_INSTALLATION", (String) null);
/* 18 */                    if (monetizationNetwork == null) {
/* 53 */                        monetizationNetwork = System.currentTimeMillis() + "-" + Math.abs(new SecureRandom().nextLong());
/* 59 */                        p0.getRevenue("AF_INSTALLATION", monetizationNetwork);
                            }
/* 65 */                    getCurrencyIso4217Code = monetizationNetwork;
                        }
/* 67 */                str = getCurrencyIso4217Code;
/* 69 */                str.getClass();
                    } catch (Throwable th) {
/* 75 */                throw th;
                    }
/* 73 */            return str;
                }

/* 75 */        public static final synchronized void getCurrencyIso4217Code(String p0, AFc1qSDK p1) {
                    p0.getClass();
                    p1.getClass();
/* 76 */            getCurrencyIso4217Code = p0;
/* 77 */            p1.AFAdRevenueData("CUSTOM_INSTALL_ID_APPLIED", true);
/* 78 */            p1.getRevenue("AF_INSTALLATION", p0);
                }
            }
