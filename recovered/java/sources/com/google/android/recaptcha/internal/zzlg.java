            package com.google.android.recaptcha.internal;

            import android.webkit.WebView;
            import kotlin.Unit;
            import kotlin.jvm.functions.Function2;
            import p000.c10;
            import p000.pg3;
            import p000.tj2;
            import p000.y10;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzlg extends tj2 implements Function2 {
                Object zza;
                int zzb;
                final /* synthetic */ zzly zzc;
                final /* synthetic */ zzhk zzd;
                final /* synthetic */ String zze;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzlg(zzly zzlyVar, zzhk zzhkVar, String str, c10 c10Var) {
/* 8 */             super(2, c10Var);
/* 1 */             this.zzc = zzlyVar;
/* 3 */             this.zzd = zzhkVar;
/* 5 */             this.zze = str;
                }

                @Override // p000.AbstractC0181bi
                public final c10 create(Object obj, c10 c10Var) {
/* 9 */             return new zzlg(this.zzc, this.zzd, this.zze, c10Var);
                }

                @Override // kotlin.jvm.functions.Function2
                public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
/* 13 */            return ((zzlg) create((y10) obj, (c10) obj2)).invokeSuspend(Unit.f12910a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
                
                    if (com.google.android.recaptcha.internal.zzhj.zzb(r1, (com.google.android.recaptcha.internal.zzhf) r6, r5) == r0) goto L18;
                 */
                @Override // p000.AbstractC0181bi
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) {
                    zzhk zzhkVar;
/* 1 */             z10 z10Var = z10.f19902a;
/* 3 */             int i = this.zzb;
/* 8 */             if (i == 0) {
/* 30 */                pg3.m7417A(obj);
/* 33 */                zzly zzlyVar = this.zzc;
/* 35 */                this.zzb = 1;
/* 37 */                obj = zzlyVar.zzv(this);
/* 41 */                if (obj != z10Var) {
                        }
/* 89 */                return z10Var;
                    }
/* 10 */            if (i == 1) {
/* 26 */                pg3.m7417A(obj);
                    } else if (i != 2) {
/* 14 */                pg3.m7417A(obj);
                    } else {
/* 20 */                zzhkVar = (zzhk) this.zza;
/* 22 */                pg3.m7417A(obj);
/* 74 */                this.zza = null;
/* 77 */                this.zzb = 3;
                    }
/* 86 */            return Unit.f12910a;
/* 45 */            ((WebView) obj).clearCache(true);
/* 48 */            zzhkVar = this.zzd;
/* 50 */            zzly zzlyVar2 = this.zzc;
/* 52 */            String str = this.zze;
/* 54 */            this.zza = zzhkVar;
/* 56 */            this.zzb = 2;
/* 67 */            obj = new zzhf(26, new zzli(zzlyVar2, str, null), null);
/* 70 */            if (obj != z10Var) {
/* 74 */                this.zza = null;
/* 77 */                this.zzb = 3;
                    }
/* 89 */            return z10Var;
                }
            }
