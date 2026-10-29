            package com.google.android.gms.internal.play_billing;

            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzcq {
                Object[] zza = new Object[8];
                int zzb = 0;
                zzcp zzc;

                public final zzcq zza(Object obj, Object obj2) {
/* 3 */             int i = this.zzb + 1;
/* 5 */             Object[] objArr = this.zza;
/* 7 */             int length = objArr.length;
/* 8 */             int i2 = i + i;
/* 9 */             if (i2 > length) {
/* 19 */                this.zza = Arrays.copyOf(objArr, zzci.zzc(length, i2));
                    }
/* 21 */            zzbw.zzb(obj, obj2);
/* 24 */            Object[] objArr2 = this.zza;
/* 26 */            int i3 = this.zzb;
/* 28 */            int i4 = i3 + i3;
/* 30 */            objArr2[i4] = obj;
/* 34 */            objArr2[i4 + 1] = obj2;
/* 38 */            this.zzb = i3 + 1;
/* 40 */            return this;
                }

                public final zzcr zzb() {
/* 1 */             zzcp zzcpVar = this.zzc;
/* 3 */             if (zzcpVar != null) {
/* 27 */                throw zzcpVar.zza();
                    }
/* 9 */             zzdp zzdpVarZzg = zzdp.zzg(this.zzb, this.zza, this);
/* 13 */            zzcp zzcpVar2 = this.zzc;
/* 15 */            if (zzcpVar2 == null) {
/* 17 */                return zzdpVarZzg;
                    }
/* 22 */            throw zzcpVar2.zza();
                }
            }
