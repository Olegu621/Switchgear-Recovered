            package com.google.android.recaptcha.internal;

            import android.app.Application;
            import com.google.android.recaptcha.RecaptchaException;
            import kotlin.jvm.internal.Intrinsics;
            import p000.C1020i9;
            import p000.c10;
            import p000.dl1;
            import p000.f42;
            import p000.gl1;
            import p000.lo2;
            import p000.p51;
            import p000.pg3;
            import p000.r51;
            import p000.v00;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzeh {
                private final Application zza;
                private final dl1 zzb = new gl1();
                private zzeq zzc;
                private final p51 zzd;

                public zzeh(Application application) {
/* 4 */             this.zza = application;
/* 13 */            int i = zzby.zza;
/* 21 */            this.zzd = r51.m8065b(zzef.zza);
/* 23 */            zzdp.zza(application);
                }

                public static /* synthetic */ Object zzd(zzeh zzehVar, String str, long j, zzdw zzdwVar, zzdq zzdqVar, c10 c10Var, int i, Object obj) throws C1020i9, RecaptchaException, lo2 {
/* 3 */             if ((i & 8) != 0) {
/* 5 */                 zzdqVar = zzdq.zza;
                    }
/* 7 */             zzdq zzdqVar2 = zzdqVar;
/* 10 */            if ((i & 2) != 0) {
/* 12 */                j = 10000;
                    }
/* 19 */            return zzehVar.zzc(str, j, null, zzdqVar2, c10Var);
                }

                public static final /* synthetic */ void zzf(zzeh zzehVar, long j) throws zzcg {
/* 5 */             if (j < 5000) {
/* 47 */                throw new zzcg(zzce.zzj, zzcd.zzI, null, null, 12, null);
                    }
/* 15 */            if (v00.checkSelfPermission(zzehVar.zza, "android.permission.INTERNET") != 0) {
/* 32 */                throw new zzcg(zzce.zzc, zzcd.zzao, null, null, 12, null);
                    }
                }

                public final zzcr zza() {
/* 7 */             return (zzcr) this.zzd.getValue();
                }

                /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
                /* JADX WARN: Code duplicated, block: B:8:0x0018  */
                public final Object zzc(String str, long j, zzdw zzdwVar, zzdq zzdqVar, c10 c10Var) throws Throwable {
                    zzea zzeaVar;
                    String str2;
                    zzdq zzdqVar2;
                    long j2;
                    dl1 dl1Var;
                    dl1 dl1Var2;
                    int i;
                    int i2;
/* 7 */             if (c10Var instanceof zzea) {
/* 10 */                zzeaVar = (zzea) c10Var;
/* 12 */                int i3 = zzeaVar.zzg;
/* 18 */                if ((i3 & Integer.MIN_VALUE) != 0) {
/* 21 */                    zzeaVar.zzg = i3 - Integer.MIN_VALUE;
                        } else {
/* 27 */                    zzeaVar = new zzea(this, c10Var);
                        }
                    } else {
/* 27 */                zzeaVar = new zzea(this, c10Var);
                    }
/* 23 */            zzea zzeaVar2 = zzeaVar;
/* 31 */            Object objInvoke = zzeaVar2.zze;
/* 33 */            z10 z10Var = z10.f19902a;
/* 35 */            int i4 = zzeaVar2.zzg;
                    try {
/* 40 */                if (i4 == 0) {
/* 85 */                    pg3.m7417A(objInvoke);
/* 88 */                    dl1 dl1Var3 = this.zzb;
/* 90 */                    str2 = str;
/* 92 */                    zzeaVar2.zza = str2;
/* 94 */                    zzeaVar2.zzb = null;
/* 96 */                    zzdqVar2 = zzdqVar;
/* 98 */                    zzeaVar2.zzh = zzdqVar2;
/* 100 */                   zzeaVar2.zzc = dl1Var3;
/* 102 */                   j2 = j;
/* 104 */                   zzeaVar2.zzd = j2;
/* 106 */                   zzeaVar2.zzg = 1;
/* 108 */                   gl1 gl1Var = (gl1) dl1Var3;
/* 114 */                   if (gl1Var.m3967d(zzeaVar2) != z10Var) {
/* 116 */                       dl1Var = gl1Var;
                            }
/* 184 */                   return z10Var;
                        }
/* 42 */                if (i4 != 1) {
/* 44 */                    if (i4 != 2) {
/* 60 */                        f42.m3656l("call to 'resume' before 'invoke' with coroutine");
/* 39 */                        return null;
                            }
/* 48 */                    dl1Var2 = (dl1) zzeaVar2.zza;
                            try {
/* 50 */                        pg3.m7417A(objInvoke);
/* 168 */                       zzeq zzeqVar = (zzeq) objInvoke;
/* 172 */                       ((gl1) dl1Var2).m3970g(null);
/* 175 */                       return zzeqVar;
                            } catch (Throwable th) {
/* 55 */                        th = th;
/* 180 */                       ((gl1) dl1Var2).m3970g(null);
/* 183 */                       throw th;
                            }
                        }
/* 64 */                long j3 = zzeaVar2.zzd;
/* 68 */                dl1 dl1Var4 = (dl1) zzeaVar2.zzc;
/* 70 */                zzdq zzdqVar3 = zzeaVar2.zzh;
/* 74 */                String str3 = (String) zzeaVar2.zza;
/* 76 */                pg3.m7417A(objInvoke);
/* 79 */                dl1Var = dl1Var4;
/* 80 */                zzdqVar2 = zzdqVar3;
/* 82 */                str2 = str3;
/* 83 */                j2 = j3;
/* 123 */               if (!Intrinsics.m6216a(zzdqVar2, zzdq.zza)) {
/* 134 */                   if (Intrinsics.m6216a(zzdqVar2, zzdq.zzb)) {
/* 136 */                       i2 = 4;
                            } else {
/* 138 */                       i = 2;
                            }
/* 143 */                   zzed zzedVar = new zzed(this, str2, null, zzdqVar2, j2, null);
/* 146 */                   zzeaVar2.zza = dl1Var;
/* 148 */                   zzeaVar2.zzb = null;
/* 150 */                   zzeaVar2.zzh = null;
/* 152 */                   zzeaVar2.zzc = null;
/* 154 */                   zzeaVar2.zzg = 2;
/* 161 */                   objInvoke = zzedVar.invoke(new zzhh(str2, i), zzeaVar2);
/* 165 */                   if (objInvoke != z10Var) {
/* 167 */                       dl1Var2 = dl1Var;
/* 168 */                       zzeq zzeqVar2 = (zzeq) objInvoke;
/* 172 */                       ((gl1) dl1Var2).m3970g(null);
/* 175 */                       return zzeqVar2;
                            }
/* 184 */                   return z10Var;
                        }
/* 125 */               i2 = 3;
/* 126 */               i = i2;
/* 143 */               zzed zzedVar2 = new zzed(this, str2, null, zzdqVar2, j2, null);
/* 146 */               zzeaVar2.zza = dl1Var;
/* 148 */               zzeaVar2.zzb = null;
/* 150 */               zzeaVar2.zzh = null;
/* 152 */               zzeaVar2.zzc = null;
/* 154 */               zzeaVar2.zzg = 2;
/* 161 */               objInvoke = zzedVar2.invoke(new zzhh(str2, i), zzeaVar2);
/* 165 */               if (objInvoke != z10Var) {
/* 167 */                   dl1Var2 = dl1Var;
/* 168 */                   zzeq zzeqVar3 = (zzeq) objInvoke;
/* 172 */                   ((gl1) dl1Var2).m3970g(null);
/* 175 */                   return zzeqVar3;
                        }
/* 184 */               return z10Var;
                    } catch (Throwable th2) {
/* 176 */               th = th2;
/* 177 */               dl1Var2 = dl1Var;
/* 180 */               ((gl1) dl1Var2).m3970g(null);
/* 183 */               throw th;
                    }
                }
            }
