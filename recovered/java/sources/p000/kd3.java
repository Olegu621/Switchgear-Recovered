            package p000;

            import android.content.Context;
            import android.os.Bundle;
            import android.os.DeadObjectException;
            import android.text.TextUtils;
            import com.google.android.gms.internal.play_billing.zzan;
            import com.google.android.gms.internal.play_billing.zzbe;
            import com.google.android.gms.internal.play_billing.zzco;
            import com.google.android.gms.internal.play_billing.zze;
            import com.supercell.titan.C0800g;
            import java.util.ArrayList;
            import java.util.concurrent.Callable;
            import okhttp3.HttpUrl;
            import org.json.JSONException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class kd3 implements Callable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12700a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0882ej f12701b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f12702c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f12703d;

                public /* synthetic */ kd3(C0882ej c0882ej, Object obj, Object obj2, int i) {
/* 1 */             this.f12700a = i;
/* 3 */             this.f12701b = c0882ej;
/* 5 */             this.f12702c = obj;
/* 7 */             this.f12703d = obj2;
                }

                /* JADX WARN: Bottom block not found for handler: all -> 0x0234 */
                /* JADX WARN: Bottom block not found for handler: all -> 0x032d */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r1v2, types: [ds0] */
                /* JADX WARN: Type inference failed for: r1v3 */
                /* JADX WARN: Type inference failed for: r1v4 */
                /* JADX WARN: Type inference failed for: r1v5, types: [ej] */
                /* JADX WARN: Type inference failed for: r1v6, types: [ej] */
                /* JADX WARN: Type inference failed for: r2v0 */
                /* JADX WARN: Type inference failed for: r2v1, types: [ej] */
                /* JADX WARN: Type inference failed for: r2v13 */
                /* JADX WARN: Type inference failed for: r2v14 */
                /* JADX WARN: Type inference failed for: r2v15, types: [int] */
                /* JADX WARN: Type inference failed for: r2v16, types: [int] */
                /* JADX WARN: Type inference failed for: r2v17 */
                /* JADX WARN: Type inference failed for: r2v18 */
                /* JADX WARN: Type inference failed for: r2v19 */
                /* JADX WARN: Type inference failed for: r2v2 */
                /* JADX WARN: Type inference failed for: r2v20 */
                /* JADX WARN: Type inference failed for: r2v21 */
                /* JADX WARN: Type inference failed for: r2v22 */
                /* JADX WARN: Type inference failed for: r2v23 */
                /* JADX WARN: Type inference failed for: r2v28 */
                /* JADX WARN: Type inference failed for: r2v3 */
                /* JADX WARN: Type inference failed for: r2v4, types: [ds0] */
                /* JADX WARN: Type inference failed for: r2v41 */
                /* JADX WARN: Type inference failed for: r2v49 */
                /* JADX WARN: Type inference failed for: r2v5, types: [ds0] */
                /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Exception] */
                /* JADX WARN: Type inference failed for: r4v14, types: [ej] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // java.util.concurrent.Callable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object call() throws Throwable {
                    zzan zzanVar;
                    int iZza;
                    String strZzh;
                    bx0 bx0Var;
                    zzan zzanVar2;
                    zzan zzanVar3;
/* 5 */             ?? r2 = 0;
/* 6 */             int i = 119;
                    switch (this.f12700a) {
                        case 0:
/* 625 */                   ?? r3 = this.f12701b;
/* 629 */                   C0832d5 c0832d5 = (C0832d5) this.f12702c;
/* 633 */                   ?? r1 = (ds0) this.f12703d;
/* 639 */                   String str = c0832d5.f6995b;
                            try {
/* 655 */                       zze.zzk("BillingClient", "Consuming purchase with token: " + str);
                                synchronized (r3.f7705a) {
                                    try {
                                        try {
/* 661 */                                   zzanVar = r3.f7712h;
                                        } catch (Throwable th) {
/* 806 */                                   th = th;
                                            while (true) {
/* 813 */                                       throw th;
                                            }
                                        }
                                    } catch (DeadObjectException e) {
/* 689 */                               e = e;
/* 833 */                               r1.m3466t(r3, kf3.f12732j, 29, "Error consuming purchase!", e);
                                    } catch (Exception e2) {
/* 685 */                               e = e2;
/* 822 */                               r1.m3466t(r3, kf3.f12730h, 29, "Error consuming purchase!", e);
                                    }
                                    break;
                                }
/* 664 */                       if (zzanVar == null) {
/* 678 */                           r3.m3466t(r1, kf3.f12732j, 119, "Service has been reset to null.", null);
                                } else {
/* 712 */                           boolean z = r3.f7717m;
/* 714 */                           Context context = r3.f7710f;
/* 716 */                           if (z) {
/* 718 */                               String packageName = context.getPackageName();
/* 722 */                               boolean z2 = r3.f7717m;
/* 724 */                               String str2 = r3.f7707c;
/* 728 */                               long jLongValue = r3.f7704A.longValue();
/* 734 */                               Bundle bundle = new Bundle();
/* 737 */                               if (z2) {
/* 739 */                                   zze.zzc(bundle, str2, jLongValue);
                                        }
/* 744 */                               Bundle bundleZze = zzanVar.zze(9, packageName, str, bundle);
/* 750 */                               iZza = bundleZze.getInt("RESPONSE_CODE");
/* 756 */                               strZzh = zze.zzh(bundleZze, "BillingClient");
                                    } else {
/* 766 */                               iZza = zzanVar.zza(3, context.getPackageName(), str);
/* 770 */                               strZzh = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
/* 772 */                           C1833kj c1833kjM6096a = kf3.m6096a(iZza, strZzh);
/* 776 */                           if (iZza == 0) {
/* 782 */                               zze.zzk("BillingClient", "Successfully consumed purchase.");
                                    } else {
/* 802 */                               r3.m3466t(r1, c1833kjM6096a, 23, "Error consuming purchase with token. Response code: " + iZza, null);
                                    }
                                }
                            } catch (DeadObjectException e3) {
/* 700 */                       e = e3;
/* 703 */                       r3 = r1;
/* 704 */                       r1 = r3;
                            } catch (Exception e4) {
/* 693 */                       e = e4;
/* 696 */                       r3 = r1;
/* 697 */                       r1 = r3;
                            }
/* 681 */                   return null;
                        case 1:
/* 81 */                    ?? r4 = this.f12701b;
/* 85 */                    fs0 fs0Var = (fs0) this.f12702c;
/* 89 */                    ArrayList arrayList = new ArrayList();
/* 96 */                    int i2 = 0;
/* 103 */                   String str3 = ((g02) ((zzco) fs0Var.f8339b).get(0)).f8425b;
/* 107 */                   zzco zzcoVar = (zzco) fs0Var.f8339b;
/* 109 */                   int size = zzcoVar.size();
/* 113 */                   int i3 = 0;
/* 114 */                   while (i3 < size) {
/* 116 */                       int i4 = i3 + 20;
/* 129 */                       ArrayList arrayList2 = new ArrayList(zzcoVar.subList(i3, i4 > size ? size : i4));
/* 134 */                       ArrayList<String> arrayList3 = new ArrayList<>();
/* 137 */                       int size2 = arrayList2.size();
/* 142 */                       for (int i5 = i2; i5 < size2; i5++) {
/* 152 */                           arrayList3.add(((g02) arrayList2.get(i5)).f8424a);
                                }
/* 160 */                       Bundle bundle2 = new Bundle();
/* 165 */                       bundle2.putStringArrayList("ITEM_ID_LIST", arrayList3);
/* 172 */                       bundle2.putString("playBillingLibraryVersion", r4.f7707c);
                                try {
                                    synchronized (r4.f7705a) {
                                        try {
/* 181 */                                   zzanVar2 = r4.f7712h;
                                        } catch (Throwable th2) {
/* 561 */                                   th = th2;
/* 562 */                                   r2 = 43;
                                            while (true) {
/* 564 */                                       throw th;
                                            }
                                        }
                                        break;
                                    }
/* 184 */                           if (zzanVar2 == null) {
/* 190 */                               bx0Var = r4.m3463q(kf3.f12732j, i, "Service has been reset to null.", r2);
                                        break;
                                    } else {
                                        try {
/* 212 */                                   int i6 = true != r4.f7725u ? 17 : 20;
                                            try {
/* 216 */                                       String packageName2 = r4.f7710f.getPackageName();
/* 222 */                                       if (r4.f7724t) {
/* 226 */                                           r4.f7727w.getClass();
                                                }
/* 229 */                                       String str4 = r4.f7707c;
/* 231 */                                       r4.m3457j();
/* 234 */                                       r4.m3457j();
/* 237 */                                       r4.m3457j();
/* 240 */                                       r4.m3457j();
/* 245 */                                       long jLongValue2 = r4.f7704A.longValue();
/* 252 */                                       Bundle bundle3 = new Bundle();
/* 255 */                                       zze.zzc(bundle3, str4, jLongValue2);
/* 261 */                                       bundle3.putBoolean("enablePendingPurchases", true);
/* 268 */                                       bundle3.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
/* 273 */                                       ArrayList<String> arrayList4 = new ArrayList<>();
/* 278 */                                       ArrayList<String> arrayList5 = new ArrayList<>();
/* 281 */                                       int size3 = arrayList2.size();
/* 285 */                                       zzco zzcoVar2 = zzcoVar;
/* 287 */                                       int i7 = 0;
/* 288 */                                       boolean z3 = false;
/* 290 */                                       boolean z4 = false;
/* 292 */                                       while (i7 < size3) {
/* 298 */                                           int i8 = i7;
/* 302 */                                           g02 g02Var = (g02) arrayList2.get(i7);
/* 304 */                                           int i9 = size;
/* 307 */                                           arrayList4.add(null);
/* 318 */                                           z4 |= !TextUtils.isEmpty(null);
/* 328 */                                           if (g02Var.f8425b.equals("first_party")) {
/* 333 */                                               zzbe.zzc(null, "Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
/* 336 */                                               arrayList5.add(null);
/* 339 */                                               z3 = true;
                                                    }
/* 352 */                                           i7 = i8 + 1;
/* 354 */                                           size = i9;
                                                }
/* 357 */                                       int i10 = size;
/* 359 */                                       if (z4) {
/* 363 */                                           bundle3.putStringArrayList("SKU_OFFER_ID_TOKEN_LIST", arrayList4);
                                                }
/* 370 */                                       if (!arrayList5.isEmpty()) {
/* 374 */                                           bundle3.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList5);
                                                }
/* 377 */                                       if (z3 && !TextUtils.isEmpty(null)) {
/* 388 */                                           bundle3.putString("accountName", null);
                                                }
/* 392 */                                       r2 = 43;
/* 392 */                                       r2 = 43;
                                                try {
/* 394 */                                           Bundle bundleZzl = zzanVar2.zzl(i6, packageName2, str3, bundle2, bundle3);
/* 398 */                                           if (bundleZzl == null) {
/* 407 */                                               bx0Var = r4.m3463q(kf3.f12739q, 44, "queryProductDetailsAsync got empty product details response.", null);
                                                    } else if (bundleZzl.containsKey("DETAILS_LIST")) {
/* 472 */                                               ArrayList<String> stringArrayList = bundleZzl.getStringArrayList("DETAILS_LIST");
/* 476 */                                               if (stringArrayList != null) {
/* 483 */                                                   for (int i11 = 0; i11 < stringArrayList.size(); i11++) {
                                                                try {
/* 493 */                                                           zx1 zx1Var = new zx1(stringArrayList.get(i11));
/* 508 */                                                           zze.zzk("BillingClient", "Got product details: ".concat(zx1Var.toString()));
/* 511 */                                                           arrayList.add(zx1Var);
                                                                } catch (JSONException e5) {
/* 529 */                                                           bx0Var = r4.m3463q(kf3.m6096a(6, "Error trying to decode SkuDetails."), 47, "Got a JSON exception trying to decode ProductDetails. \n Exception: ", e5);
                                                                }
                                                            }
/* 534 */                                                   i3 = i4;
/* 535 */                                                   zzcoVar = zzcoVar2;
/* 537 */                                                   size = i10;
/* 539 */                                                   r2 = 0;
/* 540 */                                                   i = 119;
/* 542 */                                                   i2 = 0;
                                                        } else {
/* 552 */                                                   bx0Var = r4.m3463q(kf3.f12739q, 46, "queryProductDetailsAsync got null response list", null);
                                                        }
                                                    } else {
/* 423 */                                               int iZzb = zze.zzb(bundleZzl, "BillingClient");
/* 429 */                                               String strZzh2 = zze.zzh(bundleZzl, "BillingClient");
/* 464 */                                               bx0Var = iZzb != 0 ? r4.m3463q(kf3.m6096a(iZzb, strZzh2), 23, fm0.m3781g(iZzb, "getSkuDetails() failed for queryProductDetailsAsync. Response code: "), null) : r4.m3463q(kf3.m6096a(6, strZzh2), 45, "getSkuDetails() returned a bundle with neither an error nor a product detail list for queryProductDetailsAsync.", null);
                                                    }
                                                } catch (DeadObjectException e6) {
/* 559 */                                           e = e6;
                                                } catch (Exception e7) {
/* 557 */                                           e = e7;
                                                }
                                            } catch (DeadObjectException e8) {
/* 347 */                                       e = e8;
/* 348 */                                       r2 = 43;
/* 586 */                                       bx0Var = r4.m3463q(kf3.f12732j, r2, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                                            } catch (Exception e9) {
/* 342 */                                       e = e9;
/* 343 */                                       r2 = 43;
/* 577 */                                       bx0Var = r4.m3463q(kf3.f12730h, r2, "queryProductDetailsAsync got a remote exception (try to reconnect).", e);
                                            }
                                        } catch (DeadObjectException e10) {
/* 200 */                                   e = e10;
/* 201 */                                   r2 = 43;
                                        } catch (Exception e11) {
/* 196 */                                   e = e11;
/* 197 */                                   r2 = 43;
                                        }
                                    }
                                } catch (DeadObjectException e12) {
/* 570 */                           e = e12;
/* 571 */                           r2 = 43;
                                } catch (Exception e13) {
/* 567 */                           e = e13;
/* 568 */                           r2 = 43;
                                }
/* 619 */                       ((C0800g) this.f12703d).m2753a(kf3.m6096a(bx0Var.f2631c, (String) bx0Var.f2632d), (ArrayList) bx0Var.f2630b);
/* 622 */                       return null;
                            }
/* 597 */                   bx0Var = new bx0(0, HttpUrl.FRAGMENT_ENCODE_SET, arrayList, 6);
/* 619 */                   ((C0800g) this.f12703d).m2753a(kf3.m6096a(bx0Var.f2631c, (String) bx0Var.f2632d), (ArrayList) bx0Var.f2630b);
/* 622 */                   return null;
                        default:
/* 11 */                    C0882ej c0882ej = this.f12701b;
/* 16 */                    String str5 = (String) this.f12702c;
/* 21 */                    String str6 = (String) this.f12703d;
                            try {
                                synchronized (c0882ej.f7705a) {
/* 27 */                            zzanVar3 = c0882ej.f7712h;
                                    break;
                                }
                                return zzanVar3 == null ? zze.zzn(kf3.f12732j, 119) : zzanVar3.zzf(3, c0882ej.f7710f.getPackageName(), str5, str6, null);
                            } catch (DeadObjectException e14) {
/* 76 */                        return zze.zzo(kf3.f12732j, 5, if3.m4523a(e14));
                            } catch (Exception e15) {
/* 65 */                        return zze.zzo(kf3.f12730h, 5, if3.m4523a(e15));
                            }
                    }
                }
            }
