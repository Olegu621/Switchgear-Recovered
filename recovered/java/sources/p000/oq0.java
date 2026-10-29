            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class oq0 implements nh1, Cloneable {

                /* JADX INFO: renamed from: a */
                public final sq0 f14863a;

                /* JADX INFO: renamed from: b */
                public sq0 f14864b;

                public oq0(sq0 sq0Var) {
/* 4 */             this.f14863a = sq0Var;
/* 10 */            if (sq0Var.m8620n()) {
/* 21 */                C1951n4.m6859j("Default instance must be immutable.");
/* 25 */                throw null;
                    }
/* 16 */            this.f14864b = sq0Var.m8623q();
                }

                /* JADX INFO: renamed from: f */
                public static void m7230f(Object obj, Object obj2) {
/* 1 */             az1 az1Var = az1.f2145c;
/* 3 */             az1Var.getClass();
/* 14 */            az1Var.m1182a(obj.getClass()).mo4123a(obj, obj2);
                }

                /* JADX INFO: renamed from: b */
                public final sq0 m7231b() {
/* 1 */             sq0 sq0VarM7232c = m7232c();
/* 5 */             sq0VarM7232c.getClass();
/* 13 */            if (sq0.m8611m(sq0VarM7232c, true)) {
/* 15 */                return sq0VarM7232c;
                    }
/* 21 */            throw new mx2();
                }

                /* JADX INFO: renamed from: c */
                public final sq0 m7232c() {
/* 3 */             boolean zM8620n = this.f14864b.m8620n();
/* 7 */             sq0 sq0Var = this.f14864b;
/* 9 */             if (!zM8620n) {
/* 11 */                return sq0Var;
                    }
/* 12 */            sq0Var.getClass();
/* 15 */            az1 az1Var = az1.f2145c;
/* 17 */            az1Var.getClass();
/* 28 */            az1Var.m1182a(sq0Var.getClass()).mo4124b(sq0Var);
/* 31 */            sq0Var.m8621o();
/* 34 */            return this.f14864b;
                }

                /* JADX INFO: renamed from: d */
                public final oq0 m7233d() {
/* 3 */             oq0 oq0VarM8622p = this.f14863a.mo8616d();
/* 11 */            oq0VarM8622p.f14864b = m7232c();
/* 13 */            return oq0VarM8622p;
                }

                /* JADX INFO: renamed from: e */
                public final void m7234e() {
/* 7 */             if (this.f14864b.m8620n()) {
/* 22 */                return;
                    }
/* 11 */            sq0 sq0VarM8623q = this.f14863a.m8623q();
/* 17 */            m7230f(sq0VarM8623q, this.f14864b);
/* 20 */            this.f14864b = sq0VarM8623q;
                }
            }
