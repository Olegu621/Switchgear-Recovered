            package com.google.android.gms.internal.auth;

            import com.google.android.gms.internal.auth.zzdo;
            import com.google.android.gms.internal.auth.zzdp;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzdo<MessageType extends zzdp<MessageType, BuilderType>, BuilderType extends zzdo<MessageType, BuilderType>> implements zzfv {
                @Override // 
                /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
                public abstract zzdo clone();

                public abstract zzdo zzb(zzdp zzdpVar);

                @Override // com.google.android.gms.internal.auth.zzfv
                public final /* bridge */ /* synthetic */ zzfv zzc(zzfw zzfwVar) {
/* 13 */            if (zzh().getClass().isInstance(zzfwVar)) {
/* 17 */                return zzb((zzdp) zzfwVar);
                    }
/* 24 */            C1951n4.m6859j("mergeFrom(MessageLite) can only merge messages of the same type.");
/* 27 */            return null;
                }
            }
