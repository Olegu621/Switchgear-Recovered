            package p000;

            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            
            /* JADX INFO: renamed from: on */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class RunnableC2039on implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14830a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f14831b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f14832c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f14833d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Object f14834e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Object f14835f;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ Object f14836i;

                public /* synthetic */ RunnableC2039on(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
/* 1 */             this.f14830a = i;
/* 3 */             this.f14831b = obj;
/* 5 */             this.f14832c = obj2;
/* 7 */             this.f14833d = obj3;
/* 9 */             this.f14834e = obj4;
/* 11 */            this.f14835f = obj5;
/* 13 */            this.f14836i = obj6;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (this.f14830a) {
                        case 0:
/* 185 */                   C2467xn c2467xn = (C2467xn) this.f14831b;
/* 190 */                   String str = (String) this.f14832c;
/* 195 */                   fb2 fb2Var = (fb2) this.f14833d;
/* 200 */                   zy2 zy2Var = (zy2) this.f14834e;
/* 205 */                   C2069pg c2069pg = (C2069pg) this.f14835f;
/* 210 */                   List list = (List) this.f14836i;
/* 229 */                   c2467xn.m10000s("Use case " + str + " RESET");
/* 234 */                   c2467xn.f19259a.m3827x(str, fb2Var, zy2Var, c2069pg, list);
/* 237 */                   c2467xn.m9996o();
/* 240 */                   c2467xn.m9983C();
/* 243 */                   c2467xn.m9990J();
/* 250 */                   if (c2467xn.f19284s0 == 9) {
/* 252 */                       c2467xn.m9981A();
                            }
                            break;
                        case 1:
/* 127 */                   C2467xn c2467xn2 = (C2467xn) this.f14831b;
/* 132 */                   String str2 = (String) this.f14832c;
/* 137 */                   fb2 fb2Var2 = (fb2) this.f14833d;
/* 142 */                   zy2 zy2Var2 = (zy2) this.f14834e;
/* 147 */                   C2069pg c2069pg2 = (C2069pg) this.f14835f;
/* 152 */                   List list2 = (List) this.f14836i;
/* 171 */                   c2467xn2.m10000s("Use case " + str2 + " UPDATED");
/* 176 */                   c2467xn2.f19259a.m3827x(str2, fb2Var2, zy2Var2, c2069pg2, list2);
/* 179 */                   c2467xn2.m9990J();
                            break;
                        case 2:
/* 44 */                    C2467xn c2467xn3 = (C2467xn) this.f14831b;
/* 49 */                    String str3 = (String) this.f14832c;
/* 54 */                    fb2 fb2Var3 = (fb2) this.f14833d;
/* 59 */                    zy2 zy2Var3 = (zy2) this.f14834e;
/* 64 */                    C2069pg c2069pg3 = (C2069pg) this.f14835f;
/* 69 */                    List list3 = (List) this.f14836i;
/* 88 */                    c2467xn3.m10000s("Use case " + str3 + " ACTIVE");
/* 95 */                    LinkedHashMap linkedHashMap = (LinkedHashMap) c2467xn3.f19259a.f8339b;
/* 101 */                   xy2 xy2Var = (xy2) linkedHashMap.get(str3);
/* 103 */                   if (xy2Var == null) {
/* 107 */                       xy2Var = new xy2(fb2Var3, zy2Var3, c2069pg3, list3);
/* 110 */                       linkedHashMap.put(str3, xy2Var);
                            }
/* 114 */                   xy2Var.f19404f = true;
/* 118 */                   c2467xn3.f19259a.m3827x(str3, fb2Var3, zy2Var3, c2069pg3, list3);
/* 121 */                   c2467xn3.m9990J();
                            break;
                        default:
/* 38 */                    ((C0168b5) this.f14831b).m1267l((InterfaceC2559zp) this.f14832c, (InterfaceC2559zp) this.f14833d, (lj2) this.f14834e, (lj2) this.f14835f, (Map.Entry) this.f14836i);
                            break;
                    }
                }
            }
