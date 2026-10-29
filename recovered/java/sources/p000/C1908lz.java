            package p000;

            import android.content.Context;
            import androidx.core.widget.NestedScrollView;
            import com.supercell.titan.usercentrics.UsercentricsSDK;
            import com.usercentrics.sdk.UsercentricsOptions;
            import com.usercentrics.sdk.p008ui.R$id;
            import com.usercentrics.sdk.p008ui.secondLayer.component.footer.UCSecondLayerFooter;
            import com.usercentrics.sdk.p009v2.consent.data.SaveConsentsData;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFData;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function0;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import kotlinx.serialization.internal.EnumDescriptor;
            import okhttp3.HttpUrl;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: renamed from: lz */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 12 */    public final class C1908lz extends b51 implements Function0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13536a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f13537b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f13538c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1908lz(Throwable th, a13 a13Var, C0197bz c0197bz) {
/* 10 */            super(0);
/* 3 */             this.f13536a = 13;
/* 5 */             this.f13537b = th;
/* 7 */             this.f13538c = a13Var;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    i03 i03VarM3699e;
/* 1 */             int i = this.f13536a;
/* 3 */             int i2 = 4;
/* 4 */             Object[] objArr = 0;
/* 4 */             Object[] objArr2 = 0;
/* 5 */             int i3 = 1;
/* 6 */             Object[] objArr3 = 0;
/* 6 */             Object[] objArr4 = 0;
/* 7 */             Object obj = this.f13538c;
/* 9 */             Object obj2 = this.f13537b;
                    switch (i) {
                        case 0:
/* 588 */                   C1945mz c1945mz = (C1945mz) obj2;
/* 599 */                   c1945mz.f14069a.m9743b(new C1871kz(c1945mz, (SaveConsentsData) obj, objArr3 == true ? 1 : 0, i3));
/* 602 */                   return Unit.f12910a;
                        case 1:
/* 582 */                   ((C1983o) obj2).invoke((List) obj);
/* 585 */                   return Unit.f12910a;
                        case 2:
/* 555 */                   Enum[] enumArr = ((oe0) obj2).f14719a;
/* 558 */                   EnumDescriptor enumDescriptor = new EnumDescriptor((String) obj, enumArr.length);
/* 563 */                   for (Enum r0 : enumArr) {
/* 571 */                       enumDescriptor.m6270j(r0.name(), false);
                            }
/* 577 */                   return enumDescriptor;
                        case 3:
/* 475 */                   List<List> list = (List) obj2;
/* 477 */                   ew2 ew2Var = (ew2) obj;
/* 487 */                   ArrayList arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 498 */                   for (List<uu1> list2 : list) {
/* 512 */                       ArrayList arrayList2 = new ArrayList(C2122qw.m8020h(list2, 10));
/* 523 */                       for (uu1 uu1Var : list2) {
/* 533 */                           gt2.Companion.getClass();
/* 540 */                           arrayList2.add(ft2.m3835a(uu1Var, ew2Var));
                                }
/* 544 */                       arrayList.add(arrayList2);
                            }
/* 548 */                   return arrayList;
                        case 4:
/* 341 */                   su2 su2Var = (su2) obj2;
/* 345 */                   kt2 kt2Var = ((gt2) obj).f8815f;
/* 347 */                   ts0 ts0Var = su2Var.f16809g;
/* 349 */                   ac1 ac1Var = su2Var.f16805c;
/* 351 */                   ac1 ac1Var2 = su2Var.f16810h;
/* 353 */                   int iOrdinal = kt2Var.ordinal();
/* 357 */                   if (iOrdinal == 0) {
/* 469 */                       ts0Var.m8898g(he3.m4198u(ac1Var.m174c(wk2.FIRST_LAYER)));
                            } else if (iOrdinal == 1) {
/* 455 */                       ts0Var.m8898g(he3.m4198u(ac1Var.m178g(wk2.FIRST_LAYER, ac1Var2.m192y())));
                            } else if (iOrdinal != 2) {
/* 365 */                       if (iOrdinal == 3) {
/* 405 */                           su2Var.m8642c(null);
                                } else if (iOrdinal == 4) {
/* 401 */                           ts0Var.m8898g(he3.m4198u(Intrinsics.m6216a(su2Var.f16813k, Boolean.TRUE) ? ac1Var.m178g(wk2.FIRST_LAYER, ac1Var2.m192y()) : ac1Var.m174c(wk2.FIRST_LAYER)));
                                }
                            } else if (ac1Var2.m192y().isEmpty()) {
/* 419 */                       su2Var.m8642c(null);
                            } else {
/* 437 */                       ts0Var.m8898g(he3.m4198u(ac1Var.m169L(wk2.FIRST_LAYER, ac1Var2.m192y())));
                            }
/* 472 */                   return Unit.f12910a;
                        case 5:
/* 324 */                   NestedScrollView nestedScrollView = new NestedScrollView((Context) obj2, null);
/* 331 */                   nestedScrollView.setId(R$id.ucBannerFirstLayerScrollContainer);
/* 334 */                   ((qu2) obj).setOrientation(1);
/* 337 */                   nestedScrollView.setFillViewport(true);
/* 340 */                   return nestedScrollView;
                        case 6:
/* 279 */                   ft2 ft2Var = gt2.Companion;
/* 281 */                   su2 su2Var2 = (su2) obj2;
/* 291 */                   boolean z = ((ju2) su2Var2.f16824v.getValue()) != null;
/* 294 */                   gj0 gj0Var = (gj0) obj;
/* 298 */                   AbstractC1835kl abstractC1835kl = gj0Var != null ? gj0Var.f8632a : null;
/* 306 */                   List list3 = (List) su2Var2.f16817o.getValue();
/* 308 */                   ew2 ew2Var2 = su2Var2.f16807e;
/* 310 */                   ec0 ec0Var = su2Var2.f16806d;
/* 312 */                   ft2Var.getClass();
/* 315 */                   return ft2.m3836b(z, abstractC1835kl, list3, ew2Var2, ec0Var);
                        case 7:
/* 215 */                   su2 su2Var3 = (su2) obj;
/* 221 */                   hk2 hk2VarM8065b = r51.m8065b(new ru2(su2Var3, 5));
/* 230 */                   hk2 hk2VarM8065b2 = r51.m8065b(new ru2(su2Var3, i2));
/* 234 */                   yz2 yz2Var = (yz2) obj2;
/* 236 */                   if (yz2Var != null) {
/* 246 */                       return new ut0(yz2Var, (q82) hk2VarM8065b2.getValue());
                            }
/* 256 */                   if (((yz2) hk2VarM8065b.getValue()) == null) {
/* 6 */                         return null;
                            }
/* 264 */                   yz2 yz2Var2 = (yz2) hk2VarM8065b.getValue();
/* 266 */                   yz2Var2.getClass();
/* 275 */                   return new ut0(yz2Var2, (q82) hk2VarM8065b2.getValue());
                        case 8:
/* 191 */                   nv2 nv2Var = ((UCSecondLayerFooter) obj2).f6280l0;
/* 193 */                   if (nv2Var != null) {
/* 201 */                       nv2Var.f14481f.m10186c(((gt2) obj).f8815f);
/* 204 */                       return Unit.f12910a;
                            }
/* 209 */                   Intrinsics.m6220e("viewModel");
/* 212 */                   throw null;
                        case 9:
/* 183 */                   ((n01) ((we2) obj2).f18596c).invoke((String) obj);
/* 186 */                   return Unit.f12910a;
                        case 10:
/* 169 */                   ((n01) ((we2) obj2).f18595b).invoke((tv1) obj);
/* 172 */                   return Unit.f12910a;
                        case 11:
/* 132 */                   e03 e03Var = e03.f7466a;
/* 134 */                   fb1 fb1VarM3289e = e03.m3289e();
/* 138 */                   if (fb1VarM3289e != null && (i03VarM3699e = fb1VarM3289e.m3699e()) != null) {
/* 148 */                       i03VarM3699e.mo2908c("Initialize is being invoked more than once, make sure this is the intended behaviour.", null);
                            }
/* 155 */                   e03.m3287c((Context) obj, (UsercentricsOptions) obj2);
/* 158 */                   return Unit.f12910a;
                        case 12:
/* 126 */                   ((C1996oc) obj2).invoke(new tz2(new vz2(HttpUrl.FRAGMENT_ENCODE_SET, (Throwable) obj)));
/* 129 */                   return Unit.f12910a;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 90 */                    tz2 tz2Var = new tz2(new vz2("Clear User Session failed", (Throwable) obj2));
/* 101 */                   ((a13) obj).f30a.m3699e().mo2909d(tz2Var);
/* 1 */                     UsercentricsSDK.reset$lambda$22(tz2Var);
/* 107 */                   return Unit.f12910a;
                        case 14:
/* 73 */                    ((Function1) obj2).invoke((TCFData) obj);
/* 76 */                    return Unit.f12910a;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 32 */                    C2218th c2218th = (C2218th) ((C0168b5) obj2).f2215f;
/* 40 */                    C1983o c1983o = new C1983o((Function1) obj, 27);
/* 45 */                    k61 k61Var = c2218th.f17094b.f182c;
/* 63 */                    c2218th.f17100h.m9743b(new C2107qh(c2218th, k61Var, objArr4 == true ? 1 : 0, objArr2 == true ? 1 : 0)).m3370H(new C2181sh(objArr == true ? 1 : 0, c2218th, c1983o, k61Var));
/* 66 */                    return Unit.f12910a;
                        default:
/* 22 */                    ((m73) ((ts0) obj2).f17248a).mo4178b((dl0) obj);
/* 25 */                    return Unit.f12910a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 13 */        public C1908lz(gj0 gj0Var, yz2 yz2Var, su2 su2Var) {
                    super(0);
                    this.f13536a = 7;
/* 14 */            this.f13537b = yz2Var;
                    this.f13538c = su2Var;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
/* 14 */        public /* synthetic */ C1908lz(int i, Object obj, Object obj2) {
                    super(0);
/* 15 */            this.f13536a = i;
                    this.f13537b = obj;
                    this.f13538c = obj2;
                }
            }
