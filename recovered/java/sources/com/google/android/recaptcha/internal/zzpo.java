            package com.google.android.recaptcha.internal;

            import java.io.IOException;
            import java.math.RoundingMode;
            import java.util.Objects;
            import p000.C1951n4;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 33 */    class zzpo extends zzpp {
                public static final /* synthetic */ int zzc = 0;
                final zzpk zza;
                final Character zzb;

                public zzpo(zzpk zzpkVar, Character ch) {
/* 4 */             this.zza = zzpkVar;
/* 6 */             if (ch == null || !zzpkVar.zzd('=')) {
/* 32 */                this.zzb = ch;
                    } else {
/* 27 */                C1951n4.m6859j(zzmg.zza("Padding character %s was already in alphabet", ch));
/* 31 */                throw null;
                    }
                }

                public final boolean equals(Object obj) {
/* 4 */             if (obj instanceof zzpo) {
/* 6 */                 zzpo zzpoVar = (zzpo) obj;
/* 16 */                if (this.zza.equals(zzpoVar.zza) && Objects.equals(this.zzb, zzpoVar.zzb)) {
/* 28 */                    return true;
                        }
                    }
/* 3 */             return false;
                }

                public final int hashCode() {
/* 13 */            return this.zza.hashCode() ^ Objects.hashCode(this.zzb);
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("BaseEncoding.");
/* 8 */             zzpk zzpkVar = this.zza;
/* 10 */            sb.append(zzpkVar);
/* 18 */            if (8 % zzpkVar.zzb != 0) {
/* 20 */                Character ch = this.zzb;
/* 22 */                if (ch == null) {
/* 26 */                    sb.append(".omitPadding()");
                        } else {
/* 32 */                    sb.append(".withPadChar('");
/* 35 */                    sb.append(ch);
/* 40 */                    sb.append("')");
                        }
                    }
/* 43 */            return sb.toString();
                }

                @Override // com.google.android.recaptcha.internal.zzpp
                public int zza(byte[] bArr, CharSequence charSequence) throws zzpn {
                    int i;
/* 5 */             CharSequence charSequenceZze = zze(charSequence);
/* 9 */             int length = charSequenceZze.length();
/* 13 */            zzpk zzpkVar = this.zza;
/* 19 */            if (!zzpkVar.zzc(length)) {
/* 113 */               throw new zzpn(fm0.m3781g(charSequenceZze.length(), "Invalid input length "));
                    }
/* 22 */            int i2 = 0;
/* 23 */            int i3 = 0;
/* 28 */            while (i2 < charSequenceZze.length()) {
/* 30 */                long jZzb = 0;
/* 32 */                int i4 = 0;
/* 33 */                int i5 = 0;
                        while (true) {
/* 34 */                    i = zzpkVar.zzc;
/* 36 */                    if (i4 >= i) {
                                break;
                            }
/* 40 */                    jZzb <<= zzpkVar.zzb;
/* 47 */                    if (i2 + i4 < charSequenceZze.length()) {
/* 61 */                        jZzb |= (long) zzpkVar.zzb(charSequenceZze.charAt(i5 + i2));
/* 49 */                        i5++;
                            }
/* 63 */                    i4++;
                        }
/* 66 */                int i6 = zzpkVar.zzd;
/* 70 */                int i7 = i5 * zzpkVar.zzb;
/* 73 */                int i8 = (i6 - 1) * 8;
/* 78 */                while (i8 >= (i6 * 8) - i7) {
/* 89 */                    bArr[i3] = (byte) ((jZzb >>> i8) & 255);
/* 91 */                    i8 -= 8;
/* 80 */                    i3++;
                        }
/* 95 */                i2 += i;
                    }
/* 97 */            return i3;
                }

                @Override // com.google.android.recaptcha.internal.zzpp
                public void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
/* 2 */             int i3 = 0;
/* 3 */             zzmd.zzd(0, i2, bArr.length);
/* 6 */             while (i3 < i2) {
/* 10 */                int i4 = this.zza.zzd;
/* 18 */                zzf(appendable, bArr, i3, Math.min(i4, i2 - i3));
/* 21 */                i3 += i4;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zzpp
                public final int zzc(int i) {
/* 14 */            return (int) (((((long) this.zza.zzb) * ((long) i)) + 7) / 8);
                }

                @Override // com.google.android.recaptcha.internal.zzpp
                public final int zzd(int i) {
/* 1 */             zzpk zzpkVar = this.zza;
/* 13 */            return zzpkVar.zzc * zzpr.zza(i, zzpkVar.zzd, RoundingMode.CEILING);
                }

                @Override // com.google.android.recaptcha.internal.zzpp
                public final CharSequence zze(CharSequence charSequence) {
/* 1 */             charSequence.getClass();
/* 6 */             if (this.zzb == null) {
/* 8 */                 return charSequence;
                    }
/* 9 */             int length = charSequence.length();
/* 23 */            do {
/* 13 */                length--;
/* 15 */                if (length < 0) {
                            break;
                        }
/* 23 */            } while (charSequence.charAt(length) == '=');
/* 28 */            return charSequence.subSequence(0, length + 1);
                }

                public final void zzf(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
/* 4 */             zzmd.zzd(i, i + i2, bArr.length);
/* 7 */             zzpk zzpkVar = this.zza;
/* 9 */             int i3 = zzpkVar.zzd;
/* 11 */            int i4 = 0;
/* 17 */            zzmd.zza(i2 <= i3);
/* 20 */            long j = 0;
/* 25 */            for (int i5 = 0; i5 < i2; i5++) {
/* 35 */                j = (j | ((long) (bArr[i + i5] & 255))) << 8;
                    }
/* 41 */            int i6 = (i2 + 1) * 8;
/* 42 */            int i7 = zzpkVar.zzb;
/* 46 */            while (i4 < i2 * 8) {
/* 61 */                appendable.append(zzpkVar.zza(zzpkVar.zza & ((int) (j >>> ((i6 - i7) - i4)))));
/* 64 */                i4 += i7;
                    }
/* 68 */            if (this.zzb != null) {
/* 72 */                while (i4 < i3 * 8) {
/* 76 */                    appendable.append('=');
/* 79 */                    i4 += i7;
                        }
                    }
                }

/* 34 */        public zzpo(String str, String str2, Character ch) {
/* 35 */            this(new zzpk(str, str2.toCharArray()), ch);
                }
            }
