            package io.sentry.android.core;

            import android.content.res.Configuration;
            import androidx.core.app.NotificationCompat;
            import io.sentry.C1443f;
            import io.sentry.C1486i0;
            import io.sentry.C1554m6;
            import io.sentry.EnumC1553m5;
            import io.sentry.RunnableC1526k2;
            import io.sentry.android.replay.C1325j;
            import io.sentry.android.replay.C1326k;
            import io.sentry.android.replay.C1331p;
            import io.sentry.android.replay.capture.AbstractC1301c;
            import io.sentry.android.replay.capture.C1299a;
            import io.sentry.android.replay.capture.C1300b;
            import io.sentry.android.replay.capture.C1305g;
            import io.sentry.android.replay.capture.C1308j;
            import io.sentry.android.replay.util.RunnableC1354h;
            import io.sentry.protocol.EnumC1601g;
            import io.sentry.rrweb.AbstractC1647b;
            import io.sentry.rrweb.C1658m;
            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Locale;
            import kotlin.jvm.internal.Intrinsics;
            import p000.C2085pw;
            import p000.C2270uw;
            import p000.e22;
            import p000.u21;
            
            /* JADX INFO: renamed from: io.sentry.android.core.b0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final /* synthetic */ class RunnableC1174b0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f9966a = 0;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ long f9967b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f9968c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f9969d;

                public /* synthetic */ RunnableC1174b0(AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration, long j, Configuration configuration) {
/* 7 */             this.f9968c = appComponentsBreadcrumbsIntegration;
/* 9 */             this.f9967b = j;
/* 11 */            this.f9969d = configuration;
                }

                @Override // java.lang.Runnable
                public final void run() throws IOException {
/* 1 */             int i = this.f9966a;
/* 4 */             EnumC1601g enumC1601g = null;
/* 5 */             long j = this.f9967b;
/* 7 */             Object obj = this.f9969d;
/* 9 */             Object obj2 = this.f9968c;
                    switch (i) {
                        case 0:
/* 221 */                   AppComponentsBreadcrumbsIntegration appComponentsBreadcrumbsIntegration = (AppComponentsBreadcrumbsIntegration) obj2;
/* 223 */                   Configuration configuration = (Configuration) obj;
/* 227 */                   if (appComponentsBreadcrumbsIntegration.f9849b != null) {
/* 239 */                       int i2 = appComponentsBreadcrumbsIntegration.f9848a.getResources().getConfiguration().orientation;
/* 242 */                       if (i2 == 1) {
/* 250 */                           enumC1601g = EnumC1601g.PORTRAIT;
                                } else if (i2 == 2) {
/* 247 */                           enumC1601g = EnumC1601g.LANDSCAPE;
                                }
/* 265 */                       String lowerCase = enumC1601g != null ? enumC1601g.name().toLowerCase(Locale.ROOT) : "undefined";
/* 269 */                       C1443f c1443f = new C1443f(j);
/* 274 */                       c1443f.f10930e = NotificationCompat.CATEGORY_NAVIGATION;
/* 278 */                       c1443f.f10932i = "device.orientation";
/* 282 */                       c1443f.m5209d(lowerCase, "position");
/* 287 */                       c1443f.f10934w = EnumC1553m5.INFO;
/* 291 */                       C1486i0 c1486i0 = new C1486i0();
/* 296 */                       c1486i0.m5275d(configuration, "android:configuration");
/* 301 */                       appComponentsBreadcrumbsIntegration.f9849b.mo5086f(c1443f, c1486i0);
/* 304 */                       return;
                            }
/* 304 */                   return;
                        default:
/* 15 */                    C1305g c1305g = (C1305g) obj2;
/* 17 */                    C1331p c1331p = (C1331p) obj;
/* 19 */                    C1326k c1326k = c1305g.f10465h;
/* 21 */                    if (c1326k != null) {
/* 27 */                        c1331p.invoke(c1326k, Long.valueOf(j));
                            }
/* 44 */                    long jMo4838c = c1305g.f10490v.mo4838c() - c1305g.f10488t.getSessionReplay().f11531h;
/* 46 */                    C1326k c1326k2 = c1305g.f10465h;
/* 55 */                    String strM5017i = c1326k2 != null ? c1326k2.m5017i(jMo4838c) : null;
/* 56 */                    C1300b c1300b = c1305g.f10469l;
/* 60 */                    u21 u21Var = AbstractC1301c.f10457s[2];
/* 62 */                    c1300b.getClass();
/* 65 */                    u21Var.getClass();
/* 70 */                    Object andSet = c1300b.f10454b.getAndSet(strM5017i);
/* 78 */                    if (!Intrinsics.m6216a(andSet, strM5017i)) {
/* 85 */                        C1299a c1299a = new C1299a(andSet, strM5017i, c1300b.f10456d, 3);
/* 88 */                        AbstractC1301c abstractC1301c = c1300b.f10455c;
/* 90 */                        C1554m6 c1554m6 = abstractC1301c.f10458a;
/* 100 */                       if (c1554m6.getThreadChecker().mo4842c()) {
/* 117 */                           abstractC1301c.f10462e.submit(new RunnableC1354h(new RunnableC1526k2(c1299a, 6), "CaptureStrategy.runInBackground"));
                                } else {
                                    try {
/* 121 */                               c1299a.invoke();
                                    } catch (Throwable th) {
/* 135 */                               c1554m6.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                                    }
                                }
                                break;
                            }
/* 138 */                   ArrayList arrayList = c1305g.f10492x;
/* 142 */                   e22 e22Var = new e22();
/* 151 */                   C2270uw.m9143n(arrayList, new C1325j(jMo4838c, c1305g, e22Var, 1));
/* 156 */                   if (e22Var.f7490a) {
/* 162 */                       int i3 = 0;
/* 167 */                       for (Object obj3 : arrayList) {
/* 173 */                           int i4 = i3 + 1;
/* 175 */                           if (i3 < 0) {
/* 216 */                               C2085pw.m7568g();
/* 219 */                               throw null;
                                    }
/* 177 */                           C1308j c1308j = (C1308j) obj3;
/* 181 */                           c1308j.f10493a.f11213e0 = i3;
/* 185 */                           List<AbstractC1647b> list = c1308j.f10494b.f11810b;
/* 187 */                           if (list != null) {
/* 197 */                               for (AbstractC1647b abstractC1647b : list) {
/* 207 */                                   if (abstractC1647b instanceof C1658m) {
/* 211 */                                       ((C1658m) abstractC1647b).f11633d = i3;
                                            }
                                        }
                                    }
/* 214 */                           i3 = i4;
                                }
/* 220 */                       return;
                            }
/* 220 */                   return;
                    }
                }

/* 13 */        public /* synthetic */ RunnableC1174b0(C1305g c1305g, C1331p c1331p, long j) {
                    this.f9968c = c1305g;
                    this.f9969d = c1331p;
                    this.f9967b = j;
                }
            }
