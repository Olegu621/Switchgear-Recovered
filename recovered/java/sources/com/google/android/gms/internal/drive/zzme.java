            package com.google.android.gms.internal.drive;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzme implements zzlo {
                private final int flags;
                private final String info;
                private final Object[] zzue;
                private final zzlq zzuh;

                public zzme(zzlq zzlqVar, String str, Object[] objArr) {
/* 4 */             this.zzuh = zzlqVar;
/* 6 */             this.info = str;
/* 8 */             this.zzue = objArr;
/* 11 */            char cCharAt = str.charAt(0);
/* 18 */            if (cCharAt < 55296) {
/* 20 */                this.flags = cCharAt;
/* 22 */                return;
                    }
/* 23 */            int i = cCharAt & 8191;
/* 25 */            int i2 = 13;
/* 27 */            int i3 = 1;
                    while (true) {
/* 28 */                int i4 = i3 + 1;
/* 30 */                char cCharAt2 = str.charAt(i3);
/* 34 */                if (cCharAt2 < 55296) {
/* 47 */                    this.flags = i | (cCharAt2 << i2);
/* 49 */                    return;
                        } else {
/* 39 */                    i |= (cCharAt2 & 8191) << i2;
/* 40 */                    i2 += 13;
/* 42 */                    i3 = i4;
                        }
                    }
                }

                @Override // com.google.android.gms.internal.drive.zzlo
                public final int zzec() {
                    return (this.flags & 1) == 1 ? zzkk.zze.zzsf : zzkk.zze.zzsg;
                }

                @Override // com.google.android.gms.internal.drive.zzlo
                public final boolean zzed() {
                    return (this.flags & 2) == 2;
                }

                @Override // com.google.android.gms.internal.drive.zzlo
                public final zzlq zzee() {
/* 1 */             return this.zzuh;
                }

                public final String zzek() {
/* 1 */             return this.info;
                }

                public final Object[] zzel() {
/* 1 */             return this.zzue;
                }
            }
