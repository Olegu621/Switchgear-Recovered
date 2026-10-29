            package io.sentry.android.core.performance;

            import android.os.Looper;
            import io.sentry.AbstractC1672t4;
            import io.sentry.EnumC1640r1;
            import io.sentry.InterfaceC1525k1;
            import io.sentry.android.core.internal.util.C1218e;
            
            /* JADX INFO: renamed from: io.sentry.android.core.performance.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1253a {

                /* JADX INFO: renamed from: a */
                public final String f10244a;

                /* JADX INFO: renamed from: b */
                public AbstractC1672t4 f10245b = null;

                /* JADX INFO: renamed from: c */
                public AbstractC1672t4 f10246c = null;

                /* JADX INFO: renamed from: d */
                public InterfaceC1525k1 f10247d = null;

                /* JADX INFO: renamed from: e */
                public InterfaceC1525k1 f10248e = null;

                public C1253a(String str) {
/* 13 */            this.f10244a = str;
                }

                /* JADX INFO: renamed from: a */
                public static InterfaceC1525k1 m4900a(InterfaceC1525k1 interfaceC1525k1, String str, AbstractC1672t4 abstractC1672t4) {
/* 3 */             InterfaceC1525k1 interfaceC1525k1Mo4727c = interfaceC1525k1.mo4727c(str, abstractC1672t4, EnumC1640r1.SENTRY);
/* 25 */            interfaceC1525k1Mo4727c.mo4732j(Long.valueOf(C1218e.m4839d(Looper.getMainLooper().getThread())), "thread.id");
/* 32 */            interfaceC1525k1Mo4727c.mo4732j("main", "thread.name");
/* 35 */            Boolean bool = Boolean.TRUE;
/* 39 */            interfaceC1525k1Mo4727c.mo4732j(bool, "ui.contributes_to_ttid");
/* 44 */            interfaceC1525k1Mo4727c.mo4732j(bool, "ui.contributes_to_ttfd");
/* 47 */            return interfaceC1525k1Mo4727c;
                }
            }
