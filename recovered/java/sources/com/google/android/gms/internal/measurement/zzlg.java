            package com.google.android.gms.internal.measurement;

            import java.io.IOException;
            import java.io.Serializable;
            import java.util.Iterator;
            import java.util.Locale;
            import p000.fm0;
            import p000.pk3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzlg implements Iterable, Serializable {
                public static final zzlg zzb = new zzlf(zzmo.zzb);
                private int zza = 0;

                static {
/* 10 */            int i = zzku.zza;
                }

                public static zzlg zzh(byte[] bArr, int i, int i2) {
/* 4 */             zzj(i, i + i2, bArr.length);
/* 9 */             byte[] bArr2 = new byte[i2];
/* 12 */            System.arraycopy(bArr, i, bArr2, 0, i2);
/* 15 */            return new zzlf(bArr2);
                }

                public static int zzj(int i, int i2, int i3) {
/* 3 */             int i4 = i2 - i;
/* 9 */             if ((i | i2 | i4 | (i3 - i2)) >= 0) {
/* 108 */               return i4;
                    }
/* 11 */            if (i < 0) {
/* 84 */                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 21);
/* 89 */                sb.append("Beginning index: ");
/* 92 */                sb.append(i);
/* 97 */                sb.append(" < 0");
/* 107 */               throw new IndexOutOfBoundsException(sb.toString());
                    }
/* 14 */            if (i2 < i) {
/* 39 */                pk3.m7470f(String.valueOf(i).length() + 44 + String.valueOf(i2).length(), "Beginning index larger than ending index: ", i, ", ", i2);
/* 13 */                return 0;
                    }
/* 66 */            pk3.m7470f(String.valueOf(i2).length() + 15 + String.valueOf(i3).length(), "End index: ", i2, " >= ", i3);
/* 13 */            return 0;
                }

                public abstract boolean equals(Object obj);

                public final int hashCode() {
/* 1 */             int iZzg = this.zza;
/* 3 */             if (iZzg == 0) {
/* 6 */                 int iZzc = zzc();
/* 10 */                iZzg = zzg(iZzc, 0, iZzc);
/* 14 */                if (iZzg == 0) {
/* 16 */                    iZzg = 1;
                        }
/* 17 */                this.zza = iZzg;
                    }
/* 19 */            return iZzg;
                }

                @Override // java.lang.Iterable
                public final /* synthetic */ Iterator iterator() {
/* 3 */             return new zzkz(this);
                }

                public final String toString() {
/* 1 */             Locale locale = Locale.ROOT;
/* 7 */             String hexString = Integer.toHexString(System.identityHashCode(this));
/* 11 */            int iZzc = zzc();
/* 41 */            String strZza = zzc() <= 50 ? zzof.zza(this) : zzof.zza(zze(0, 47)).concat("...");
/* 49 */            StringBuilder sb = new StringBuilder("<ByteString@");
/* 52 */            sb.append(hexString);
/* 57 */            sb.append(" size=");
/* 60 */            sb.append(iZzc);
/* 65 */            sb.append(" contents=\"");
/* 70 */            return fm0.m3789o(sb, strZza, "\">");
                }

                public abstract byte zza(int i);

                public abstract byte zzb(int i);

                public abstract int zzc();

                public abstract zzlg zze(int i, int i2);

                public abstract void zzf(zzky zzkyVar) throws IOException;

                public abstract int zzg(int i, int i2, int i3);

                public final int zzi() {
/* 1 */             return this.zza;
                }
            }
