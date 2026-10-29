            package com.appsflyer.internal;

            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerProperties;
            import io.sentry.android.core.AbstractC1245n0;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJG\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\fJ1\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001c\u0010\fJ'\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001d\u0010\fR\u0014\u0010 \u001a\u00020\b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f"}, m6176d2 = {"Lcom/appsflyer/internal/AFg1hSDK;", "Lcom/appsflyer/internal/AFh1ySDK;", "<init>", "()V", "Lcom/appsflyer/internal/AFg1cSDK;", "p0", HttpUrl.FRAGMENT_ENCODE_SET, "p1", HttpUrl.FRAGMENT_ENCODE_SET, "p2", HttpUrl.FRAGMENT_ENCODE_SET, "d", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Z)V", HttpUrl.FRAGMENT_ENCODE_SET, "p3", "p4", "p5", "p6", "e", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;)V", "i", "Lcom/appsflyer/AFLogger$LogLevel;", "getRevenue", "(Lcom/appsflyer/AFLogger$LogLevel;Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;)V", "getMediationNetwork", "(Lcom/appsflyer/AFLogger$LogLevel;)Z", "v", "w", "getShouldExtendMsg", "()Z", "getMonetizationNetwork", "AFa1zSDK"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class AFg1hSDK extends AFh1ySDK {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public /* synthetic */ class AFa1vSDK {
                    public static final /* synthetic */ int[] getRevenue;

                    static {
/* 6 */                 int[] iArr = new int[AFLogger.LogLevel.values().length];
                        try {
/* 15 */                    iArr[AFLogger.LogLevel.DEBUG.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
/* 24 */                    iArr[AFLogger.LogLevel.INFO.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
/* 33 */                    iArr[AFLogger.LogLevel.WARNING.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
/* 42 */                    iArr[AFLogger.LogLevel.VERBOSE.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
/* 51 */                    iArr[AFLogger.LogLevel.ERROR.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
/* 60 */                    iArr[AFLogger.LogLevel.NONE.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
/* 62 */                getRevenue = iArr;
                    }
                }

                private static boolean getMediationNetwork(AFLogger.LogLevel p0) {
                    return p0.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
                }

                private final void getRevenue(AFLogger.LogLevel p0, AFg1cSDK p1, String p2, Throwable p3) {
/* 5 */             if (getMediationNetwork(p0)) {
/* 7 */                 String mediationNetwork = getMediationNetwork(p2, p1);
/* 17 */                int i = AFa1vSDK.getRevenue[p0.ordinal()];
/* 22 */                if (i == 3) {
/* 32 */                    AbstractC1245n0.m4889q("AppsFlyer_6.17.6", mediationNetwork);
                        } else {
/* 25 */                    if (i != 5) {
/* 35 */                        return;
                            }
/* 28 */                    AbstractC1245n0.m4877e("AppsFlyer_6.17.6", mediationNetwork, p3);
                        }
                    }
                }

                @Override // com.appsflyer.internal.AFh1ySDK
                /* JADX INFO: renamed from: d */
                public final void mo1747d(AFg1cSDK p0, String p1, boolean p2) {
/* 1 */             p0.getClass();
/* 4 */             p1.getClass();
/* 10 */            getRevenue(AFLogger.LogLevel.DEBUG, p0, p1, null);
                }

                @Override // com.appsflyer.internal.AFh1ySDK
                /* JADX INFO: renamed from: e */
                public final void mo1748e(AFg1cSDK p0, String p1, Throwable p2, boolean p3, boolean p4, boolean p5, boolean p6) {
/* 1 */             p0.getClass();
/* 4 */             p1.getClass();
/* 7 */             p2.getClass();
/* 10 */            if (p4) {
/* 14 */                getRevenue(AFLogger.LogLevel.ERROR, p0, p1, p2);
                    } else if (p3) {
/* 23 */                getRevenue(AFLogger.LogLevel.DEBUG, p0, p1, null);
                    }
                }

                @Override // com.appsflyer.internal.AFh1ySDK
                public final void force(AFg1cSDK p0, String p1) {
/* 1 */             p0.getClass();
/* 4 */             p1.getClass();
/* 15 */            if (AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
/* 20 */                return;
                    }
/* 17 */            withTag$SDK_prodRelease(p1, p0);
                }

                @Override // com.appsflyer.internal.AFh1ySDK
                public final boolean getShouldExtendMsg() {
                    return AFLogger.LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel();
                }

                @Override // com.appsflyer.internal.AFh1ySDK
                /* JADX INFO: renamed from: i */
                public final void mo1749i(AFg1cSDK p0, String p1, boolean p2) {
/* 1 */             p0.getClass();
/* 4 */             p1.getClass();
/* 10 */            getRevenue(AFLogger.LogLevel.INFO, p0, p1, null);
                }

                @Override // com.appsflyer.internal.AFh1ySDK
                /* JADX INFO: renamed from: v */
                public final void mo1750v(AFg1cSDK p0, String p1, boolean p2) {
/* 1 */             p0.getClass();
/* 4 */             p1.getClass();
/* 10 */            getRevenue(AFLogger.LogLevel.VERBOSE, p0, p1, null);
                }

                @Override // com.appsflyer.internal.AFh1ySDK
                /* JADX INFO: renamed from: w */
                public final void mo1751w(AFg1cSDK p0, String p1, boolean p2) {
/* 1 */             p0.getClass();
/* 4 */             p1.getClass();
/* 10 */            getRevenue(AFLogger.LogLevel.WARNING, p0, p1, null);
                }
            }
