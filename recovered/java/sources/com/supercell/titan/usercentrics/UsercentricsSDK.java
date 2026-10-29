            package com.supercell.titan.usercentrics;

            import android.app.Activity;
            import android.os.Looper;
            import com.supercell.titan.usercentrics.UsercentricsSDK;
            import com.usercentrics.sdk.UsercentricsReadyStatus;
            import com.usercentrics.sdk.UsercentricsServiceConsent;
            import com.usercentrics.sdk.services.tcf.interfaces.IdAndName;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFData;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFPurpose;
            import com.usercentrics.sdk.services.tcf.interfaces.TCFVendor;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.Metadata;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.text.C1850c;
            import kotlin.text.StringsKt;
            import okhttp3.HttpUrl;
            import p000.AbstractC1835kl;
            import p000.C0168b5;
            import p000.C0995hl;
            import p000.C1031il;
            import p000.C1797jl;
            import p000.C1996oc;
            import p000.C2001oh;
            import p000.C2107qh;
            import p000.C2122qw;
            import p000.C2181sh;
            import p000.C2218th;
            import p000.C2484y3;
            import p000.C2508yr;
            import p000.a13;
            import p000.ac2;
            import p000.c10;
            import p000.de3;
            import p000.ez2;
            import p000.fb1;
            import p000.fm0;
            import p000.g13;
            import p000.gj0;
            import p000.k61;
            import p000.kq0;
            import p000.m82;
            import p000.nz2;
            import p000.ra2;
            import p000.s03;
            import p000.sr2;
            import p000.sx0;
            import p000.tz2;
            import p000.u03;
            import p000.vz2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0086 J\t\u0010\u000b\u001a\u00020\u0005H\u0086 J\t\u0010\f\u001a\u00020\u0005H\u0086 J\t\u0010\r\u001a\u00020\u0005H\u0086 J\u0016\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u001a\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J:\u0010\u0019\u001a\u00020\u00052\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u00182\b\u0010\u001f\u001a\u0004\u0018\u00010\u0018H\u0002J\u0006\u0010 \u001a\u00020\u0005¨\u0006\""}, m6176d2 = {"Lcom/supercell/titan/usercentrics/UsercentricsSDK;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "gotConsent", HttpUrl.FRAGMENT_ENCODE_SET, "consentJson", HttpUrl.FRAGMENT_ENCODE_SET, "didAnyConsentChangeToGiven", HttpUrl.FRAGMENT_ENCODE_SET, "isAnyConsentGiven", "gotFailure", "popupShowing", "popupClosed", "getConsentOrShowDialog", "activity", "Landroid/app/Activity;", "buttonLayout", HttpUrl.FRAGMENT_ENCODE_SET, "showDialog", "areAllTCFVendorPurposesConsented", "vendor", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFVendor;", "tcfData", "Lcom/usercentrics/sdk/services/tcf/interfaces/TCFData;", "applyConsent", "consentsBefore", HttpUrl.FRAGMENT_ENCODE_SET, "Lcom/usercentrics/sdk/UsercentricsServiceConsent;", "consentsAfter", "tcfDataBefore", "tcfDataAfter", "reset", "Companion", "usercentrics"}, m6177k = 1, m6178mv = {2, 2, 0}, m6180xi = 48)
            public final class UsercentricsSDK {
                private static final String TAG = "UsercentricsSDK";

                /* JADX WARN: Code duplicated, block: B:30:0x0058  */
                /* JADX WARN: Code duplicated, block: B:59:0x00b4  */
                /* JADX WARN: Code duplicated, block: B:67:0x00c5  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v3 */
                /* JADX WARN: Type inference failed for: r0v4 */
                /* JADX WARN: Type inference failed for: r0v5 */
                /* JADX WARN: Type inference failed for: r10v1 */
                /* JADX WARN: Type inference failed for: r10v2 */
                /* JADX WARN: Type inference failed for: r10v6 */
                /* JADX WARN: Type inference failed for: r12v1 */
                /* JADX WARN: Type inference failed for: r12v2 */
                /* JADX WARN: Type inference failed for: r12v3 */
                /* JADX WARN: Type inference failed for: r13v1 */
                /* JADX WARN: Type inference failed for: r13v2 */
                /* JADX WARN: Type inference failed for: r13v5 */
                /* JADX WARN: Type inference failed for: r4v22 */
                /* JADX WARN: Type inference failed for: r4v23 */
                /* JADX WARN: Type inference failed for: r4v27 */
                /* JADX WARN: Type inference failed for: r5v10 */
                /* JADX WARN: Type inference failed for: r5v13 */
                /* JADX WARN: Type inference failed for: r5v9 */
                private final void applyConsent(List<UsercentricsServiceConsent> consentsBefore, List<UsercentricsServiceConsent> consentsAfter, TCFData tcfDataBefore, TCFData tcfDataAfter) {
                    boolean zBooleanValue;
                    ?? r10;
                    Object next;
                    Boolean boolValueOf;
                    ?? r12;
                    ?? r0;
                    ?? r13;
                    List list;
                    List list2;
                    Object next2;
                    ?? r5;
                    ?? r4;
                    Boolean bool;
/* 2 */             boolean z = true;
/* 2 */             z = true;
/* 4 */             if (consentsAfter != null && consentsAfter.isEmpty()) {
/* 12 */                r10 = false;
                        break;
                    }
/* 14 */            Iterator it = consentsAfter.iterator();
                    while (true) {
/* 22 */                if (!it.hasNext()) {
/* 12 */                    r10 = false;
                            break;
                        }
/* 28 */                UsercentricsServiceConsent usercentricsServiceConsent = (UsercentricsServiceConsent) it.next();
/* 30 */                if (consentsBefore != null) {
/* 32 */                    Iterator it2 = consentsBefore.iterator();
/* 57 */                    do {
/* 40 */                        if (!it2.hasNext()) {
/* 60 */                            next = null;
                                    break;
                                }
/* 42 */                        next = it2.next();
/* 57 */                    } while (!Intrinsics.m6216a(((UsercentricsServiceConsent) next).f6064a, usercentricsServiceConsent.f6064a));
/* 61 */                    UsercentricsServiceConsent usercentricsServiceConsent2 = (UsercentricsServiceConsent) next;
/* 63 */                    if (usercentricsServiceConsent2 != null) {
/* 65 */                        boolean z2 = usercentricsServiceConsent2.f6065b;
/* 67 */                        boolean z3 = usercentricsServiceConsent.f6065b;
/* 76 */                        boolValueOf = Boolean.valueOf(z2 != z3 && z3);
                            } else {
/* 81 */                        boolValueOf = null;
                            }
/* 82 */                    if (boolValueOf != null) {
/* 84 */                        zBooleanValue = boolValueOf.booleanValue();
                            } else {
/* 89 */                        zBooleanValue = false;
                            }
                        } else {
/* 89 */                    zBooleanValue = false;
                        }
/* 90 */                if (zBooleanValue) {
/* 92 */                    r10 = true;
                            break;
                        }
                    }
/* 93 */            if (tcfDataBefore != null && tcfDataAfter != null && ((list2 = tcfDataAfter.f6165f) == null || !list2.isEmpty())) {
/* 110 */               Iterator it3 = list2.iterator();
                        while (true) {
/* 118 */                   if (!it3.hasNext()) {
/* 107 */                       r12 = false;
                                break;
                            }
/* 124 */                   TCFVendor tCFVendor = (TCFVendor) it3.next();
/* 128 */                   Iterator it4 = tcfDataBefore.f6165f.iterator();
/* 149 */                   do {
/* 136 */                       if (!it4.hasNext()) {
/* 152 */                           next2 = null;
                                    break;
                                }
/* 138 */                       next2 = it4.next();
/* 149 */                   } while (tCFVendor.f6209d != ((TCFVendor) next2).f6209d);
/* 153 */                   TCFVendor tCFVendor2 = (TCFVendor) next2;
/* 155 */                   boolean zAreAllTCFVendorPurposesConsented = areAllTCFVendorPurposesConsented(tCFVendor2, tcfDataBefore);
/* 159 */                   boolean zAreAllTCFVendorPurposesConsented2 = areAllTCFVendorPurposesConsented(tCFVendor, tcfDataAfter);
/* 163 */                   if (!zAreAllTCFVendorPurposesConsented) {
/* 181 */                       r5 = false;
                            } else if ((tCFVendor2 == null || (bool = tCFVendor2.f6206a) == null) ? false : bool.booleanValue()) {
/* 179 */                       r5 = true;
                            } else {
/* 181 */                       r5 = false;
                            }
/* 182 */                   if (zAreAllTCFVendorPurposesConsented2) {
/* 184 */                       Boolean bool2 = tCFVendor.f6206a;
/* 194 */                       if (bool2 != null ? bool2.booleanValue() : false) {
/* 196 */                           r4 = true;
                                } else {
/* 198 */                           r4 = false;
                                }
                            } else {
/* 198 */                       r4 = false;
                            }
/* 199 */                   if (r4 != r5 && r4 != false) {
/* 203 */                       r12 = true;
                                break;
                            }
                        }
                    } else {
/* 107 */               r12 = false;
                        break;
                    }
/* 206 */           ArrayList arrayList = new ArrayList();
/* 217 */           for (Object obj : consentsAfter) {
/* 228 */               if (!((UsercentricsServiceConsent) obj).f6070g) {
/* 230 */                   arrayList.add(obj);
                        }
                    }
/* 238 */           if (arrayList.isEmpty()) {
/* 240 */               r0 = false;
                        break;
                    }
/* 242 */           Iterator it5 = arrayList.iterator();
                    while (true) {
/* 250 */               if (it5.hasNext()) {
/* 260 */                   if (((UsercentricsServiceConsent) it5.next()).f6065b) {
/* 262 */                       r0 = true;
                                break;
                            }
                        } else {
/* 240 */                   r0 = false;
                            break;
                        }
                    }
/* 263 */           if (tcfDataAfter != null && (list = tcfDataAfter.f6165f) != null && !list.isEmpty()) {
/* 276 */               Iterator it6 = list.iterator();
                        while (true) {
/* 284 */                   if (!it6.hasNext()) {
/* 306 */                       r13 = false;
                                break;
                            }
/* 292 */                   Boolean bool3 = ((TCFVendor) it6.next()).f6206a;
/* 302 */                   if (bool3 != null ? bool3.booleanValue() : false) {
/* 304 */                       r13 = true;
                                break;
                            }
                        }
                    } else {
/* 306 */               r13 = false;
                        break;
                    }
                    final int i = z ? 1 : 0;
/* 327 */           String strM3784j = fm0.m3784j("[", CollectionsKt.m6203x(consentsAfter, ",", null, null, new Function1() { // from class: t03
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i) {
                                case 0:
/* 1 */                             return UsercentricsSDK.reset$lambda$21((UsercentricsReadyStatus) obj2);
                                default:
/* 1 */                             return UsercentricsSDK.applyConsent$lambda$20((UsercentricsServiceConsent) obj2);
                            }
                        }
                    }, 30), "]");
