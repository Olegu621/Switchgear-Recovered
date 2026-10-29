            package com.google.android.gms.internal.play_billing;

            import java.util.Arrays;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class zzch extends zzci {
                Object[] zza;
                int zzb;
                boolean zzc;

                public zzch(int i) {
/* 6 */             zzbw.zza(i, "initialCapacity");
/* 11 */            this.zza = new Object[i];
/* 14 */            this.zzb = 0;
                }

                private final void zzd(int i) {
/* 3 */             int length = this.zza.length;
/* 7 */             int iZzc = zzci.zzc(length, this.zzb + i);
/* 11 */            if (iZzc > length || this.zzc) {
/* 25 */                this.zza = Arrays.copyOf(this.zza, iZzc);
/* 28 */                this.zzc = false;
                    }
                }

                public final zzch zza(Object obj) {
/* 1 */             obj.getClass();
/* 5 */             zzd(1);
/* 8 */             Object[] objArr = this.zza;
/* 10 */            int i = this.zzb;
/* 14 */            this.zzb = i + 1;
/* 16 */            objArr[i] = obj;
/* 18 */            return this;
                }

                public final void zzb(Object[] objArr, int i) {
/* 1 */             zzdd.zzb(objArr, i);
/* 4 */             zzd(i);
/* 12 */            System.arraycopy(objArr, 0, this.zza, this.zzb, i);
/* 18 */            this.zzb += i;
                }
            }
