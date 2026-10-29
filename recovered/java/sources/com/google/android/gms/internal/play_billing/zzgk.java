            package com.google.android.gms.internal.play_billing;

            import java.io.IOException;
            import java.io.Serializable;
            import java.util.Iterator;
            import java.util.Locale;
            import p000.AbstractC0886en;
            import p000.fm0;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzgk implements Iterable, Serializable {
                public static final zzgk zzb = new zzgi(zzhp.zzb);
                private int zza = 0;

                static {
/* 10 */            int i = zzfy.zza;
                }

                public static int zzh(int i, int i2, int i3) {
/* 3 */             int i4 = i2 - i;
/* 9 */             if ((i | i2 | i4 | (i3 - i2)) >= 0) {
/* 52 */                return i4;
                    }
/* 11 */            if (i < 0) {
/* 48 */                s80.m8425f(AbstractC0886en.m3505i(i, "Beginning index: ", " < 0"));
/* 26 */                return 0;
                    }
/* 13 */            if (i2 < i) {
/* 23 */                s80.m8425f(AbstractC0886en.m3506j("Beginning index larger than ending index: ", i, i2, ", "));
/* 26 */                return 0;
                    }
/* 36 */            s80.m8425f(AbstractC0886en.m3506j("End index: ", i2, i3, " >= "));
/* 26 */            return 0;
                }

                public static zzgk zzj(byte[] bArr, int i, int i2) {
/* 4 */             zzh(i, i + i2, bArr.length);
/* 9 */             byte[] bArr2 = new byte[i2];
/* 12 */            System.arraycopy(bArr, i, bArr2, 0, i2);
/* 15 */            return new zzgi(bArr2);
                }

                public abstract boolean equals(Object obj);

                public final int hashCode() {
/* 1 */             int iZze = this.zza;
/* 3 */             if (iZze == 0) {
/* 6 */                 int iZzd = zzd();
/* 10 */                iZze = zze(iZzd, 0, iZzd);
/* 14 */                if (iZze == 0) {
/* 16 */                    iZze = 1;
                        }
/* 17 */                this.zza = iZze;
                    }
/* 19 */            return iZze;
                }

                @Override // java.lang.Iterable
                public final /* synthetic */ Iterator iterator() {
/* 3 */             return new zzgd(this);
                }

                public final String toString() {
/* 1 */             Locale locale = Locale.ROOT;
/* 7 */             String hexString = Integer.toHexString(System.identityHashCode(this));
/* 11 */            int iZzd = zzd();
/* 41 */            String strZza = zzd() <= 50 ? zzjh.zza(this) : zzjh.zza(zzf(0, 47)).concat("...");
/* 49 */            StringBuilder sb = new StringBuilder("<ByteString@");
/* 52 */            sb.append(hexString);
/* 57 */            sb.append(" size=");
/* 60 */            sb.append(iZzd);
/* 65 */            sb.append(" contents=\"");
/* 70 */            return fm0.m3789o(sb, strZza, "\">");
                }

                public abstract byte zza(int i);

                public abstract byte zzb(int i);

                public abstract int zzd();

                public abstract int zze(int i, int i2, int i3);

                public abstract zzgk zzf(int i, int i2);

                public abstract void zzg(zzgc zzgcVar) throws IOException;

                public final int zzi() {
/* 1 */             return this.zza;
                }
            }