/* 338 */           boolean z4 = r10 == true || r12 == true;
/* 339 */           if (r0 == false && r13 == false) {
/* 344 */               z = false;
                    }
/* 345 */           gotConsent(strM3784j, z4, z);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final CharSequence applyConsent$lambda$20(UsercentricsServiceConsent usercentricsServiceConsent) {
/* 1 */             usercentricsServiceConsent.getClass();
/* 55 */            return C1850c.m6253b("\n\t\t\t\t{\n\t\t\t\t\t\"templateId\": \"" + usercentricsServiceConsent.f6064a + "\",\n\t\t\t\t\t\"status\": " + usercentricsServiceConsent.f6065b + ",\n\t\t\t\t\t\"isEssential\": " + usercentricsServiceConsent.f6070g + ",\n\t\t\t\t\t\"version\": \"" + usercentricsServiceConsent.f6069f + "\"\n\t\t\t\t}\n\t\t\t");
                }

                private final boolean areAllTCFVendorPurposesConsented(TCFVendor vendor, TCFData tcfData) {
                    ArrayList arrayList;
                    Object next;
                    Boolean bool;
                    List list;
/* 2 */             if (vendor == null || (list = vendor.f6214i) == null) {
/* 45 */                arrayList = null;
                    } else {
/* 16 */                arrayList = new ArrayList(C2122qw.m8020h(list, 10));
/* 19 */                Iterator it = list.iterator();
/* 27 */                while (it.hasNext()) {
/* 41 */                    arrayList.add(Integer.valueOf(((IdAndName) it.next()).f6157a));
                        }
                    }
/* 47 */            if (arrayList == null) {
/* 46 */                return false;
                    }
/* 54 */            if (arrayList.isEmpty()) {
/* 53 */                return true;
                    }
/* 57 */            Iterator it2 = arrayList.iterator();
/* 65 */            while (it2.hasNext()) {
/* 73 */                int iIntValue = ((Number) it2.next()).intValue();
/* 79 */                Iterator it3 = tcfData.f6161b.iterator();
/* 98 */                do {
/* 87 */                    if (!it3.hasNext()) {
/* 101 */                       next = null;
                                break;
                            }
/* 89 */                    next = it3.next();
/* 98 */                } while (((TCFPurpose) next).f6176c != iIntValue);
/* 102 */               TCFPurpose tCFPurpose = (TCFPurpose) next;
/* 116 */               if (!((tCFPurpose == null || (bool = tCFPurpose.f6178e) == null) ? false : bool.booleanValue())) {
/* 46 */                    return false;
                        }
                    }
/* 53 */            return true;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit getConsentOrShowDialog$lambda$0(UsercentricsSDK usercentricsSDK, Activity activity, int i, UsercentricsReadyStatus usercentricsReadyStatus) {
/* 1 */             usercentricsReadyStatus.getClass();
/* 6 */             if (usercentricsReadyStatus.f6059a) {
/* 8 */                 usercentricsSDK.showDialog(activity, i);
                    } else {
/* 15 */                usercentricsSDK.applyConsent(null, usercentricsReadyStatus.f6060b, null, null);
                    }
/* 18 */            return Unit.f12910a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit getConsentOrShowDialog$lambda$1(UsercentricsSDK usercentricsSDK, tz2 tz2Var) {
/* 1 */             tz2Var.getClass();
/* 4 */             usercentricsSDK.gotFailure();
/* 23 */            AbstractC1245n0.m4876d("UsercentricsSDK", "Not ready at getConsentOrShowDialog(). Reason: " + tz2Var);
/* 26 */            return Unit.f12910a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit reset$lambda$21(UsercentricsReadyStatus usercentricsReadyStatus) {
/* 1 */             usercentricsReadyStatus.getClass();
/* 4 */             return Unit.f12910a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit reset$lambda$22(tz2 tz2Var) {
/* 1 */             tz2Var.getClass();
/* 20 */            AbstractC1245n0.m4876d("UsercentricsSDK", "Error clearing Usercentrics user session. Reason: " + tz2Var);
/* 23 */            return Unit.f12910a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit showDialog$lambda$6(final Activity activity, final UsercentricsSDK usercentricsSDK, final int i, final UsercentricsReadyStatus usercentricsReadyStatus) {
/* 1 */             usercentricsReadyStatus.getClass();
/* 13 */            de3.m3036r().mo21a(new Function1() { // from class: p03
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
/* 1 */                     return UsercentricsSDK.showDialog$lambda$6$lambda$5(activity, usercentricsSDK, i, usercentricsReadyStatus, (TCFData) obj);
                        }
                    });
/* 16 */            return Unit.f12910a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit showDialog$lambda$6$lambda$5(final Activity activity, final UsercentricsSDK usercentricsSDK, final int i, final UsercentricsReadyStatus usercentricsReadyStatus, final TCFData tCFData) {
/* 1 */             tCFData.getClass();
/* 14 */            activity.runOnUiThread(new Runnable() { // from class: r03
                        @Override // java.lang.Runnable
                        public final void run() throws Throwable {
/* 1 */                     UsercentricsReadyStatus usercentricsReadyStatus2 = usercentricsReadyStatus;
/* 3 */                     TCFData tCFData2 = tCFData;
/* 1 */                     UsercentricsSDK.showDialog$lambda$6$lambda$5$lambda$4(usercentricsSDK, activity, i, usercentricsReadyStatus2, tCFData2);
                        }
                    });
/* 17 */            return Unit.f12910a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void showDialog$lambda$6$lambda$5$lambda$4(UsercentricsSDK usercentricsSDK, Activity activity, int i, UsercentricsReadyStatus usercentricsReadyStatus, TCFData tCFData) throws Throwable {
/* 1 */             usercentricsSDK.popupShowing();
/* 29 */            C2001oh c2001oh = new C2001oh(new kq0(), new gj0(showDialog$lambda$6$lambda$5$lambda$4$buttonLayout(i)), new m82(showDialog$lambda$6$lambda$5$lambda$4$buttonLayout(i)));
/* 34 */            activity.getClass();
/* 37 */            ra2 ra2Var = new ra2();
/* 40 */            ra2Var.f15955a = c2001oh;
/* 49 */            ra2Var.f15958d = new WeakReference(activity);
/* 62 */            ra2Var.f15957c = new s03(usercentricsSDK, usercentricsReadyStatus, tCFData);
/* 64 */            u03 u03VarM3036r = de3.m3036r();
/* 71 */            c10 c10Var = null;
/* 72 */            C2181sh c2181sh = new C2181sh(1, c10Var, ra2Var, u03VarM3036r);
/* 76 */            a13 a13Var = (a13) u03VarM3036r;
/* 78 */            fb1 fb1Var = a13Var.f30a;
/* 84 */            if (Looper.getMainLooper() != null) {
/* 87 */                Looper mainLooper = Looper.getMainLooper();
/* 103 */               Intrinsics.m6216a(mainLooper != null ? mainLooper.getThread() : null, Thread.currentThread());
                    }
/* 114 */           g13 g13Var = ((sx0) fb1Var.f8106t.getValue()).f16850l;
/* 116 */           if (g13Var == null) {
/* 252 */               throw new vz2("Usercentrics is still initializing. Please, check if you are trying to show the UI before the `isReady` was invoked.");
                    }
/* 118 */           String str = a13Var.f32c;
/* 124 */           if (StringsKt.m6228D(str)) {
/* 138 */               str = ((ac2) a13Var.f30a.f8068F.getValue()).f182c.f12614e;
                    }
/* 195 */           C0168b5 c0168b5 = new C0168b5(a13Var, g13Var, str, fb1Var.m3699e(), fb1Var.m3700f(), (sr2) fb1Var.f8102p.getValue(), (C2508yr) fb1Var.f8071I.getValue(), (ac2) fb1Var.f8068F.getValue(), a13Var.m32m(), (C2484y3) fb1Var.f8086X.getValue(), fb1Var.m3696b());
/* 201 */           C2181sh c2181sh2 = new C2181sh(2, a13Var, c10Var, c2181sh);
/* 206 */           C2218th c2218th = (C2218th) c0168b5.f2215f;
/* 212 */           C1996oc c1996oc = new C1996oc(16, c2181sh2, c0168b5);
/* 217 */           k61 k61Var = c2218th.f17094b.f182c;
/* 223 */           int i2 = 0;
/* 236 */           c2218th.f17100h.m9743b(new C2107qh(c2218th, k61Var, c10Var, i2)).m3370H(new C2181sh(i2, c2218th, c1996oc, k61Var));
/* 241 */           a13Var.mo23c(ez2.CMP_SHOWN);
                }

                private static final AbstractC1835kl showDialog$lambda$6$lambda$5$lambda$4$buttonLayout(int i) {
/* 1 */             if (i == 0) {
/* 31 */                return null;
                    }
/* 4 */             if (i == 1) {
/* 27 */                return new C0995hl();
                    }
/* 7 */             if (i == 2) {
/* 21 */                return new C1797jl();
                    }
/* 10 */            if (i != 3) {
/* 31 */                return null;
                    }
/* 15 */            return new C1031il();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit showDialog$lambda$6$lambda$5$lambda$4$lambda$3(final UsercentricsSDK usercentricsSDK, final UsercentricsReadyStatus usercentricsReadyStatus, final TCFData tCFData, final nz2 nz2Var) {
/* 10 */            de3.m3036r().mo21a(new Function1() { // from class: q03
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
/* 1 */                     return UsercentricsSDK.showDialog$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2(this.f15361a, nz2Var, usercentricsReadyStatus, tCFData, (TCFData) obj);
                        }
                    });
/* 13 */            return Unit.f12910a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit showDialog$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2(UsercentricsSDK usercentricsSDK, nz2 nz2Var, UsercentricsReadyStatus usercentricsReadyStatus, TCFData tCFData, TCFData tCFData2) {
/* 1 */             tCFData2.getClass();
/* 4 */             usercentricsSDK.popupClosed();
/* 7 */             if (nz2Var == null) {
/* 12 */                usercentricsSDK.gotConsent(HttpUrl.FRAGMENT_ENCODE_SET, false, false);
                    } else {
/* 20 */                usercentricsSDK.applyConsent(usercentricsReadyStatus.f6060b, nz2Var.f14575b, tCFData, tCFData2);
                    }
/* 23 */            return Unit.f12910a;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit showDialog$lambda$7(tz2 tz2Var) {
/* 1 */             tz2Var.getClass();
/* 20 */            AbstractC1245n0.m4876d("UsercentricsSDK", "Not ready at showDialog(). Reason: " + tz2Var);
/* 23 */            return Unit.f12910a;
                }

                public final void getConsentOrShowDialog(Activity activity, int buttonLayout) {
                    gotFailure();
                }

                public final native void gotConsent(String consentJson, boolean didAnyConsentChangeToGiven, boolean isAnyConsentGiven);

                public final native void gotFailure();

                public final native void popupClosed();

                public final native void popupShowing();

                public final void reset() {
                }

                public final void showDialog(Activity activity, int buttonLayout) {
                    gotFailure();
                }
            }
