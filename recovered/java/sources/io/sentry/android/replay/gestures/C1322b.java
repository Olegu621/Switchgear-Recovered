            package io.sentry.android.replay.gestures;

            import android.view.View;
            import android.view.Window;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.replay.C1316e0;
            import io.sentry.android.replay.InterfaceC1317f;
            import io.sentry.android.replay.ReplayIntegration;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.util.C1702a;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.WeakHashMap;
            import p000.C2270uw;
            import p000.xe2;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.gestures.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1322b implements InterfaceC1317f {

                /* JADX INFO: renamed from: a */
                public final SentryAndroidOptions f10537a;

                /* JADX INFO: renamed from: b */
                public final ReplayIntegration f10538b;

                /* JADX INFO: renamed from: c */
                public final ArrayList f10539c = new ArrayList();

                /* JADX INFO: renamed from: d */
                public final C1702a f10540d = new C1702a();

                /* JADX INFO: renamed from: e */
                public final WeakHashMap f10541e = new WeakHashMap();

                /* JADX INFO: renamed from: f */
                public final C1702a f10542f = new C1702a();

                public C1322b(SentryAndroidOptions sentryAndroidOptions, ReplayIntegration replayIntegration) {
/* 4 */             this.f10537a = sentryAndroidOptions;
/* 6 */             this.f10538b = replayIntegration;
                }

                /* JADX INFO: renamed from: a */
                public final void m5010a(View view) throws Exception {
/* 1 */             WeakHashMap weakHashMap = this.f10541e;
/* 3 */             Window windowM5176n = AbstractC1417a.m5176n(view);
/* 7 */             SentryAndroidOptions sentryAndroidOptions = this.f10537a;
/* 9 */             if (windowM5176n == null) {
/* 22 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
/* 25 */                return;
                    }
/* 26 */            C1702a c1702a = this.f10542f;
/* 28 */            c1702a.m5443c();
                    try {
/* 35 */                WeakReference weakReference = (WeakReference) weakHashMap.get(windowM5176n);
/* 50 */                if ((weakReference != null ? (WindowCallbackC1321a) weakReference.get() : null) != null) {
/* 52 */                    xe2.m9770h(c1702a, null);
/* 55 */                    return;
                        }
/* 56 */                xe2.m9770h(c1702a, null);
/* 67 */                WindowCallbackC1321a windowCallbackC1321a = new WindowCallbackC1321a(sentryAndroidOptions, this.f10538b, windowM5176n.getCallback());
/* 70 */                windowM5176n.setCallback(windowCallbackC1321a);
/* 73 */                c1702a.m5443c();
                        try {
/* 81 */                    weakHashMap.put(windowM5176n, new WeakReference(windowCallbackC1321a));
/* 84 */                    xe2.m9770h(c1702a, null);
                        } catch (Throwable th) {
                            try {
/* 89 */                        throw th;
                            } catch (Throwable th2) {
/* 91 */                        xe2.m9770h(c1702a, th);
/* 94 */                        throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        try {
/* 95 */                    throw th3;
                        } catch (Throwable th4) {
/* 97 */                    xe2.m9770h(c1702a, th3);
/* 100 */                   throw th4;
                        }
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m5011b() throws Exception {
/* 1 */             ArrayList arrayList = this.f10539c;
/* 3 */             C1702a c1702a = this.f10540d;
/* 5 */             c1702a.m5443c();
                    try {
/* 8 */                 Iterator it = arrayList.iterator();
/* 16 */                while (it.hasNext()) {
/* 28 */                    View view = (View) ((WeakReference) it.next()).get();
/* 30 */                    if (view != null) {
/* 32 */                        m5012d(view);
                            }
                        }
/* 38 */                arrayList.clear();
/* 42 */                xe2.m9770h(c1702a, null);
                    } catch (Throwable th) {
                        try {
/* 46 */                    throw th;
                        } catch (Throwable th2) {
/* 48 */                    xe2.m9770h(c1702a, th);
/* 51 */                    throw th2;
                        }
                    }
                }

                @Override // io.sentry.android.replay.InterfaceC1317f
                /* JADX INFO: renamed from: c */
                public final void mo5002c(View view, boolean z) throws Exception {
/* 1 */             view.getClass();
/* 4 */             C1702a c1702a = this.f10540d;
/* 6 */             c1702a.m5443c();
/* 9 */             ArrayList arrayList = this.f10539c;
                    try {
/* 11 */                if (z) {
/* 18 */                    arrayList.add(new WeakReference(view));
/* 21 */                    m5010a(view);
                        } else {
/* 27 */                    m5012d(view);
/* 36 */                    C2270uw.m9143n(arrayList, new C1316e0(view, 1));
                        }
/* 40 */                xe2.m9770h(c1702a, null);
                    } catch (Throwable th) {
                        try {
/* 44 */                    throw th;
                        } catch (Throwable th2) {
/* 46 */                    xe2.m9770h(c1702a, th);
/* 49 */                    throw th2;
                        }
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m5012d(View view) throws Exception {
/* 1 */             Window windowM5176n = AbstractC1417a.m5176n(view);
/* 5 */             if (windowM5176n == null) {
/* 20 */                this.f10537a.getLogger().mo4672k(EnumC1553m5.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
/* 23 */                return;
                    }
/* 24 */            Window.Callback callback = windowM5176n.getCallback();
/* 31 */            if (callback instanceof WindowCallbackC1321a) {
/* 37 */                windowM5176n.setCallback(((WindowCallbackC1321a) callback).f10534a);
/* 40 */                C1702a c1702a = this.f10542f;
/* 42 */                c1702a.m5443c();
                        try {
/* 53 */                    xe2.m9770h(c1702a, null);
/* 56 */                    return;
                        } catch (Throwable th) {
                            try {
/* 58 */                        throw th;
                            } catch (Throwable th2) {
/* 60 */                        xe2.m9770h(c1702a, th);
/* 63 */                        throw th2;
                            }
                        }
                    }
/* 64 */            C1702a c1702a2 = this.f10542f;
/* 66 */            c1702a2.m5443c();
                    try {
/* 75 */                WeakReference weakReference = (WeakReference) this.f10541e.get(windowM5176n);
/* 88 */                WindowCallbackC1321a windowCallbackC1321a = weakReference != null ? (WindowCallbackC1321a) weakReference.get() : null;
/* 97 */                xe2.m9770h(c1702a2, null);
/* 100 */               if (windowCallbackC1321a != null) {
/* 102 */                   windowCallbackC1321a.f10536c = null;
                        }
                    } catch (Throwable th3) {
                        try {
/* 105 */                   throw th3;
                        } catch (Throwable th4) {
/* 107 */                   xe2.m9770h(c1702a2, th3);
/* 110 */                   throw th4;
                        }
                    }
                }
            }
