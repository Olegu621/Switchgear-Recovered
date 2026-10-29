            package io.sentry.android.core.internal.util;

            import android.content.Context;
            import io.sentry.ILogger;
            import io.sentry.android.core.C1248o0;
            import io.sentry.util.AbstractC1704c;
            import java.nio.charset.Charset;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.util.k */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1224k {

                /* JADX INFO: renamed from: g */
                public static final Charset f10173g = Charset.forName("UTF-8");

                /* JADX INFO: renamed from: a */
                public final Context f10174a;

                /* JADX INFO: renamed from: b */
                public final C1248o0 f10175b;

                /* JADX INFO: renamed from: c */
                public final ILogger f10176c;

                /* JADX INFO: renamed from: d */
                public final String[] f10177d;

                /* JADX INFO: renamed from: e */
                public final String[] f10178e;

                /* JADX INFO: renamed from: f */
                public final Runtime f10179f;

                public C1224k(Context context, C1248o0 c1248o0, ILogger iLogger) {
/* 45 */            Runtime runtime = Runtime.getRuntime();
/* 52 */            this.f10174a = context;
/* 56 */            AbstractC1704c.m5462q(c1248o0, "The BuildInfoProvider is required.");
/* 59 */            this.f10175b = c1248o0;
/* 63 */            AbstractC1704c.m5462q(iLogger, "The Logger is required.");
/* 66 */            this.f10176c = iLogger;
/* 68 */            this.f10177d = new String[]{"/sbin/su", "/data/local/xbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/bin/su", "/system/app/Superuser.apk", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su", "/su/bin", "/system/xbin/daemonsu"};
/* 70 */            this.f10178e = new String[]{"com.devadvance.rootcloak", "com.devadvance.rootcloakplus", "com.koushikdutta.superuser", "com.thirdparty.superuser", "eu.chainfire.supersu", "com.noshufou.android.su"};
/* 74 */            AbstractC1704c.m5462q(runtime, "The Runtime is required.");
/* 77 */            this.f10179f = runtime;
                }
            }
