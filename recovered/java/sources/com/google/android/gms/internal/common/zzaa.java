            package com.google.android.gms.internal.common;

            import java.util.Arrays;
            import p000.AbstractC0208c9;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            class zzaa extends zzab {
                Object[] zza = new Object[4];
                int zzb = 0;
                boolean zzc;

                public zzaa(int i) {
                }

                public final zzaa zza(Object obj) {
                    int i;
/* 1 */             obj.getClass();
/* 6 */             int length = this.zza.length;
/* 7 */             int i2 = this.zzb;
/* 9 */             int i3 = i2 + 1;
/* 11 */            if (i3 < 0) {
/* 65 */                C1951n4.m6859j("cannot store more than Integer.MAX_VALUE elements");
/* 68 */                return null;
                    }
/* 13 */            if (i3 <= length) {
/* 15 */                i = length;
                    } else {
/* 20 */                i = (length >> 1) + length + 1;
/* 22 */                if (i < i3) {
/* 24 */                    int iHighestOneBit = Integer.highestOneBit(i2);
/* 28 */                    i = iHighestOneBit + iHighestOneBit;
                        }
/* 30 */                if (i < 0) {
/* 32 */                    i = AbstractC0208c9.API_PRIORITY_OTHER;
                        }
                    }
/* 35 */            if (i > length || this.zzc) {
/* 47 */                this.zza = Arrays.copyOf(this.zza, i);
/* 50 */                this.zzc = false;
                    }
/* 52 */            Object[] objArr = this.zza;
/* 54 */            int i4 = this.zzb;
/* 58 */            this.zzb = i4 + 1;
/* 60 */            objArr[i4] = obj;
/* 62 */            return this;
                }
            }
