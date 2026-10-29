            package io.sentry.android.core.internal.gestures;

            import android.app.Activity;
            import android.view.GestureDetector;
            import android.view.MotionEvent;
            import android.view.View;
            import android.view.Window;
            import io.sentry.C1443f;
            import io.sentry.C1469h4;
            import io.sentry.C1486i0;
            import io.sentry.C1522j7;
            import io.sentry.C1531k7;
            import io.sentry.C1697u2;
            import io.sentry.EnumC1451f7;
            import io.sentry.EnumC1553m5;
            import io.sentry.ILogger;
            import io.sentry.InterfaceC1389c1;
            import io.sentry.InterfaceC1549m1;
            import io.sentry.android.core.C1195h1;
            import io.sentry.android.core.SentryAndroidOptions;
            import io.sentry.config.AbstractC1417a;
            import io.sentry.internal.gestures.C1507b;
            import io.sentry.internal.gestures.EnumC1506a;
            import io.sentry.protocol.EnumC1606i0;
            import io.sentry.util.AbstractC1704c;
            import java.lang.ref.WeakReference;
            import java.util.Collections;
            import java.util.Map;
            import p000.C2076pn;
            import p000.fm0;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.gestures.g */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class GestureDetectorOnGestureListenerC1205g implements GestureDetector.OnGestureListener {

                /* JADX INFO: renamed from: a */
                public final WeakReference f10088a;

                /* JADX INFO: renamed from: b */
                public final InterfaceC1389c1 f10089b;

                /* JADX INFO: renamed from: c */
                public final SentryAndroidOptions f10090c;

                /* JADX INFO: renamed from: d */
                public C1507b f10091d = null;

                /* JADX INFO: renamed from: e */
                public InterfaceC1549m1 f10092e = null;

                /* JADX INFO: renamed from: f */
                public EnumC1203e f10093f;

                /* JADX INFO: renamed from: g */
                public final C1204f f10094g;

                public GestureDetectorOnGestureListenerC1205g(Activity activity, C1469h4 c1469h4, SentryAndroidOptions sentryAndroidOptions) {
/* 9 */             EnumC1203e enumC1203e = EnumC1203e.Unknown;
/* 11 */            this.f10093f = enumC1203e;
/* 15 */            C1204f c1204f = new C1204f();
/* 18 */            c1204f.f10084a = enumC1203e;
/* 21 */            c1204f.f10086c = 0.0f;
/* 23 */            c1204f.f10087d = 0.0f;
/* 25 */            this.f10094g = c1204f;
/* 32 */            this.f10088a = new WeakReference(activity);
/* 34 */            this.f10089b = c1469h4;
/* 36 */            this.f10090c = sentryAndroidOptions;
                }

                /* JADX INFO: renamed from: a */
                public final void m4812a(C1507b c1507b, EnumC1203e enumC1203e, Map map, MotionEvent motionEvent) {
                    String str;
/* 7 */             if (this.f10090c.isEnableUserInteractionBreadcrumbs()) {
/* 16 */                int i = AbstractC1202d.f10083a[enumC1203e.ordinal()];
/* 19 */                if (i == 1) {
/* 36 */                    str = "click";
                        } else if (i != 2) {
/* 30 */                    str = i != 3 ? "unknown" : "swipe";
                        } else {
/* 33 */                    str = "scroll";
                        }
/* 40 */                C1486i0 c1486i0 = new C1486i0();
/* 45 */                c1486i0.m5275d(motionEvent, "android:motionEvent");
/* 56 */                c1486i0.m5275d(c1507b.f11044a.get(), "android:view");
/* 59 */                String str2 = c1507b.f11046c;
/* 61 */                String str3 = c1507b.f11045b;
/* 65 */                C1443f c1443f = new C1443f();
/* 70 */                c1443f.f10930e = "user";
/* 78 */                c1443f.f10932i = "ui.".concat(str);
/* 80 */                if (str2 != null) {
/* 84 */                    c1443f.m5209d(str2, "view.id");
                        }
/* 87 */                if (str3 != null) {
/* 91 */                    c1443f.m5209d(str3, "view.class");
                        }
/* 106 */               for (Map.Entry entry : map.entrySet()) {
/* 124 */                   c1443f.m5209d(entry.getValue(), (String) entry.getKey());
                        }
/* 130 */               c1443f.f10934w = EnumC1553m5.INFO;
/* 134 */               this.f10089b.mo5086f(c1443f, c1486i0);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final View m4813b(String str) {
/* 7 */             Activity activity = (Activity) this.f10088a.get();
/* 13 */            SentryAndroidOptions sentryAndroidOptions = this.f10090c;
/* 15 */            if (activity == null) {
/* 31 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, fm0.m3784j("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
/* 9 */                 return null;
                    }
/* 35 */            Window window = activity.getWindow();
/* 39 */            if (window == null) {
/* 55 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, fm0.m3784j("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
/* 9 */                 return null;
                    }
/* 59 */            View viewPeekDecorView = window.peekDecorView();
/* 63 */            if (viewPeekDecorView != null) {
/* 83 */                return viewPeekDecorView;
                    }
/* 79 */            sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, fm0.m3784j("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
/* 9 */             return null;
                }

                /* JADX INFO: renamed from: c */
                public final void m4814c(C1507b c1507b, EnumC1203e enumC1203e) {
                    String str;
/* 27 */            boolean z = enumC1203e == EnumC1203e.Click || !(enumC1203e == this.f10093f && c1507b.equals(this.f10091d));
/* 28 */            SentryAndroidOptions sentryAndroidOptions = this.f10090c;
/* 30 */            boolean zIsTracingEnabled = sentryAndroidOptions.isTracingEnabled();
/* 34 */            InterfaceC1389c1 interfaceC1389c1 = this.f10089b;
/* 36 */            if (!zIsTracingEnabled || !sentryAndroidOptions.isEnableUserInteractionTracing()) {
/* 302 */               if (z) {
/* 308 */                   if (sentryAndroidOptions.isEnableAutoTraceIdGeneration()) {
/* 317 */                       interfaceC1389c1.mo5098r(new C1697u2(22));
                            }
/* 320 */                   this.f10091d = c1507b;
/* 322 */                   this.f10093f = enumC1203e;
/* 324 */                   return;
                        }
/* 324 */               return;
                    }
/* 52 */            Activity activity = (Activity) this.f10088a.get();
/* 54 */            if (activity == null) {
/* 66 */                sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
/* 69 */                return;
                    }
/* 70 */            String str2 = c1507b.f11046c;
/* 73 */            if (str2 == null) {
/* 78 */                AbstractC1704c.m5462q(null, "UiElement.tag can't be null");
/* 81 */                str2 = null;
                    }
/* 82 */            InterfaceC1549m1 interfaceC1549m1 = this.f10092e;
/* 84 */            if (interfaceC1549m1 != null) {
/* 86 */                if (!z && !interfaceC1549m1.mo4728d()) {
/* 110 */                   sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, fm0.m3784j("The view with id: ", str2, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
/* 117 */                   if (sentryAndroidOptions.getIdleTimeout() != null) {
/* 121 */                       this.f10092e.mo5251q();
/* 124 */                       return;
                            }
/* 324 */                   return;
                        }
/* 127 */               m4815d(EnumC1451f7.OK);
                    }
/* 130 */           InterfaceC1549m1[] interfaceC1549m1Arr = {null};
/* 140 */           interfaceC1389c1.mo5098r(new C1195h1(interfaceC1549m1Arr, 3));
/* 145 */           if (interfaceC1549m1Arr[0] != null) {
/* 159 */               sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Transaction won't be created for view with id: %s since there's already a transaction bound to the Scope.", str2);
/* 162 */               return;
                    }
/* 187 */           String str3 = activity.getClass().getSimpleName() + "." + str2;
/* 197 */           int i = AbstractC1202d.f10083a[enumC1203e.ordinal()];
/* 199 */           if (i == 1) {
/* 215 */               str = "click";
                    } else if (i != 2) {
/* 209 */               str = i != 3 ? "unknown" : "swipe";
                    } else {
/* 212 */               str = "scroll";
                    }
/* 219 */           String strConcat = "ui.action.".concat(str);
/* 225 */           C1531k7 c1531k7 = new C1531k7();
/* 228 */           c1531k7.f11095f = true;
/* 230 */           long deadlineTimeout = sentryAndroidOptions.getDeadlineTimeout();
/* 246 */           c1531k7.f11097h = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
/* 252 */           c1531k7.f11096g = sentryAndroidOptions.getIdleTimeout();
/* 254 */           c1531k7.f10918c = true;
/* 272 */           c1531k7.f10919d = "auto.ui.gesture_listener." + c1507b.f11047d;
/* 281 */           InterfaceC1549m1 interfaceC1549m1Mo5097q = interfaceC1389c1.mo5097q(new C1522j7(str3, EnumC1606i0.COMPONENT, strConcat, null), c1531k7);
/* 292 */           interfaceC1389c1.mo5098r(new C2076pn(24, this, interfaceC1549m1Mo5097q));
/* 295 */           this.f10092e = interfaceC1549m1Mo5097q;
/* 297 */           this.f10091d = c1507b;
/* 299 */           this.f10093f = enumC1203e;
                }

                /* JADX INFO: renamed from: d */
                public final void m4815d(EnumC1451f7 enumC1451f7) {
/* 1 */             InterfaceC1549m1 interfaceC1549m1 = this.f10092e;
/* 3 */             if (interfaceC1549m1 != null) {
/* 5 */                 EnumC1451f7 status = interfaceC1549m1.getStatus();
/* 9 */                 InterfaceC1549m1 interfaceC1549m2 = this.f10092e;
/* 11 */                if (status == null) {
/* 13 */                    interfaceC1549m2.mo4729f(enumC1451f7);
                        } else {
/* 17 */                    interfaceC1549m2.mo4731i();
                        }
                    }
/* 28 */            this.f10089b.mo5098r(new C1195h1(this, 2));
/* 32 */            this.f10092e = null;
/* 36 */            if (this.f10091d != null) {
/* 38 */                this.f10091d = null;
                    }
/* 42 */            this.f10093f = EnumC1203e.Unknown;
                }

                @Override // android.view.GestureDetector.OnGestureListener
                public final boolean onDown(MotionEvent motionEvent) {
/* 2 */             if (motionEvent == null) {
/* 1 */                 return false;
                    }
/* 6 */             C1204f c1204f = this.f10094g;
/* 8 */             c1204f.f10085b = null;
/* 12 */            c1204f.f10084a = EnumC1203e.Unknown;
/* 15 */            c1204f.f10086c = 0.0f;
/* 17 */            c1204f.f10087d = 0.0f;
/* 23 */            c1204f.f10086c = motionEvent.getX();
/* 29 */            c1204f.f10087d = motionEvent.getY();
/* 1 */             return false;
                }

                @Override // android.view.GestureDetector.OnGestureListener
                public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
/* 5 */             this.f10094g.f10084a = EnumC1203e.Swipe;
/* 7 */             return false;
                }

                @Override // android.view.GestureDetector.OnGestureListener
                public final void onLongPress(MotionEvent motionEvent) {
                }

                @Override // android.view.GestureDetector.OnGestureListener
                public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
/* 3 */             View viewM4813b = m4813b("onScroll");
/* 8 */             if (viewM4813b != null && motionEvent != null) {
/* 13 */                C1204f c1204f = this.f10094g;
/* 19 */                if (c1204f.f10084a == EnumC1203e.Unknown) {
/* 21 */                    float x = motionEvent.getX();
/* 25 */                    float y = motionEvent.getY();
/* 29 */                    EnumC1506a enumC1506a = EnumC1506a.SCROLLABLE;
/* 31 */                    SentryAndroidOptions sentryAndroidOptions = this.f10090c;
/* 33 */                    C1507b c1507bM5170h = AbstractC1417a.m5170h(sentryAndroidOptions, viewM4813b, x, y, enumC1506a);
/* 37 */                    if (c1507bM5170h == null) {
/* 49 */                        sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
/* 54 */                        c1204f.f10084a = EnumC1203e.Scroll;
/* 7 */                         return false;
                            }
/* 57 */                    ILogger logger = sentryAndroidOptions.getLogger();
/* 61 */                    EnumC1553m5 enumC1553m5 = EnumC1553m5.DEBUG;
/* 67 */                    StringBuilder sb = new StringBuilder("Scroll target found: ");
/* 70 */                    String str = c1507bM5170h.f11046c;
/* 72 */                    if (str == null) {
/* 78 */                        AbstractC1704c.m5462q(null, "UiElement.tag can't be null");
/* 81 */                        str = null;
                            }
/* 82 */                    sb.append(str);
/* 91 */                    logger.mo4672k(enumC1553m5, sb.toString(), new Object[0]);
/* 94 */                    c1204f.f10085b = c1507bM5170h;
/* 98 */                    c1204f.f10084a = EnumC1203e.Scroll;
                        }
                    }
/* 7 */             return false;
                }

                @Override // android.view.GestureDetector.OnGestureListener
                public final void onShowPress(MotionEvent motionEvent) {
                }

                @Override // android.view.GestureDetector.OnGestureListener
                public final boolean onSingleTapUp(MotionEvent motionEvent) {
/* 3 */             View viewM4813b = m4813b("onSingleTapUp");
/* 8 */             if (viewM4813b != null && motionEvent != null) {
/* 13 */                float x = motionEvent.getX();
/* 17 */                float y = motionEvent.getY();
/* 21 */                EnumC1506a enumC1506a = EnumC1506a.CLICKABLE;
/* 23 */                SentryAndroidOptions sentryAndroidOptions = this.f10090c;
/* 25 */                C1507b c1507bM5170h = AbstractC1417a.m5170h(sentryAndroidOptions, viewM4813b, x, y, enumC1506a);
/* 29 */                if (c1507bM5170h == null) {
/* 41 */                    sentryAndroidOptions.getLogger().mo4672k(EnumC1553m5.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
/* 7 */                     return false;
                        }
/* 45 */                EnumC1203e enumC1203e = EnumC1203e.Click;
/* 49 */                m4812a(c1507bM5170h, enumC1203e, Collections.EMPTY_MAP, motionEvent);
/* 52 */                m4814c(c1507bM5170h, enumC1203e);
                    }
/* 7 */             return false;
                }
            }
