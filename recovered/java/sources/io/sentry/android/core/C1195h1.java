            package io.sentry.android.core;

            import io.sentry.C1461g5;
            import io.sentry.C1554m6;
            import io.sentry.C1666s6;
            import io.sentry.C1671t3;
            import io.sentry.C1764z6;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1156a1;
            import io.sentry.InterfaceC1427d4;
            import io.sentry.InterfaceC1549m1;
            import io.sentry.InterfaceC1753y3;
            import io.sentry.RunnableC1526k2;
            import io.sentry.android.core.internal.gestures.GestureDetectorOnGestureListenerC1205g;
            import io.sentry.android.replay.capture.AbstractC1301c;
            import io.sentry.android.replay.capture.C1299a;
            import io.sentry.android.replay.capture.C1300b;
            import io.sentry.android.replay.capture.C1305g;
            import io.sentry.android.replay.capture.C1312n;
            import io.sentry.android.replay.util.RunnableC1354h;
            import io.sentry.cache.AbstractC1396a;
            import io.sentry.cache.C1398c;
            import io.sentry.cache.C1401f;
            import io.sentry.cache.tape.C1403b;
            import io.sentry.cache.tape.C1405d;
            import io.sentry.cache.tape.C1410i;
            import io.sentry.util.C1709h;
            import io.sentry.util.InterfaceC1707f;
            import java.io.File;
            import java.io.IOException;
            import java.io.RandomAccessFile;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.StringsKt;
            import p000.C2076pn;
            import p000.u21;
            
            /* JADX INFO: renamed from: io.sentry.android.core.h1 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 9 */     public final /* synthetic */ class C1195h1 implements InterfaceC1427d4, InterfaceC1707f, InterfaceC1753y3 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10050a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f10051b;

                public /* synthetic */ C1195h1(C1709h c1709h, ILogger iLogger) {
/* 3 */             this.f10050a = 8;
/* 8 */             this.f10051b = iLogger;
                }

                @Override // io.sentry.InterfaceC1753y3
                /* JADX INFO: renamed from: a */
                public void mo4802a(C1671t3 c1671t3) {
/* 10 */            ((InterfaceC1156a1) this.f10051b).mo4691O(new C1671t3());
                }

                @Override // io.sentry.util.InterfaceC1707f
                /* JADX INFO: renamed from: b */
                public Object mo4803b() {
                    C1410i c1410i;
/* 1 */             int i = this.f10050a;
/* 3 */             Object obj = this.f10051b;
                    switch (i) {
                        case 1:
/* 139 */                   C1461g5 c1461g5 = (C1461g5) obj;
/* 141 */                   int i2 = SentryPerformanceProvider.f9888f;
/* 143 */                   return c1461g5;
                        case 6:
/* 134 */                   return ((C1398c) obj).f10799a.getSerializer();
                        case 7:
/* 21 */                    C1401f c1401f = (C1401f) obj;
/* 23 */                    SentryAndroidOptions sentryAndroidOptions = c1401f.f10809a;
/* 27 */                    File fileM5114b = AbstractC1396a.m5114b(sentryAndroidOptions, ".scope-cache");
/* 31 */                    if (fileM5114b == null) {
/* 44 */                        sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
/* 49 */                        return new C1403b();
                            }
/* 57 */                    File file = new File(fileM5114b, "breadcrumbs.json");
                            try {
/* 60 */                        int maxBreadcrumbs = sentryAndroidOptions.getMaxBreadcrumbs();
/* 64 */                        RandomAccessFile randomAccessFileM5135c = C1410i.m5135c(file);
                                try {
                                    try {
/* 70 */                                c1410i = new C1410i(file, randomAccessFileM5135c, maxBreadcrumbs);
                                    } catch (Throwable th) {
/* 75 */                                randomAccessFileM5135c.close();
/* 78 */                                throw th;
                                    }
                                } catch (IOException e) {
/* 121 */                           sentryAndroidOptions.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to create breadcrumbs queue", e);
/* 126 */                           return new C1403b();
                                }
                                break;
                            } catch (IOException unused) {
/* 79 */                        file.delete();
/* 82 */                        int maxBreadcrumbs2 = sentryAndroidOptions.getMaxBreadcrumbs();
/* 86 */                        RandomAccessFile randomAccessFileM5135c2 = C1410i.m5135c(file);
                                try {
/* 92 */                            c1410i = new C1410i(file, randomAccessFileM5135c2, maxBreadcrumbs2);
                                } catch (Throwable th2) {
/* 108 */                           randomAccessFileM5135c2.close();
/* 111 */                           throw th2;
                                }
                                break;
                            }
/* 103 */                   return new C1405d(c1410i, new C1666s6(c1401f, 6));
                        default:
/* 16 */                    return Boolean.valueOf(C1709h.m5474d("androidx.core.app.FrameMetricsAggregator", (ILogger) obj));
                    }
                }

                @Override // io.sentry.InterfaceC1427d4
                /* JADX INFO: renamed from: e */
                public void mo4804e(InterfaceC1156a1 interfaceC1156a1) {
/* 1 */             int i = this.f10050a;
/* 5 */             Object obj = this.f10051b;
                    switch (i) {
                        case 0:
/* 167 */                   AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
/* 169 */                   C1764z6 c1764z6Mo4705r = interfaceC1156a1.mo4705r();
/* 173 */                   if (c1764z6Mo4705r != null && c1764z6Mo4705r.f11860a != null) {
/* 179 */                       atomicBoolean.set(true);
                                break;
                            }
                            break;
                        case 1:
                        default:
/* 10 */                    C1312n c1312n = (C1312n) obj;
/* 12 */                    interfaceC1156a1.getClass();
/* 19 */                    interfaceC1156a1.mo4698k(c1312n.m4987d());
/* 22 */                    String strMo4682F = interfaceC1156a1.mo4682F();
/* 26 */                    int i2 = 6;
/* 27 */                    if (strMo4682F != null) {
/* 31 */                        int iM6230F = StringsKt.m6230F(strMo4682F, '.', 0, 6);
/* 36 */                        if (iM6230F != -1) {
/* 44 */                            strMo4682F = strMo4682F.substring(iM6230F + 1, strMo4682F.length());
                                }
                            } else {
/* 49 */                        strMo4682F = null;
                            }
/* 50 */                    C1300b c1300b = c1312n.f10469l;
/* 55 */                    u21 u21Var = AbstractC1301c.f10457s[2];
/* 57 */                    c1300b.getClass();
/* 60 */                    u21Var.getClass();
/* 65 */                    Object andSet = c1300b.f10454b.getAndSet(strMo4682F);
/* 73 */                    if (!Intrinsics.m6216a(andSet, strMo4682F)) {
/* 80 */                        C1299a c1299a = new C1299a(andSet, strMo4682F, c1300b.f10456d, 3);
/* 83 */                        AbstractC1301c abstractC1301c = c1300b.f10455c;
/* 85 */                        C1554m6 c1554m6 = abstractC1301c.f10458a;
/* 95 */                        if (c1554m6.getThreadChecker().mo4842c()) {
/* 111 */                           abstractC1301c.f10462e.submit(new RunnableC1354h(new RunnableC1526k2(c1299a, i2), "CaptureStrategy.runInBackground"));
                                } else {
                                    try {
/* 115 */                               c1299a.invoke();
                                    } catch (Throwable th) {
/* 128 */                               c1554m6.getLogger().mo4671d(EnumC1553m5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                                    }
                                }
                            }
                            break;
                        case 2:
/* 163 */                   interfaceC1156a1.mo4683G(new C2076pn(25, (GestureDetectorOnGestureListenerC1205g) obj, interfaceC1156a1));
                            break;
                        case 3:
/* 151 */                   ((InterfaceC1549m1[]) obj)[0] = interfaceC1156a1.mo4700m();
                            break;
                        case 4:
/* 134 */                   interfaceC1156a1.getClass();
/* 141 */                   interfaceC1156a1.mo4698k(((C1305g) obj).m4987d());
                            break;
                    }
                }

/* 10 */        public /* synthetic */ C1195h1(Object obj, int i) {
/* 11 */            this.f10050a = i;
                    this.f10051b = obj;
                }
            }
