            package com.google.android.gms.internal.common;

            import p000.AbstractC0208c9;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            abstract class zzv extends zzk {
                final CharSequence zzb;
                final zzp zzc;
                final boolean zzd;
                int zze = 0;
                int zzf = AbstractC0208c9.API_PRIORITY_OTHER;

                public zzv(zzw zzwVar, CharSequence charSequence) {
/* 11 */            this.zzc = zzwVar.zzf();
/* 17 */            this.zzd = zzwVar.zzg();
/* 24 */            this.zzb = charSequence;
                }

                @Override // com.google.android.gms.internal.common.zzk
                public final /* bridge */ /* synthetic */ Object zza() {
                    int iZzd;
/* 1 */             int i = this.zze;
                    while (true) {
/* 3 */                 int i2 = this.zze;
/* 6 */                 if (i2 == -1) {
/* 108 */                   zzb();
/* 111 */                   return null;
                        }
/* 8 */                 int iZzc = zzc(i2);
/* 12 */                if (iZzc == -1) {
/* 16 */                    iZzc = this.zzb.length();
/* 20 */                    this.zze = -1;
/* 22 */                    iZzd = -1;
                        } else {
/* 24 */                    iZzd = zzd(iZzc);
/* 28 */                    this.zze = iZzd;
                        }
/* 30 */                if (iZzd == i) {
/* 32 */                    int i3 = iZzd + 1;
/* 34 */                    this.zze = i3;
/* 42 */                    if (i3 > this.zzb.length()) {
/* 44 */                        this.zze = -1;
                            }
                        } else {
/* 47 */                    if (i < iZzc) {
/* 51 */                        this.zzb.charAt(i);
                            }
/* 54 */                    if (i < iZzc) {
/* 60 */                        this.zzb.charAt(iZzc - 1);
                            }
/* 65 */                    if (!this.zzd || i != iZzc) {
/* 72 */                        int i4 = this.zzf;
/* 75 */                        if (i4 == 1) {
/* 77 */                            CharSequence charSequence = this.zzb;
/* 79 */                            int length = charSequence.length();
/* 83 */                            this.zze = -1;
/* 85 */                            if (length > i) {
/* 89 */                                charSequence.charAt(length - 1);
                                    }
/* 92 */                            iZzc = length;
                                } else {
/* 95 */                            this.zzf = i4 - 1;
                                }
/* 103 */                       return this.zzb.subSequence(i, iZzc).toString();
                            }
/* 69 */                    i = this.zze;
                        }
                    }
                }

                public abstract int zzc(int i);

                public abstract int zzd(int i);
            }
