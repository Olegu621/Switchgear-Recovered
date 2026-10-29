            package com.google.android.recaptcha.internal;

            import android.os.Build;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.C2085pw;
            import p000.C2103qd;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzy extends tj2 implements Function2 {
                final /* synthetic */ zzz zza;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzy(zzz zzzVar, c10 c10Var) {
/* 4 */             super(2, c10Var);
/* 1 */             this.zza = zzzVar;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 5 */             return new zzy(this.zza, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzy) create((zzhk) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                @Override // p000.AbstractC0181bi
                public final Object invokeSuspend(Object obj) {
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             pg3.m7417A(obj);
/* 6 */             zzyu zzyuVarZzf = zzyx.zzf();
/* 12 */            zzz zzzVar = this.zza;
/* 16 */            zzyw zzywVarZzb = zzz.zzb(zzzVar, Build.MANUFACTURER);
/* 22 */            zzyw zzywVarZzb2 = zzz.zzb(zzzVar, Build.MODEL);
/* 28 */            zzyw zzywVarZzb3 = zzz.zzb(zzzVar, Build.DEVICE);
/* 34 */            zzyw zzywVarZzb4 = zzz.zzb(zzzVar, Build.HARDWARE);
/* 40 */            zzyw zzywVarZzb5 = zzz.zzb(zzzVar, Build.FINGERPRINT);
/* 46 */            zzyw zzywVarZzb6 = zzz.zzb(zzzVar, Build.PRODUCT);
/* 52 */            zzyw zzywVarZzb7 = zzz.zzb(zzzVar, Build.BOARD);
/* 58 */            zzyw zzywVarZzb8 = zzz.zzb(zzzVar, Build.BRAND);
/* 72 */            zzyw zzywVarZzb9 = zzz.zzb(zzzVar, C2103qd.m7775j(",", 56, Build.SUPPORTED_ABIS));
/* 76 */            long j = Build.TIME;
/* 78 */            zzyv zzyvVarZzf = zzyw.zzf();
/* 82 */            zzyvVarZzf.zzv(j);
/* 130 */           zzyuVarZzf.zze(C2085pw.m7566e(zzywVarZzb, zzywVarZzb2, zzywVarZzb3, zzywVarZzb4, zzywVarZzb5, zzywVarZzb6, zzywVarZzb7, zzywVarZzb8, zzywVarZzb9, (zzyw) zzyvVarZzf.zzk(), zzz.zzb(zzzVar, Build.ID), zzz.zzb(zzzVar, Build.BOOTLOADER), zzz.zzb(zzzVar, Build.DISPLAY), zzz.zzb(zzzVar, Build.TYPE), zzz.zzb(zzzVar, Build.TAGS)));
/* 139 */           return zzas.zzb(zzzVar, (zzyx) zzyuVarZzf.zzk());
                }
            }
