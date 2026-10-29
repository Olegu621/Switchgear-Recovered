            package io.sentry.android.core;

            import android.app.ActivityManager;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.ProviderInfo;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import io.sentry.AbstractC1552m4;
            import io.sentry.C1529k5;
            import io.sentry.C1697u2;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.core.performance.C1259g;
            import java.util.Iterator;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class SentryInitProvider extends AbstractC1275u0 {
                @Override // android.content.ContentProvider
                public final void attachInfo(Context context, ProviderInfo providerInfo) {
/* 13 */            if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
/* 21 */                f42.m3656l("An applicationId is required to fulfill the manifest placeholder.");
                    } else {
/* 15 */                super.attachInfo(context, providerInfo);
                    }
                }

                @Override // android.content.ContentProvider
                public final String getType(Uri uri) {
/* 1 */             return null;
                }

                @Override // android.content.ContentProvider
                public final boolean onCreate() {
                    boolean zM4883k;
/* 1 */             C1259g.m4908d(this);
/* 7 */             C1274u c1274u = new C1274u(3);
/* 10 */            Context context = getContext();
/* 14 */            if (context == null) {
/* 23 */                c1274u.mo4672k(EnumC1553m5.FATAL, "App. Context from ContentProvider is null", new Object[0]);
/* 26 */                C1259g.m4909e(this);
/* 20 */                return false;
                    }
                    try {
/* 52 */                ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) AbstractC1245n0.f10220d.m1157c(context) : (ApplicationInfo) AbstractC1245n0.f10221e.m1157c(context);
/* 59 */                Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
/* 71 */                zM4883k = bundle != null ? AbstractC1245n0.m4883k(bundle, c1274u, "io.sentry.auto-init", true) : true;
                    } catch (Throwable th) {
/* 77 */                c1274u.mo4671d(EnumC1553m5.ERROR, "Failed to read auto-init from android manifest metadata.", th);
                    }
/* 81 */            if (zM4883k) {
/* 93 */                if (context.getPackageName().endsWith(".test")) {
                            try {
/* 107 */                       Iterator<ActivityManager.AppTask> it = ((ActivityManager) context.getSystemService("activity")).getAppTasks().iterator();
/* 115 */                       while (it.hasNext()) {
/* 131 */                           ComponentName component = it.next().getTaskInfo().baseIntent.getComponent();
/* 135 */                           if (component == null || !component.getClassName().equals("androidx.compose.ui.tooling.PreviewActivity")) {
                                    }
                                }
                            } catch (Throwable unused) {
                            }
/* 157 */                   AbstractC1198i1.m4810b(context, c1274u, new C1697u2(17));
/* 166 */                   C1529k5.m5336d().m5337a("AutoInit");
                        } else {
/* 157 */                   AbstractC1198i1.m4810b(context, c1274u, new C1697u2(17));
/* 166 */                   C1529k5.m5336d().m5337a("AutoInit");
                        }
                    }
/* 169 */           C1259g.m4909e(this);
/* 30 */            return true;
                }

                @Override // android.content.ContentProvider
                public final void shutdown() {
/* 1 */             AbstractC1552m4.m5356a();
                }
            }
