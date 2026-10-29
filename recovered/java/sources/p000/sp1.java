            package p000;

            import android.os.Build;
            import android.window.OnBackInvokedCallback;
            import android.window.OnBackInvokedDispatcher;
            import java.util.Iterator;
            import java.util.ListIterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class sp1 {

                /* JADX INFO: renamed from: a */
                public final Runnable f16738a;

                /* JADX INFO: renamed from: b */
                public final C0840dd f16739b = new C0840dd();

                /* JADX INFO: renamed from: c */
                public kp1 f16740c;

                /* JADX INFO: renamed from: d */
                public final OnBackInvokedCallback f16741d;

                /* JADX INFO: renamed from: e */
                public OnBackInvokedDispatcher f16742e;

                /* JADX INFO: renamed from: f */
                public boolean f16743f;

                /* JADX INFO: renamed from: g */
                public boolean f16744g;

                public sp1(Runnable runnable) {
                    OnBackInvokedCallback onBackInvokedCallbackM7016a;
/* 4 */             this.f16738a = runnable;
/* 13 */            int i = Build.VERSION.SDK_INT;
/* 17 */            if (i >= 33) {
/* 21 */                if (i >= 34) {
/* 25 */                    int i2 = 0;
/* 31 */                    int i3 = 1;
/* 47 */                    onBackInvokedCallbackM7016a = pp1.f15230a.m7535a(new lp1(this, i2), new lp1(this, i3), new mp1(this, i2), new mp1(this, i3));
                        } else {
/* 60 */                    onBackInvokedCallbackM7016a = np1.f14401a.m7016a(new mp1(this, 2));
                        }
/* 64 */                this.f16741d = onBackInvokedCallbackM7016a;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m8601a(g71 g71Var, kp1 kp1Var) {
/* 1 */             kp1Var.getClass();
/* 4 */             v61 lifecycle = g71Var.getLifecycle();
/* 15 */            if (((i71) lifecycle).f9483c == u61.f17374a) {
/* 17 */                return;
                    }
/* 23 */            kp1Var.addCancellable(new qp1(this, lifecycle, kp1Var));
/* 26 */            m8604d();
/* 44 */            kp1Var.setEnabledChangedCallback$activity_release(new v11(0, this, sp1.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 2));
                }

                /* JADX INFO: renamed from: b */
                public final void m8602b() {
                    Object objPrevious;
/* 1 */             kp1 kp1Var = this.f16740c;
/* 4 */             if (kp1Var == null) {
/* 6 */                 C0840dd c0840dd = this.f16739b;
/* 12 */                ListIterator listIterator = c0840dd.listIterator(c0840dd.mo0a());
/* 33 */                do {
/* 20 */                    if (!listIterator.hasPrevious()) {
/* 36 */                        objPrevious = null;
                                break;
                            }
/* 22 */                    objPrevious = listIterator.previous();
/* 33 */                } while (!((kp1) objPrevious).isEnabled());
/* 38 */                kp1Var = (kp1) objPrevious;
                    }
/* 40 */            this.f16740c = null;
/* 42 */            if (kp1Var != null) {
/* 44 */                kp1Var.handleOnBackPressed();
                    } else {
/* 50 */                this.f16738a.run();
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m8603c(boolean z) {
                    OnBackInvokedCallback onBackInvokedCallback;
/* 1 */             OnBackInvokedDispatcher onBackInvokedDispatcher = this.f16742e;
/* 3 */             if (onBackInvokedDispatcher == null || (onBackInvokedCallback = this.f16741d) == null) {
/* 36 */                return;
                    }
/* 10 */            np1 np1Var = np1.f14401a;
/* 12 */            if (z && !this.f16743f) {
/* 18 */                np1Var.m7017b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
/* 22 */                this.f16743f = true;
                    } else {
/* 25 */                if (z || !this.f16743f) {
/* 36 */                    return;
                        }
/* 31 */                np1Var.m7018c(onBackInvokedDispatcher, onBackInvokedCallback);
/* 34 */                this.f16743f = false;
                    }
                }

                /* JADX INFO: renamed from: d */
                public final void m8604d() {
/* 1 */             boolean z = this.f16744g;
/* 3 */             boolean z2 = false;
/* 4 */             C0840dd c0840dd = this.f16739b;
/* 6 */             if (c0840dd == null || !c0840dd.isEmpty()) {
/* 15 */                Iterator it = c0840dd.iterator();
/* 23 */                while (it.hasNext()) {
/* 35 */                    if (((kp1) it.next()).isEnabled()) {
/* 37 */                        z2 = true;
                                break;
                            }
                        }
                    }
/* 38 */            this.f16744g = z2;
/* 40 */            if (z2 == z || Build.VERSION.SDK_INT < 33) {
/* 51 */                return;
                    }
/* 48 */            m8603c(z2);
                }
            }
