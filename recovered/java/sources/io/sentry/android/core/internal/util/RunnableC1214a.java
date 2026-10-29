            package io.sentry.android.core.internal.util;

            import android.net.ConnectivityManager;
            import io.sentry.EnumC1570o0;
            import io.sentry.InterfaceC1578p0;
            import io.sentry.android.core.C1191g0;
            import io.sentry.util.C1702a;
            import java.util.Iterator;
            
            /* JADX INFO: renamed from: io.sentry.android.core.internal.util.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC1214a implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f10136a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C1216c f10137b;

                public /* synthetic */ RunnableC1214a(C1216c c1216c, int i) {
/* 1 */             this.f10136a = i;
/* 3 */             this.f10137b = c1216c;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f10136a;
/* 5 */             C1216c c1216c = this.f10137b;
                    switch (i) {
                        case 0:
/* 122 */                   c1216c.m4833o(true);
/* 125 */                   C1702a c1702a = C1216c.f10141Y;
/* 127 */                   c1702a.m5443c();
                            try {
/* 132 */                       C1216c.f10142Z.clear();
/* 135 */                       c1702a.close();
/* 138 */                       C1702a c1702a2 = C1216c.f10139W;
/* 140 */                       c1702a2.m5443c();
                                try {
/* 143 */                           C1216c.f10140X = null;
/* 145 */                           c1702a2.close();
/* 150 */                           C1191g0.f10017e.m4791h(c1216c);
/* 153 */                           return;
                                } catch (Throwable th) {
                                    try {
/* 155 */                               c1702a2.close();
                                        break;
                                    } catch (Throwable th2) {
/* 160 */                               th.addSuppressed(th2);
                                    }
/* 163 */                           throw th;
                                }
                            } catch (Throwable th3) {
                                try {
/* 165 */                           c1702a.close();
                                    break;
                                } catch (Throwable th4) {
/* 170 */                           th3.addSuppressed(th4);
                                }
/* 173 */                       throw th3;
                            }
                        case 1:
/* 117 */                   c1216c.m4829h();
/* 120 */                   return;
                        case 2:
/* 113 */                   c1216c.m4833o(false);
/* 116 */                   return;
                        default:
/* 10 */                    c1216c.m4834p(null);
/* 13 */                    EnumC1570o0 enumC1570o0M4830i = c1216c.m4830i();
/* 19 */                    if (enumC1570o0M4830i == EnumC1570o0.DISCONNECTED) {
/* 23 */                        c1216c.f10146V.set(false);
/* 26 */                        C1702a c1702a3 = C1216c.f10141Y;
/* 28 */                        c1702a3.m5443c();
                                try {
/* 33 */                            Iterator it = C1216c.f10142Z.iterator();
/* 41 */                            while (it.hasNext()) {
/* 49 */                                ((ConnectivityManager.NetworkCallback) it.next()).onLost(null);
                                    }
/* 55 */                            c1702a3.close();
                                } catch (Throwable th5) {
                                    try {
/* 59 */                                c1702a3.close();
                                        break;
                                    } catch (Throwable th6) {
/* 64 */                                th5.addSuppressed(th6);
                                    }
/* 67 */                            throw th5;
                                }
                            }
/* 68 */                    C1702a c1702a4 = c1216c.f10152f;
/* 70 */                    c1702a4.m5443c();
                            try {
/* 75 */                        Iterator it2 = c1216c.f10151e.iterator();
/* 83 */                        while (it2.hasNext()) {
/* 91 */                            ((InterfaceC1578p0) it2.next()).mo4757f(enumC1570o0M4830i);
                                }
/* 97 */                        c1702a4.close();
/* 100 */                       c1216c.m4829h();
/* 103 */                       return;
                            } catch (Throwable th7) {
                                try {
/* 104 */                           c1702a4.close();
                                    break;
                                } catch (Throwable th8) {
/* 109 */                           th7.addSuppressed(th8);
                                }
/* 112 */                       throw th7;
                            }
                    }
                }
            }
