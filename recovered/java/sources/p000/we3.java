            package p000;

            import com.google.android.gms.internal.play_billing.zzav;
            import com.google.android.gms.internal.play_billing.zze;
            import com.google.android.gms.internal.play_billing.zzr;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class we3 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ gf3 f18597a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f18598b;

                public /* synthetic */ we3(gf3 gf3Var, int i) {
/* 4 */             this.f18597a = gf3Var;
/* 6 */             this.f18598b = i;
                }

                /* JADX INFO: renamed from: a */
                public final void m9573a(zzr zzrVar) {
                    String str;
/* 1 */             gf3 gf3Var = this.f18597a;
/* 3 */             int i = this.f18598b;
                    try {
/* 7 */                 if (gf3Var.f8589D == null) {
/* 52 */                    throw null;
                        }
/* 9 */                 zzav zzavVar = gf3Var.f8589D;
/* 13 */                String packageName = gf3Var.f8587B.getPackageName();
                        switch (i) {
                            case 2:
/* 40 */                        str = "LAUNCH_BILLING_FLOW";
                                break;
                            case 3:
/* 37 */                        str = "ACKNOWLEDGE_PURCHASE";
                                break;
                            case 4:
/* 34 */                        str = "CONSUME_ASYNC";
                                break;
                            case 5:
/* 31 */                        str = "IS_FEATURE_SUPPORTED";
                                break;
                            case 6:
/* 28 */                        str = "START_CONNECTION";
                                break;
                            case 7:
/* 25 */                        str = "QUERY_PRODUCT_DETAILS_ASYNC";
                                break;
                            default:
/* 20 */                        str = "QUERY_SKU_DETAILS_ASYNC";
                                break;
                        }
/* 47 */                zzavVar.zza(packageName, str, new xe3(zzrVar));
                    } catch (Exception e) {
/* 59 */                gf3Var.m3920G(107, 28, kf3.f12741s);
/* 66 */                zze.zzm("BillingClientTesting", "An error occurred while retrieving billing override.", e);
/* 74 */                zzrVar.zzb(0);
                    }
                }
            }
