            package com.google.android.recaptcha.internal;

            import android.content.ContentValues;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzgy extends tj2 implements Function2 {
                final /* synthetic */ zzgz zza;
                final /* synthetic */ zzzm zzb;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzgy(zzgz zzgzVar, zzzm zzzmVar, c10 c10Var) {
/* 6 */             super(2, c10Var);
/* 1 */             this.zza = zzgzVar;
/* 3 */             this.zzb = zzzmVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 7 */             return new zzgy(this.zza, this.zzb, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzgy) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 6 */             zzzm zzzmVar = this.zzb;
/* 8 */             zzgz zzgzVar = this.zza;
                    synchronized (zzgs.class) {
                        try {
/* 17 */                    if (zzgzVar.zzc != null) {
/* 21 */                        byte[] bArrZzd = zzzmVar.zzd();
/* 39 */                        zzgp zzgpVar = new zzgp(zzpp.zzg().zzi(bArrZzd, 0, bArrZzd.length), System.currentTimeMillis(), 0);
/* 1 */                         zzgo zzgoVar = zzgzVar.zzc;
/* 48 */                        ContentValues contentValues = new ContentValues();
/* 57 */                        contentValues.put("ss", zzgpVar.zzc());
/* 70 */                        contentValues.put("ts", Long.valueOf(zzgpVar.zzb()));
/* 80 */                        zzgoVar.getWritableDatabase().insert("ce", null, contentValues);
/* 91 */                        int iZzb = zzgzVar.zzc.zzb() - 500;
/* 93 */                        if (iZzb > 0) {
/* 111 */                           zzgzVar.zzc.zza(CollectionsKt.m6187F(iZzb, zzgzVar.zzc.zzd()));
                                }
/* 127 */                       if (zzgzVar.zzc.zzb() >= 20) {
/* 1 */                             zzgzVar.zzf();
                                }
                            }
                        } catch (Throwable th) {
/* 137 */                   throw th;
                        }
                    }
/* 133 */           return Unit.f12910a;
                }
            }
