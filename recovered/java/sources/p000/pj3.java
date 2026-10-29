            package p000;

            import android.content.Context;
            import android.os.Bundle;
            import android.os.DeadObjectException;
            import com.google.android.gms.internal.play_billing.zzan;
            import com.google.android.gms.internal.play_billing.zze;
            import com.google.android.gms.measurement.internal.zzjc;
            import com.supercell.titan.C0801h;
            import java.io.Serializable;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.concurrent.Callable;
            import okhttp3.HttpUrl;
            import org.json.JSONException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public final class pj3 implements Callable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f15144a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f15145b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f15146c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Serializable f15147d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Object f15148e;

                public /* synthetic */ pj3(C0882ej c0882ej, String str, ArrayList arrayList, C0801h c0801h) {
/* 2 */             this.f15144a = 4;
/* 7 */             this.f15146c = c0882ej;
/* 9 */             this.f15145b = str;
/* 11 */            this.f15147d = arrayList;
/* 13 */            this.f15148e = c0801h;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    bx0 bx0Var;
                    zzan zzanVar;
                    Bundle bundleZzk;
                    switch (this.f15144a) {
                        case 0:
/* 468 */                   zzjc zzjcVar = (zzjc) this.f15148e;
/* 472 */                   zzjcVar.f4212a.m6731A();
/* 477 */                   ae3 ae3Var = zzjcVar.f4212a.f13913c;
/* 479 */                   mp3.m6728S(ae3Var);
/* 492 */                   return ae3Var.m268x0(this.f15145b, (String) this.f15146c, (String) this.f15147d);
                        case 1:
/* 437 */                   zzjc zzjcVar2 = (zzjc) this.f15148e;
/* 441 */                   zzjcVar2.f4212a.m6731A();
/* 446 */                   ae3 ae3Var2 = zzjcVar2.f4212a.f13913c;
/* 448 */                   mp3.m6728S(ae3Var2);
/* 461 */                   return ae3Var2.m268x0(this.f15145b, (String) this.f15146c, (String) this.f15147d);
                        case 2:
/* 406 */                   zzjc zzjcVar3 = (zzjc) this.f15148e;
/* 410 */                   zzjcVar3.f4212a.m6731A();
/* 415 */                   ae3 ae3Var3 = zzjcVar3.f4212a.f13913c;
/* 417 */                   mp3.m6728S(ae3Var3);
/* 430 */                   return ae3Var3.m215B0(this.f15145b, (String) this.f15146c, (String) this.f15147d);
                        case 3:
/* 375 */                   zzjc zzjcVar4 = (zzjc) this.f15148e;
/* 379 */                   zzjcVar4.f4212a.m6731A();
/* 384 */                   ae3 ae3Var4 = zzjcVar4.f4212a.f13913c;
/* 386 */                   mp3.m6728S(ae3Var4);
/* 399 */                   return ae3Var4.m215B0(this.f15145b, (String) this.f15146c, (String) this.f15147d);
                        default:
/* 11 */                    C0882ej c0882ej = (C0882ej) this.f15146c;
/* 13 */                    String str = this.f15145b;
/* 17 */                    ArrayList arrayList = (ArrayList) this.f15147d;
/* 21 */                    ArrayList arrayList2 = new ArrayList();
/* 24 */                    int size = arrayList.size();
/* 28 */                    int i = 0;
/* 30 */                    while (i < size) {
/* 32 */                        int i2 = i + 20;
/* 45 */                        ArrayList<String> arrayList3 = new ArrayList<>(arrayList.subList(i, i2 > size ? size : i2));
/* 50 */                        Bundle bundle = new Bundle();
/* 55 */                        bundle.putStringArrayList("ITEM_ID_LIST", arrayList3);
/* 62 */                        bundle.putString("playBillingLibraryVersion", c0882ej.f7707c);
                                try {
                                    synchronized (c0882ej.f7705a) {
/* 69 */                                zzanVar = c0882ej.f7712h;
                                        break;
                                    }
/* 72 */                            if (zzanVar == null) {
/* 80 */                                bx0Var = c0882ej.m3465s(kf3.f12732j, 119, "Service has been reset to null.", null);
                                    } else {
/* 94 */                                boolean z = c0882ej.f7718n;
/* 96 */                                Context context = c0882ej.f7710f;
/* 98 */                                if (z) {
/* 100 */                                   String packageName = context.getPackageName();
/* 104 */                                   int i3 = c0882ej.f7715k;
/* 108 */                                   c0882ej.f7727w.getClass();
/* 113 */                                   if (c0882ej.f7724t) {
/* 117 */                                       c0882ej.f7727w.getClass();
                                            }
/* 120 */                                   String str2 = c0882ej.f7707c;
/* 124 */                                   long jLongValue = c0882ej.f7704A.longValue();
/* 130 */                                   Bundle bundle2 = new Bundle();
/* 135 */                                   if (i3 >= 9) {
/* 137 */                                       zze.zzc(bundle2, str2, jLongValue);
                                            }
/* 140 */                                   if (i3 >= 9) {
/* 145 */                                       bundle2.putBoolean("enablePendingPurchases", true);
                                            }
/* 151 */                                   bundleZzk = zzanVar.zzl(10, packageName, str, bundle, bundle2);
                                        } else {
/* 161 */                                   bundleZzk = zzanVar.zzk(3, context.getPackageName(), str, bundle);
                                        }
/* 165 */                               if (bundleZzk == null) {
/* 174 */                                   bx0Var = c0882ej.m3465s(kf3.f12739q, 44, "querySkuDetailsAsync got null sku details list", null);
                                        } else if (bundleZzk.containsKey("DETAILS_LIST")) {
/* 239 */                                   ArrayList<String> stringArrayList = bundleZzk.getStringArrayList("DETAILS_LIST");
/* 243 */                                   if (stringArrayList != null) {
/* 250 */                                       for (int i4 = 0; i4 < stringArrayList.size(); i4++) {
                                                    try {
/* 260 */                                               ve2 ve2Var = new ve2(stringArrayList.get(i4));
/* 275 */                                               zze.zzk("BillingClient", "Got sku details: ".concat(ve2Var.toString()));
/* 278 */                                               arrayList2.add(ve2Var);
                                                    } catch (JSONException e) {
/* 295 */                                               bx0Var = c0882ej.m3465s(kf3.m6096a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode SkuDetails.", e);
                                                    }
                                                }
/* 300 */                                       i = i2;
                                            } else {
/* 310 */                                       bx0Var = c0882ej.m3465s(kf3.f12739q, 46, "querySkuDetailsAsync got null response list", null);
                                            }
                                        } else {
/* 191 */                                   int iZzb = zze.zzb(bundleZzk, "BillingClient");
/* 197 */                                   String strZzh = zze.zzh(bundleZzk, "BillingClient");
/* 231 */                                   bx0Var = iZzb != 0 ? c0882ej.m3465s(kf3.m6096a(iZzb, strZzh), 23, fm0.m3781g(iZzb, "getSkuDetails() failed. Response code: "), null) : c0882ej.m3465s(kf3.m6096a(6, strZzh), 45, "getSkuDetails() returned a bundle with neither an error nor a detail list.", null);
                                        }
                                    }
                                } catch (DeadObjectException e2) {
/* 333 */                           bx0Var = c0882ej.m3465s(kf3.f12732j, 43, "querySkuDetailsAsync got a remote exception (try to reconnect).", e2);
                                } catch (Exception e3) {
/* 324 */                           bx0Var = c0882ej.m3465s(kf3.f12730h, 43, "querySkuDetailsAsync got a remote exception (try to reconnect).", e3);
                                }
/* 367 */                       ((C0801h) this.f15148e).m2754a(kf3.m6096a(bx0Var.f2631c, (String) bx0Var.f2632d), (List) bx0Var.f2630b);
/* 370 */                       return null;
                            }
/* 345 */                   bx0Var = new bx0(0, HttpUrl.FRAGMENT_ENCODE_SET, arrayList2, 8);
/* 367 */                   ((C0801h) this.f15148e).m2754a(kf3.m6096a(bx0Var.f2631c, (String) bx0Var.f2632d), (List) bx0Var.f2630b);
/* 370 */                   return null;
                    }
                }

/* 15 */        public /* synthetic */ pj3(zzjc zzjcVar, String str, String str2, String str3, int i) {
/* 16 */            this.f15144a = i;
                    this.f15145b = str;
                    this.f15146c = str2;
                    this.f15147d = str3;
                    this.f15148e = zzjcVar;
                }
            }
