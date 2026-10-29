            package p000;

            import java.util.Collections;
            import java.util.HashSet;
            
            /* JADX INFO: renamed from: rx */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 61 */    public final class C2160rx {

                /* JADX INFO: renamed from: a */
                public String f16329a = null;

                /* JADX INFO: renamed from: b */
                public final HashSet f16330b;

                /* JADX INFO: renamed from: c */
                public final HashSet f16331c;

                /* JADX INFO: renamed from: d */
                public int f16332d;

                /* JADX INFO: renamed from: e */
                public int f16333e;

                /* JADX INFO: renamed from: f */
                public InterfaceC0934fy f16334f;

                /* JADX INFO: renamed from: g */
                public final HashSet f16335g;

                public C2160rx(Class cls, Class[] clsArr) {
/* 9 */             HashSet hashSet = new HashSet();
/* 12 */            this.f16330b = hashSet;
/* 19 */            this.f16331c = new HashSet();
/* 22 */            this.f16332d = 0;
/* 24 */            this.f16333e = 0;
/* 31 */            this.f16335g = new HashSet();
/* 37 */            hashSet.add(f02.m3619a(cls));
/* 41 */            for (Class cls2 : clsArr) {
/* 47 */                xe2.m9769g(cls2, "Null interface");
/* 56 */                this.f16330b.add(f02.m3619a(cls2));
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m8314a(r70 r70Var) {
/* 9 */             if (this.f16330b.contains(r70Var.f15895a)) {
/* 19 */                C1951n4.m6859j("Components are not allowed to depend on interfaces they themselves provide.");
                    } else {
/* 13 */                this.f16331c.add(r70Var);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final C2197sx m8315b() {
/* 8 */             if (this.f16334f != null) {
/* 36 */                return new C2197sx(this.f16329a, new HashSet(this.f16330b), new HashSet(this.f16331c), this.f16332d, this.f16333e, this.f16334f, this.f16335g);
                    }
/* 42 */            f42.m3656l("Missing required property: factory.");
/* 45 */            return null;
                }

/* 62 */        public C2160rx(f02 f02Var, f02[] f02VarArr) {
/* 65 */            HashSet hashSet = new HashSet();
                    this.f16330b = hashSet;
/* 66 */            this.f16331c = new HashSet();
/* 67 */            this.f16332d = 0;
/* 68 */            this.f16333e = 0;
/* 69 */            this.f16335g = new HashSet();
/* 70 */            hashSet.add(f02Var);
                    for (f02 f02Var2 : f02VarArr) {
/* 72 */                xe2.m9769g(f02Var2, "Null interface");
                    }
/* 73 */            Collections.addAll(this.f16330b, f02VarArr);
                }
            }
