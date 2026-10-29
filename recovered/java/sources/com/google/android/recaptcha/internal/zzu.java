            package com.google.android.recaptcha.internal;

            import android.app.Application;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import p000.c10;
            import p000.e70;
            import p000.p51;
            import p000.qr0;
            import p000.r51;
            import p000.z02;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 15 */    public final class zzu extends zzg {
                private final zzcz zza;
                private String zzb;
                private e70 zzc;
                private final p51 zzd;

                public zzu(zzcz zzczVar, z02 z02Var) {
/* 4 */             this.zza = zzczVar;
/* 6 */             int i = zzby.zza;
/* 14 */            this.zzd = r51.m8065b(zzt.zza);
                }

                public static final /* synthetic */ Application zzl(zzu zzuVar) {
/* 7 */             return (Application) zzuVar.zzd.getValue();
                }

                @Override // com.google.android.recaptcha.internal.zzg
                public final Object zza(String str, c10 c10Var) {
/* 1 */             zzxw zzxwVarZzf = zzxx.zzf();
/* 5 */             zzxwVarZzf.zze(str);
/* 8 */             return zzxwVarZzf.zzk();
                }

                @Override // com.google.android.recaptcha.internal.zzg
                public final Object zzb(String str, c10 c10Var) {
/* 9 */             return new zzhg(new zzr(this, str, null));
                }

                @Override // com.google.android.recaptcha.internal.zzg
                public final Object zzd(zzxn zzxnVar, c10 c10Var) {
/* 9 */             return new zzhg(new zzs(this, zzxnVar, null));
                }

                @Override // com.google.android.recaptcha.internal.zzg
                public final int zzj() {
/* 1 */             return 40;
                }

                @Override // com.google.android.recaptcha.internal.zzg
                public final int zzk() {
/* 1 */             return 39;
                }

/* 16 */        public zzu() {
/* 17 */            this(null, null, 3, null);
                }

/* 17 */        public zzu(zzcz zzczVar, z02 z02Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 21 */            this(new zzcz(qr0.f15712b), null);
                }
            }
