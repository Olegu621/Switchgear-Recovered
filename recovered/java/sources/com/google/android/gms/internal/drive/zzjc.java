            package com.google.android.gms.internal.drive;

            import java.io.IOException;
            import java.io.Serializable;
            import java.nio.charset.Charset;
            import java.util.Comparator;
            import java.util.Iterator;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 110 */   public abstract class zzjc implements Serializable, Iterable<Byte> {
                public static final zzjc zznq = new zzjm(zzkm.zzsn);
                private static final zzji zznr;
                private static final Comparator<zzjc> zznt;
                private int zzns = 0;

                static {
/* 14 */            zzjd zzjdVar = null;
/* 28 */            zznr = zzix.zzbr() ? new zzjn(zzjdVar) : new zzjg(zzjdVar);
/* 35 */            zznt = new zzje();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static int zza(byte b) {
/* 1 */             return b & 255;
                }

                public static int zzb(int i, int i2, int i3) {
/* 1 */             int i4 = i2 - i;
/* 9 */             if ((i | i2 | i4 | (i3 - i2)) >= 0) {
/* 111 */               return i4;
                    }
/* 11 */            if (i < 0) {
/* 87 */                StringBuilder sb = new StringBuilder(32);
/* 92 */                sb.append("Beginning index: ");
/* 95 */                sb.append(i);
/* 100 */               sb.append(" < 0");
/* 110 */               throw new IndexOutOfBoundsException(sb.toString());
                    }
/* 13 */            if (i2 < i) {
/* 21 */                StringBuilder sb2 = new StringBuilder(66);
/* 26 */                sb2.append("Beginning index larger than ending index: ");
/* 29 */                sb2.append(i);
/* 34 */                sb2.append(", ");
/* 37 */                sb2.append(i2);
/* 47 */                throw new IndexOutOfBoundsException(sb2.toString());
                    }
/* 54 */            StringBuilder sb3 = new StringBuilder(37);
/* 59 */            sb3.append("End index: ");
/* 62 */            sb3.append(i2);
/* 67 */            sb3.append(" >= ");
/* 70 */            sb3.append(i3);
/* 80 */            throw new IndexOutOfBoundsException(sb3.toString());
                }

                public static zzjc zzk(String str) {
/* 9 */             return new zzjm(str.getBytes(zzkm.UTF_8));
                }

                public static zzjk zzu(int i) {
/* 4 */             return new zzjk(i, null);
                }

                public abstract boolean equals(Object obj);

                public final int hashCode() {
/* 1 */             int iZza = this.zzns;
/* 3 */             if (iZza == 0) {
/* 5 */                 int size = size();
/* 10 */                iZza = zza(size, 0, size);
/* 14 */                if (iZza == 0) {
/* 16 */                    iZza = 1;
                        }
/* 17 */                this.zzns = iZza;
                    }
/* 19 */            return iZza;
                }

                @Override // java.lang.Iterable
                public /* synthetic */ Iterator<Byte> iterator() {
/* 3 */             return new zzjd(this);
                }

                public abstract int size();

                public final String toString() {
/* 23 */            return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
                }

                public abstract int zza(int i, int i2, int i3);

                public abstract zzjc zza(int i, int i2);

                public abstract String zza(Charset charset);

                public abstract void zza(zzjb zzjbVar) throws IOException;

                public final String zzbt() {
                    return size() == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : zza(zzkm.UTF_8);
                }

                public abstract boolean zzbu();

                public final int zzbv() {
/* 1 */             return this.zzns;
                }

                public abstract byte zzs(int i);

                public abstract byte zzt(int i);

/* 111 */       public static zzjc zzb(byte[] bArr, int i, int i2) {
/* 112 */           zzb(i, i + i2, bArr.length);
/* 113 */           return new zzjm(zznr.zzc(bArr, i, i2));
                }
            }
