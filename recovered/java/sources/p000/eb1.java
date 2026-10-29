            package p000;

            import android.content.SharedPreferences;
            import java.util.ArrayList;
            import java.util.Iterator;
            import kotlin.jvm.functions.Function0;
            import kotlin.ranges.IntRange;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class eb1 extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7603a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ fb1 f7604b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ eb1(fb1 fb1Var, int i) {
/* 6 */             super(0);
/* 1 */             this.f7603a = i;
/* 3 */             this.f7604b = fb1Var;
                }

                /* JADX WARN: Code duplicated, block: B:26:0x021c  */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() throws vi1 {
                    Iterator it;
                    int iNextInt;
                    int i;
/* 3 */             int i2 = this.f7603a;
/* 5 */             int i3 = 5;
/* 6 */             int i4 = 4;
/* 7 */             int i5 = 3;
/* 8 */             fb1 fb1Var = this.f7604b;
                    switch (i2) {
                        case 0:
/* 307 */                   we2 we2Var = new we2((od2) fb1Var.f8110x.getValue(), (od2) fb1Var.f8111y.getValue());
/* 310 */                   i03 i03VarM3699e = fb1Var.m3699e();
/* 315 */                   a21 a21VarM3698d = fb1Var.m3698d();
/* 319 */                   i03VarM3699e.getClass();
/* 322 */                   a21VarM3698d.getClass();
/* 327 */                   ArrayList arrayList = new ArrayList();
/* 336 */                   fb1Var.m3698d().getClass();
/* 345 */                   int i6 = 0;
/* 348 */                   C2270uw.m9141l(arrayList, new ui1[]{new aj1(we2Var, 1)});
/* 353 */                   int i7 = 2;
/* 361 */                   C2270uw.m9141l(arrayList, new ui1[]{new bj1(we2Var, i7, i6)});
/* 370 */                   fb1Var.m3698d().getClass();
/* 380 */                   C2270uw.m9141l(arrayList, new ui1[]{new cj1(we2Var, 3)});
/* 392 */                   C2270uw.m9141l(arrayList, new ui1[]{new bj1(we2Var, i4, 1)});
/* 404 */                   C2270uw.m9141l(arrayList, new ui1[]{new bj1(we2Var, i3, i7)});
/* 413 */                   fb1Var.m3698d().getClass();
/* 424 */                   C2270uw.m9141l(arrayList, new ui1[]{new bj1(we2Var, 6, i5)});
/* 437 */                   C2270uw.m9141l(arrayList, new ui1[]{new bj1(we2Var, 7, i4)});
/* 461 */                   C2270uw.m9141l(arrayList, new ui1[]{new dj1(we2Var, fb1Var.m3698d(), (ev0) fb1Var.f8078P.getValue())});
/* 470 */                   pz2 pz2Var = new pz2(we2Var, i03VarM3699e, 8, arrayList, a21VarM3698d);
/* 473 */                   fh2[] fh2VarArr = fh2.f8216a;
/* 475 */                   od2 od2Var = pz2Var.f15354e;
/* 477 */                   od2Var.getClass();
/* 480 */                   SharedPreferences sharedPreferences = od2Var.f14716a;
/* 484 */                   int i8 = sharedPreferences.getInt("storage_version", 0);
/* 488 */                   if (i8 == 0) {
/* 490 */                       zi1[] zi1VarArrValues = zi1.values();
/* 494 */                       int length = zi1VarArrValues.length;
                                while (true) {
/* 495 */                           if (i6 < length) {
/* 497 */                               zi1 zi1Var = zi1VarArrValues[i6];
/* 503 */                               od2 od2Var2 = (od2) pz2Var.f15350a.f18596c;
/* 505 */                               String str = zi1Var.f20160a;
/* 507 */                               od2Var2.getClass();
/* 516 */                               if (!od2Var2.f14716a.contains(str)) {
/* 519 */                                   i6++;
                                        }
                                    }
                                }
/* 530 */                       it = new IntRange(i8 + 1, 8, 1).iterator();
/* 539 */                       while (((yy0) it).f19856c) {
/* 544 */                           iNextInt = ((wy0) it).nextInt();
/* 548 */                           i = iNextInt - 1;
                                    try {
/* 550 */                               pz2Var.m7633e(i, iNextInt);
                                    } catch (Throwable th) {
/* 568 */                               throw new vi1(AbstractC0886en.m3506j("Cannot migrate stored data from ", i, iNextInt, " to "), th);
                                    }
                                }
                            } else if (i8 < 8) {
/* 530 */                       it = new IntRange(i8 + 1, 8, 1).iterator();
/* 539 */                       while (((yy0) it).f19856c) {
/* 544 */                           iNextInt = ((wy0) it).nextInt();
/* 548 */                           i = iNextInt - 1;
/* 550 */                           pz2Var.m7633e(i, iNextInt);
                                }
                            }
/* 569 */                   fh2[] fh2VarArr2 = fh2.f8216a;
/* 579 */                   sharedPreferences.edit().putInt("storage_version", 8).apply();
/* 582 */                   return pz2Var;
                        case 1:
/* 285 */                   return new qk2(fb1Var.m3699e(), fb1Var.m3700f(), (g80) fb1Var.f8112z.getValue(), (InterfaceC1811jz) fb1Var.f8105s.getValue(), (p91) fb1Var.f8065C.getValue(), (C2484y3) fb1Var.f8086X.getValue(), new fs0((gl2) fb1Var.f8072J.getValue()), fb1Var.m3696b(), new ib1(), (jc2) fb1Var.f8083U.getValue());
                        case 2:
/* 101 */                   xu0 xu0VarM3697c = fb1Var.m3697c();
/* 105 */                   hk2 hk2Var = fb1Var.f8095i;
/* 113 */                   C2130r3 c2130r3 = new C2130r3(xu0VarM3697c, (hb1) hk2Var.getValue(), 3);
/* 128 */                   C2130r3 c2130r4 = new C2130r3(fb1Var.m3697c(), (hb1) hk2Var.getValue(), 4);
/* 135 */                   a21 a21VarM3698d2 = fb1Var.m3698d();
/* 139 */                   i03 i03VarM3699e2 = fb1Var.m3699e();
/* 143 */                   hk2 hk2Var2 = fb1Var.f8082T;
/* 150 */                   se0 se0Var = (se0) hk2Var2.getValue();
/* 152 */                   hk2 hk2Var3 = fb1Var.f8090d;
/* 197 */                   return new gl2(new k51(c2130r4, a21VarM3698d2, i03VarM3699e2, se0Var, (fn1) hk2Var3.getValue(), (byte) 0), new C2279v3(c2130r3, fb1Var.m3698d(), fb1Var.m3699e(), (se0) hk2Var2.getValue(), (fn1) hk2Var3.getValue(), (byte) 0));
                        case 3:
/* 94 */                    return Long.valueOf(fb1Var.f8087a.f6051d);
                        case 4:
/* 86 */                    return new sr2(new C2279v3(new C2130r3(fb1Var.m3697c(), (hb1) fb1Var.f8095i.getValue(), 5), fb1Var.m3698d(), fb1Var.m3699e(), (se0) fb1Var.f8082T.getValue(), (fn1) fb1Var.f8090d.getValue(), (char) 0));
                        default:
/* 31 */                    return new zt1((oz2) fb1Var.f8101o.getValue(), fb1Var.m3699e(), fb1Var.f8087a.f6052e);
                    }
                }
            }
