            package p000;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.Objects;
            import java.util.concurrent.ExecutionException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class kv0 implements db2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13018a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f13019b;

                public /* synthetic */ kv0(Object obj, int i) {
/* 1 */             this.f13018a = i;
/* 3 */             this.f13019b = obj;
                }

                @Override // p000.db2
                /* JADX INFO: renamed from: a */
                public final void mo1608a(fb2 fb2Var) {
/* 1 */             int i = this.f13018a;
/* 4 */             int i2 = 0;
/* 5 */             Object obj = this.f13019b;
                    switch (i) {
                        case 0:
/* 228 */                   pv0 pv0Var = (pv0) obj;
/* 234 */                   if (pv0Var.m9655b() != null) {
/* 237 */                       pg3.m7423a();
/* 240 */                       cb2 cb2Var = pv0Var.f15296t;
/* 243 */                       if (cb2Var != null) {
/* 245 */                           cb2Var.m1609b();
/* 248 */                           pv0Var.f15296t = null;
                                }
/* 250 */                       uw0 uw0Var = pv0Var.f15295s;
/* 252 */                       if (uw0Var != null) {
/* 254 */                           uw0Var.mo2951a();
/* 257 */                           pv0Var.f15295s = null;
                                }
/* 261 */                       pv0Var.f15291o.mo8260c();
/* 264 */                       pv0Var.m9657d();
/* 269 */                       tv0 tv0Var = (tv0) pv0Var.f18861f;
/* 271 */                       C2069pg c2069pg = pv0Var.f18862g;
/* 273 */                       c2069pg.getClass();
/* 276 */                       bb2 bb2VarM7560B = pv0Var.m7560B(tv0Var, c2069pg);
/* 280 */                       pv0Var.f15294r = bb2VarM7560B;
/* 286 */                       Object[] objArr = {bb2VarM7560B.m1318c()};
/* 292 */                       ArrayList arrayList = new ArrayList(1);
/* 295 */                       Object obj2 = objArr[0];
/* 297 */                       Objects.requireNonNull(obj2);
/* 300 */                       arrayList.add(obj2);
/* 307 */                       pv0Var.m9653A(Collections.unmodifiableList(arrayList));
/* 310 */                       pv0Var.m9664n();
                                break;
                            }
                            break;
                        case 1:
/* 142 */                   zv0 zv0Var = (zv0) obj;
/* 148 */                   if (zv0Var.m9655b() != null) {
/* 151 */                       qm2 qm2Var = zv0Var.f20349u;
/* 153 */                       qm2Var.getClass();
/* 156 */                       pg3.m7423a();
/* 159 */                       qm2Var.f15657d = true;
/* 161 */                       zv0Var.m10444B(true);
/* 164 */                       String strM9657d = zv0Var.m9657d();
/* 170 */                       aw0 aw0Var = (aw0) zv0Var.f18861f;
/* 172 */                       C2069pg c2069pg2 = zv0Var.f18862g;
/* 174 */                       c2069pg2.getClass();
/* 177 */                       bb2 bb2VarM10445C = zv0Var.m10445C(strM9657d, aw0Var, c2069pg2);
/* 181 */                       zv0Var.f20347s = bb2VarM10445C;
/* 187 */                       Object[] objArr2 = {bb2VarM10445C.m1318c()};
/* 193 */                       ArrayList arrayList2 = new ArrayList(1);
/* 196 */                       Object obj3 = objArr2[0];
/* 198 */                       Objects.requireNonNull(obj3);
/* 201 */                       arrayList2.add(obj3);
/* 208 */                       zv0Var.m9653A(Collections.unmodifiableList(arrayList2));
/* 211 */                       zv0Var.m9664n();
/* 214 */                       qm2 qm2Var2 = zv0Var.f20349u;
/* 216 */                       qm2Var2.getClass();
/* 219 */                       pg3.m7423a();
/* 222 */                       qm2Var2.f15657d = false;
/* 224 */                       qm2Var2.m7952c();
                                break;
                            }
                            break;
                        case 2:
/* 57 */                    qi1 qi1Var = (qi1) obj;
/* 63 */                    qi1Var.f15573b = qi1Var.m7857c();
/* 67 */                    C1933mn c1933mn = (C1933mn) qi1Var.f15576e;
/* 69 */                    if (c1933mn != null) {
/* 71 */                        C2467xn c2467xn = c1933mn.f13867b;
                                try {
                                    try {
/* 94 */                                if (((Boolean) py0.m7599Y(new C1933mn(c2467xn, i2)).f19248b.get()).booleanValue()) {
/* 97 */                                    qi1 qi1Var2 = c2467xn.f19272h0;
/* 102 */                                   fb2 fb2Var2 = (fb2) qi1Var2.f15573b;
/* 107 */                                   pi1 pi1Var = (pi1) qi1Var2.f15574c;
/* 124 */                                   Object obj4 = null;
/* 128 */                                   c2467xn.f19263c.execute(new RunnableC2039on(c2467xn, C2467xn.m9979v(qi1Var2), fb2Var2, pi1Var, obj4, Collections.singletonList(bz2.f2644f), 0));
                                            break;
                                        }
                                    } catch (ExecutionException e) {
/* 132 */                               e = e;
/* 138 */                               ds0.m3198o("Unable to check if MeteringRepeating is attached.", e);
/* 141 */                               return;
                                    }
                                } catch (InterruptedException | ExecutionException e2) {
/* 134 */                           e = e2;
                                }
                            }
                            break;
                        case 3:
/* 35 */                    vw1 vw1Var = (vw1) obj;
/* 41 */                    if (vw1Var.m9655b() != null) {
/* 50 */                        vw1Var.m9352E((ww1) vw1Var.f18861f, vw1Var.f18862g);
/* 53 */                        vw1Var.m9664n();
                                break;
                            }
                            break;
                        default:
/* 14 */                    Iterator it = ((eb2) obj).f7608l.iterator();
/* 22 */                    while (it.hasNext()) {
/* 30 */                        ((db2) it.next()).mo1608a(fb2Var);
                            }
                            break;
                    }
                }
            }
