            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class uv2 extends b51 implements lo0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17733a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f17734b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ uv2(Object obj, int i) {
/* 6 */             super(3);
/* 1 */             this.f17733a = i;
/* 3 */             this.f17734b = obj;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [nd0] */
                /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
                /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
                /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
                @Override // p000.lo0
                /* JADX INFO: renamed from: a */
                public final Object mo4450a(Object obj, Object obj2, Object obj3) {
                    ?? arrayList;
/* 1 */             int i = this.f17733a;
/* 3 */             Object obj4 = this.f17734b;
                    switch (i) {
                        case 0:
/* 236 */                   cv2 cv2Var = (cv2) obj;
/* 238 */                   qv2 qv2Var = (qv2) obj2;
/* 240 */                   nv2 nv2Var = (nv2) obj3;
/* 242 */                   cv2Var.getClass();
/* 245 */                   qv2Var.getClass();
/* 248 */                   nv2Var.getClass();
/* 251 */                   wv2 wv2Var = (wv2) obj4;
/* 259 */                   wv2Var.getUcHeader().m2814k(wv2Var.f18835d0, qv2Var);
/* 266 */                   wv2Var.getUcFooter().m2811k(nv2Var);
/* 269 */                   wv2.m9644l(wv2Var, cv2Var);
                            break;
                        default:
/* 9 */                     String str = (String) obj;
/* 11 */                    Function1 function1 = (Function1) obj2;
/* 13 */                    Function1 function2 = (Function1) obj3;
/* 15 */                    str.getClass();
/* 18 */                    function1.getClass();
/* 21 */                    function2.getClass();
/* 24 */                    C0168b5 c0168b5 = (C0168b5) obj4;
/* 29 */                    a13 a13Var = (a13) c0168b5.f2211b;
/* 35 */                    C1908lz c1908lz = new C1908lz(15, c0168b5, function1);
/* 42 */                    C1996oc c1996oc = new C1996oc(17, c0168b5, function2);
/* 45 */                    fb1 fb1Var = a13Var.f30a;
/* 54 */                    jc2 jc2Var = (jc2) fb1Var.f8083U.getValue();
/* 56 */                    jc2Var.getClass();
/* 65 */                    if (str.equals(jc2Var.f12215e)) {
/* 67 */                        c1908lz.invoke();
                            } else {
/* 82 */                        k61 k61Var = ((ac2) jc2Var.f12211a.f8068F.getValue()).f182c;
/* 84 */                        C0875ec c0875ec = k61Var.f12619j;
/* 88 */                        if (c0875ec != null) {
/* 94 */                            List list = ((cv1) c0875ec.f7614c).f6917a;
/* 102 */                           arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 105 */                           Iterator it = list.iterator();
/* 113 */                           while (it.hasNext()) {
/* 123 */                               arrayList.add(((bv1) it.next()).f2615a);
                                    }
                                } else {
/* 127 */                           C1029ij c1029ij = k61Var.f12618i;
/* 129 */                           if (c1029ij != null) {
/* 135 */                               List list2 = ((cv1) c1029ij.f9631d).f6917a;
/* 143 */                               arrayList = new ArrayList(C2122qw.m8020h(list2, 10));
/* 146 */                               Iterator it2 = list2.iterator();
/* 154 */                               while (it2.hasNext()) {
/* 164 */                                   arrayList.add(((bv1) it2.next()).f2615a);
                                        }
                                    } else {
/* 168 */                               arrayList = nd0.f14189a;
                                    }
                                }
/* 174 */                       if (arrayList.contains(str)) {
/* 209 */                           C0875ec c0875ecM9743b = fb1Var.m3696b().m9743b(new C2562zs(jc2Var, a13Var, str, null, 7));
/* 220 */                           c0875ecM9743b.m3370H(new C1996oc(11, a13Var, c1908lz));
/* 230 */                           c0875ecM9743b.m3369G(new C1996oc(12, a13Var, c1996oc));
                                } else {
/* 194 */                           c1996oc.invoke(new tz2(new C1836km(fm0.m3784j("Cannot change the language to '", str, "' as it is not supported by your configuration. Please add it to your configuration at: Configuration Section > Setup Tab > Language Settings"))));
                                }
                            }
                            break;
                    }
/* 233 */           return Unit.f12910a;
                }
            }
