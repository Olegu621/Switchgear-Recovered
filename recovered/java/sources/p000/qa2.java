            package p000;

            import android.content.Context;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.jvm.internal.Intrinsics;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class qa2 {

                /* JADX INFO: renamed from: a */
                public final String f15461a;

                /* JADX INFO: renamed from: b */
                public final Context f15462b;

                /* JADX INFO: renamed from: c */
                public uq2 f15463c;

                /* JADX INFO: renamed from: d */
                public jc0 f15464d;

                /* JADX INFO: renamed from: e */
                public d31 f15465e;

                /* JADX INFO: renamed from: f */
                public ht1 f15466f;

                /* JADX INFO: renamed from: g */
                public ht1 f15467g;

                /* JADX INFO: renamed from: h */
                public lb2 f15468h;

                /* JADX INFO: renamed from: i */
                public final hk2 f15469i;

                /* JADX INFO: renamed from: j */
                public final vq2 f15470j;

                /* JADX INFO: renamed from: k */
                public final sm1 f15471k;

                /* JADX INFO: renamed from: l */
                public final ii2 f15472l;

                /* JADX INFO: renamed from: m */
                public final kc0 f15473m;

                /* JADX INFO: renamed from: n */
                public final gb2 f15474n;

                /* JADX INFO: renamed from: o */
                public final iq0 f15475o;

                /* JADX INFO: renamed from: p */
                public final ArrayList f15476p;

                public qa2(Context context, String str, sm1 sm1Var, List list) {
/* 1 */             context.getClass();
/* 4 */             list.getClass();
/* 10 */            this.f15461a = str;
/* 19 */            r51.m8065b(new C2498yh(this, 25));
/* 28 */            r51.m8065b(new pa2(this, 1));
/* 41 */            this.f15469i = r51.m8065b(new pa2(this, 0));
/* 48 */            this.f15476p = new ArrayList();
/* 50 */            this.f15462b = context;
/* 57 */            this.f15470j = new vq2();
/* 64 */            this.f15471k = new sm1();
/* 71 */            this.f15472l = new ii2();
/* 78 */            this.f15473m = new kc0();
/* 85 */            this.f15474n = new gb2();
/* 92 */            this.f15475o = new iq0();
/* 98 */            m7748b().f16700a = sm1Var;
/* 100 */           m7753g(list);
/* 103 */           m7750d();
                }

                /* JADX INFO: renamed from: a */
                public final kc0 m7747a() {
/* 1 */             kc0 kc0Var = this.f15473m;
/* 3 */             if (kc0Var != null) {
/* 5 */                 return kc0Var;
                    }
/* 8 */             Intrinsics.m6220e("emitterConfiguration");
/* 12 */            throw null;
                }

                /* JADX INFO: renamed from: b */
                public final sm1 m7748b() {
/* 1 */             sm1 sm1Var = this.f15471k;
/* 3 */             if (sm1Var != null) {
/* 5 */                 return sm1Var;
                    }
/* 8 */             Intrinsics.m6220e("networkConfiguration");
/* 12 */            throw null;
                }

                /* JADX INFO: renamed from: c */
                public final d31 m7749c() {
/* 1 */             d31 d31Var = this.f15465e;
/* 3 */             if (d31Var != null) {
/* 26 */                return d31Var;
                    }
/* 7 */             ii2 ii2Var = this.f15472l;
/* 9 */             if (ii2Var == null) {
/* 21 */                Intrinsics.m6220e("subjectConfiguration");
/* 25 */                throw null;
                    }
/* 13 */            d31 d31Var2 = new d31(this.f15462b, ii2Var);
/* 16 */            this.f15465e = d31Var2;
/* 18 */            return d31Var2;
                }

                /* JADX INFO: renamed from: d */
                public final uq2 m7750d() {
                    c00 c00VarM3905c;
/* 1 */             uq2 uq2Var = this.f15463c;
/* 3 */             if (uq2Var != null) {
/* 167 */               return uq2Var;
                    }
/* 5 */             jc0 jc0Var = this.f15464d;
/* 7 */             String str = this.f15461a;
/* 10 */            if (jc0Var == null) {
/* 16 */                String strM8575b = m7748b().m8575b();
/* 20 */                if (strM8575b == null) {
/* 22 */                    strM8575b = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 44 */                jc0 jc0Var2 = new jc0(str, m7747a().m6082f(), this.f15462b, strM8575b, new C1983o(this, 18));
/* 55 */                if (m7747a().m6089m()) {
/* 59 */                    jc0Var2.f12186d.set(true);
                        }
/* 62 */                this.f15464d = jc0Var2;
/* 64 */                jc0Var = jc0Var2;
                    }
/* 105 */           uq2 uq2Var2 = new uq2(jc0Var, str, m7752f().m9313a(), m7752f().m9326n(), m7752f().m9327o(), this.f15462b, new C1996oc(7, m7749c(), this));
/* 116 */           if (m7752f().m9334v() && uq2Var2.f17653g.compareAndSet(true, false)) {
/* 127 */               uq2Var2.m9120b();
/* 132 */               uq2Var2.f17655i.m5774e();
                    }
/* 143 */           if (m7751e().m3906d()) {
/* 145 */               uq2Var2.m9120b();
                    }
/* 148 */           za2 za2Var = uq2Var2.f17657k;
/* 150 */           if (za2Var != null && (c00VarM3905c = m7751e().m3905c()) != null) {
/* 162 */               za2Var.f20053p = c00VarM3905c;
                    }
/* 164 */           this.f15463c = uq2Var2;
/* 166 */           return uq2Var2;
                }

                /* JADX INFO: renamed from: e */
                public final gb2 m7751e() {
/* 1 */             gb2 gb2Var = this.f15474n;
/* 3 */             if (gb2Var != null) {
/* 5 */                 return gb2Var;
                    }
/* 8 */             Intrinsics.m6220e("sessionConfiguration");
/* 12 */            throw null;
                }

                /* JADX INFO: renamed from: f */
                public final vq2 m7752f() {
/* 1 */             vq2 vq2Var = this.f15470j;
/* 3 */             if (vq2Var != null) {
/* 5 */                 return vq2Var;
                    }
/* 8 */             Intrinsics.m6220e("trackerConfiguration");
/* 12 */            throw null;
                }

                /* JADX INFO: renamed from: g */
                public final void m7753g(List list) {
/* 1 */             Iterator it = list.iterator();
/* 9 */             while (it.hasNext()) {
/* 15 */                InterfaceC2273uy interfaceC2273uy = (InterfaceC2273uy) it.next();
/* 19 */                if (interfaceC2273uy instanceof sm1) {
/* 27 */                    m7748b().f16700a = (sm1) interfaceC2273uy;
                        } else if (interfaceC2273uy instanceof vq2) {
/* 40 */                    m7752f().f18308b = (vq2) interfaceC2273uy;
                        } else if (interfaceC2273uy instanceof ii2) {
/* 48 */                    ii2 ii2Var = this.f15472l;
/* 50 */                    if (ii2Var == null) {
/* 59 */                        Intrinsics.m6220e("subjectConfiguration");
/* 62 */                        throw null;
                            }
/* 54 */                    ii2Var.f9616a = (ii2) interfaceC2273uy;
                        } else if (interfaceC2273uy instanceof gb2) {
/* 73 */                    m7751e().f8532a = (gb2) interfaceC2273uy;
                        } else if (interfaceC2273uy instanceof kc0) {
/* 86 */                    m7747a().f12677a = (kc0) interfaceC2273uy;
                        } else if (interfaceC2273uy instanceof iq0) {
/* 93 */                    iq0 iq0Var = this.f15475o;
/* 95 */                    if (iq0Var == null) {
/* 104 */                       Intrinsics.m6220e("gdprConfiguration");
/* 107 */                       throw null;
                            }
/* 99 */                    iq0Var.f11895a = (iq0) interfaceC2273uy;
                        } else {
                            continue;
                        }
                    }
                }
            }
