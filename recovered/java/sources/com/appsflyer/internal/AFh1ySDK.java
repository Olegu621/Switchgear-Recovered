            package com.appsflyer.internal;

            import androidx.core.app.NotificationCompat;
            import kotlin.Metadata;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.f42;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0014\b'\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u000b\u0010\fJO\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0016\u0010\fJ)\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0017\u0010\fJ)\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0018\u0010\fJ\u001d\u0010\u001a\u001a\u00020\u0006*\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\u0004H\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u001c\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\b8\u0017X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 "}, m6176d2 = {"Lcom/appsflyer/internal/AFh1ySDK;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "Lcom/appsflyer/internal/AFg1cSDK;", "tag", HttpUrl.FRAGMENT_ENCODE_SET, NotificationCompat.CATEGORY_MESSAGE, HttpUrl.FRAGMENT_ENCODE_SET, "shouldRemoteDebug", HttpUrl.FRAGMENT_ENCODE_SET, "d", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Z)V", HttpUrl.FRAGMENT_ENCODE_SET, "throwable", "printMsg", "printThrowable", "shouldReportToExManager", "e", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V", "force", "(Lcom/appsflyer/internal/AFg1cSDK;Ljava/lang/String;)V", "i", "v", "w", "p0", "getMediationNetwork", "(Ljava/lang/String;Lcom/appsflyer/internal/AFg1cSDK;)Ljava/lang/String;", "withTag$SDK_prodRelease", "shouldExtendMsg", "Z", "getShouldExtendMsg", "()Z", "Companion"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
/* 15 */    public abstract class AFh1ySDK {
                private final boolean shouldExtendMsg;
                public static long AFAdRevenueData = System.currentTimeMillis();

                public static /* synthetic */ void d$default(AFh1ySDK aFh1ySDK, AFg1cSDK aFg1cSDK, String str, boolean z, int i, Object obj) {
/* 1 */             if (obj != null) {
/* 12 */                f42.m3660p();
/* 15 */                return;
                    }
/* 5 */             if ((i & 4) != 0) {
/* 7 */                 z = true;
                    }
/* 8 */             aFh1ySDK.mo1747d(aFg1cSDK, str, z);
                }

                public static /* synthetic */ void e$default(AFh1ySDK aFh1ySDK, AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
/* 1 */             if (obj != null) {
/* 28 */                f42.m3660p();
/* 31 */                return;
                    }
/* 6 */             if ((i & 8) != 0) {
/* 8 */                 z = true;
                    }
/* 11 */            if ((i & 16) != 0) {
/* 13 */                z2 = true;
                    }
/* 16 */            if ((i & 32) != 0) {
/* 18 */                z3 = true;
                    }
/* 21 */            if ((i & 64) != 0) {
/* 23 */                z4 = true;
                    }
/* 24 */            aFh1ySDK.mo1748e(aFg1cSDK, str, th, z, z2, z3, z4);
                }

                public static /* synthetic */ void i$default(AFh1ySDK aFh1ySDK, AFg1cSDK aFg1cSDK, String str, boolean z, int i, Object obj) {
/* 1 */             if (obj != null) {
/* 12 */                f42.m3660p();
/* 15 */                return;
                    }
/* 5 */             if ((i & 4) != 0) {
/* 7 */                 z = true;
                    }
/* 8 */             aFh1ySDK.mo1749i(aFg1cSDK, str, z);
                }

                public static /* synthetic */ void v$default(AFh1ySDK aFh1ySDK, AFg1cSDK aFg1cSDK, String str, boolean z, int i, Object obj) {
/* 1 */             if (obj != null) {
/* 12 */                f42.m3660p();
/* 15 */                return;
                    }
/* 5 */             if ((i & 4) != 0) {
/* 7 */                 z = true;
                    }
/* 8 */             aFh1ySDK.mo1750v(aFg1cSDK, str, z);
                }

                public static /* synthetic */ void w$default(AFh1ySDK aFh1ySDK, AFg1cSDK aFg1cSDK, String str, boolean z, int i, Object obj) {
/* 1 */             if (obj != null) {
/* 12 */                f42.m3660p();
/* 15 */                return;
                    }
/* 5 */             if ((i & 4) != 0) {
/* 7 */                 z = true;
                    }
/* 8 */             aFh1ySDK.mo1751w(aFg1cSDK, str, z);
                }

                /* JADX INFO: renamed from: d */
                public final void m1810d(AFg1cSDK aFg1cSDK, String str) {
/* 1 */             aFg1cSDK.getClass();
/* 4 */             str.getClass();
/* 13 */            d$default(this, aFg1cSDK, str, false, 4, null);
                }

                /* JADX INFO: renamed from: e */
                public final void m1814e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z, boolean z2, boolean z3) {
/* 1 */             aFg1cSDK.getClass();
/* 4 */             str.getClass();
/* 7 */             th.getClass();
/* 22 */            e$default(this, aFg1cSDK, str, th, z, z2, z3, false, 64, null);
                }

                public void force(AFg1cSDK tag, String msg) {
/* 1 */             tag.getClass();
/* 4 */             msg.getClass();
                }

                public final String getMediationNetwork(String str, AFg1cSDK aFg1cSDK) {
/* 1 */             aFg1cSDK.getClass();
/* 4 */             if (str == null || StringsKt.m6228D(str)) {
/* 12 */                str = "null";
                    }
/* 14 */            String strWithTag$SDK_prodRelease = withTag$SDK_prodRelease(str, aFg1cSDK);
/* 22 */            if (!getShouldExtendMsg()) {
/* 64 */                return strWithTag$SDK_prodRelease;
                    }
/* 30 */            long jCurrentTimeMillis = System.currentTimeMillis() - AFAdRevenueData;
/* 35 */            String name = Thread.currentThread().getName();
/* 43 */            StringBuilder sb = new StringBuilder("(");
/* 46 */            sb.append(jCurrentTimeMillis);
/* 51 */            sb.append(") [");
/* 54 */            sb.append(name);
/* 59 */            return fm0.m3789o(sb, "] ", strWithTag$SDK_prodRelease);
                }

                public boolean getShouldExtendMsg() {
/* 1 */             return this.shouldExtendMsg;
                }

                /* JADX INFO: renamed from: i */
                public final void m1815i(AFg1cSDK aFg1cSDK, String str) {
/* 1 */             aFg1cSDK.getClass();
/* 4 */             str.getClass();
/* 13 */            i$default(this, aFg1cSDK, str, false, 4, null);
                }

                /* JADX INFO: renamed from: v */
                public final void m1816v(AFg1cSDK aFg1cSDK, String str) {
/* 1 */             aFg1cSDK.getClass();
/* 4 */             str.getClass();
/* 13 */            v$default(this, aFg1cSDK, str, false, 4, null);
                }

                /* JADX INFO: renamed from: w */
                public final void m1817w(AFg1cSDK aFg1cSDK, String str) {
/* 1 */             aFg1cSDK.getClass();
/* 4 */             str.getClass();
/* 13 */            w$default(this, aFg1cSDK, str, false, 4, null);
                }

                public final String withTag$SDK_prodRelease(String str, AFg1cSDK aFg1cSDK) {
/* 1 */             str.getClass();
/* 4 */             aFg1cSDK.getClass();
/* 13 */            return AbstractC0886en.m3509m("[", aFg1cSDK.AFAdRevenueData, "] ", str);
                }

                /* JADX INFO: renamed from: d */
