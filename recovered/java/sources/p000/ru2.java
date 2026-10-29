            package p000;

            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.functions.Function0;
            import kotlin.text.StringsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 8 */     public final class ru2 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16299a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ su2 f16300b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ ru2(su2 su2Var, int i) {
/* 6 */             super(0);
/* 1 */             this.f16299a = i;
/* 3 */             this.f16300b = su2Var;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
/* 1 */             int i = this.f16299a;
/* 3 */             boolean z = true;
/* 5 */             su2 su2Var = this.f16300b;
                    switch (i) {
                        case 0:
/* 337 */                   C1029ij c1029ij = su2Var.f16804b.f12530c;
/* 341 */                   C2131r4 c2131r4 = (C2131r4) c1029ij.f9631d;
/* 343 */                   if (c2131r4 == null) {
/* 4 */                         return null;
                            }
/* 352 */                   return new ju2(c2131r4.f15867b, c1029ij.f9628a);
                        case 1:
/* 242 */                   jw2 jw2Var = su2Var.f16804b;
/* 244 */                   ac1 ac1Var = su2Var.f16810h;
/* 246 */                   List<du1> list = jw2Var.f12531d;
/* 256 */                   ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 267 */                   for (du1 du1Var : list) {
/* 275 */                       String str = du1Var.f7410a;
/* 277 */                       List<cu1> list2 = du1Var.f7411b;
/* 285 */                       ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(list2, 10));
/* 296 */                       for (cu1 cu1Var : list2) {
/* 312 */                           arrayList2.add(q62.m7732d(cu1Var, ac1Var.m187q(cu1Var), ac1Var));
                                }
/* 316 */                       ac1Var.m176e();
/* 324 */                       arrayList.add(new ut2(str, arrayList2, null));
                            }
/* 332 */                   return (List) yy1.m10221p(arrayList);
                        case 2:
/* 238 */                   return new mu2((String) su2Var.f16804b.f12529b.f7985c);
                        case 3:
/* 210 */                   boolean z2 = su2Var.f16811i;
/* 214 */                   C1029ij c1029ij2 = su2Var.f16804b.f12530c;
                            return z2 ? (List) c1029ij2.f9632e : (ArrayList) c1029ij2.f9629b;
                        case 4:
/* 161 */                   p82 p82Var = q82.Companion;
/* 169 */                   ej0 ej0Var = (ej0) su2Var.f16804b.f12529b.f7987e;
/* 171 */                   p82Var.getClass();
/* 185 */                   int i2 = ej0Var == null ? -1 : o82.f14675a[ej0Var.ordinal()];
/* 187 */                   if (i2 == -1) {
/* 4 */                         return null;
                            }
/* 189 */                   if (i2 == 1) {
/* 207 */                       return q82.f15442a;
                            }
/* 192 */                   if (i2 == 2) {
/* 204 */                       return q82.f15443b;
                            }
/* 195 */                   if (i2 == 3) {
/* 197 */                       return q82.f15444c;
                            }
/* 200 */                   ds0.m3187b();
/* 4 */                     return null;
                        case 5:
/* 133 */                   wz2 wz2Var = xz2.Companion;
/* 141 */                   String str2 = (String) su2Var.f16804b.f12529b.f7988f;
/* 143 */                   wz2Var.getClass();
/* 146 */                   if (str2 == null || !(!StringsKt.m6228D(str2))) {
/* 4 */                         return null;
                            }
/* 157 */                   return new xz2(str2);
                        case 6:
/* 71 */                    o61 o61Var = su2Var.f16808f;
/* 75 */                    if (o61Var != o61.f14644b && o61Var != o61.f14646d) {
/* 82 */                        z = false;
                            }
/* 89 */                    ArrayList arrayList3 = (ArrayList) su2Var.f16804b.f12529b.f7986d;
/* 93 */                    ArrayList arrayList4 = new ArrayList();
/* 104 */                   for (Object obj : arrayList3) {
/* 111 */                       ev1 ev1Var = (ev1) obj;
/* 113 */                       if (!z || ev1Var.f7894c != fv1.URL) {
/* 122 */                           arrayList4.add(obj);
                                }
                            }
/* 130 */                   return (List) yy1.m10221p(arrayList4);
                        case 7:
/* 58 */                    if (((mu2) su2Var.f16820r.getValue()) == null) {
/* 4 */                         return null;
                            }
/* 68 */                    return (String) su2Var.f16804b.f12529b.f7991i;
                        case 8:
/* 39 */                    String str3 = (String) su2Var.f16804b.f12529b.f7984b;
/* 41 */                    if (str3 == null) {
/* 4 */                         return null;
                            }
/* 46 */                    return new mu2(str3);
                        case 9:
/* 29 */                    return new pu2((String) su2Var.f16804b.f12529b.f7983a);
                        default:
/* 14 */                    return Boolean.valueOf(su2Var.f16803a instanceof f03);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 9 */         public /* synthetic */ ru2(su2 su2Var, gj0 gj0Var, int i) {
                    super(0);
/* 10 */            this.f16299a = i;
                    this.f16300b = su2Var;
                }
            }
