            package com.google.android.gms.internal.drive;

            import com.google.android.gms.internal.drive.zzit;
            import com.google.android.gms.internal.drive.zziu;
            import p000.C1951n4;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zziu<MessageType extends zzit<MessageType, BuilderType>, BuilderType extends zziu<MessageType, BuilderType>> implements zzlr {
                public abstract BuilderType zza(MessageType messagetype);

                @Override // com.google.android.gms.internal.drive.zzlr
                public final /* synthetic */ zzlr zza(zzlq zzlqVar) {
/* 13 */            if (zzda().getClass().isInstance(zzlqVar)) {
/* 17 */                return zza((zzit) zzlqVar);
                    }
/* 24 */            C1951n4.m6859j("mergeFrom(MessageLite) can only merge messages of the same type.");
/* 27 */            return null;
                }

                @Override // 
                /* JADX INFO: renamed from: zzbn, reason: merged with bridge method [inline-methods] */
                public abstract BuilderType clone();
            }
