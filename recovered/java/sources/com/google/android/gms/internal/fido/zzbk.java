            package com.google.android.gms.internal.fido;

            import java.io.IOException;
            import java.math.RoundingMode;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 35 */    class zzbk extends zzbl {
                final zzbh zzb;
                final Character zzc;

                public zzbk(zzbh zzbhVar, Character ch) {
/* 4 */             this.zzb = zzbhVar;
/* 6 */             if (ch == null || !zzbhVar.zzb(ch.charValue())) {
/* 34 */                this.zzc = ch;
                    } else {
/* 29 */                C1951n4.m6859j(zzat.zza("Padding character %s was already in alphabet", ch));
/* 33 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof zzbk) {
/* 6 */                 zzbk zzbkVar = (zzbk) obj;
/* 16 */                if (this.zzb.equals(zzbkVar.zzb)) {
/* 18 */                    Character ch = this.zzc;
/* 20 */                    Character ch2 = zzbkVar.zzc;
/* 22 */                    if (ch == ch2) {
/* 32 */                        return true;
                            }
/* 24 */                    if (ch != null && ch.equals(ch2)) {
/* 32 */                        return true;
                            }
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 3 */             int iHashCode = this.zzb.hashCode();
/* 7 */             Character ch = this.zzc;
/* 17 */            return (ch == null ? 0 : ch.hashCode()) ^ iHashCode;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("BaseEncoding.");
/* 10 */            sb.append(this.zzb);
/* 20 */            if (8 % this.zzb.zzb != 0) {
/* 24 */                if (this.zzc == null) {
/* 28 */                    sb.append(".omitPadding()");
                        } else {
/* 34 */                    sb.append(".withPadChar('");
/* 39 */                    sb.append(this.zzc);
/* 44 */                    sb.append("')");
                        }
                    }
/* 47 */            return sb.toString();
                }

                @Override // com.google.android.gms.internal.fido.zzbl
                public void zza(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
/* 2 */             int i3 = 0;
/* 3 */             zzas.zze(0, i2, bArr.length);
/* 6 */             while (i3 < i2) {
/* 18 */                zzc(appendable, bArr, i3, Math.min(this.zzb.zzd, i2 - i3));
/* 25 */                i3 += this.zzb.zzd;
                    }
                }

                @Override // com.google.android.gms.internal.fido.zzbl
                public final int zzb(int i) {
/* 1 */             zzbh zzbhVar = this.zzb;
/* 13 */            return zzbn.zza(i, zzbhVar.zzd, RoundingMode.CEILING) * zzbhVar.zzc;
                }

                public final void zzc(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
/* 4 */             zzas.zze(i, i + i2, bArr.length);
/* 11 */            int i3 = 0;
/* 17 */            zzas.zzc(i2 <= this.zzb.zzd);
/* 20 */            long j = 0;
/* 25 */            for (int i4 = 0; i4 < i2; i4++) {
/* 35 */                j = (j | ((long) (bArr[i + i4] & 255))) << 8;
                    }
/* 46 */            int i5 = ((i2 + 1) * 8) - this.zzb.zzb;
/* 49 */            while (i3 < i2 * 8) {
/* 55 */                zzbh zzbhVar = this.zzb;
/* 65 */                appendable.append(zzbhVar.zza(zzbhVar.zza & ((int) (j >>> (i5 - i3)))));
/* 72 */                i3 += this.zzb.zzb;
                    }
/* 76 */            if (this.zzc != null) {
/* 83 */                while (i3 < this.zzb.zzd * 8) {
/* 91 */                    appendable.append(this.zzc.charValue());
/* 98 */                    i3 += this.zzb.zzb;
                        }
                    }
                }

/* 36 */        public zzbk(String str, String str2, Character ch) {
/* 37 */            this(new zzbh(str, str2.toCharArray()), ch);
                }
            }
