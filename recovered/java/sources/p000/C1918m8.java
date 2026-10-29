            package p000;

            import io.sentry.C1469h4;
            import io.sentry.C1630q;
            import io.sentry.InterfaceC1750y0;
            import io.sentry.android.core.C1289z0;
            import io.sentry.transport.C1690p;
            import io.sentry.transport.InterfaceC1689o;
            import java.util.Iterator;
            import java.util.TimerTask;
            
            /* JADX INFO: renamed from: m8 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1918m8 extends TimerTask {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13648a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f13649b;

                public /* synthetic */ C1918m8(Object obj, int i) {
/* 1 */             this.f13648a = i;
/* 3 */             this.f13649b = obj;
                }

                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f13648a;
/* 3 */             Object obj = this.f13649b;
                    switch (i) {
                        case 0:
/* 97 */                    ((C1955n8) obj).f14159a.invoke();
                            break;
                        case 1:
/* 72 */                    Iterator it = ((C1630q) obj).f11503d.iterator();
/* 80 */                    while (it.hasNext()) {
/* 88 */                        ((InterfaceC1750y0) it.next()).mo4807c();
                            }
                            break;
                        case 2:
/* 33 */                    C1289z0 c1289z0 = (C1289z0) obj;
/* 35 */                    C1469h4 c1469h4 = c1289z0.f10401f;
/* 39 */                    if (c1289z0.f10402i) {
/* 41 */                        c1469h4.mo5094n();
                            }
/* 52 */                    c1469h4.mo5092l().getReplayController().stop();
/* 64 */                    c1469h4.mo5092l().getContinuousProfiler().mo4793a(false);
                            break;
                        default:
/* 8 */                     C1690p c1690p = (C1690p) obj;
/* 12 */                    Iterator it2 = c1690p.f11711d.iterator();
/* 20 */                    while (it2.hasNext()) {
/* 28 */                        ((InterfaceC1689o) it2.next()).mo4801k(c1690p);
                            }
                            break;
                    }
                }
            }
