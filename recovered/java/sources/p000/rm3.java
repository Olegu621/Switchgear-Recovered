            package p000;

            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.measurement.internal.zzah;
            import com.google.android.gms.measurement.internal.zzbg;
            import com.google.android.gms.measurement.internal.zzga;
            import com.google.android.gms.measurement.internal.zzpk;
            import com.google.android.gms.measurement.internal.zzr;
            import java.util.Objects;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 17 */    public final class rm3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16185a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ zzr f16186b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f16187c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ pn3 f16188d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ AbstractSafeParcelable f16189e;

                public rm3(pn3 pn3Var, zzr zzrVar, boolean z, zzah zzahVar) {
/* 2 */             this.f16185a = 2;
/* 7 */             this.f16186b = zzrVar;
/* 9 */             this.f16187c = z;
/* 11 */            this.f16189e = zzahVar;
/* 13 */            Objects.requireNonNull(pn3Var);
/* 16 */            this.f16188d = pn3Var;
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
/* 1 */             int i = this.f16185a;
/* 3 */             AbstractSafeParcelable abstractSafeParcelable = this.f16189e;
/* 6 */             boolean z = this.f16187c;
/* 8 */             zzr zzrVar = this.f16186b;
/* 10 */            pn3 pn3Var = this.f16188d;
                    switch (i) {
                        case 0:
/* 83 */                    zzga zzgaVar = pn3Var.f15188d;
/* 85 */                    if (zzgaVar != null) {
/* 110 */                       pn3Var.m7522R(zzgaVar, z ? null : (zzpk) abstractSafeParcelable, zzrVar);
/* 113 */                       pn3Var.m7517M();
                            } else {
/* 91 */                        uh3 uh3Var = ((ij3) pn3Var.f16749a).f9655f;
/* 93 */                        ij3.m4555l(uh3Var);
/* 100 */                       uh3Var.f17538f.m8510a("Discarding data. Failed to set user property");
                            }
                            break;
                        case 1:
/* 49 */                    zzga zzgaVar2 = pn3Var.f15188d;
/* 51 */                    if (zzgaVar2 != null) {
/* 76 */                        pn3Var.m7522R(zzgaVar2, z ? null : (zzbg) abstractSafeParcelable, zzrVar);
/* 79 */                        pn3Var.m7517M();
                            } else {
/* 57 */                        uh3 uh3Var2 = ((ij3) pn3Var.f16749a).f9655f;
/* 59 */                        ij3.m4555l(uh3Var2);
/* 66 */                        uh3Var2.f17538f.m8510a("Discarding data. Failed to send event to service");
                            }
                            break;
                        default:
/* 15 */                    zzga zzgaVar3 = pn3Var.f15188d;
/* 17 */                    if (zzgaVar3 != null) {
/* 42 */                        pn3Var.m7522R(zzgaVar3, z ? null : (zzah) abstractSafeParcelable, zzrVar);
/* 45 */                        pn3Var.m7517M();
                            } else {
/* 23 */                        uh3 uh3Var3 = ((ij3) pn3Var.f16749a).f9655f;
/* 25 */                        ij3.m4555l(uh3Var3);
/* 32 */                        uh3Var3.f17538f.m8510a("Discarding data. Failed to send conditional user property to service");
                            }
                            break;
                    }
                }

/* 18 */        public /* synthetic */ rm3(pn3 pn3Var, zzr zzrVar, boolean z, AbstractSafeParcelable abstractSafeParcelable, int i) {
/* 19 */            this.f16185a = i;
                    this.f16186b = zzrVar;
                    this.f16187c = z;
                    this.f16189e = abstractSafeParcelable;
                    this.f16188d = pn3Var;
                }
            }
