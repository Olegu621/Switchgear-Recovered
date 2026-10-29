            package com.google.android.gms.internal.auth;

            import java.nio.ByteBuffer;
            import java.nio.charset.Charset;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzez {
                static final Charset zza = Charset.forName("US-ASCII");
                static final Charset zzb = Charset.forName("UTF-8");
                static final Charset zzc = Charset.forName("ISO-8859-1");
                public static final byte[] zzd;
                public static final ByteBuffer zze;
                public static final zzei zzf;

                static {
/* 26 */            byte[] bArr = new byte[0];
/* 28 */            zzd = bArr;
/* 34 */            zze = ByteBuffer.wrap(bArr);
/* 42 */            zzeg zzegVar = new zzeg(bArr, 0, 0, false, null);
                    try {
/* 45 */                zzegVar.zza(0);
/* 48 */                zzf = zzegVar;
                    } catch (zzfa e) {
/* 52 */                C1951n4.m6863n(e);
                    }
                }

                public static int zza(boolean z) {
                    return z ? 1231 : 1237;
                }

                public static int zzb(byte[] bArr) {
/* 1 */             int length = bArr.length;
/* 3 */             int iZzd = zzd(length, bArr, 0, length);
/* 7 */             if (iZzd == 0) {
/* 9 */                 return 1;
                    }
/* 10 */            return iZzd;
                }

                public static int zzc(long j) {
/* 6 */             return (int) (j ^ (j >>> 32));
                }

                public static int zzd(int i, byte[] bArr, int i2, int i3) {
/* 2 */             for (int i4 = 0; i4 < i3; i4++) {
/* 8 */                 i = (i * 31) + bArr[i4];
                    }
/* 12 */            return i;
                }

                public static Object zze(Object obj) {
/* 1 */             obj.getClass();
/* 4 */             return obj;
                }

                public static Object zzf(Object obj, String str) {
/* 1 */             if (obj != null) {
/* 3 */                 return obj;
                    }
/* 4 */             C1951n4.m6868s(str);
/* 7 */             return null;
                }

                public static Object zzg(Object obj, Object obj2) {
/* 13 */            return ((zzfw) obj).zzd().zzc((zzfw) obj2).zzg();
                }

                public static String zzh(byte[] bArr) {
/* 5 */             return new String(bArr, zzb);
                }

                public static boolean zzi(byte[] bArr) {
/* 1 */             return zzhm.zzc(bArr);
                }
            }