/* 16 */        public void mo1747d(AFg1cSDK tag, String msg, boolean shouldRemoteDebug) {
/* 17 */            tag.getClass();
                    msg.getClass();
                }

                /* JADX INFO: renamed from: i */
/* 16 */        public void mo1749i(AFg1cSDK tag, String msg, boolean shouldRemoteDebug) {
/* 17 */            tag.getClass();
                    msg.getClass();
                }

                /* JADX INFO: renamed from: v */
/* 16 */        public void mo1750v(AFg1cSDK tag, String msg, boolean shouldRemoteDebug) {
/* 17 */            tag.getClass();
                    msg.getClass();
                }

                /* JADX INFO: renamed from: w */
/* 16 */        public void mo1751w(AFg1cSDK tag, String msg, boolean shouldRemoteDebug) {
/* 17 */            tag.getClass();
                    msg.getClass();
                }

                /* JADX INFO: renamed from: e */
/* 25 */        public final void m1811e(AFg1cSDK aFg1cSDK, String str, Throwable th) {
/* 26 */            aFg1cSDK.getClass();
                    str.getClass();
                    th.getClass();
                    e$default(this, aFg1cSDK, str, th, false, false, false, false, 120, null);
                }

                /* JADX INFO: renamed from: e */
/* 26 */        public final void m1812e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z) {
/* 27 */            aFg1cSDK.getClass();
                    str.getClass();
                    th.getClass();
                    e$default(this, aFg1cSDK, str, th, z, false, false, false, 112, null);
                }

                /* JADX INFO: renamed from: e */
/* 27 */        public final void m1813e(AFg1cSDK aFg1cSDK, String str, Throwable th, boolean z, boolean z2) {
/* 28 */            aFg1cSDK.getClass();
                    str.getClass();
                    th.getClass();
                    e$default(this, aFg1cSDK, str, th, z, z2, false, false, 96, null);
                }

                /* JADX INFO: renamed from: e */
/* 28 */        public void mo1748e(AFg1cSDK tag, String msg, Throwable throwable, boolean printMsg, boolean printThrowable, boolean shouldReportToExManager, boolean shouldRemoteDebug) {
/* 29 */            tag.getClass();
                    msg.getClass();
                    throwable.getClass();
                }
            }
