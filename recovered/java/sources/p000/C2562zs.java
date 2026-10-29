            package p000;

            import android.app.Activity;
            import android.net.Uri;
            import android.view.InputEvent;
            import com.usercentrics.sdk.p008ui.components.UCImageView;
            import java.util.List;
            import java.util.Map;
            import java.util.concurrent.atomic.AtomicInteger;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.coroutines.CoroutineContext;
            import kotlin.jvm.functions.Function2;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: renamed from: zs */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class C2562zs extends tj2 implements Function2 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f20313a;

                /* JADX INFO: renamed from: b */
                public int f20314b;

                /* JADX INFO: renamed from: c */
                public Object f20315c;

                /* JADX INFO: renamed from: d */
                public Object f20316d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Object f20317e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ C2562zs(Object obj, Object obj2, Object obj3, c10 c10Var, int i) {
/* 10 */            super(2, c10Var);
/* 1 */             this.f20313a = i;
/* 3 */             this.f20315c = obj;
/* 5 */             this.f20316d = obj2;
/* 7 */             this.f20317e = obj3;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 1 */             int i = this.f20313a;
/* 3 */             Object obj2 = this.f20317e;
                    switch (i) {
                        case 0:
/* 159 */                   C2562zs c2562zs = new C2562zs((hk0) this.f20316d, (AbstractC0155at) obj2, c10Var, 0);
/* 162 */                   c2562zs.f20315c = obj;
/* 164 */                   return c2562zs;
                        case 1:
/* 143 */                   C2562zs c2562zs2 = new C2562zs((b50) obj2, c10Var);
/* 146 */                   c2562zs2.f20315c = obj;
/* 148 */                   return c2562zs2;
                        case 2:
/* 132 */                   C2562zs c2562zs3 = new C2562zs((b50) this.f20316d, (Function2) obj2, c10Var, 2);
/* 135 */                   c2562zs3.f20315c = obj;
/* 137 */                   return c2562zs3;
                        case 3:
/* 118 */                   return new C2562zs((x80) this.f20315c, (Function2) this.f20316d, (C0875ec) obj2, c10Var, 3);
                        case 4:
/* 97 */                    return new C2562zs((x80) this.f20315c, (C2223tm) this.f20316d, (C0875ec) obj2, c10Var, 4);
                        case 5:
/* 76 */                    return new C2562zs((pd1) this.f20315c, (Uri) this.f20316d, (InputEvent) obj2, c10Var, 5);
                        case 6:
/* 55 */                    return new C2562zs((UCImageView) this.f20316d, (String) obj2, c10Var, 6);
                        case 7:
/* 41 */                    return new C2562zs((jc2) this.f20315c, (a13) this.f20316d, (String) obj2, c10Var, 7);
                        default:
/* 18 */                    C2562zs c2562zs4 = new C2562zs((ts0) this.f20316d, (Activity) obj2, c10Var, 8);
/* 21 */                    c2562zs4.f20315c = obj;
/* 23 */                    return c2562zs4;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.f20313a) {
                        case 0:
/* 154 */                   return ((C2562zs) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 1:
/* 137 */                   return ((C2562zs) create((hk0) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 2:
/* 120 */                   return ((C2562zs) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 3:
/* 103 */                   return ((C2562zs) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 4:
/* 86 */                    return ((C2562zs) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 5:
/* 69 */                    return ((C2562zs) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 6:
/* 52 */                    return ((C2562zs) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        case 7:
/* 35 */                    return ((C2562zs) create((y80) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                        default:
/* 18 */                    return ((C2562zs) create((xx1) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                    }
                }

                /* JADX WARN: Code duplicated, block: B:146:0x02d4  */
                /* JADX WARN: Code duplicated, block: B:149:0x02db  */
                /* JADX WARN: Code duplicated, block: B:153:0x02e4  */
                /* JADX WARN: Code duplicated, block: B:55:0x00f5  */
                /* JADX WARN: Code duplicated, block: B:56:0x00fc  */
                /* JADX WARN: Code duplicated, block: B:59:0x0105  */
                /* JADX WARN: Code duplicated, block: B:62:0x0110  */
                /* JADX WARN: Code restructure failed: missing block: B:150:0x02dd, code lost:
                
                    if (r11 == r0) goto L151;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
                
                    if (r11 == r1) goto L28;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:60:0x010d, code lost:
                
                    if (com.usercentrics.sdk.p008ui.components.UCImageView.m2792f(r0, r4, r3, r11) == r8) goto L64;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:63:0x0118, code lost:
                
                    if (com.usercentrics.sdk.p008ui.components.UCImageView.m2791e(r0, r4, r3, r11) == r8) goto L64;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    hk0 hk0Var;
                    Object obj2;
                    lk0 lk0Var;
                    Object objCollect;
                    ev2 ev2Var;
                    List list;
                    String str;
                    Object objM5782h;
                    Object objM20e;
/* 1 */             int i = this.f20313a;
/* 3 */             int i2 = 4;
/* 4 */             int i3 = 3;
/* 5 */             int i4 = 2;
/* 6 */             Object obj3 = this.f20317e;
/* 10 */            int i5 = 1;
/* 11 */            c10 c10Var = null;
                    switch (i) {
                        case 0:
/* 757 */                   Object obj4 = z10.f19902a;
/* 759 */                   int i6 = this.f20314b;
/* 761 */                   if (i6 == 0) {
/* 773 */                       pg3.m7417A(obj);
/* 778 */                       y10 y10Var = (y10) this.f20315c;
/* 782 */                       hk0 hk0Var2 = (hk0) this.f20316d;
/* 784 */                       AbstractC0155at abstractC0155at = (AbstractC0155at) obj3;
/* 786 */                       CoroutineContext coroutineContext = abstractC0155at.f2086a;
/* 788 */                       int i7 = abstractC0155at.f2087b;
/* 791 */                       if (i7 == -3) {
/* 793 */                           i7 = -2;
                                }
/* 794 */                       EnumC2464xk enumC2464xk = abstractC0155at.f2088c;
/* 796 */                       b20 b20Var = b20.f2176b;
/* 800 */                       Function2 c2223tm = new C2223tm(abstractC0155at, c10Var, i5);
/* 813 */                       xx1 xx1Var = new xx1(j13.m5653o(y10Var, coroutineContext), hu0.m4311F(i7, enumC2464xk, 4));
/* 816 */                       xx1Var.m4405W(b20Var, xx1Var, c2223tm);
/* 819 */                       this.f20314b = 1;
/* 821 */                       Object objM7906q = qj3.m7906q(hk0Var2, xx1Var, true, this);
/* 825 */                       if (objM7906q != obj4) {
/* 828 */                           objM7906q = Unit.f12910a;
                                }
/* 830 */                       if (objM7906q == obj4) {
/* 832 */                           return obj4;
                                }
                            } else {
/* 763 */                       if (i6 != 1) {
/* 769 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 765 */                       pg3.m7417A(obj);
                            }
/* 834 */                   return Unit.f12910a;
                        case 1:
/* 544 */                   b50 b50Var = (b50) obj3;
/* 546 */                   z10 z10Var = z10.f19902a;
/* 548 */                   int i8 = this.f20314b;
/* 550 */                   if (i8 == 0) {
/* 589 */                       pg3.m7417A(obj);
/* 594 */                       hk0 hk0Var3 = (hk0) this.f20315c;
/* 596 */                       this.f20315c = hk0Var3;
/* 598 */                       this.f20314b = 1;
/* 611 */                       Object objM4422D = i13.m4422D(b50Var.f2218c.mo4406c(), new n40(b50Var, c10Var, i4), this);
/* 615 */                       if (objM4422D != z10Var) {
/* 619 */                           hk0Var = hk0Var3;
/* 620 */                           obj = objM4422D;
                                }
/* 736 */                       return z10Var;
                            }
/* 552 */                   if (i8 != 1) {
/* 554 */                       if (i8 == 2) {
/* 570 */                           obj2 = (x30) this.f20316d;
/* 574 */                           hk0Var = (hk0) this.f20315c;
/* 576 */                           pg3.m7417A(obj);
/* 712 */                           lk0Var = new lk0(new d52(new wc0(5, new wc0(6, new wc0(i2, new n40(b50Var, c10Var, 0), (rg2) b50Var.f2223h.f8789a), new C1929mj(i4, c10Var)), new C2107qh(obj2, c10Var, i3))), new o40(b50Var, (c10) null));
/* 715 */                           this.f20315c = null;
/* 717 */                           this.f20316d = null;
/* 719 */                           this.f20314b = 3;
/* 723 */                           if (!(hk0Var instanceof go2)) {
/* 745 */                               throw ((go2) hk0Var).f8754a;
                                    }
/* 725 */                           objCollect = lk0Var.collect(hk0Var, this);
/* 729 */                           if (objCollect != z10Var) {
/* 732 */                               objCollect = Unit.f12910a;
                                    }
                                } else {
/* 556 */                           if (i8 != 3) {
/* 563 */                               f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 11 */                                return null;
                                    }
/* 558 */                           pg3.m7417A(obj);
                                }
                                break;
                            } else {
/* 582 */                       hk0 hk0Var4 = (hk0) this.f20315c;
/* 584 */                       pg3.m7417A(obj);
/* 587 */                       hk0Var = hk0Var4;
                            }
/* 738 */                   return Unit.f12910a;
/* 622 */                   obj2 = (og2) obj;
/* 626 */                   if (obj2 instanceof x30) {
/* 629 */                       x30 x30Var = (x30) obj2;
/* 631 */                       Object obj5 = x30Var.f18924b;
/* 633 */                       this.f20315c = hk0Var;
/* 635 */                       this.f20316d = x30Var;
/* 637 */                       this.f20314b = 2;
/* 643 */                       if (hk0Var.emit(obj5, this) != z10Var) {
                                }
/* 736 */                       return z10Var;
                            }
/* 648 */                   if (obj2 instanceof hx2) {
/* 753 */                       f42.m3656l("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
/* 11 */                        return null;
                            }
/* 652 */                   if (obj2 instanceof v02) {
/* 750 */                       throw ((v02) obj2).f17824b;
                            }
/* 656 */                   if (obj2 instanceof mi0) {
/* 658 */                       return Unit.f12910a;
                            }
/* 712 */                   lk0Var = new lk0(new d52(new wc0(5, new wc0(6, new wc0(i2, new n40(b50Var, c10Var, 0), (rg2) b50Var.f2223h.f8789a), new C1929mj(i4, c10Var)), new C2107qh(obj2, c10Var, i3))), new o40(b50Var, (c10) null));
/* 715 */                   this.f20315c = null;
/* 717 */                   this.f20316d = null;
/* 719 */                   this.f20314b = 3;
/* 723 */                   if (!(hk0Var instanceof go2)) {
/* 745 */                       throw ((go2) hk0Var).f8754a;
                            }
/* 725 */                   objCollect = lk0Var.collect(hk0Var, this);
/* 729 */                   if (objCollect != z10Var) {
/* 732 */                       objCollect = Unit.f12910a;
                            }
                            break;
                            break;
                        case 2:
/* 418 */                   b50 b50Var2 = (b50) this.f20316d;
/* 420 */                   z10 z10Var2 = z10.f19902a;
/* 422 */                   int i9 = this.f20314b;
/* 424 */                   if (i9 == 0) {
/* 438 */                       pg3.m7417A(obj);
/* 443 */                       y10 y10Var2 = (y10) this.f20315c;
/* 447 */                       C1869kx c1869kx = new C1869kx();
/* 464 */                       kh1 kh1Var = new kh1((Function2) obj3, c1869kx, b50Var2.f2223h.m4001r(), y10Var2.mo4406c());
/* 467 */                       ra2 ra2Var = b50Var2.f2227l;
/* 473 */                       Object objMo6629e = ((C2554zk) ra2Var.f15957c).mo6629e(kh1Var);
/* 479 */                       if (objMo6629e instanceof C0855dt) {
/* 483 */                           Throwable th = ((C0855dt) objMo6629e).f7403a;
/* 485 */                           if (th == null) {
/* 494 */                               throw new C0822cw("Channel was closed normally");
                                    }
/* 494 */                           throw th;
                                }
/* 497 */                       if (!(objMo6629e instanceof C0892et)) {
/* 511 */                           if (((AtomicInteger) ((qc3) ra2Var.f15958d).f15492b).getAndIncrement() == 0) {
/* 524 */                               i13.m4443w((y10) ra2Var.f15955a, null, new C2223tm(ra2Var, c10Var, 9), 3);
                                    }
/* 527 */                           this.f20314b = 1;
/* 529 */                           Object objM10250i = c1869kx.m10250i(this);
                                    return objM10250i == z10Var2 ? z10Var2 : objM10250i;
                                }
/* 539 */                       f42.m3656l("Check failed.");
                            } else {
/* 426 */                       if (i9 == 1) {
/* 428 */                           pg3.m7417A(obj);
/* 543 */                           return obj;
                                }
/* 433 */                       f42.m3656l("call to 'resume' before 'invoke' with coroutine");
                            }
/* 11 */                    return null;
                        case 3:
/* 374 */                   z10 z10Var3 = z10.f19902a;
/* 376 */                   int i10 = this.f20314b;
/* 378 */                   if (i10 == 0) {
/* 390 */                       pg3.m7417A(obj);
/* 403 */                       this.f20314b = 1;
/* 409 */                       if (x80.m9742a((x80) this.f20315c, (Function2) this.f20316d, (C0875ec) obj3, this) == z10Var3) {
/* 411 */                           return z10Var3;
                                }
                            } else {
/* 380 */                       if (i10 != 1) {
/* 386 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 382 */                       pg3.m7417A(obj);
                            }
/* 413 */                   return Unit.f12910a;
                        case 4:
/* 332 */                   z10 z10Var4 = z10.f19902a;
/* 334 */                   int i11 = this.f20314b;
/* 336 */                   if (i11 == 0) {
/* 348 */                       pg3.m7417A(obj);
/* 361 */                       this.f20314b = 1;
/* 367 */                       if (x80.m9742a((x80) this.f20315c, (C2223tm) this.f20316d, (C0875ec) obj3, this) == z10Var4) {
/* 369 */                           return z10Var4;
                                }
                            } else {
/* 338 */                       if (i11 != 1) {
/* 344 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 340 */                       pg3.m7417A(obj);
                            }
/* 371 */                   return Unit.f12910a;
                        case 5:
/* 288 */                   z10 z10Var5 = z10.f19902a;
/* 290 */                   int i12 = this.f20314b;
/* 292 */                   if (i12 == 0) {
/* 304 */                       pg3.m7417A(obj);
/* 319 */                       this.f20314b = 1;
/* 325 */                       if (((pd1) this.f20315c).f15072a.m8145f((Uri) this.f20316d, (InputEvent) obj3, this) == z10Var5) {
/* 327 */                           return z10Var5;
                                }
                            } else {
/* 294 */                       if (i12 != 1) {
/* 300 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 296 */                       pg3.m7417A(obj);
                            }
/* 329 */                   return Unit.f12910a;
                        case 6:
/* 160 */                   UCImageView uCImageView = (UCImageView) this.f20316d;
/* 162 */                   String str2 = (String) obj3;
/* 164 */                   z10 z10Var6 = z10.f19902a;
/* 166 */                   int i13 = this.f20314b;
/* 168 */                   if (i13 == 0) {
/* 201 */                       pg3.m7417A(obj);
/* 204 */                       this.f20314b = 1;
/* 206 */                       obj = UCImageView.m2790d(uCImageView, str2, this);
/* 210 */                       if (obj != z10Var6) {
                                }
/* 283 */                       return z10Var6;
                            }
/* 170 */                   if (i13 != 1) {
/* 172 */                       if (i13 == 2) {
/* 191 */                           ev2Var = (ev2) this.f20315c;
/* 193 */                           pg3.m7417A(obj);
/* 232 */                           Map map = ev2Var.f7897b;
/* 234 */                           byte[] bArr = ev2Var.f7896a;
/* 242 */                           list = (List) map.get("content-type");
/* 244 */                           if (list != null) {
/* 250 */                               str = (String) CollectionsKt.firstOrNull(list);
                                    } else {
/* 253 */                               str = null;
                                    }
/* 260 */                           if (Intrinsics.m6216a(str, "image/svg+xml")) {
/* 273 */                               this.f20315c = null;
/* 275 */                               this.f20314b = 4;
                                    } else {
/* 262 */                               this.f20315c = null;
/* 264 */                               this.f20314b = 3;
                                    }
                                } else {
/* 174 */                           if (i13 != 3 && i13 != 4) {
/* 179 */                               f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 11 */                                return null;
                                    }
/* 184 */                           pg3.m7417A(obj);
                                }
                                break;
                            } else {
/* 197 */                       pg3.m7417A(obj);
                            }
/* 285 */                   return Unit.f12910a;
/* 213 */                   ev2 ev2Var2 = (ev2) obj;
/* 215 */                   if (ev2Var2 == null) {
/* 217 */                       return Unit.f12910a;
                            }
/* 220 */                   this.f20315c = ev2Var2;
/* 222 */                   this.f20314b = 2;
/* 228 */                   if (w11.m9415Y(this) != z10Var6) {
/* 231 */                       ev2Var = ev2Var2;
/* 232 */                       Map map2 = ev2Var.f7897b;
/* 234 */                       byte[] bArr2 = ev2Var.f7896a;
/* 242 */                       list = (List) map2.get("content-type");
/* 244 */                       if (list != null) {
/* 250 */                           str = (String) CollectionsKt.firstOrNull(list);
                                } else {
/* 253 */                           str = null;
                                }
/* 260 */                       if (Intrinsics.m6216a(str, "image/svg+xml")) {
/* 273 */                           this.f20315c = null;
/* 275 */                           this.f20314b = 4;
                                } else {
/* 262 */                           this.f20315c = null;
/* 264 */                           this.f20314b = 3;
                                }
                                break;
                            }
/* 283 */                   return z10Var6;
                        case 7:
/* 81 */                    String str3 = (String) obj3;
/* 85 */                    a13 a13Var = (a13) this.f20316d;
/* 87 */                    z10 z10Var7 = z10.f19902a;
/* 89 */                    int i14 = this.f20314b;
/* 91 */                    if (i14 == 0) {
/* 117 */                       pg3.m7417A(obj);
/* 122 */                       jc2 jc2Var = (jc2) this.f20315c;
/* 124 */                       String str4 = a13Var.f32c;
/* 126 */                       this.f20314b = 1;
/* 128 */                       objM5782h = jc2Var.m5782h(str4, str3, this);
/* 132 */                       if (objM5782h != z10Var7) {
                                }
/* 149 */                       return z10Var7;
                            }
/* 93 */                    if (i14 == 1) {
/* 109 */                       pg3.m7417A(obj);
/* 114 */                       objM5782h = ((o42) obj).f14613a;
                            } else {
/* 95 */                        if (i14 != 2) {
/* 105 */                           f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 97 */                        pg3.m7417A(obj);
/* 102 */                       objM20e = ((o42) obj).f14613a;
                            }
/* 153 */                   return new o42(objM20e);
/* 135 */                   Throwable thM7099a = o42.m7099a(objM5782h);
/* 139 */                   if (thM7099a != null) {
/* 157 */                       throw thM7099a;
                            }
/* 141 */                   this.f20314b = 2;
/* 143 */                   objM20e = a13.m20e(a13Var, str3, this);
                            break;
                            break;
                        default:
/* 17 */                    ts0 ts0Var = (ts0) this.f20316d;
/* 19 */                    z10 z10Var8 = z10.f19902a;
/* 21 */                    int i15 = this.f20314b;
/* 23 */                    if (i15 == 0) {
/* 35 */                        pg3.m7417A(obj);
/* 40 */                        xx1 xx1Var2 = (xx1) this.f20315c;
/* 44 */                        dl0 dl0Var = new dl0(xx1Var2, 2);
/* 58 */                        ((m73) ts0Var.f17248a).mo4177a((Activity) obj3, new qd1(), dl0Var);
/* 65 */                        C1908lz c1908lz = new C1908lz(16, ts0Var, dl0Var);
/* 68 */                        this.f20314b = 1;
/* 74 */                        if (b40.m1220d(xx1Var2, c1908lz, this) == z10Var8) {
/* 76 */                            return z10Var8;
                                }
                            } else {
/* 25 */                        if (i15 != 1) {
/* 31 */                            f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 11 */                            return null;
                                }
/* 27 */                        pg3.m7417A(obj);
                            }
/* 78 */                    return Unit.f12910a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public /* synthetic */ C2562zs(Object obj, Object obj2, c10 c10Var, int i) {
                    super(2, c10Var);
/* 14 */            this.f20313a = i;
                    this.f20316d = obj;
                    this.f20317e = obj2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public C2562zs(b50 b50Var, c10 c10Var) {
                    super(2, c10Var);
                    this.f20313a = 1;
/* 15 */            this.f20317e = b50Var;
                }
            }
