            package p000;

            import android.os.Bundle;
            import android.os.DeadObjectException;
            import android.text.TextUtils;
            import com.google.android.gms.internal.play_billing.zzan;
            import com.google.android.gms.internal.play_billing.zzco;
            import com.google.android.gms.internal.play_billing.zze;
            import com.google.android.gms.measurement.internal.zzao;
            import com.google.android.gms.measurement.internal.zzjc;
            import com.google.android.gms.measurement.internal.zzr;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Objects;
            import java.util.concurrent.Callable;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public final class yd3 implements Callable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f19582a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f19583b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f19584c;

                public yd3(zzjc zzjcVar, String str) {
/* 2 */             this.f19582a = 1;
/* 7 */             this.f19583b = str;
/* 9 */             Objects.requireNonNull(zzjcVar);
/* 12 */            this.f19584c = zzjcVar;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    we2 we2VarM3464r;
                    zzan zzanVar;
                    C1954n7 c1954n7;
                    zzan zzanVar2;
/* 5 */             int i = 119;
/* 7 */             Exception exc = null;
                    switch (this.f19582a) {
                        case 0:
/* 212 */                   C0882ej c0882ej = (C0882ej) this.f19584c;
/* 216 */                   c0882ej.getClass();
/* 227 */                   zze.zzk("BillingClient", "Querying owned items, item type: ".concat("inapp"));
/* 232 */                   ArrayList arrayList = new ArrayList();
/* 235 */                   boolean z = c0882ej.f7717m;
/* 237 */                   boolean z2 = c0882ej.f7724t;
/* 241 */                   c0882ej.f7727w.getClass();
/* 246 */                   c0882ej.f7727w.getClass();
/* 259 */                   Bundle bundleZzd = zze.zzd(z, z2, true, false, c0882ej.f7707c, c0882ej.f7704A.longValue());
/* 263 */                   String string = null;
                            while (true) {
                                try {
                                    synchronized (c0882ej.f7705a) {
/* 270 */                               zzanVar = c0882ej.f7712h;
                                        break;
                                    }
/* 273 */                           if (zzanVar == null) {
/* 279 */                               we2VarM3464r = c0882ej.m3464r(kf3.f12732j, i, "Service has been reset to null", exc);
                                    } else {
/* 323 */                               Bundle bundleZzj = c0882ej.f7717m ? zzanVar.zzj(true != c0882ej.f7724t ? 9 : 19, c0882ej.f7710f.getPackageName(), "inapp", string, bundleZzd) : zzanVar.zzi(3, c0882ej.f7710f.getPackageName(), "inapp", string);
/* 333 */                               C1833kj c1833kj = kf3.f12730h;
/* 339 */                               if (bundleZzj == null) {
/* 343 */                                   zze.zzl("BillingClient", "getPurchase() got null owned items list");
/* 350 */                                   c1954n7 = new C1954n7(c1833kj, 54, 11);
                                        } else {
/* 355 */                                   int iZzb = zze.zzb(bundleZzj, "BillingClient");
/* 359 */                                   String strZzh = zze.zzh(bundleZzj, "BillingClient");
/* 363 */                                   C1795jj c1795jjM6120a = C1833kj.m6120a();
/* 367 */                                   c1795jjM6120a.f12324a = iZzb;
/* 369 */                                   c1795jjM6120a.f12325b = strZzh;
/* 371 */                                   C1833kj c1833kjM5841a = c1795jjM6120a.m5841a();
/* 375 */                                   if (iZzb != 0) {
/* 391 */                                       zze.zzl("BillingClient", "getPurchase() failed. Response code: " + iZzb);
/* 398 */                                       c1954n7 = new C1954n7(c1833kjM5841a, 23, 11);
                                            } else if (bundleZzj.containsKey("INAPP_PURCHASE_ITEM_LIST") && bundleZzj.containsKey("INAPP_PURCHASE_DATA_LIST") && bundleZzj.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
/* 421 */                                       ArrayList<String> stringArrayList = bundleZzj.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
/* 425 */                                       ArrayList<String> stringArrayList2 = bundleZzj.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
/* 429 */                                       ArrayList<String> stringArrayList3 = bundleZzj.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
/* 433 */                                       if (stringArrayList == null) {
/* 437 */                                           zze.zzl("BillingClient", "Bundle returned from getPurchase() contains null SKUs list.");
/* 444 */                                           c1954n7 = new C1954n7(c1833kj, 56, 11);
                                                } else if (stringArrayList2 == null) {
/* 452 */                                           zze.zzl("BillingClient", "Bundle returned from getPurchase() contains null purchases list.");
/* 459 */                                           c1954n7 = new C1954n7(c1833kj, 57, 11);
                                                } else if (stringArrayList3 == null) {
/* 467 */                                           zze.zzl("BillingClient", "Bundle returned from getPurchase() contains null signatures list.");
/* 474 */                                           c1954n7 = new C1954n7(c1833kj, 58, 11);
                                                } else {
/* 482 */                                           c1954n7 = new C1954n7(kf3.f12731i, 1, 11);
                                                }
                                            } else {
/* 488 */                                       zze.zzl("BillingClient", "Bundle returned from getPurchase() doesn't contain required fields.");
/* 495 */                                       c1954n7 = new C1954n7(c1833kj, 55, 11);
                                            }
                                        }
/* 500 */                               C1833kj c1833kj2 = (C1833kj) c1954n7.f14152c;
/* 504 */                               if (c1833kj2 != kf3.f12731i) {
/* 511 */                                   we2VarM3464r = c0882ej.m3464r(c1833kj2, c1954n7.f14151b, "Purchase bundle invalid", null);
                                        } else {
/* 519 */                                   ArrayList<String> stringArrayList4 = bundleZzj.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
/* 525 */                                   ArrayList<String> stringArrayList5 = bundleZzj.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
/* 531 */                                   ArrayList<String> stringArrayList6 = bundleZzj.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
/* 536 */                                   boolean z3 = false;
/* 541 */                                   for (int i2 = 0; i2 < stringArrayList5.size(); i2++) {
/* 543 */                                       String str = stringArrayList5.get(i2);
/* 549 */                                       String str2 = stringArrayList6.get(i2);
/* 573 */                                       zze.zzk("BillingClient", "Sku is owned: ".concat(String.valueOf(stringArrayList4.get(i2))));
                                                try {
/* 578 */                                           sz1 sz1Var = new sz1(str, str2);
/* 581 */                                           JSONObject jSONObject = sz1Var.f16881c;
/* 599 */                                           if (TextUtils.isEmpty(jSONObject.optString("token", jSONObject.optString("purchaseToken")))) {
/* 605 */                                               zze.zzl("BillingClient", "BUG: empty/null token!");
/* 608 */                                               z3 = true;
                                                    }
/* 609 */                                           arrayList.add(sz1Var);
                                                } catch (JSONException e) {
/* 623 */                                           we2VarM3464r = c0882ej.m3464r(kf3.f12730h, 51, "Got an exception trying to decode the purchase!", e);
                                                }
                                            }
/* 628 */                                   if (z3) {
/* 636 */                                       c0882ej.m3470x(26, 9, kf3.f12730h);
                                            }
/* 641 */                                   string = bundleZzj.getString("INAPP_CONTINUATION_TOKEN");
/* 657 */                                   zze.zzk("BillingClient", "Continuation token: ".concat(String.valueOf(string)));
/* 664 */                                   if (TextUtils.isEmpty(string)) {
/* 672 */                                       we2VarM3464r = new we2(19, kf3.f12731i, arrayList);
                                            } else {
/* 677 */                                       i = 119;
/* 679 */                                       exc = null;
                                            }
                                        }
                                    }
                                } catch (DeadObjectException e2) {
/* 698 */                           we2VarM3464r = c0882ej.m3464r(kf3.f12732j, 52, "Got exception trying to get purchases try to reconnect", e2);
                                } catch (Exception e3) {
/* 689 */                           we2VarM3464r = c0882ej.m3464r(kf3.f12730h, 52, "Got exception trying to get purchases try to reconnect", e3);
                                }
                            }
/* 704 */                   List list = (List) we2VarM3464r.f18596c;
/* 708 */                   C2357x6 c2357x6 = (C2357x6) this.f19583b;
/* 712 */                   C1833kj c1833kj3 = (C1833kj) we2VarM3464r.f18595b;
/* 714 */                   if (list != null) {
/* 716 */                       c2357x6.m9714g(c1833kj3, list);
/* 719 */                       return null;
                            }
/* 726 */                   c2357x6.m9714g(c1833kj3, zzco.zzl());
/* 719 */                   return null;
                        case 1:
/* 186 */                   zzjc zzjcVar = (zzjc) this.f19584c;
/* 190 */                   zzjcVar.f4212a.m6731A();
/* 195 */                   ae3 ae3Var = zzjcVar.f4212a.f13913c;
/* 197 */                   mp3.m6728S(ae3Var);
/* 204 */                   return ae3Var.m267w0((String) this.f19583b);
                        case 2:
/* 159 */                   zzjc zzjcVar2 = (zzjc) this.f19584c;
/* 163 */                   zzjcVar2.f4212a.m6731A();
/* 180 */                   return new zzao(zzjcVar2.f4212a.m6773o0(((zzr) this.f19583b).f4240a));
                        case 3:
/* 98 */                    zzr zzrVar = (zzr) this.f19583b;
/* 100 */                   String str3 = zzrVar.f4240a;
/* 102 */                   kb1.m6061n(str3);
/* 107 */                   mp3 mp3Var = (mp3) this.f19584c;
/* 109 */                   ok3 ok3VarM6752d = mp3Var.m6752d(str3);
/* 113 */                   nk3 nk3Var = nk3.ANALYTICS_STORAGE;
/* 119 */                   if (ok3VarM6752d.m7189i(nk3Var) && ok3.m7182c(100, zzrVar.f4247d0).m7189i(nk3Var)) {
/* 140 */                       return mp3Var.m6750a0(zzrVar).m3094E();
                            }
/* 153 */                   mp3Var.mo4557a().f17534Y.m8510a("Analytics storage consent denied. Returning null app instance id");
/* 7 */                     return null;
                        default:
/* 14 */                    C0882ej c0882ej2 = (C0882ej) this.f19584c;
/* 19 */                    C2076pn c2076pn = (C2076pn) this.f19583b;
/* 21 */                    c0882ej2.getClass();
                            try {
                                synchronized (c0882ej2.f7705a) {
/* 29 */                            zzanVar2 = c0882ej2.f7712h;
                                    break;
                                }
/* 32 */                        if (zzanVar2 == null) {
/* 36 */                            c0882ej2.m3469w(c2076pn, kf3.f12732j, 119, null);
                                } else {
/* 46 */                            String packageName = c0882ej2.f7710f.getPackageName();
/* 50 */                            String str4 = c0882ej2.f7707c;
/* 54 */                            long jLongValue = c0882ej2.f7704A.longValue();
/* 60 */                            Bundle bundle = new Bundle();
/* 63 */                            zze.zzc(bundle, str4, jLongValue);
/* 77 */                            zzanVar2.zzp(18, packageName, bundle, new qe3(c2076pn, c0882ej2.f7711g, c0882ej2.f7715k));
                                }
                            } catch (DeadObjectException e4) {
/* 92 */                        c0882ej2.m3469w(c2076pn, kf3.f12732j, 62, e4);
                            } catch (Exception e5) {
/* 86 */                        c0882ej2.m3469w(c2076pn, kf3.f12730h, 62, e5);
                            }
/* 7 */                     return null;
                    }
                }

/* 14 */        public /* synthetic */ yd3(int i, Object obj, Object obj2) {
/* 15 */            this.f19582a = i;
                    this.f19583b = obj2;
                    this.f19584c = obj;
                }

/* 15 */        public yd3(mp3 mp3Var, zzr zzrVar) {
                    this.f19582a = 3;
                    this.f19583b = zzrVar;
                    Objects.requireNonNull(mp3Var);
                    this.f19584c = mp3Var;
                }
            }
