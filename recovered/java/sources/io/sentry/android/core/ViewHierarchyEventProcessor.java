            package io.sentry.android.core;

            import android.app.Activity;
            import android.view.View;
            import android.view.ViewGroup;
            import android.view.Window;
            import io.sentry.C1154a;
            import io.sentry.C1393c5;
            import io.sentry.C1486i0;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1388c0;
            import io.sentry.android.core.internal.util.C1220g;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.protocol.C1600f0;
            import io.sentry.protocol.C1610k0;
            import io.sentry.protocol.C1612l0;
            import io.sentry.util.AbstractC1704c;
            import io.sentry.util.thread.InterfaceC1718a;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicReference;
            import p000.fm0;
            import p000.uk0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ViewHierarchyEventProcessor implements InterfaceC1388c0 {

                /* JADX INFO: renamed from: a */
                public final SentryAndroidOptions f9915a;

                /* JADX INFO: renamed from: b */
                public final C1220g f9916b = new C1220g(3, 2000);

                public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
/* 4 */             this.f9915a = sentryAndroidOptions;
/* 20 */            if (sentryAndroidOptions.isAttachViewHierarchy()) {
/* 24 */                AbstractC1704c.m5446a("ViewHierarchy");
                    }
                }

                /* JADX INFO: renamed from: a */
                public static void m4767a(View view, C1612l0 c1612l0, List list) {
/* 3 */             if (view instanceof ViewGroup) {
/* 6 */                 Iterator it = list.iterator();
/* 14 */                if (it.hasNext()) {
/* 59 */                    throw fm0.m3780f(it);
                        }
/* 16 */                ViewGroup viewGroup = (ViewGroup) view;
/* 18 */                int childCount = viewGroup.getChildCount();
/* 22 */                if (childCount == 0) {
/* 24 */                    return;
                        }
/* 27 */                ArrayList arrayList = new ArrayList(childCount);
/* 31 */                for (int i = 0; i < childCount; i++) {
/* 33 */                    View childAt = viewGroup.getChildAt(i);
/* 37 */                    if (childAt != null) {
/* 39 */                        C1612l0 c1612l0M4768b = m4768b(childAt);
/* 43 */                        arrayList.add(c1612l0M4768b);
/* 46 */                        m4767a(childAt, c1612l0M4768b, list);
                            }
                        }
/* 52 */                c1612l0.f11384V = arrayList;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static C1612l0 m4768b(View view) {
/* 3 */             C1612l0 c1612l0 = new C1612l0();
/* 10 */            c1612l0.f11387b = AbstractC1417a.m5173k(view);
                    try {
/* 12 */                String strM5177o = AbstractC1417a.m5177o(view);
/* 16 */                if (strM5177o != null) {
/* 18 */                    c1612l0.f11388c = strM5177o;
                        }
                    } catch (Throwable unused) {
                    }
/* 29 */            c1612l0.f11392i = Double.valueOf(view.getX());
/* 40 */            c1612l0.f11393v = Double.valueOf(view.getY());
/* 51 */            c1612l0.f11390e = Double.valueOf(view.getWidth());
/* 62 */            c1612l0.f11391f = Double.valueOf(view.getHeight());
/* 73 */            c1612l0.f11383U = Double.valueOf(view.getAlpha());
/* 75 */            int visibility = view.getVisibility();
/* 79 */            if (visibility == 0) {
/* 101 */               c1612l0.f11394w = "visible";
                    } else if (visibility == 4) {
/* 96 */                c1612l0.f11394w = "invisible";
                    } else if (visibility == 8) {
/* 91 */                c1612l0.f11394w = "gone";
                    }
/* 103 */           return c1612l0;
                }

                @Override // io.sentry.InterfaceC1388c0
                /* JADX INFO: renamed from: f */
                public final C1393c5 mo4754f(C1393c5 c1393c5, C1486i0 c1486i0) {
/* 5 */             if (c1393c5.m5110g()) {
/* 9 */                 SentryAndroidOptions sentryAndroidOptions = this.f9915a;
/* 16 */                if (!sentryAndroidOptions.isAttachViewHierarchy()) {
/* 28 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
/* 31 */                    return c1393c5;
                        }
/* 36 */                if (!AbstractC1704c.m5455j(c1486i0)) {
/* 42 */                    boolean zM4844a = this.f9916b.m4844a();
/* 46 */                    sentryAndroidOptions.getBeforeViewHierarchyCaptureCallback();
/* 49 */                    if (!zM4844a) {
/* 57 */                        WeakReference weakReference = (WeakReference) C1248o0.f10225b.f10226a;
/* 59 */                        C1610k0 c1610k0 = null;
/* 69 */                        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
/* 70 */                        List<Object> viewHierarchyExporters = sentryAndroidOptions.getViewHierarchyExporters();
/* 74 */                        InterfaceC1718a threadChecker = sentryAndroidOptions.getThreadChecker();
/* 78 */                        ILogger logger = sentryAndroidOptions.getLogger();
/* 82 */                        if (activity == null) {
/* 90 */                            logger.mo4672k(EnumC1553m5.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
                                } else {
/* 95 */                            Window window = activity.getWindow();
/* 99 */                            if (window == null) {
/* 107 */                               logger.mo4672k(EnumC1553m5.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
                                    } else {
/* 111 */                               View viewPeekDecorView = window.peekDecorView();
/* 115 */                               if (viewPeekDecorView == null) {
/* 123 */                                   logger.mo4672k(EnumC1553m5.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
                                        } else {
                                            try {
/* 132 */                                       if (threadChecker.mo4842c()) {
/* 136 */                                           ArrayList arrayList = new ArrayList(1);
/* 143 */                                           C1610k0 c1610k1 = new C1610k0("android_view_system", arrayList);
/* 146 */                                           C1612l0 c1612l0M4768b = m4768b(viewPeekDecorView);
/* 150 */                                           arrayList.add(c1612l0M4768b);
/* 153 */                                           m4767a(viewPeekDecorView, c1612l0M4768b, viewHierarchyExporters);
/* 156 */                                           c1610k0 = c1610k1;
                                                } else {
/* 160 */                                           CountDownLatch countDownLatch = new CountDownLatch(1);
/* 165 */                                           AtomicReference atomicReference = new AtomicReference(null);
/* 174 */                                           activity.runOnUiThread(new uk0(atomicReference, viewPeekDecorView, viewHierarchyExporters, countDownLatch, logger, 2));
/* 185 */                                           if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
/* 191 */                                               c1610k0 = (C1610k0) atomicReference.get();
                                                    }
                                                }
                                            } catch (Throwable th) {
/* 201 */                                       logger.mo4671d(EnumC1553m5.ERROR, "Failed to process view hierarchy.", th);
                                            }
                                        }
                                    }
                                }
/* 204 */                       if (c1610k0 != null) {
/* 211 */                           c1486i0.f11005e = new C1154a(c1610k0);
                                }
                            }
                        }
                    }
/* 213 */           return c1393c5;
                }

                @Override // io.sentry.InterfaceC1388c0
                /* JADX INFO: renamed from: g */
                public final C1600f0 mo4755g(C1600f0 c1600f0, C1486i0 c1486i0) {
/* 1 */             return c1600f0;
                }
            }
