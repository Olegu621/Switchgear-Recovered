            package p000;

            import java.util.concurrent.Callable;
            import java.util.concurrent.FutureTask;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 44 */    public final class yi3 extends FutureTask implements Comparable {

                /* JADX INFO: renamed from: a */
                public final long f19651a;

                /* JADX INFO: renamed from: b */
                public final boolean f19652b;

                /* JADX INFO: renamed from: c */
                public final String f19653c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ bj3 f19654d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public yi3(bj3 bj3Var, Callable callable, boolean z) {
/* 3 */             super(callable);
/* 1 */             this.f19654d = bj3Var;
/* 8 */             long andIncrement = bj3.f2450V.getAndIncrement();
/* 12 */            this.f19651a = andIncrement;
/* 16 */            this.f19653c = "Task exception on worker thread";
/* 18 */            this.f19652b = z;
/* 27 */            if (andIncrement == Long.MAX_VALUE) {
/* 33 */                uh3 uh3Var = ((ij3) bj3Var.f16749a).f9655f;
/* 35 */                ij3.m4555l(uh3Var);
/* 42 */                uh3Var.f17538f.m8510a("Tasks index overflow");
                    }
                }

                @Override // java.lang.Comparable
                public final int compareTo(Object obj) {
/* 1 */             yi3 yi3Var = (yi3) obj;
/* 3 */             boolean z = yi3Var.f19652b;
/* 5 */             boolean z2 = this.f19652b;
/* 7 */             if (z2 != z) {
                        return !z2 ? 1 : -1;
                    }
/* 12 */            long j = yi3Var.f19651a;
/* 14 */            long j2 = this.f19651a;
/* 18 */            if (j2 < j) {
/* 20 */                return -1;
                    }
/* 22 */            if (j2 > j) {
/* 24 */                return 1;
                    }
/* 32 */            uh3 uh3Var = ((ij3) this.f19654d.f16749a).f9655f;
/* 34 */            ij3.m4555l(uh3Var);
/* 45 */            uh3Var.f17539i.m8511b(Long.valueOf(j2), "Two tasks share the same index. index");
/* 48 */            return 0;
                }

                @Override // java.util.concurrent.FutureTask
                public final void setException(Throwable th) {
/* 7 */             uh3 uh3Var = ((ij3) this.f19654d.f16749a).f9655f;
/* 9 */             ij3.m4555l(uh3Var);
/* 16 */            uh3Var.f17538f.m8511b(th, this.f19653c);
/* 19 */            super.setException(th);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 45 */        public yi3(bj3 bj3Var, Runnable runnable, boolean z, String str) {
/* 47 */            super(runnable, null);
/* 46 */            this.f19654d = bj3Var;
/* 49 */            long andIncrement = bj3.f2450V.getAndIncrement();
                    this.f19651a = andIncrement;
                    this.f19653c = str;
                    this.f19652b = z;
                    if (andIncrement == Long.MAX_VALUE) {
/* 50 */                uh3 uh3Var = ((ij3) bj3Var.f16749a).f9655f;
/* 51 */                ij3.m4555l(uh3Var);
/* 53 */                uh3Var.f17538f.m8510a("Tasks index overflow");
                    }
                }
            }
