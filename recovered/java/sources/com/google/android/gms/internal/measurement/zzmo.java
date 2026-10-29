            package com.google.android.gms.internal.measurement;

            import java.nio.ByteBuffer;
            import java.nio.charset.Charset;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzmo {
                static final Charset zza;
                public static final byte[] zzb;

                static {
/* 3 */             Charset.forName("US-ASCII");
/* 12 */            zza = Charset.forName("UTF-8");
/* 16 */            Charset.forName("ISO-8859-1");
/* 20 */            byte[] bArr = new byte[0];
/* 22 */            zzb = bArr;
/* 24 */            ByteBuffer.wrap(bArr);
                    try {
/* 36 */                new zzlh(bArr, 0, 0, false, null).zza(0);
                    } catch (zzmq e) {
/* 41 */                C1951n4.m6863n(e);
                    }
                }

                public static Object zza(Object obj, String str) {
/* 1 */             if (obj != null) {
/* 3 */                 return obj;
                    }
/* 6 */             C1951n4.m6868s("messageType");
/* 9 */             return null;
                }

                public static int zzb(boolean z) {
                    return z ? 1231 : 1237;
                }

                public static int zzc(int i, byte[] bArr, int i2, int i3) {
/* 2 */             for (int i4 = 0; i4 < i3; i4++) {
/* 8 */                 i = (i * 31) + bArr[i4];
                    }
/* 12 */            return i;
                }

                public static boolean zzd(zznl zznlVar) {
/* 3 */             if (zznlVar instanceof zzks) {
/* 8 */                 throw null;
                    }
/* 5 */             return false;
                }
            }
