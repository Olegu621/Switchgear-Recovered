            package com.google.android.gms.internal.measurement;

            import com.google.android.gms.internal.measurement.zzkq;
            import com.google.android.gms.internal.measurement.zzkr;
            import java.io.IOException;
            import java.util.List;
            import p000.ds0;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzkr<MessageType extends zzkr<MessageType, BuilderType>, BuilderType extends zzkq<MessageType, BuilderType>> implements zznl {
                protected int zza = 0;

                public static void zzce(Iterable iterable, List list) {
/* 1 */             zzkq.zzaU(iterable, list);
                }

                @Override // com.google.android.gms.internal.measurement.zznl
                public final zzlg zzcb() {
                    try {
/* 1 */                 int iZzcn = zzcn();
/* 5 */                 zzlg zzlgVar = zzlg.zzb;
/* 7 */                 byte[] bArr = new byte[iZzcn];
/* 9 */                 int i = zzll.zzb;
/* 14 */                zzlj zzljVar = new zzlj(bArr, 0, iZzcn);
/* 17 */                zzcB(zzljVar);
/* 20 */                return zzld.zza(zzljVar, bArr);
                    } catch (IOException e) {
/* 30 */                String name = getClass().getName();
/* 53 */                ds0.m3198o(fm0.m3790p(new StringBuilder(name.length() + 72), "Serializing ", name, " to a ByteString threw an IOException (should never happen)."), e);
/* 56 */                return null;
                    }
                }

                public final byte[] zzcc() {
                    try {
/* 1 */                 int iZzcn = zzcn();
/* 5 */                 byte[] bArr = new byte[iZzcn];
/* 7 */                 int i = zzll.zzb;
/* 12 */                zzlj zzljVar = new zzlj(bArr, 0, iZzcn);
/* 15 */                zzcB(zzljVar);
/* 18 */                zzljVar.zzE();
/* 21 */                return bArr;
                    } catch (IOException e) {
/* 27 */                String name = getClass().getName();
/* 50 */                ds0.m3198o(fm0.m3790p(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
/* 53 */                return null;
                    }
                }

                public int zzcd(zznw zznwVar) {
/* 2 */             throw null;
                }
            }
