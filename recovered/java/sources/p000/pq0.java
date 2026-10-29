            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class pq0 implements Cloneable {

                /* JADX INFO: renamed from: a */
                public final tq0 f15245a;

                /* JADX INFO: renamed from: b */
                public tq0 f15246b;

                public pq0(tq0 tq0Var) {
/* 4 */             this.f15245a = tq0Var;
/* 10 */            if (tq0Var.m8858g()) {
/* 21 */                C1951n4.m6859j("Default instance must be immutable.");
/* 25 */                throw null;
                    }
/* 16 */            this.f15246b = tq0Var.m8860i();
                }

                /* JADX INFO: renamed from: a */
                public final tq0 m7536a() {
/* 1 */             tq0 tq0VarM7537b = m7537b();
/* 5 */             tq0VarM7537b.getClass();
/* 13 */            if (tq0.m8854f(tq0VarM7537b, true)) {
/* 15 */                return tq0VarM7537b;
                    }
/* 21 */            throw new nx2();
                }

                /* JADX INFO: renamed from: b */
                public final tq0 m7537b() {
/* 3 */             boolean zM8858g = this.f15246b.m8858g();
/* 7 */             tq0 tq0Var = this.f15246b;
/* 9 */             if (!zM8858g) {
/* 11 */                return tq0Var;
                    }
/* 12 */            tq0Var.getClass();
/* 15 */            cz1 cz1Var = cz1.f6940c;
/* 17 */            cz1Var.getClass();
/* 28 */            cz1Var.m2900a(tq0Var.getClass()).mo4492b(tq0Var);
/* 31 */            tq0Var.m8859h();
/* 34 */            return this.f15246b;
                }

                /* JADX INFO: renamed from: c */
                public final void m7538c() {
/* 7 */             if (this.f15246b.m8858g()) {
/* 35 */                return;
                    }
/* 11 */            tq0 tq0VarM8860i = this.f15245a.m8860i();
/* 15 */            tq0 tq0Var = this.f15246b;
/* 17 */            cz1 cz1Var = cz1.f6940c;
/* 19 */            cz1Var.getClass();
/* 30 */            cz1Var.m2900a(tq0VarM8860i.getClass()).mo4491a(tq0VarM8860i, tq0Var);
/* 33 */            this.f15246b = tq0VarM8860i;
                }

                public final Object clone() {
/* 8 */             pq0 pq0Var = (pq0) this.f15245a.mo7066c(5);
/* 14 */            pq0Var.f15246b = m7537b();
/* 16 */            return pq0Var;
                }
            }
