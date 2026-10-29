            package com.google.android.gms.internal.play_billing;

            import com.google.android.gms.internal.play_billing.zzfu;
            import com.google.android.gms.internal.play_billing.zzfv;
            import java.io.IOException;
            import java.util.List;
            import p000.ds0;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzfv<MessageType extends zzfv<MessageType, BuilderType>, BuilderType extends zzfu<MessageType, BuilderType>> implements zzim {
                protected int zza = 0;

                public static void zzg(Iterable iterable, List list) {
/* 1 */             zzfu.zzc(iterable, list);
                }

                public int zze(zzix zzixVar) {
/* 2 */             throw null;
                }

                @Override // com.google.android.gms.internal.play_billing.zzim
                public final zzgk zzf() {
                    try {
/* 1 */                 int iZzk = zzk();
/* 5 */                 zzgk zzgkVar = zzgk.zzb;
/* 7 */                 byte[] bArr = new byte[iZzk];
/* 12 */                zzgo zzgoVar = new zzgo(bArr, 0, iZzk);
/* 15 */                zzJ(zzgoVar);
/* 18 */                zzgoVar.zzB();
/* 23 */                return new zzgi(bArr);
                    } catch (IOException e) {
/* 44 */                ds0.m3198o(fm0.m3784j("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e);
/* 47 */                return null;
                    }
                }

                public final byte[] zzh() {
                    try {
/* 1 */                 int iZzk = zzk();
/* 5 */                 byte[] bArr = new byte[iZzk];
/* 10 */                zzgo zzgoVar = new zzgo(bArr, 0, iZzk);
/* 13 */                zzJ(zzgoVar);
/* 16 */                zzgoVar.zzB();
/* 19 */                return bArr;
                    } catch (IOException e) {
/* 37 */                ds0.m3198o(fm0.m3784j("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e);
/* 40 */                return null;
                    }
                }
            }
