            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class wm2 extends sm2 {

                /* JADX INFO: renamed from: c */
                public final Runnable f18689c;

                public wm2(Runnable runnable, long j, vm2 vm2Var) {
/* 1 */             super(j, vm2Var);
/* 4 */             this.f18689c = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
/* 3 */                 this.f18689c.run();
                    } finally {
/* 15 */                this.f16707b.getClass();
                    }
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Task[");
/* 8 */             Runnable runnable = this.f18689c;
/* 18 */            sb.append(runnable.getClass().getSimpleName());
/* 23 */            sb.append('@');
/* 30 */            sb.append(k50.m5983t(runnable));
/* 35 */            sb.append(", ");
/* 40 */            sb.append(this.f16706a);
/* 43 */            sb.append(", ");
/* 48 */            sb.append(this.f16707b);
/* 53 */            sb.append(']');
/* 56 */            return sb.toString();
                }
            }
