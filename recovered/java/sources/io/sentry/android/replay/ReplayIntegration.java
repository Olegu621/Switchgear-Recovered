            package io.sentry.android.replay;

            import android.content.Context;
            import android.graphics.Bitmap;
            import android.os.Build;
            import android.os.Handler;
            import android.view.View;
            import io.sentry.C1469h4;
            import io.sentry.C1529k5;
            import io.sentry.C1637q6;
            import io.sentry.C1666s6;
            import io.sentry.C1670t2;
            import io.sentry.EnumC1553m5;
            import io.sentry.EnumC1560n;
            import io.sentry.EnumC1570o0;
            import io.sentry.EnumC1584p6;
            import io.sentry.InterfaceC1457g1;
            import io.sentry.InterfaceC1578p0;
            import io.sentry.InterfaceC1661s1;
            import io.sentry.InterfaceC1698u3;
            import io.sentry.InterfaceC1725v3;
            import io.sentry.android.core.C1185e0;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.replay.capture.AbstractC1301c;
            import io.sentry.android.replay.capture.C1305g;
            import io.sentry.android.replay.capture.C1312n;
            import io.sentry.android.replay.capture.RunnableC1303e;
            import io.sentry.android.replay.gestures.C1322b;
            import io.sentry.android.replay.util.ScheduledExecutorServiceC1353g;
            import io.sentry.protocol.C1626w;
            import io.sentry.transport.C1678d;
            import io.sentry.transport.C1690p;
            import io.sentry.transport.InterfaceC1689o;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.C1702a;
            import io.sentry.util.C1713l;
            import java.io.Closeable;
            import java.io.File;
            import java.lang.ref.WeakReference;
            import java.util.Date;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.Metadata;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1852e;
            import kotlin.text.StringsKt;
            import p000.C1983o;
            import p000.f72;
            import p000.h22;
            import p000.hk2;
            import p000.jd1;
            import p000.r51;
            import p000.xe2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0003\u0006\u0007\u0007¨\u0006\b"}, m6176d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/s1;", "Ljava/io/Closeable;", "Lio/sentry/v3;", "Lio/sentry/p0;", "Lio/sentry/transport/o;", "io/sentry/android/replay/n", "io/sentry/k0", "sentry-android-replay_release"}, m6177k = 1, m6178mv = {1, 9, 0}, m6180xi = 48)
            public final class ReplayIntegration implements InterfaceC1661s1, Closeable, InterfaceC1725v3, InterfaceC1578p0, InterfaceC1689o {

                /* JADX INFO: renamed from: d0 */
                public static final /* synthetic */ int f10408d0 = 0;

                /* JADX INFO: renamed from: U */
                public final hk2 f10409U;

                /* JADX INFO: renamed from: V */
                public final hk2 f10410V;

                /* JADX INFO: renamed from: W */
                public final AtomicBoolean f10411W;

                /* JADX INFO: renamed from: X */
                public final AtomicBoolean f10412X;

                /* JADX INFO: renamed from: Y */
                public AbstractC1301c f10413Y;

                /* JADX INFO: renamed from: Z */
                public InterfaceC1698u3 f10414Z;

                /* JADX INFO: renamed from: a */
                public final Context f10415a;

                /* JADX INFO: renamed from: a0 */
                public final C1666s6 f10416a0;

                /* JADX INFO: renamed from: b */
                public final C1678d f10417b;

                /* JADX INFO: renamed from: b0 */
                public final C1702a f10418b0;

                /* JADX INFO: renamed from: c */
                public volatile EnumC1570o0 f10419c;

                /* JADX INFO: renamed from: c0 */
                public final C1333r f10420c0;

                /* JADX INFO: renamed from: d */
                public SentryAndroidOptions f10421d;

                /* JADX INFO: renamed from: e */
                public C1469h4 f10422e;

                /* JADX INFO: renamed from: f */
                public C1318f0 f10423f;

                /* JADX INFO: renamed from: i */
                public C1322b f10424i;

                /* JADX INFO: renamed from: v */
                public final hk2 f10425v;

                /* JADX INFO: renamed from: w */
                public final hk2 f10426w;

                static {
/* 9 */             C1529k5.m5336d().m5338b("maven:io.sentry:sentry-android-replay", "8.48.0");
                }

                public ReplayIntegration(Context context) {
/* 1 */             C1678d c1678d = C1678d.f11692a;
/* 3 */             Context applicationContext = context.getApplicationContext();
/* 14 */            this.f10415a = applicationContext != null ? applicationContext : context;
/* 16 */            this.f10417b = c1678d;
/* 20 */            this.f10419c = EnumC1570o0.UNKNOWN;
/* 28 */            this.f10425v = r51.m8065b(C1293a.f10428c);
/* 36 */            this.f10426w = r51.m8065b(C1293a.f10429d);
/* 48 */            this.f10409U = r51.m8065b(new C1330o(this, 1));
/* 60 */            this.f10410V = r51.m8065b(new C1330o(this, 0));
/* 67 */            this.f10411W = new AtomicBoolean(false);
/* 74 */            this.f10412X = new AtomicBoolean(false);
/* 78 */            this.f10414Z = C1670t2.f11666a;
/* 86 */            this.f10416a0 = new C1666s6(5);
/* 93 */            this.f10418b0 = new C1702a();
/* 97 */            C1333r c1333r = new C1333r();
/* 102 */           c1333r.f10572a = EnumC1334s.INITIAL;
/* 104 */           this.f10420c0 = c1333r;
                }

                @Override // io.sentry.InterfaceC1725v3
                /* JADX INFO: renamed from: c */
                public final void mo4971c(Boolean bool) {
/* 7 */             if (this.f10411W.get() && m4977o()) {
/* 16 */                C1626w c1626w = C1626w.f11478b;
/* 18 */                AbstractC1301c abstractC1301c = this.f10413Y;
/* 33 */                if (c1626w.equals(abstractC1301c != null ? abstractC1301c.m4987d() : null)) {
/* 35 */                    SentryAndroidOptions sentryAndroidOptions = this.f10421d;
/* 37 */                    if (sentryAndroidOptions != null) {
/* 50 */                        sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
/* 53 */                        return;
                            } else {
/* 56 */                        Intrinsics.m6220e("options");
/* 59 */                        throw null;
                            }
                        }
/* 60 */                AbstractC1301c abstractC1301c2 = this.f10413Y;
/* 62 */                if (abstractC1301c2 != null) {
/* 77 */                    abstractC1301c2.mo4985a(bool.equals(Boolean.TRUE), new C1983o(this, 28));
                        }
/* 80 */                AbstractC1301c abstractC1301c3 = this.f10413Y;
/* 88 */                this.f10413Y = abstractC1301c3 != null ? abstractC1301c3.mo4986b() : null;
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws Exception {
                    C1690p c1690pMo5084d;
/* 1 */             C1333r c1333r = this.f10420c0;
/* 5 */             C1702a c1702a = this.f10418b0;
/* 7 */             c1702a.m5443c();
                    try {
/* 17 */                if (this.f10411W.get()) {
/* 19 */                    EnumC1334s enumC1334s = EnumC1334s.CLOSED;
/* 25 */                    if (c1333r.m5018a(enumC1334s)) {
/* 29 */                        SentryAndroidOptions sentryAndroidOptions = this.f10421d;
/* 31 */                        if (sentryAndroidOptions == null) {
/* 218 */                           Intrinsics.m6220e("options");
/* 221 */                           throw null;
                                }
/* 37 */                        sentryAndroidOptions.getConnectionStatusProvider().mo4828Z0(this);
/* 40 */                        C1469h4 c1469h4 = this.f10422e;
/* 42 */                        if (c1469h4 != null && (c1690pMo5084d = c1469h4.mo5084d()) != null) {
/* 52 */                            c1690pMo5084d.f11711d.remove(this);
                                }
/* 59 */                        stop();
/* 62 */                        C1318f0 c1318f0 = this.f10423f;
/* 64 */                        if (c1318f0 != null) {
/* 66 */                            c1318f0.close();
                                }
/* 69 */                        this.f10423f = null;
/* 79 */                        ((C1346u) this.f10426w.getValue()).close();
/* 88 */                        if (this.f10409U.isInitialized()) {
/* 90 */                            SentryAndroidOptions sentryAndroidOptions2 = this.f10421d;
/* 92 */                            if (sentryAndroidOptions2 == null) {
/* 143 */                               Intrinsics.m6220e("options");
/* 146 */                               throw null;
                                    }
/* 98 */                            boolean zMo4842c = sentryAndroidOptions2.getThreadChecker().mo4842c();
/* 102 */                           hk2 hk2Var = this.f10409U;
/* 104 */                           if (zMo4842c) {
/* 110 */                               ScheduledExecutorServiceC1353g scheduledExecutorServiceC1353g = (ScheduledExecutorServiceC1353g) hk2Var.getValue();
                                        synchronized (scheduledExecutorServiceC1353g) {
/* 119 */                                   if (!scheduledExecutorServiceC1353g.f10661a.isShutdown()) {
/* 123 */                                       scheduledExecutorServiceC1353g.f10661a.shutdown();
                                            }
                                        }
                                    } else {
/* 139 */                               ((ScheduledExecutorServiceC1353g) hk2Var.getValue()).shutdown();
                                    }
                                }
/* 153 */                       if (this.f10410V.isInitialized()) {
/* 155 */                           SentryAndroidOptions sentryAndroidOptions3 = this.f10421d;
/* 157 */                           if (sentryAndroidOptions3 == null) {
/* 208 */                               Intrinsics.m6220e("options");
/* 211 */                               throw null;
                                    }
/* 163 */                           boolean zMo4842c2 = sentryAndroidOptions3.getThreadChecker().mo4842c();
/* 167 */                           hk2 hk2Var2 = this.f10410V;
/* 169 */                           if (zMo4842c2) {
/* 175 */                               ScheduledExecutorServiceC1353g scheduledExecutorServiceC1353g2 = (ScheduledExecutorServiceC1353g) hk2Var2.getValue();
                                        synchronized (scheduledExecutorServiceC1353g2) {
/* 184 */                                   if (!scheduledExecutorServiceC1353g2.f10661a.isShutdown()) {
/* 188 */                                       scheduledExecutorServiceC1353g2.f10661a.shutdown();
                                            }
                                        }
                                    } else {
/* 204 */                               ((ScheduledExecutorServiceC1353g) hk2Var2.getValue()).shutdown();
                                    }
                                }
/* 212 */                       c1333r.f10572a = enumC1334s;
/* 214 */                       xe2.m9770h(c1702a, null);
/* 217 */                       return;
                            }
                        }
/* 222 */               xe2.m9770h(c1702a, null);
                    } catch (Throwable th) {
                        try {
/* 226 */                   throw th;
                        } catch (Throwable th2) {
/* 228 */                   xe2.m9770h(c1702a, th);
/* 231 */                   throw th2;
                        }
                    }
                }

                @Override // io.sentry.InterfaceC1578p0
                /* JADX INFO: renamed from: f */
                public final void mo4757f(EnumC1570o0 enumC1570o0) throws Exception {
/* 1 */             enumC1570o0.getClass();
/* 4 */             this.f10419c = enumC1570o0;
/* 10 */            if (this.f10413Y instanceof C1312n) {
/* 15 */                if (enumC1570o0 == EnumC1570o0.DISCONNECTED) {
/* 17 */                    m4981t();
                        } else {
/* 21 */                    m4982v();
                        }
                    }
                }

                @Override // io.sentry.InterfaceC1725v3
                /* JADX INFO: renamed from: g */
                public final void mo4972g(C1626w c1626w) {
                    AbstractC1301c abstractC1301c;
/* 1 */             c1626w.getClass();
/* 10 */            if (!this.f10411W.get() || !m4977o() || (abstractC1301c = this.f10413Y) == null || c1626w.equals(C1626w.f11478b)) {
/* 68 */                return;
                    }
                    synchronized (abstractC1301c.f10474q) {
/* 42 */                if (abstractC1301c.f10475r.size() < 100) {
/* 44 */                    String strM5380a = c1626w.m5380a();
/* 54 */                    if (!abstractC1301c.f10475r.contains(strM5380a)) {
/* 58 */                        abstractC1301c.f10475r.add(strM5380a);
                            }
                        }
                    }
                }

                @Override // io.sentry.InterfaceC1725v3
                /* JADX INFO: renamed from: h */
                public final void mo4973h(C1297c c1297c) {
/* 1 */             this.f10414Z = c1297c;
                }

                @Override // io.sentry.InterfaceC1725v3
                /* JADX INFO: renamed from: i */
                public final C1626w mo4974i() {
                    C1626w c1626wM4987d;
/* 1 */             AbstractC1301c abstractC1301c = this.f10413Y;
/* 3 */             if (abstractC1301c != null && (c1626wM4987d = abstractC1301c.m4987d()) != null) {
/* 12 */                return c1626wM4987d;
                    }
/* 13 */            C1626w c1626w = C1626w.f11478b;
/* 15 */            c1626w.getClass();
/* 18 */            return c1626w;
                }

                @Override // io.sentry.transport.InterfaceC1689o
                /* JADX INFO: renamed from: k */
                public final void mo4801k(C1690p c1690p) throws Exception {
/* 5 */             if (this.f10413Y instanceof C1312n) {
/* 14 */                if (c1690p.m5428f(EnumC1560n.All) || c1690p.m5428f(EnumC1560n.Replay)) {
/* 29 */                    m4981t();
                        } else {
/* 25 */                    m4982v();
                        }
                    }
                }

                @Override // io.sentry.InterfaceC1661s1
                /* JADX INFO: renamed from: l */
                public final void mo4674l(SentryAndroidOptions sentryAndroidOptions) {
                    Double d;
/* 1 */             this.f10421d = sentryAndroidOptions;
/* 8 */             if (Build.VERSION.SDK_INT < 26) {
/* 20 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Session replay is only supported on API 26 and above", new Object[0]);
/* 23 */                return;
                    }
/* 28 */            Double d2 = sentryAndroidOptions.getSessionReplay().f11527d;
/* 32 */            if ((d2 == null || d2.doubleValue() <= 0.0d) && ((d = sentryAndroidOptions.getSessionReplay().f11528e) == null || d.doubleValue() <= 0.0d)) {
/* 185 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
/* 188 */               return;
                    }
/* 59 */            C1469h4 c1469h4 = C1469h4.f10976a;
/* 61 */            this.f10422e = c1469h4;
/* 82 */            this.f10423f = new C1318f0(sentryAndroidOptions, this, this, this.f10416a0, (ScheduledExecutorServiceC1353g) this.f10409U.getValue());
/* 89 */            this.f10424i = new C1322b(sentryAndroidOptions, this);
/* 93 */            int i = 1;
/* 94 */            this.f10411W.set(true);
/* 101 */           sentryAndroidOptions.getConnectionStatusProvider().mo4837z0(this);
/* 104 */           C1690p c1690pMo5084d = c1469h4.mo5084d();
/* 108 */           if (c1690pMo5084d != null) {
/* 112 */               c1690pMo5084d.f11711d.add(this);
                    }
/* 117 */           AbstractC1704c.m5446a("Replay");
/* 120 */           SentryAndroidOptions sentryAndroidOptions2 = this.f10421d;
/* 125 */           if (sentryAndroidOptions2 == null) {
/* 170 */               Intrinsics.m6220e("options");
/* 173 */               throw null;
                    }
/* 127 */           InterfaceC1457g1 executorService = sentryAndroidOptions2.getExecutorService();
/* 131 */           executorService.getClass();
/* 134 */           SentryAndroidOptions sentryAndroidOptions3 = this.f10421d;
/* 136 */           if (sentryAndroidOptions3 == null) {
/* 166 */               Intrinsics.m6220e("options");
/* 169 */               throw null;
                    }
                    try {
/* 148 */               executorService.submit(new RunnableC1303e(i, new f72(this, 26), sentryAndroidOptions3));
                    } catch (Throwable th) {
/* 162 */               sentryAndroidOptions3.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to submit task ReplayIntegration.finalize_previous_replay to executor", th);
                    }
                }

                /* JADX INFO: renamed from: m */
                public final void m4975m(String str) {
                    File[] fileArrListFiles;
/* 1 */             SentryAndroidOptions sentryAndroidOptions = this.f10421d;
/* 3 */             if (sentryAndroidOptions == null) {
/* 79 */                Intrinsics.m6220e("options");
/* 83 */                throw null;
                    }
/* 5 */             String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
/* 9 */             if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
/* 76 */                return;
                    }
/* 25 */            for (File file : fileArrListFiles) {
/* 29 */                String name = file.getName();
/* 33 */                name.getClass();
/* 42 */                if (C1852e.m6263m(name, "replay_", false) && !StringsKt.m6240z(name, mo4974i().m5380a(), false) && (StringsKt.m6228D(str) || !StringsKt.m6240z(name, str, false))) {
/* 70 */                    AbstractC1704c.m5451f(file);
                        }
                    }
                }

                @Override // io.sentry.InterfaceC1725v3
                /* JADX INFO: renamed from: n */
                public final void mo4976n() throws Exception {
                    AbstractC1301c c1305g;
/* 3 */             C1333r c1333r = this.f10420c0;
/* 5 */             C1702a c1702a = this.f10418b0;
/* 7 */             c1702a.m5443c();
                    try {
/* 17 */                if (!this.f10411W.get()) {
/* 19 */                    xe2.m9770h(c1702a, null);
/* 22 */                    return;
                        }
/* 23 */                EnumC1334s enumC1334s = EnumC1334s.STARTED;
/* 32 */                if (!c1333r.m5018a(enumC1334s)) {
/* 34 */                    SentryAndroidOptions sentryAndroidOptions = this.f10421d;
/* 36 */                    if (sentryAndroidOptions == null) {
/* 59 */                        Intrinsics.m6220e("options");
/* 62 */                        throw null;
                            }
/* 48 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
/* 51 */                    xe2.m9770h(c1702a, null);
/* 54 */                    return;
                        }
/* 69 */                C1713l c1713l = (C1713l) this.f10425v.getValue();
/* 71 */                SentryAndroidOptions sentryAndroidOptions2 = this.f10421d;
/* 73 */                if (sentryAndroidOptions2 == null) {
/* 309 */                   Intrinsics.m6220e("options");
/* 312 */                   throw null;
                        }
/* 79 */                Double d = sentryAndroidOptions2.getSessionReplay().f11527d;
/* 81 */                c1713l.getClass();
/* 101 */               boolean z = d != null && d.doubleValue() >= c1713l.m5480c();
/* 102 */               if (!z) {
/* 104 */                   SentryAndroidOptions sentryAndroidOptions3 = this.f10421d;
/* 106 */                   if (sentryAndroidOptions3 == null) {
/* 156 */                       Intrinsics.m6220e("options");
/* 159 */                       throw null;
                            }
/* 112 */                   Double d2 = sentryAndroidOptions3.getSessionReplay().f11528e;
/* 129 */                   if (!(d2 != null && d2.doubleValue() > 0.0d)) {
/* 131 */                       SentryAndroidOptions sentryAndroidOptions4 = this.f10421d;
/* 133 */                       if (sentryAndroidOptions4 == null) {
/* 152 */                           Intrinsics.m6220e("options");
/* 155 */                           throw null;
                                }
/* 145 */                       sentryAndroidOptions4.getLogger().mo4672k(EnumC1553m5.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
/* 148 */                       xe2.m9770h(c1702a, null);
/* 151 */                       return;
                            }
                        }
/* 160 */               c1333r.f10572a = enumC1334s;
/* 162 */               if (z) {
/* 166 */                   SentryAndroidOptions sentryAndroidOptions5 = this.f10421d;
/* 168 */                   if (sentryAndroidOptions5 == null) {
/* 196 */                       Intrinsics.m6220e("options");
/* 199 */                       throw null;
                            }
/* 192 */                   c1305g = new C1312n(sentryAndroidOptions5, this.f10422e, this.f10417b, (ScheduledExecutorServiceC1353g) this.f10409U.getValue(), (ScheduledExecutorServiceC1353g) this.f10410V.getValue());
                        } else {
/* 202 */                   SentryAndroidOptions sentryAndroidOptions6 = this.f10421d;
/* 204 */                   if (sentryAndroidOptions6 == null) {
/* 305 */                       Intrinsics.m6220e("options");
/* 308 */                       throw null;
                            }
/* 238 */                   c1305g = new C1305g(sentryAndroidOptions6, this.f10422e, this.f10417b, (C1713l) this.f10425v.getValue(), (ScheduledExecutorServiceC1353g) this.f10409U.getValue(), (ScheduledExecutorServiceC1353g) this.f10410V.getValue());
                        }
/* 241 */               this.f10413Y = c1305g;
/* 243 */               C1318f0 c1318f0 = this.f10423f;
/* 245 */               if (c1318f0 != null) {
/* 249 */                   c1318f0.f10527f.getAndSet(true);
                        }
/* 252 */               AbstractC1301c abstractC1301c = this.f10413Y;
/* 254 */               if (abstractC1301c != null) {
/* 261 */                   abstractC1301c.mo4996m(0, new C1626w(), null);
                        }
/* 266 */               if (this.f10423f != null) {
/* 276 */                   C1185e0 c1185e0 = ((C1346u) this.f10426w.getValue()).f10642c;
/* 278 */                   C1318f0 c1318f1 = this.f10423f;
/* 280 */                   c1318f1.getClass();
/* 283 */                   c1185e0.add(c1318f1);
                        }
/* 298 */               ((C1346u) this.f10426w.getValue()).f10642c.add(this.f10424i);
/* 301 */               xe2.m9770h(c1702a, null);
                    } catch (Throwable th) {
                        try {
/* 313 */                   throw th;
                        } catch (Throwable th2) {
/* 315 */                   xe2.m9770h(c1702a, th);
/* 318 */                   throw th2;
                        }
                    }
                }

                /* JADX INFO: renamed from: o */
                public final boolean m4977o() {
                    return this.f10420c0.f10572a.compareTo(EnumC1334s.STARTED) >= 0 && this.f10420c0.f10572a.compareTo(EnumC1334s.STOPPED) < 0;
                }

                @Override // io.sentry.InterfaceC1725v3
                /* JADX INFO: renamed from: p, reason: from getter */
                public final InterfaceC1698u3 getF10414Z() {
/* 1 */             return this.f10414Z;
                }

                @Override // io.sentry.InterfaceC1725v3
                public final void pause() throws Exception {
/* 4 */             this.f10412X.set(true);
/* 7 */             m4981t();
                }

                /* JADX INFO: renamed from: q */
                public final void m4979q(Bitmap bitmap) throws Exception {
                    C1469h4 c1469h4;
                    C1469h4 c1469h5;
                    C1690p c1690pMo5084d;
                    C1690p c1690pMo5084d2;
/* 1 */             bitmap.getClass();
/* 6 */             h22 h22Var = new h22();
/* 9 */             C1469h4 c1469h6 = this.f10422e;
/* 11 */            if (c1469h6 != null) {
/* 19 */                c1469h6.mo5098r(new C1328m(0, h22Var));
                    }
/* 22 */            AbstractC1301c abstractC1301c = this.f10413Y;
/* 24 */            if (abstractC1301c != null) {
/* 31 */                abstractC1301c.mo4991h(new C1331p(this, bitmap, h22Var));
                    }
/* 38 */            if (this.f10413Y instanceof C1312n) {
/* 44 */                if (this.f10419c == EnumC1570o0.DISCONNECTED || !(((c1469h4 = this.f10422e) == null || (c1690pMo5084d2 = c1469h4.mo5084d()) == null || !c1690pMo5084d2.m5428f(EnumC1560n.All)) && ((c1469h5 = this.f10422e) == null || (c1690pMo5084d = c1469h5.mo5084d()) == null || !c1690pMo5084d.m5428f(EnumC1560n.Replay)))) {
/* 84 */                    m4981t();
                        }
                    }
                }

                @Override // io.sentry.InterfaceC1725v3
                public final void resume() throws Exception {
/* 4 */             this.f10412X.set(false);
/* 7 */             m4982v();
                }

                /* JADX INFO: renamed from: s */
                public final void m4980s(int i, int i2) throws Exception {
                    C1318f0 c1318f0;
                    RunnableC1298c0 runnableC1298c0;
                    ViewTreeObserverOnDrawListenerC1371w viewTreeObserverOnDrawListenerC1371w;
/* 9 */             if (this.f10411W.get() && m4977o()) {
/* 19 */                SentryAndroidOptions sentryAndroidOptions = this.f10421d;
/* 24 */                if (sentryAndroidOptions == null) {
/* 344 */                   Intrinsics.m6220e("options");
/* 347 */                   throw null;
                        }
/* 32 */                if (sentryAndroidOptions.getSessionReplay().f11534k) {
/* 34 */                    Context context = this.f10415a;
/* 36 */                    SentryAndroidOptions sentryAndroidOptions2 = this.f10421d;
/* 38 */                    if (sentryAndroidOptions2 == null) {
/* 340 */                       Intrinsics.m6220e("options");
/* 343 */                       throw null;
                            }
/* 40 */                    C1637q6 sessionReplay = sentryAndroidOptions2.getSessionReplay();
/* 44 */                    sessionReplay.getClass();
/* 47 */                    context.getClass();
                            float f = i2;
/* 70 */                    int iM5796a = jd1.m5796a((f / context.getResources().getDisplayMetrics().density) * sessionReplay.f11529f.sizeScale);
/* 74 */                    int i3 = iM5796a % 16;
/* 93 */                    int iMax = i3 <= 8 ? Math.max(16, iM5796a - i3) : iM5796a + (16 - i3);
                            float f2 = i;
/* 106 */                   float f3 = f2 / context.getResources().getDisplayMetrics().density;
/* 108 */                   EnumC1584p6 enumC1584p6 = sessionReplay.f11529f;
/* 113 */                   int iM5796a2 = jd1.m5796a(f3 * enumC1584p6.sizeScale);
/* 117 */                   int i4 = iM5796a2 % 16;
/* 129 */                   int iMax2 = i4 <= 8 ? Math.max(16, iM5796a2 - i4) : iM5796a2 + (16 - i4);
/* 143 */                   C1372x c1372x = new C1372x(iMax2, iMax, iMax2 / f2, iMax / f, sessionReplay.f11530g, enumC1584p6.bitRate);
/* 152 */                   if (this.f10411W.get() && m4977o()) {
/* 162 */                       AbstractC1301c abstractC1301c = this.f10413Y;
/* 164 */                       if (abstractC1301c != null) {
/* 166 */                           abstractC1301c.mo4990g(c1372x);
                                }
/* 169 */                       C1318f0 c1318f1 = this.f10423f;
/* 171 */                       if (c1318f1 != null && c1318f1.f10527f.get()) {
/* 185 */                           if (c1318f1.f10519X == null) {
/* 187 */                               C1702a c1702a = c1318f1.f10517V;
/* 189 */                               c1702a.m5443c();
                                        try {
/* 194 */                                   if (c1318f1.f10519X == null) {
/* 205 */                                       c1318f1.f10519X = new RunnableC1298c0(c1318f1.f10522a, c1318f1.f10525d);
                                            }
/* 211 */                                   xe2.m9770h(c1702a, null);
                                        } catch (Throwable th) {
                                            try {
/* 215 */                                       throw th;
                                            } catch (Throwable th2) {
/* 217 */                                       xe2.m9770h(c1702a, th);
/* 220 */                                       throw th2;
                                            }
                                        }
                                    }
/* 221 */                           RunnableC1298c0 runnableC1298c1 = c1318f1.f10519X;
/* 223 */                           if (runnableC1298c1 != null) {
/* 226 */                               runnableC1298c1.f10447d = c1372x;
                                    }
/* 228 */                           RunnableC1298c0 runnableC1298c2 = c1318f1.f10519X;
/* 230 */                           if (runnableC1298c2 != null) {
/* 242 */                               runnableC1298c2.f10446c = new ViewTreeObserverOnDrawListenerC1371w(c1318f1.f10522a, c1318f1.f10523b, c1372x, c1318f1);
                                    }
/* 250 */                           WeakReference weakReference = (WeakReference) CollectionsKt.m6205z(c1318f1.f10528i);
/* 259 */                           View view = weakReference != null ? (View) weakReference.get() : null;
/* 261 */                           if (view != null && (runnableC1298c0 = c1318f1.f10519X) != null && (viewTreeObserverOnDrawListenerC1371w = runnableC1298c0.f10446c) != null) {
/* 271 */                               viewTreeObserverOnDrawListenerC1371w.m5053a(view);
                                    }
/* 274 */                           C1666s6 c1666s6 = c1318f1.f10525d;
/* 276 */                           RunnableC1298c0 runnableC1298c3 = c1318f1.f10519X;
/* 280 */                           Handler handler = (Handler) c1666s6.f11662b;
/* 282 */                           if (runnableC1298c3 != null) {
/* 285 */                               handler.removeCallbacks(runnableC1298c3);
                                    }
/* 288 */                           C1666s6 c1666s7 = c1318f1.f10525d;
/* 290 */                           RunnableC1298c0 runnableC1298c4 = c1318f1.f10519X;
/* 307 */                           if (!(runnableC1298c4 == null ? false : ((Handler) c1666s7.f11662b).postDelayed(runnableC1298c4, 100L))) {
/* 321 */                               c1318f1.f10522a.getLogger().mo4672k(EnumC1553m5.WARNING, "Failed to post the capture runnable, main looper is shutting down.", new Object[0]);
                                    }
                                }
/* 330 */                       if (this.f10420c0.f10572a != EnumC1334s.PAUSED || (c1318f0 = this.f10423f) == null) {
/* 348 */                           return;
                                }
/* 336 */                       c1318f0.m5005h();
                            }
                        }
                    }
                }

                @Override // io.sentry.InterfaceC1725v3
                public final void stop() throws Exception {
/* 1 */             C1333r c1333r = this.f10420c0;
/* 3 */             C1702a c1702a = this.f10418b0;
/* 5 */             c1702a.m5443c();
                    try {
/* 15 */                if (this.f10411W.get()) {
/* 17 */                    EnumC1334s enumC1334s = EnumC1334s.STOPPED;
/* 23 */                    if (c1333r.m5018a(enumC1334s)) {
/* 28 */                        if (this.f10423f != null) {
/* 38 */                            C1185e0 c1185e0 = ((C1346u) this.f10426w.getValue()).f10642c;
/* 40 */                            C1318f0 c1318f0 = this.f10423f;
/* 42 */                            c1318f0.getClass();
/* 45 */                            c1185e0.remove(c1318f0);
                                }
/* 60 */                        ((C1346u) this.f10426w.getValue()).f10642c.remove(this.f10424i);
/* 63 */                        C1318f0 c1318f1 = this.f10423f;
/* 65 */                        if (c1318f1 != null) {
/* 67 */                            c1318f1.m5006i();
                                }
/* 73 */                        C1318f0 c1318f2 = this.f10423f;
/* 75 */                        if (c1318f2 != null) {
/* 77 */                            c1318f2.m5008l();
                                }
/* 80 */                        C1322b c1322b = this.f10424i;
/* 82 */                        if (c1322b != null) {
/* 84 */                            c1322b.m5011b();
                                }
/* 87 */                        AbstractC1301c abstractC1301c = this.f10413Y;
/* 89 */                        if (abstractC1301c != null) {
/* 91 */                            abstractC1301c.mo4997n();
                                }
/* 94 */                        this.f10413Y = null;
/* 96 */                        c1333r.f10572a = enumC1334s;
/* 98 */                        xe2.m9770h(c1702a, null);
/* 101 */                       return;
                            }
                        }
/* 102 */               xe2.m9770h(c1702a, null);
                    } catch (Throwable th) {
                        try {
/* 106 */                   throw th;
                        } catch (Throwable th2) {
/* 108 */                   xe2.m9770h(c1702a, th);
/* 111 */                   throw th2;
                        }
                    }
                }

                /* JADX INFO: renamed from: t */
                public final void m4981t() throws Exception {
/* 1 */             C1333r c1333r = this.f10420c0;
/* 3 */             C1702a c1702a = this.f10418b0;
/* 5 */             c1702a.m5443c();
                    try {
/* 15 */                if (this.f10411W.get()) {
/* 17 */                    EnumC1334s enumC1334s = EnumC1334s.PAUSED;
/* 23 */                    if (c1333r.m5018a(enumC1334s)) {
/* 26 */                        C1318f0 c1318f0 = this.f10423f;
/* 28 */                        if (c1318f0 != null) {
/* 30 */                            c1318f0.m5005h();
                                }
/* 36 */                        AbstractC1301c abstractC1301c = this.f10413Y;
/* 38 */                        if (abstractC1301c != null) {
/* 40 */                            abstractC1301c.mo4993j();
                                }
/* 43 */                        c1333r.f10572a = enumC1334s;
/* 45 */                        xe2.m9770h(c1702a, null);
/* 48 */                        return;
                            }
                        }
/* 49 */                xe2.m9770h(c1702a, null);
                    } catch (Throwable th) {
                        try {
/* 53 */                    throw th;
                        } catch (Throwable th2) {
/* 55 */                    xe2.m9770h(c1702a, th);
/* 58 */                    throw th2;
                        }
                    }
                }

                /* JADX INFO: renamed from: v */
                public final void m4982v() throws Exception {
                    C1469h4 c1469h4;
                    C1469h4 c1469h5;
                    C1690p c1690pMo5084d;
                    C1690p c1690pMo5084d2;
/* 1 */             C1702a c1702a = this.f10418b0;
/* 3 */             c1702a.m5443c();
                    try {
/* 13 */                if (this.f10411W.get()) {
/* 15 */                    C1333r c1333r = this.f10420c0;
/* 17 */                    EnumC1334s enumC1334s = EnumC1334s.RESUMED;
/* 23 */                    if (c1333r.m5018a(enumC1334s)) {
/* 32 */                        if (!this.f10412X.get() && this.f10419c != EnumC1570o0.DISCONNECTED && (((c1469h4 = this.f10422e) == null || (c1690pMo5084d2 = c1469h4.mo5084d()) == null || !c1690pMo5084d2.m5428f(EnumC1560n.All)) && ((c1469h5 = this.f10422e) == null || (c1690pMo5084d = c1469h5.mo5084d()) == null || !c1690pMo5084d.m5428f(EnumC1560n.Replay)))) {
/* 81 */                            C1333r c1333r2 = this.f10420c0;
/* 83 */                            c1333r2.getClass();
/* 86 */                            c1333r2.f10572a = enumC1334s;
/* 88 */                            AbstractC1301c abstractC1301c = this.f10413Y;
/* 90 */                            if (abstractC1301c != null) {
/* 97 */                                abstractC1301c.m4995l(new Date());
                                    }
/* 100 */                           C1318f0 c1318f0 = this.f10423f;
/* 102 */                           if (c1318f0 != null) {
/* 104 */                               c1318f0.m5007k();
                                    }
/* 107 */                           xe2.m9770h(c1702a, null);
/* 110 */                           return;
                                }
/* 111 */                       xe2.m9770h(c1702a, null);
/* 114 */                       return;
                            }
                        }
/* 115 */               xe2.m9770h(c1702a, null);
                    } catch (Throwable th) {
                        try {
/* 119 */                   throw th;
                        } catch (Throwable th2) {
/* 121 */                   xe2.m9770h(c1702a, th);
/* 124 */                   throw th2;
                        }
                    }
                }
            }
