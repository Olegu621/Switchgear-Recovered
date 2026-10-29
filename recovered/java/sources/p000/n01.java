            package p000;

            import android.content.Context;
            import android.view.Window;
            import androidx.recyclerview.widget.RecyclerView;
            import com.usercentrics.sdk.p008ui.R$style;
            import com.usercentrics.sdk.p008ui.secondLayer.component.header.UCSecondLayerHeader;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import java.util.Map;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class n01 extends vo0 implements Function1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14088a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ n01(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
/* 3 */             super(i, obj, cls, str, str2, i2);
/* 1 */             this.f14088a = i3;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Object obj2;
                    switch (this.f14088a) {
                        case 0:
/* 447 */                   ((hz0) this.receiver).mo277a((Throwable) obj);
                            break;
                        case 1:
/* 420 */                   Boolean bool = (Boolean) obj;
/* 422 */                   boolean zBooleanValue = bool.booleanValue();
/* 428 */                   yv1 yv1Var = (yv1) this.receiver;
/* 430 */                   yv1Var.setCurrentState(zBooleanValue);
/* 435 */                   yv1Var.f19819a.invoke(bool);
                            break;
                        case 2:
/* 405 */                   yu1 yu1Var = (yu1) obj;
/* 407 */                   yu1Var.getClass();
/* 414 */                   ((su2) this.receiver).m8641b(yu1Var);
                            break;
                        case 3:
/* 390 */                   yu1 yu1Var2 = (yu1) obj;
/* 392 */                   yu1Var2.getClass();
/* 399 */                   ((su2) this.receiver).m8641b(yu1Var2);
                            break;
                        case 4:
/* 347 */                   yu1 yu1Var3 = (yu1) obj;
/* 349 */                   yu1Var3.getClass();
/* 356 */                   yv2 yv2Var = ((qv2) this.receiver).f15783c;
/* 358 */                   int iOrdinal = yu1Var3.ordinal();
/* 362 */                   if (iOrdinal == 0) {
/* 384 */                       yv2Var.m10186c(kt2.f13003a);
                            } else if (iOrdinal == 1) {
/* 378 */                       yv2Var.m10186c(kt2.f13004b);
                            } else if (iOrdinal == 2) {
/* 372 */                       yv2Var.m10186c(kt2.f13006d);
                            }
                            break;
                        case 5:
/* 332 */                   String str = (String) obj;
/* 334 */                   str.getClass();
/* 341 */                   UCSecondLayerHeader.m2813j((UCSecondLayerHeader) this.receiver, str);
                            break;
                        case 6:
/* 156 */                   String str2 = (String) obj;
/* 158 */                   str2.getClass();
/* 163 */                   rv2 rv2Var = (rv2) this.receiver;
/* 171 */                   Iterator it = rv2Var.f16327e.entrySet().iterator();
/* 175 */                   int i = -1;
                            while (true) {
/* 180 */                       obj2 = null;
/* 181 */                       if (it.hasNext()) {
/* 183 */                           Object next = it.next();
/* 194 */                           kv2 kv2Var = (kv2) ((Map.Entry) next).getValue();
/* 196 */                           kv2Var.getClass();
/* 201 */                           Iterator it2 = kv2Var.f13025g.iterator();
/* 205 */                           int i2 = 0;
                                    while (true) {
/* 210 */                               if (it2.hasNext()) {
/* 216 */                                   qt2 qt2Var = (qt2) it2.next();
/* 225 */                                   st2 st2Var = qt2Var instanceof st2 ? (st2) qt2Var : null;
/* 236 */                                   if (!Intrinsics.m6216a(st2Var != null ? st2Var.f16774a : null, str2)) {
/* 239 */                                       i2++;
                                            }
                                        } else {
/* 242 */                                   i2 = -1;
                                        }
                                    }
/* 243 */                           if (i2 > -1) {
/* 245 */                               obj2 = next;
/* 246 */                               i = i2;
                                    } else {
/* 248 */                               i = i2;
                                    }
                                }
                            }
/* 250 */                   Map.Entry entry = (Map.Entry) obj2;
/* 252 */                   if (entry != null) {
/* 259 */                       RecyclerView recyclerView = (RecyclerView) entry.getKey();
/* 265 */                       kv2 kv2Var2 = (kv2) entry.getValue();
/* 273 */                       Integer num = (Integer) rv2Var.f16328f.get(kv2Var2);
/* 275 */                       if (num != null) {
/* 279 */                           rv2Var.f16324b.invoke(num);
/* 284 */                           rv2Var.f16325c.invoke();
/* 287 */                           LinkedHashSet linkedHashSet = kv2Var2.f13026h;
/* 289 */                           CollectionsKt.m6190I(linkedHashSet);
/* 292 */                           linkedHashSet.clear();
/* 295 */                           LinkedHashSet linkedHashSet2 = kv2Var2.f13026h;
/* 297 */                           Integer numValueOf = Integer.valueOf(i);
/* 301 */                           linkedHashSet2.getClass();
/* 304 */                           linkedHashSet2.add(numValueOf);
/* 307 */                           kv2Var2.m958d();
/* 317 */                           recyclerView.m875c0(kv2Var2.f13025g.size() - 1);
/* 326 */                           recyclerView.post(new RunnableC0923fn(recyclerView, i, 5));
                                }
                            }
                            break;
                        case 7:
/* 150 */                   wv2.m9649q((wv2) this.receiver, ((Number) obj).intValue());
                            break;
                        case 8:
/* 125 */                   String str3 = (String) obj;
/* 127 */                   str3.getClass();
/* 134 */                   mn0.m6707x((Context) this.receiver, str3);
                            break;
                        default:
/* 8 */                     tv1 tv1Var = (tv1) obj;
/* 10 */                    tv1Var.getClass();
/* 15 */                    yv2 yv2Var2 = (yv2) this.receiver;
/* 19 */                    ew2 ew2Var = yv2Var2.f19832k;
/* 21 */                    fu2 fu2Var = new fu2();
/* 24 */                    Context context = yv2Var2.f19822a;
/* 39 */                    v11 v11Var = new v11(0, fu2Var, fu2.class, "dismissDialog", "dismissDialog()V", 0, 4);
/* 42 */                    tv1Var.getClass();
/* 45 */                    ra2 ra2Var = new ra2();
/* 48 */                    ra2Var.f15955a = tv1Var;
/* 50 */                    ra2Var.f15956b = v11Var;
/* 58 */                    ra2Var.f15957c = r51.m8065b(C2498yh.f19626h0);
/* 71 */                    ra2Var.f15958d = r51.m8065b(new C0908f8(ra2Var, 13));
/* 82 */                    iu2 iu2Var = new iu2(new z00(context, R$style.BaseTheme), ew2Var, ra2Var);
/* 89 */                    C1954n7 c1954n7 = new C1954n7(context, R$style.DialogBaseTheme);
/* 94 */                    C1783j7 c1783j7 = (C1783j7) c1954n7.f14152c;
/* 96 */                    c1783j7.f12115k = true;
/* 98 */                    c1783j7.f12121q = iu2Var;
/* 100 */                   c1954n7.m6897b();
/* 103 */                   DialogInterfaceC1991o7 dialogInterfaceC1991o7M6897b = c1954n7.m6897b();
/* 107 */                   dialogInterfaceC1991o7M6897b.show();
/* 110 */                   Window window = dialogInterfaceC1991o7M6897b.getWindow();
/* 114 */                   if (window != null) {
/* 117 */                       window.setLayout(-1, -2);
                            }
/* 120 */                   fu2Var.f8359a = dialogInterfaceC1991o7M6897b;
                            break;
                    }
/* 122 */           return Unit.f12910a;
                }
            }
