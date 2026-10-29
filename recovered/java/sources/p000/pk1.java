            package p000;

            import android.content.Context;
            import androidx.window.extensions.core.util.function.Consumer;
            import androidx.window.extensions.layout.WindowLayoutInfo;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.concurrent.locks.ReentrantLock;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class pk1 implements c00, Consumer {

                /* JADX INFO: renamed from: a */
                public final Context f15159a;

                /* JADX INFO: renamed from: c */
                public q83 f15161c;

                /* JADX INFO: renamed from: b */
                public final ReentrantLock f15160b = new ReentrantLock();

                /* JADX INFO: renamed from: d */
                public final LinkedHashSet f15162d = new LinkedHashSet();

                public pk1(Context context) {
/* 4 */             this.f15159a = context;
                }

                @Override // p000.c00
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final void accept(WindowLayoutInfo windowLayoutInfo) {
/* 1 */             windowLayoutInfo.getClass();
/* 4 */             ReentrantLock reentrantLock = this.f15160b;
/* 6 */             reentrantLock.lock();
                    try {
/* 15 */                this.f15161c = og0.m7169c(this.f15159a, windowLayoutInfo);
/* 19 */                Iterator it = this.f15162d.iterator();
/* 27 */                while (it.hasNext()) {
/* 37 */                    ((c00) it.next()).accept(this.f15161c);
                        }
/* 43 */                reentrantLock.unlock();
                    } catch (Throwable th) {
/* 47 */                reentrantLock.unlock();
/* 50 */                throw th;
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m7464b(dl0 dl0Var) {
/* 1 */             ReentrantLock reentrantLock = this.f15160b;
/* 3 */             reentrantLock.lock();
                    try {
/* 6 */                 q83 q83Var = this.f15161c;
/* 8 */                 if (q83Var != null) {
/* 10 */                    dl0Var.accept(q83Var);
                        }
/* 18 */                this.f15162d.add(dl0Var);
                    } finally {
/* 25 */                reentrantLock.unlock();
                    }
                }
            }
