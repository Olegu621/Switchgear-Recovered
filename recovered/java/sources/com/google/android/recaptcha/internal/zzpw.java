            package com.google.android.recaptcha.internal;

            import com.google.android.recaptcha.internal.zzpv;
            import com.google.android.recaptcha.internal.zzpw;
            import java.io.IOException;
            import java.util.List;
            import p000.ds0;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzpw<MessageType extends zzpw<MessageType, BuilderType>, BuilderType extends zzpv<MessageType, BuilderType>> implements zzts {
                protected int zza = 0;

                public static void zzc(Iterable iterable, List list) {
/* 1 */             zzpv.zzd(iterable, list);
                }

                public int zza(zzug zzugVar) {
/* 2 */             throw null;
                }

                @Override // com.google.android.recaptcha.internal.zzts
                public final zzqm zzb() {
                    try {
/* 1 */                 int iZzo = zzo();
/* 5 */                 zzqm zzqmVar = zzqm.zzb;
/* 7 */                 byte[] bArr = new byte[iZzo];
/* 9 */                 int i = zzqv.zzb;
/* 14 */                zzqs zzqsVar = new zzqs(bArr, 0, iZzo);
/* 17 */                zze(zzqsVar);
/* 20 */                zzqsVar.zzC();
/* 25 */                return new zzqk(bArr);
                    } catch (IOException e) {
/* 46 */                ds0.m3198o(fm0.m3784j("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
/* 49 */                return null;
                    }
                }

                public final byte[] zzd() {
                    try {
/* 1 */                 int iZzo = zzo();
/* 5 */                 byte[] bArr = new byte[iZzo];
/* 7 */                 int i = zzqv.zzb;
/* 12 */                zzqs zzqsVar = new zzqs(bArr, 0, iZzo);
/* 15 */                zze(zzqsVar);
/* 18 */                zzqsVar.zzC();
/* 21 */                return bArr;
                    } catch (IOException e) {
/* 39 */                ds0.m3198o(fm0.m3784j("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
/* 42 */                return null;
                    }
                }
            }
