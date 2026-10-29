            package com.google.android.gms.internal.auth;

            import java.io.Serializable;
            import java.nio.charset.Charset;
            import java.util.Comparator;
            import java.util.Iterator;
            import java.util.Locale;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.fm0;
            import p000.s80;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzee implements Iterable, Serializable {
                private static final Comparator zza;
                public static final zzee zzb = new zzeb(zzez.zzd);
                private static final zzed zzd;
                private int zzc = 0;

                static {
/* 10 */            int i = zzdr.zza;
/* 18 */            zzd = new zzed(null);
/* 25 */            zza = new zzdw();
                }

                public static int zzi(int i, int i2, int i3) {
/* 1 */             int i4 = i2 - i;
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

                public static zzee zzk(byte[] bArr, int i, int i2) {
/* 4 */             zzi(i, i + i2, bArr.length);
/* 9 */             byte[] bArr2 = new byte[i2];
/* 12 */            System.arraycopy(bArr, i, bArr2, 0, i2);
/* 15 */            return new zzeb(bArr2);
                }

                public static zzee zzl(String str) {
/* 9 */             return new zzeb(str.getBytes(zzez.zzb));
                }

                public abstract boolean equals(Object obj);

                public final int hashCode() {
/* 1 */             int iZze = this.zzc;
/* 3 */             if (iZze == 0) {
/* 5 */                 int iZzd = zzd();
/* 10 */                iZze = zze(iZzd, 0, iZzd);
/* 14 */                if (iZze == 0) {
/* 16 */                    iZze = 1;
                        }
/* 17 */                this.zzc = iZze;
                    }
/* 19 */            return iZze;
                }

                @Override // java.lang.Iterable
                public final /* synthetic */ Iterator iterator() {
/* 3 */             return new zzdv(this);
                }

                public final String toString() {
/* 1 */             Locale locale = Locale.ROOT;
/* 7 */             String hexString = Integer.toHexString(System.identityHashCode(this));
/* 11 */            int iZzd = zzd();
/* 41 */            String strZza = zzd() <= 50 ? zzgw.zza(this) : zzgw.zza(zzf(0, 47)).concat("...");
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

                public abstract zzee zzf(int i, int i2);

                public abstract String zzg(Charset charset);

                public abstract boolean zzh();

                public final int zzj() {
/* 1 */             return this.zzc;
                }

                public final String zzm(Charset charset) {
                    return zzd() == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : zzg(charset);
                }
            }
