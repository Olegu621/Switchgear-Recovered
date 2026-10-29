            package p000;

            import android.app.Activity;
            import android.net.Uri;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataWhitelist;
            import java.util.List;
            import java.util.concurrent.atomic.AtomicInteger;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import org.json.JSONObject;
            
            /* JADX INFO: renamed from: tm */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class C2223tm extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f17178a;

                /* JADX INFO: renamed from: b */
                public int f17179b;

                /* JADX INFO: renamed from: c */
                public Object f17180c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f17181d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C2223tm(Object obj, Object obj2, c10 c10Var, int i) {
/* 8 */             super(2, c10Var);
/* 1 */             this.f17178a = i;
/* 3 */             this.f17180c = obj;
/* 5 */             this.f17181d = obj2;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 1 */             int i = this.f17178a;
/* 3 */             Object obj2 = this.f17181d;
                    switch (i) {
                        case 0:
/* 164 */                   return new C2223tm((fk0) this.f17180c, (c00) obj2, c10Var, 0);
                        case 1:
/* 149 */                   C2223tm c2223tm = new C2223tm((AbstractC0155at) obj2, c10Var, 1);
/* 152 */                   c2223tm.f17180c = obj;
/* 154 */                   return c2223tm;
                        case 2:
/* 138 */                   C2223tm c2223tm2 = new C2223tm((C0192bt) obj2, c10Var, 2);
/* 141 */                   c2223tm2.f17180c = obj;
/* 143 */                   return c2223tm2;
                        case 3:
/* 127 */                   C2223tm c2223tm3 = new C2223tm((List) obj2, c10Var, 3);
/* 130 */                   c2223tm3.f17180c = obj;
/* 132 */                   return c2223tm3;
                        case 4:
/* 118 */                   return new C2223tm((Function2) this.f17180c, (x30) obj2, c10Var, 4);
                        case 5:
/* 103 */                   C2223tm c2223tm4 = new C2223tm((b50) obj2, c10Var, 5);
/* 106 */                   c2223tm4.f17180c = obj;
/* 108 */                   return c2223tm4;
                        case 6:
/* 94 */                    return new C2223tm((il0) this.f17180c, (Activity) obj2, c10Var, 6);
                        case 7:
/* 81 */                    return new C2223tm((pd1) this.f17180c, (Uri) obj2, c10Var, 7);
                        case 8:
/* 68 */                    return new C2223tm((SharedDataWhitelist) this.f17180c, (JSONObject) obj2, c10Var, 8);
                        case 9:
/* 54 */                    return new C2223tm((ra2) obj2, c10Var, 9);
                        case 10:
/* 42 */                    C2223tm c2223tm5 = new C2223tm((hk0) obj2, c10Var, 10);
/* 45 */                    c2223tm5.f17180c = obj;
/* 47 */                    return c2223tm5;
                        case 11:
/* 32 */                    return new C2223tm((se0) this.f17180c, (a13) obj2, c10Var, 11);
                        default:
/* 18 */                    return new C2223tm((fb1) this.f17180c, (vz2) obj2, c10Var, 12);
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f17178a) {
                        case 0:
/* 220 */                   return ((C2223tm) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 1:
/* 203 */                   return ((C2223tm) create((xx1) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 2:
/* 186 */                   return ((C2223tm) create((hk0) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 3:
/* 169 */                   return ((C2223tm) create((k40) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 4:
/* 152 */                   return ((C2223tm) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 5:
/* 135 */                   return ((C2223tm) create((kh1) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 6:
/* 118 */                   return ((C2223tm) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 7:
/* 101 */                   return ((C2223tm) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 8:
/* 84 */                    return ((C2223tm) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 9:
/* 67 */                    return ((C2223tm) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 10:
/* 50 */                    return ((C2223tm) create(obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 11:
/* 35 */                    return ((C2223tm) create((y80) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        default:
/* 18 */                    return ((C2223tm) create((y80) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:54:0x015d A[PHI: r1 r9
  0x015d: PHI (r1v12 tm) = (r1v14 tm), (r1v16 tm) binds: [B:52:0x015a, B:48:0x0122] A[DONT_GENERATE, DONT_INLINE]
  0x015d: PHI (r9v31 java.lang.Object) = (r9v39 java.lang.Object), (r9v0 java.lang.Object) binds: [B:52:0x015a, B:48:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Code restructure failed: missing block: B:55:0x0165, code lost:
                
                    if (r1.invoke(r9, r8) == r0) goto L56;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x0165 -> B:57:0x0169). Please report as a decompilation issue!!! */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    fk0 i90Var;
                    C2223tm c2223tm;
                    Object objM33n;
/* 1 */             int i = this.f17178a;
/* 3 */             int i2 = 0;
/* 4 */             Object obj2 = this.f17181d;
/* 9 */             c10 c10Var = null;
                    switch (i) {
                        case 0:
/* 727 */                   z10 z10Var = z10.f19902a;
/* 729 */                   int i3 = this.f17179b;
/* 731 */                   if (i3 == 0) {
/* 743 */                       pg3.m7417A(obj);
/* 748 */                       fk0 fk0Var = (fk0) this.f17180c;
/* 754 */                       C2186sm c2186sm = new C2186sm((c00) obj2, i2);
/* 757 */                       this.f17179b = 1;
/* 763 */                       if (fk0Var.collect(c2186sm, this) == z10Var) {
/* 765 */                           return z10Var;
                                }
                            } else {
/* 733 */                       if (i3 != 1) {
/* 739 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 9 */                             return null;
                                }
/* 735 */                       pg3.m7417A(obj);
                            }
/* 767 */                   return Unit.f12910a;
                        case 1:
/* 689 */                   z10 z10Var2 = z10.f19902a;
/* 691 */                   int i4 = this.f17179b;
/* 693 */                   if (i4 == 0) {
/* 705 */                       pg3.m7417A(obj);
/* 710 */                       xx1 xx1Var = (xx1) this.f17180c;
/* 714 */                       this.f17179b = 1;
/* 720 */                       if (((AbstractC0155at) obj2).mo1162a(xx1Var, this) == z10Var2) {
/* 722 */                           return z10Var2;
                                }
                            } else {
/* 695 */                       if (i4 != 1) {
/* 701 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 9 */                             return null;
                                }
/* 697 */                       pg3.m7417A(obj);
                            }
/* 724 */                   return Unit.f12910a;
                        case 2:
/* 644 */                   z10 z10Var3 = z10.f19902a;
/* 646 */                   int i5 = this.f17179b;
/* 648 */                   if (i5 == 0) {
/* 660 */                       pg3.m7417A(obj);
/* 665 */                       hk0 hk0Var = (hk0) this.f17180c;
/* 669 */                       this.f17179b = 1;
/* 673 */                       Object objCollect = ((C0192bt) obj2).f2592d.collect(hk0Var, this);
/* 677 */                       if (objCollect != z10Var3) {
/* 680 */                           objCollect = Unit.f12910a;
                                }
/* 682 */                       if (objCollect == z10Var3) {
/* 684 */                           return z10Var3;
                                }
                            } else {
/* 650 */                       if (i5 != 1) {
/* 656 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 9 */                             return null;
                                }
/* 652 */                       pg3.m7417A(obj);
                            }
/* 686 */                   return Unit.f12910a;
                        case 3:
/* 606 */                   z10 z10Var4 = z10.f19902a;
/* 608 */                   int i6 = this.f17179b;
/* 610 */                   if (i6 == 0) {
/* 622 */                       pg3.m7417A(obj);
/* 627 */                       k40 k40Var = (k40) this.f17180c;
/* 631 */                       this.f17179b = 1;
/* 637 */                       if (yy1.m10209a((List) obj2, k40Var, this) == z10Var4) {
/* 639 */                           return z10Var4;
                                }
                            } else {
/* 612 */                       if (i6 != 1) {
/* 618 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 9 */                             return null;
                                }
/* 614 */                       pg3.m7417A(obj);
                            }
/* 641 */                   return Unit.f12910a;
                        case 4:
/* 568 */                   z10 z10Var5 = z10.f19902a;
/* 570 */                   int i7 = this.f17179b;
/* 572 */                   if (i7 != 0) {
/* 574 */                       if (i7 == 1) {
/* 576 */                           pg3.m7417A(obj);
/* 605 */                           return obj;
                                }
/* 580 */                       f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 9 */                         return null;
                            }
/* 585 */                   pg3.m7417A(obj);
/* 590 */                   Function2 function2 = (Function2) this.f17180c;
/* 594 */                   Object obj3 = ((x30) obj2).f18924b;
/* 596 */                   this.f17179b = 1;
/* 598 */                   Object objInvoke = function2.invoke(obj3, this);
                            return objInvoke == z10Var5 ? z10Var5 : objInvoke;
                        case 5:
/* 530 */                   z10 z10Var6 = z10.f19902a;
/* 532 */                   int i8 = this.f17179b;
/* 534 */                   if (i8 == 0) {
/* 546 */                       pg3.m7417A(obj);
/* 551 */                       kh1 kh1Var = (kh1) this.f17180c;
/* 555 */                       this.f17179b = 1;
/* 561 */                       if (b50.m1281c((b50) obj2, kh1Var, this) == z10Var6) {
/* 563 */                           return z10Var6;
                                }
                            } else {
/* 536 */                       if (i8 != 1) {
/* 542 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 9 */                             return null;
                                }
/* 538 */                       pg3.m7417A(obj);
                            }
/* 565 */                   return Unit.f12910a;
                        case 6:
/* 465 */                   il0 il0Var = (il0) this.f17180c;
/* 467 */                   z10 z10Var7 = z10.f19902a;
/* 469 */                   int i9 = this.f17179b;
/* 471 */                   if (i9 == 0) {
/* 483 */                       pg3.m7417A(obj);
/* 497 */                       wc0 wc0Var = new wc0(7, il0Var.f9703a.m8894I((Activity) obj2), il0Var);
/* 502 */                       if (!(wc0Var instanceof pg2)) {
                                    i90Var = wc0Var;
/* 507 */                           i90Var = new i90(wc0Var);
                                }
                                i90Var = wc0Var;
/* 514 */                       C2186sm c2186sm2 = new C2186sm(il0Var, 4);
/* 517 */                       this.f17179b = 1;
/* 523 */                       if (i90Var.collect(c2186sm2, this) == z10Var7) {
/* 525 */                           return z10Var7;
                                }
                            } else {
/* 473 */                       if (i9 != 1) {
/* 479 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 9 */                             return null;
                                }
/* 475 */                       pg3.m7417A(obj);
                            }
/* 527 */                   return Unit.f12910a;
                        case 7:
/* 423 */                   z10 z10Var8 = z10.f19902a;
/* 425 */                   int i10 = this.f17179b;
/* 427 */                   if (i10 == 0) {
/* 439 */                       pg3.m7417A(obj);
/* 450 */                       this.f17179b = 1;
/* 456 */                       if (((pd1) this.f17180c).f15072a.m8146i((Uri) obj2, this) == z10Var8) {
/* 458 */                           return z10Var8;
                                }
                            } else {
/* 429 */                       if (i10 != 1) {
/* 435 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 9 */                             return null;
                                }
/* 431 */                       pg3.m7417A(obj);
                            }
/* 460 */                   return Unit.f12910a;
                        case 8:
/* 385 */                   z10 z10Var9 = z10.f19902a;
/* 387 */                   int i11 = this.f17179b;
/* 389 */                   if (i11 == 0) {
/* 401 */                       pg3.m7417A(obj);
/* 410 */                       this.f17179b = 1;
/* 416 */                       if (((SharedDataWhitelist) this.f17180c).saveToPersistentStorage((JSONObject) obj2, this) == z10Var9) {
/* 418 */                           return z10Var9;
                                }
                            } else {
/* 391 */                       if (i11 != 1) {
/* 397 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 9 */                             return null;
                                }
/* 393 */                       pg3.m7417A(obj);
                            }
/* 420 */                   return Unit.f12910a;
                        case 9:
/* 270 */                   ra2 ra2Var = (ra2) obj2;
/* 272 */                   z10 z10Var10 = z10.f19902a;
/* 274 */                   int i12 = this.f17179b;
/* 277 */                   if (i12 == 0) {
/* 299 */                       pg3.m7417A(obj);
/* 314 */                       if (((AtomicInteger) ((qc3) ra2Var.f15958d).f15492b).get() <= 0) {
/* 381 */                           f42.m3656l("Check failed.");
/* 9 */                             return null;
                                }
/* 324 */                       hu0.m4328W(((y10) ra2Var.f15955a).mo4406c());
/* 330 */                       c2223tm = (C2223tm) ra2Var.f15956b;
/* 334 */                       C2554zk c2554zk = (C2554zk) ra2Var.f15957c;
/* 336 */                       this.f17180c = c2223tm;
/* 338 */                       this.f17179b = 1;
/* 340 */                       c2554zk.getClass();
/* 343 */                       obj = C2554zk.m10367B(c2554zk, this);
/* 347 */                       if (obj != z10Var10) {
/* 350 */                           this.f17180c = null;
/* 352 */                           this.f17179b = 2;
                                    break;
                                }
/* 360 */                       return z10Var10;
                            }
/* 279 */                   if (i12 == 1) {
/* 293 */                       c2223tm = (C2223tm) this.f17180c;
/* 295 */                       pg3.m7417A(obj);
/* 350 */                       this.f17180c = null;
/* 352 */                       this.f17179b = 2;
                            } else {
/* 281 */                       if (i12 != 2) {
/* 287 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 9 */                             return null;
                                }
/* 283 */                       pg3.m7417A(obj);
                            }
                            break;
/* 374 */                   if (((AtomicInteger) ((qc3) ra2Var.f15958d).f15492b).decrementAndGet() == 0) {
/* 376 */                       return Unit.f12910a;
                            }
/* 324 */                   hu0.m4328W(((y10) ra2Var.f15955a).mo4406c());
/* 330 */                   c2223tm = (C2223tm) ra2Var.f15956b;
/* 334 */                   C2554zk c2554zk2 = (C2554zk) ra2Var.f15957c;
/* 336 */                   this.f17180c = c2223tm;
/* 338 */                   this.f17179b = 1;
/* 340 */                   c2554zk2.getClass();
/* 343 */                   obj = C2554zk.m10367B(c2554zk2, this);
/* 347 */                   if (obj != z10Var10) {
/* 350 */                       this.f17180c = null;
/* 352 */                       this.f17179b = 2;
                                break;
                            }
/* 360 */                   return z10Var10;
                        case 10:
/* 234 */                   z10 z10Var11 = z10.f19902a;
/* 236 */                   int i13 = this.f17179b;
/* 238 */                   if (i13 == 0) {
/* 250 */                       pg3.m7417A(obj);
/* 253 */                       Object obj4 = this.f17180c;
/* 257 */                       this.f17179b = 1;
/* 263 */                       if (((hk0) obj2).emit(obj4, this) == z10Var11) {
/* 265 */                           return z10Var11;
                                }
                            } else {
/* 240 */                       if (i13 != 1) {
/* 246 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 9 */                             return null;
                                }
/* 242 */                       pg3.m7417A(obj);
                            }
/* 267 */                   return Unit.f12910a;
                        case 11:
/* 90 */                    a13 a13Var = (a13) obj2;
/* 94 */                    se0 se0Var = (se0) this.f17180c;
/* 96 */                    z10 z10Var12 = z10.f19902a;
/* 98 */                    int i14 = this.f17179b;
/* 100 */                   if (i14 == 0) {
/* 117 */                       pg3.m7417A(obj);
/* 126 */                       C0835d8 c0835d8 = (C0835d8) se0Var.f16548a;
/* 128 */                       c0835d8.m2960d(se0Var.m8488c());
/* 139 */                       c0835d8.m2957a(se0Var.m8486a(), se0Var.m8488c());
/* 142 */                       this.f17179b = 1;
/* 144 */                       objM33n = a13Var.m33n(false, this);
/* 148 */                       if (objM33n == z10Var12) {
/* 150 */                           return z10Var12;
                                }
                            } else {
/* 102 */                       if (i14 != 1) {
/* 112 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 9 */                             return null;
                                }
/* 104 */                       pg3.m7417A(obj);
/* 109 */                       objM33n = ((o42) obj).f14613a;
                            }
/* 160 */                   boolean zIsCancelled = hu0.m4335d0(getContext()).isCancelled();
/* 164 */                   m42 m42Var = o42.f14612b;
/* 168 */                   if (!(objM33n instanceof n42) && !zIsCancelled) {
/* 172 */                       e03 e03Var = e03.f7466a;
/* 174 */                       e03.m3288d(a13Var);
/* 185 */                       ((C0835d8) se0Var.f16548a).m2960d(se0Var.m8488c());
/* 188 */                       return Unit.f12910a;
                            }
/* 191 */                   e03 e03Var2 = e03.f7466a;
/* 197 */                   vz2 vz2VarM3286b = e03.m3286b(o42.m7099a(objM33n));
/* 201 */                   fb1 fb1VarM3289e = e03.m3289e();
/* 205 */                   if (fb1VarM3289e != null) {
/* 214 */                       fb1VarM3289e.m3699e().mo2908c("Usercentrics SDK was not able to initialize online, let's try to initialize offline", vz2VarM3286b);
/* 228 */                       fb1VarM3289e.m3696b().m9743b(new C2223tm(fb1VarM3289e, vz2VarM3286b, c10Var, 12));
                            }
/* 231 */                   return Unit.f12910a;
                        default:
/* 13 */                    z10 z10Var13 = z10.f19902a;
/* 15 */                    int i15 = this.f17179b;
/* 17 */                    if (i15 == 0) {
/* 29 */                        pg3.m7417A(obj);
/* 42 */                        se0 se0Var2 = (se0) ((fb1) this.f17180c).f8082T.getValue();
/* 50 */                        C0835d8 c0835d9 = (C0835d8) se0Var2.f16548a;
/* 52 */                        c0835d9.m2960d(se0Var2.m8486a());
/* 63 */                        c0835d9.m2957a(se0Var2.m8488c(), se0Var2.m8486a());
/* 70 */                        c0835d9.m2960d(se0Var2.m8488c());
/* 73 */                        e03 e03Var3 = e03.f7466a;
/* 77 */                        this.f17179b = 1;
/* 83 */                        if (e03.m3285a((vz2) obj2, this) == z10Var13) {
/* 85 */                            return z10Var13;
                                }
                            } else {
/* 19 */                        if (i15 != 1) {
/* 25 */                            f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 9 */                             return null;
                                }
/* 21 */                        pg3.m7417A(obj);
                            }
/* 87 */                    return Unit.f12910a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 11 */        public /* synthetic */ C2223tm(Object obj, c10 c10Var, int i) {
                    super(2, c10Var);
/* 12 */            this.f17178a = i;
                    this.f17181d = obj;
                }
            }
