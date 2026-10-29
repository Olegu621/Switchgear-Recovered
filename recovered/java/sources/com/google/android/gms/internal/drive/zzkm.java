            package com.google.android.gms.internal.drive;

            import java.nio.ByteBuffer;
            import java.nio.charset.Charset;
            import p000.C1951n4;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 7 */     public final class zzkm {
                public static final byte[] zzsn;
                private static final ByteBuffer zzso;
                private static final zzjo zzsp;
                static final Charset UTF_8 = Charset.forName("UTF-8");
                private static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");

                static {
/* 18 */            byte[] bArr = new byte[0];
/* 20 */            zzsn = bArr;
/* 26 */            zzso = ByteBuffer.wrap(bArr);
/* 33 */            zzsp = zzjo.zza(bArr, 0, bArr.length, false);
                }

                public static <T> T checkNotNull(T t) {
/* 1 */             t.getClass();
/* 4 */             return t;
                }

                public static int hashCode(byte[] bArr) {
/* 1 */             int length = bArr.length;
/* 3 */             int iZza = zza(length, bArr, 0, length);
/* 7 */             if (iZza == 0) {
/* 9 */                 return 1;
                    }
/* 10 */            return iZza;
                }

                public static Object zza(Object obj, Object obj2) {
/* 13 */            return ((zzlq) obj).zzcy().zza((zzlq) obj2).zzde();
                }

                public static boolean zzd(byte[] bArr) {
/* 1 */             return zznf.zzd(bArr);
                }

                public static int zze(boolean z) {
                    return z ? 1231 : 1237;
                }

                public static boolean zzf(zzlq zzlqVar) {
/* 1 */             return false;
                }

                public static int zzu(long j) {
/* 6 */             return (int) (j ^ (j >>> 32));
                }

/* 8 */         public static String zze(byte[] bArr) {
/* 9 */             return new String(bArr, UTF_8);
                }

/* 17 */        public static int zza(int i, byte[] bArr, int i2, int i3) {
                    for (int i4 = i2; i4 < i2 + i3; i4++) {
/* 18 */                i = (i * 31) + bArr[i4];
                    }
                    return i;
                }

/* 18 */        public static <T> T zza(T t, String str) {
                    if (t != null) {
                        return t;
                    }
/* 19 */            C1951n4.m6868s(str);
                    return null;
                }
            }
