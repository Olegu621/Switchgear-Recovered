            package com.google.android.recaptcha.internal;

            import java.io.IOException;
            import java.io.Serializable;
            import java.nio.charset.Charset;
            import java.util.Iterator;
            import java.util.Locale;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.fm0;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzqm implements Iterable, Serializable {
                public static final zzqm zzb = new zzqk(zzsv.zzb);
                private int zza = 0;

                static {
/* 10 */            int i = zzqa.zza;
                }

                public static int zzj(int i, int i2, int i3) {
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

                public static zzqm zzl(byte[] bArr, int i, int i2) {
/* 4 */             zzj(i, i + i2, bArr.length);
/* 9 */             byte[] bArr2 = new byte[i2];
/* 12 */            System.arraycopy(bArr, i, bArr2, 0, i2);
/* 15 */            return new zzqk(bArr2);
                }

                public abstract boolean equals(Object obj);

                public final int hashCode() {
/* 1 */             int iZzf = this.zza;
/* 3 */             if (iZzf == 0) {
/* 6 */                 int iZzd = zzd();
/* 10 */                iZzf = zzf(iZzd, 0, iZzd);
/* 14 */                if (iZzf == 0) {
/* 16 */                    iZzf = 1;
                        }
/* 17 */                this.zza = iZzf;
                    }
/* 19 */            return iZzf;
                }

                @Override // java.lang.Iterable
                public final /* synthetic */ Iterator iterator() {
/* 3 */             return new zzqf(this);
                }

                public final String toString() {
/* 1 */             Locale locale = Locale.ROOT;
/* 7 */             String hexString = Integer.toHexString(System.identityHashCode(this));
/* 11 */            int iZzd = zzd();
/* 41 */            String strZza = zzd() <= 50 ? zzuq.zza(this) : zzuq.zza(zzg(0, 47)).concat("...");
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

                public abstract void zze(byte[] bArr, int i, int i2, int i3);

                public abstract int zzf(int i, int i2, int i3);

                public abstract zzqm zzg(int i, int i2);

                public abstract String zzh(Charset charset);

                public abstract void zzi(zzqe zzqeVar) throws IOException;

                public final int zzk() {
/* 1 */             return this.zza;
                }

                public final String zzm() {
                    return zzd() == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : zzh(zzsv.zza);
                }

                public final boolean zzn() {
                    return zzd() == 0;
                }

                public final byte[] zzo() {
/* 1 */             int iZzd = zzd();
/* 5 */             if (iZzd == 0) {
/* 7 */                 return zzsv.zzb;
                    }
/* 10 */            byte[] bArr = new byte[iZzd];
/* 13 */            zze(bArr, 0, 0, iZzd);
/* 16 */            return bArr;
                }
            }
