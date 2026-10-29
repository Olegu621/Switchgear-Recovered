            package com.google.android.gms.internal.play_billing;

            import com.google.android.gms.internal.play_billing.zzhg;
            import com.google.android.gms.internal.play_billing.zzhk;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zzhg<MessageType extends zzhk<MessageType, BuilderType>, BuilderType extends zzhg<MessageType, BuilderType>> extends zzfu<MessageType, BuilderType> {
                protected zzhk zza;
                private final zzhk zzb;

                public zzhg(MessageType messagetype) {
/* 4 */             this.zzb = messagetype;
/* 10 */            if (messagetype.zzA()) {
/* 21 */                C1951n4.m6859j("Default instance must be immutable.");
/* 25 */                throw null;
                    }
/* 16 */            this.zza = messagetype.zzp();
                }

                private static void zza(Object obj, Object obj2) {
/* 13 */            zziu.zza().zzb(obj.getClass()).zzg(obj, obj2);
                }

                @Override // com.google.android.gms.internal.play_billing.zzfu
                /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public final zzhg zzb() {
/* 9 */             zzhg zzhgVar = (zzhg) this.zzb.zzd(5, null, null);
/* 15 */            zzhgVar.zza = zzh();
/* 17 */            return zzhgVar;
                }

                public final zzhg zze(zzhk zzhkVar) {
/* 7 */             if (!this.zzb.equals(zzhkVar)) {
/* 15 */                if (!this.zza.zzA()) {
/* 17 */                    zzk();
                        }
/* 22 */                zza(this.zza, zzhkVar);
                    }
/* 25 */            return this;
                }

                public final MessageType zzf() {
/* 1 */             MessageType messagetype = (MessageType) zzh();
/* 10 */            if (zzhk.zzz(messagetype, true)) {
/* 12 */                return messagetype;
                    }
/* 18 */            throw new zzji(messagetype);
                }

                @Override // com.google.android.gms.internal.play_billing.zzil
                /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
                public MessageType zzh() {
/* 3 */             boolean zZzA = this.zza.zzA();
/* 7 */             MessageType messagetype = (MessageType) this.zza;
/* 9 */             if (!zZzA) {
/* 11 */                return messagetype;
                    }
/* 12 */            messagetype.zzv();
/* 15 */            return (MessageType) this.zza;
                }

                @Override // com.google.android.gms.internal.play_billing.zzin
                public final /* bridge */ /* synthetic */ zzim zzi() {
/* 2 */             throw null;
                }

                public final void zzj() {
/* 7 */             if (this.zza.zzA()) {
/* 12 */                return;
                    }
/* 9 */             zzk();
                }

                public void zzk() {
/* 3 */             zzhk zzhkVarZzp = this.zzb.zzp();
/* 9 */             zza(zzhkVarZzp, this.zza);
/* 12 */            this.zza = zzhkVarZzp;
                }

                @Override // com.google.android.gms.internal.play_billing.zzin
                public final boolean zzl() {
/* 4 */             return zzhk.zzz(this.zza, false);
                }
            }
