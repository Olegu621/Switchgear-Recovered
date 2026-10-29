            package io.sentry.android.replay;

            import android.graphics.Point;
            import android.os.Handler;
            import android.os.HandlerThread;
            import android.view.View;
            import io.sentry.C1666s6;
            import io.sentry.EnumC1553m5;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.android.replay.util.ScheduledExecutorServiceC1353g;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.util.C1702a;
            import java.io.Closeable;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.WeakHashMap;
            import java.util.concurrent.ScheduledExecutorService;
            import java.util.concurrent.atomic.AtomicBoolean;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import p000.C2270uw;
            import p000.xe2;
            
            /* JADX INFO: renamed from: io.sentry.android.replay.f0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1318f0 implements InterfaceC1317f, Closeable {

                /* JADX INFO: renamed from: U */
                public final C1702a f10516U;

                /* JADX INFO: renamed from: V */
                public final C1702a f10517V;

                /* JADX INFO: renamed from: W */
                public final C1702a f10518W;

                /* JADX INFO: renamed from: X */
                public volatile RunnableC1298c0 f10519X;

                /* JADX INFO: renamed from: Y */
                public volatile HandlerThread f10520Y;

                /* JADX INFO: renamed from: Z */
                public volatile Handler f10521Z;

                /* JADX INFO: renamed from: a */
                public final SentryAndroidOptions f10522a;

                /* JADX INFO: renamed from: b */
                public final ReplayIntegration f10523b;

                /* JADX INFO: renamed from: c */
                public final ReplayIntegration f10524c;

                /* JADX INFO: renamed from: d */
                public final C1666s6 f10525d;

                /* JADX INFO: renamed from: e */
                public final ScheduledExecutorService f10526e;

                /* JADX INFO: renamed from: f */
                public final AtomicBoolean f10527f;

                /* JADX INFO: renamed from: i */
                public final ArrayList f10528i;

                /* JADX INFO: renamed from: v */
                public final Point f10529v;

                /* JADX INFO: renamed from: w */
                public final WeakHashMap f10530w;

                public C1318f0(SentryAndroidOptions sentryAndroidOptions, ReplayIntegration replayIntegration, ReplayIntegration replayIntegration2, C1666s6 c1666s6, ScheduledExecutorServiceC1353g scheduledExecutorServiceC1353g) {
/* 1 */             c1666s6.getClass();
/* 4 */             scheduledExecutorServiceC1353g.getClass();
/* 10 */            this.f10522a = sentryAndroidOptions;
/* 12 */            this.f10523b = replayIntegration;
/* 14 */            this.f10524c = replayIntegration2;
/* 16 */            this.f10525d = c1666s6;
/* 18 */            this.f10526e = scheduledExecutorServiceC1353g;
/* 26 */            this.f10527f = new AtomicBoolean(false);
/* 33 */            this.f10528i = new ArrayList();
/* 40 */            this.f10529v = new Point();
/* 47 */            this.f10530w = new WeakHashMap();
/* 54 */            this.f10516U = new C1702a();
/* 61 */            this.f10517V = new C1702a();
/* 68 */            this.f10518W = new C1702a();
                }

                @Override // io.sentry.android.replay.InterfaceC1317f
                /* JADX INFO: renamed from: c */
                public final void mo5002c(View view, boolean z) throws Exception {
                    ViewTreeObserverOnDrawListenerC1371w viewTreeObserverOnDrawListenerC1371w;
                    ViewTreeObserverOnDrawListenerC1371w viewTreeObserverOnDrawListenerC1371w2;
                    ViewTreeObserverOnDrawListenerC1371w viewTreeObserverOnDrawListenerC1371w3;
/* 1 */             view.getClass();
/* 4 */             C1702a c1702a = this.f10516U;
/* 6 */             c1702a.m5443c();
                    try {
/* 11 */                if (!z) {
/* 92 */                    View.OnLayoutChangeListener onLayoutChangeListener = (View.OnLayoutChangeListener) this.f10530w.remove(view);
/* 94 */                    if (onLayoutChangeListener != null) {
/* 96 */                        view.removeOnLayoutChangeListener(onLayoutChangeListener);
                            }
/* 99 */                    RunnableC1298c0 runnableC1298c0 = this.f10519X;
/* 101 */                   if (runnableC1298c0 != null && (viewTreeObserverOnDrawListenerC1371w2 = runnableC1298c0.f10446c) != null) {
/* 107 */                       viewTreeObserverOnDrawListenerC1371w2.m5055c(view);
                            }
/* 117 */                   C2270uw.m9143n(this.f10528i, new C1316e0(view, 0));
/* 126 */                   WeakReference weakReference = (WeakReference) CollectionsKt.m6205z(this.f10528i);
/* 137 */                   View view2 = weakReference != null ? (View) weakReference.get() : null;
/* 138 */                   if (view2 != null && !view.equals(view2)) {
/* 146 */                       RunnableC1298c0 runnableC1298c1 = this.f10519X;
/* 148 */                       if (runnableC1298c1 != null && (viewTreeObserverOnDrawListenerC1371w = runnableC1298c1.f10446c) != null) {
/* 154 */                           viewTreeObserverOnDrawListenerC1371w.m5053a(view2);
                                }
/* 157 */                       m5003f(view2);
/* 160 */                       WeakHashMap weakHashMap = this.f10530w;
/* 166 */                       if (!weakHashMap.containsKey(view2)) {
/* 171 */                           View.OnLayoutChangeListener onLayoutChangeListener2 = new View.OnLayoutChangeListener() { // from class: io.sentry.android.replay.b0
                                        @Override // android.view.View.OnLayoutChangeListener
                                        public final void onLayoutChange(View view3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Exception {
/* 2 */                                     int i9 = i4 - i2;
/* 4 */                                     int i10 = i8 - i6;
/* 5 */                                     if (i3 - i == i7 - i5 && i9 == i10) {
/* 36 */                                        return;
                                            }
/* 10 */                                    C1318f0 c1318f0 = this.f10439a;
/* 18 */                                    WeakReference weakReference2 = (WeakReference) CollectionsKt.m6205z(c1318f0.f10528i);
/* 34 */                                    if (Intrinsics.m6216a(view3, weakReference2 != null ? (View) weakReference2.get() : null)) {
/* 37 */                                        view3.getClass();
/* 40 */                                        c1318f0.m5003f(view3);
                                            }
                                        }
                                    };
/* 174 */                           weakHashMap.put(view2, onLayoutChangeListener2);
/* 177 */                           view2.addOnLayoutChangeListener(onLayoutChangeListener2);
                                }
                            }
                        } else {
/* 17 */                    if (AbstractC1417a.m5176n(view) == null) {
/* 31 */                        this.f10522a.getLogger().mo4672k(EnumC1553m5.WARNING, "Root view does not have a phone window, skipping.", new Object[0]);
/* 34 */                        xe2.m9770h(c1702a, null);
/* 37 */                        return;
                            }
/* 48 */                    this.f10528i.add(new WeakReference(view));
/* 51 */                    RunnableC1298c0 runnableC1298c2 = this.f10519X;
/* 53 */                    if (runnableC1298c2 != null && (viewTreeObserverOnDrawListenerC1371w3 = runnableC1298c2.f10446c) != null) {
/* 59 */                        viewTreeObserverOnDrawListenerC1371w3.m5053a(view);
                            }
/* 62 */                    m5003f(view);
/* 65 */                    WeakHashMap weakHashMap2 = this.f10530w;
/* 71 */                    if (!weakHashMap2.containsKey(view)) {
/* 76 */                        View.OnLayoutChangeListener onLayoutChangeListener3 = new View.OnLayoutChangeListener() { // from class: io.sentry.android.replay.b0
                                    @Override // android.view.View.OnLayoutChangeListener
                                    public final void onLayoutChange(View view3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) throws Exception {
/* 2 */                                 int i9 = i4 - i2;
/* 4 */                                 int i10 = i8 - i6;
/* 5 */                                 if (i3 - i == i7 - i5 && i9 == i10) {
/* 36 */                                    return;
                                        }
/* 10 */                                C1318f0 c1318f0 = this.f10439a;
/* 18 */                                WeakReference weakReference2 = (WeakReference) CollectionsKt.m6205z(c1318f0.f10528i);
/* 34 */                                if (Intrinsics.m6216a(view3, weakReference2 != null ? (View) weakReference2.get() : null)) {
/* 37 */                                    view3.getClass();
/* 40 */                                    c1318f0.m5003f(view3);
                                        }
                                    }
                                };
/* 79 */                        weakHashMap2.put(view, onLayoutChangeListener3);
/* 82 */                        view.addOnLayoutChangeListener(onLayoutChangeListener3);
                            }
                        }
/* 180 */               xe2.m9770h(c1702a, null);
                    } catch (Throwable th) {
                        try {
/* 184 */                   throw th;
                        } catch (Throwable th2) {
/* 186 */                   xe2.m9770h(c1702a, th);
/* 189 */                   throw th2;
                        }
                    }
                }

                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws Exception {
/* 1 */             m5006i();
/* 4 */             C1666s6 c1666s6 = this.f10525d;
/* 6 */             RunnableC1298c0 runnableC1298c0 = this.f10519X;
/* 10 */            Handler handler = (Handler) c1666s6.f11662b;
/* 12 */            if (runnableC1298c0 != null) {
/* 15 */                handler.removeCallbacks(runnableC1298c0);
                    }
/* 18 */            C1702a c1702a = this.f10518W;
/* 20 */            c1702a.m5443c();
                    try {
/* 23 */                Handler handler2 = this.f10521Z;
/* 26 */                if (handler2 != null) {
/* 28 */                    handler2.removeCallbacksAndMessages(null);
                        }
/* 34 */                HandlerThread handlerThread = this.f10520Y;
/* 36 */                if (handlerThread != null) {
/* 38 */                    handlerThread.quitSafely();
                        }
/* 41 */                xe2.m9770h(c1702a, null);
/* 44 */                m5008l();
                    } catch (Throwable th) {
                        try {
/* 48 */                    throw th;
                        } catch (Throwable th2) {
/* 50 */                    xe2.m9770h(c1702a, th);
/* 53 */                    throw th2;
                        }
                    }
                }

                /* JADX INFO: renamed from: f */
                public final void m5003f(View view) throws Exception {
/* 1 */             view.getClass();
/* 8 */             if (view.getWidth() <= 0 || view.getHeight() <= 0) {
/* 61 */                ViewTreeObserverOnPreDrawListenerC1314d0 viewTreeObserverOnPreDrawListenerC1314d0 = new ViewTreeObserverOnPreDrawListenerC1314d0(this, view);
/* 68 */                if (view.getViewTreeObserver() == null || !view.getViewTreeObserver().isAlive()) {
/* 88 */                    return;
                        }
                        try {
/* 85 */                    view.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1314d0);
/* 88 */                    return;
                        } catch (IllegalStateException unused) {
/* 88 */                    return;
                        }
                    }
/* 16 */            int width = view.getWidth();
/* 20 */            Point point = this.f10529v;
/* 24 */            if (width == point.x && view.getHeight() == point.y) {
/* 88 */                return;
                    }
/* 42 */            point.set(view.getWidth(), view.getHeight());
/* 55 */            this.f10524c.m4980s(view.getWidth(), view.getHeight());
                }

                /* JADX INFO: renamed from: g */
                public final Handler m5004g() throws Exception {
/* 3 */             if (this.f10521Z == null) {
/* 5 */                 C1702a c1702a = this.f10518W;
/* 7 */                 c1702a.m5443c();
                        try {
/* 12 */                    if (this.f10521Z == null) {
/* 21 */                        this.f10520Y = new HandlerThread("SentryReplayBackgroundProcessing");
/* 23 */                        HandlerThread handlerThread = this.f10520Y;
/* 25 */                        if (handlerThread != null) {
/* 27 */                            handlerThread.start();
                                }
/* 35 */                        HandlerThread handlerThread2 = this.f10520Y;
/* 37 */                        handlerThread2.getClass();
/* 47 */                        this.f10521Z = new Handler(handlerThread2.getLooper());
                            }
/* 50 */                    xe2.m9770h(c1702a, null);
                        } catch (Throwable th) {
                            try {
/* 54 */                        throw th;
                            } catch (Throwable th2) {
/* 56 */                        xe2.m9770h(c1702a, th);
/* 59 */                        throw th2;
                            }
                        }
                    }
/* 60 */            Handler handler = this.f10521Z;
/* 62 */            handler.getClass();
/* 65 */            return handler;
                }

                /* JADX INFO: renamed from: h */
                public final void m5005h() {
/* 1 */             RunnableC1298c0 runnableC1298c0 = this.f10519X;
/* 3 */             if (runnableC1298c0 != null) {
/* 5 */                 ViewTreeObserverOnDrawListenerC1371w viewTreeObserverOnDrawListenerC1371w = runnableC1298c0.f10446c;
/* 8 */                 if (viewTreeObserverOnDrawListenerC1371w != null) {
/* 12 */                    viewTreeObserverOnDrawListenerC1371w.f10700c.set(false);
/* 15 */                    WeakReference weakReference = viewTreeObserverOnDrawListenerC1371w.f10699b;
/* 27 */                    viewTreeObserverOnDrawListenerC1371w.m5055c(weakReference != null ? (View) weakReference.get() : null);
                        }
/* 32 */                runnableC1298c0.f10448e.getAndSet(false);
                    }
                }

                /* JADX INFO: renamed from: i */
                public final void m5006i() throws Exception {
                    ViewTreeObserverOnDrawListenerC1371w viewTreeObserverOnDrawListenerC1371w;
/* 4 */             this.f10529v.set(0, 0);
/* 7 */             C1702a c1702a = this.f10516U;
/* 9 */             c1702a.m5443c();
                    try {
/* 14 */                Iterator it = this.f10528i.iterator();
/* 22 */                while (it.hasNext()) {
/* 34 */                    View view = (View) ((WeakReference) it.next()).get();
/* 36 */                    if (view != null) {
/* 44 */                        View.OnLayoutChangeListener onLayoutChangeListener = (View.OnLayoutChangeListener) this.f10530w.remove(view);
/* 46 */                        if (onLayoutChangeListener != null) {
/* 48 */                            view.removeOnLayoutChangeListener(onLayoutChangeListener);
                                }
/* 51 */                        RunnableC1298c0 runnableC1298c0 = this.f10519X;
/* 53 */                        if (runnableC1298c0 != null && (viewTreeObserverOnDrawListenerC1371w = runnableC1298c0.f10446c) != null) {
/* 59 */                            viewTreeObserverOnDrawListenerC1371w.m5055c(view);
                                }
                            }
                        }
/* 67 */                this.f10528i.clear();
/* 71 */                xe2.m9770h(c1702a, null);
                    } catch (Throwable th) {
                        try {
/* 75 */                    throw th;
                        } catch (Throwable th2) {
/* 77 */                    xe2.m9770h(c1702a, th);
/* 80 */                    throw th2;
                        }
                    }
                }

                /* JADX INFO: renamed from: k */
                public final void m5007k() {
                    View view;
/* 1 */             RunnableC1298c0 runnableC1298c0 = this.f10519X;
/* 3 */             if (runnableC1298c0 != null) {
/* 5 */                 C1666s6 c1666s6 = runnableC1298c0.f10445b;
/* 7 */                 SentryAndroidOptions sentryAndroidOptions = runnableC1298c0.f10444a;
/* 16 */                if (sentryAndroidOptions.getSessionReplay().f11536m) {
/* 28 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Resuming the capture runnable.", new Object[0]);
                        }
/* 31 */                ViewTreeObserverOnDrawListenerC1371w viewTreeObserverOnDrawListenerC1371w = runnableC1298c0.f10446c;
/* 34 */                if (viewTreeObserverOnDrawListenerC1371w != null) {
/* 36 */                    WeakReference weakReference = viewTreeObserverOnDrawListenerC1371w.f10699b;
/* 38 */                    if (weakReference != null && (view = (View) weakReference.get()) != null && view.getViewTreeObserver() != null && view.getViewTreeObserver().isAlive()) {
                                try {
/* 69 */                            view.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC1371w);
                                } catch (IllegalStateException unused) {
                                }
                            }
/* 74 */                    viewTreeObserverOnDrawListenerC1371w.f10700c.set(true);
                        }
/* 79 */                runnableC1298c0.f10448e.getAndSet(true);
/* 86 */                ((Handler) c1666s6.f11662b).removeCallbacks(runnableC1298c0);
/* 97 */                if (((Handler) c1666s6.f11662b).post(runnableC1298c0)) {
/* 112 */                   return;
                        }
/* 109 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.WARNING, "Failed to post the capture runnable, main looper is not ready.", new Object[0]);
                    }
                }

                /* JADX INFO: renamed from: l */
                public final void m5008l() throws Exception {
/* 1 */             RunnableC1298c0 runnableC1298c0 = this.f10519X;
/* 5 */             if (runnableC1298c0 != null) {
/* 7 */                 ViewTreeObserverOnDrawListenerC1371w viewTreeObserverOnDrawListenerC1371w = runnableC1298c0.f10446c;
/* 9 */                 if (viewTreeObserverOnDrawListenerC1371w != null) {
/* 13 */                    viewTreeObserverOnDrawListenerC1371w.f10700c.set(false);
/* 16 */                    WeakReference weakReference = viewTreeObserverOnDrawListenerC1371w.f10699b;
/* 28 */                    viewTreeObserverOnDrawListenerC1371w.m5055c(weakReference != null ? (View) weakReference.get() : null);
/* 31 */                    WeakReference weakReference2 = viewTreeObserverOnDrawListenerC1371w.f10699b;
/* 33 */                    if (weakReference2 != null) {
/* 35 */                        weakReference2.clear();
                            }
/* 40 */                    viewTreeObserverOnDrawListenerC1371w.f10702e.close();
                        }
/* 43 */                runnableC1298c0.f10446c = null;
/* 47 */                runnableC1298c0.f10448e.getAndSet(false);
                    }
/* 50 */            C1702a c1702a = this.f10517V;
/* 52 */            c1702a.m5443c();
                    try {
/* 55 */                this.f10519X = null;
/* 57 */                xe2.m9770h(c1702a, null);
/* 62 */                this.f10527f.set(false);
                    } catch (Throwable th) {
                        try {
/* 67 */                    throw th;
                        } catch (Throwable th2) {
/* 69 */                    xe2.m9770h(c1702a, th);
/* 72 */                    throw th2;
                        }
                    }
                }
            }
