            package com.google.android.gms.internal.auth;

            import com.google.android.gms.internal.auth.zzes;
            import com.google.android.gms.internal.auth.zzeu;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zzes<MessageType extends zzeu<MessageType, BuilderType>, BuilderType extends zzes<MessageType, BuilderType>> extends zzdo<MessageType, BuilderType> {
                protected zzeu zza;
                protected boolean zzb = false;
                private final zzeu zzc;

                public zzes(MessageType messagetype) {
/* 4 */             this.zzc = messagetype;
/* 14 */            this.zza = (zzeu) messagetype.zzi(4, null, null);
                }

                private static final void zzj(zzeu zzeuVar, zzeu zzeuVar2) {
/* 13 */            zzge.zza().zzb(zzeuVar.getClass()).zzf(zzeuVar, zzeuVar2);
                }

                @Override // com.google.android.gms.internal.auth.zzdo
                public final /* synthetic */ zzdo zzb(zzdp zzdpVar) {
/* 3 */             zze((zzeu) zzdpVar);
/* 6 */             return this;
                }

                @Override // com.google.android.gms.internal.auth.zzdo
                /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
                public final zzes clone() {
/* 9 */             zzes zzesVar = (zzes) this.zzc.zzi(5, null, null);
/* 15 */            zzesVar.zze(zzg());
/* 18 */            return zzesVar;
                }

                public final zzes zze(zzeu zzeuVar) {
/* 3 */             if (this.zzb) {
/* 5 */                 zzi();
/* 9 */                 this.zzb = false;
                    }
/* 13 */            zzj(this.zza, zzeuVar);
/* 16 */            return this;
                }

                @Override // com.google.android.gms.internal.auth.zzfv
                /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
                public MessageType zzg() {
/* 1 */             boolean z = this.zzb;
/* 3 */             MessageType messagetype = (MessageType) this.zza;
/* 5 */             if (z) {
/* 7 */                 return messagetype;
                    }
/* 20 */            zzge.zza().zzb(messagetype.getClass()).zze(messagetype);
/* 24 */            this.zzb = true;
/* 26 */            return (MessageType) this.zza;
                }

                @Override // com.google.android.gms.internal.auth.zzfx
                public final /* synthetic */ zzfw zzh() {
/* 1 */             return this.zzc;
                }

                public void zzi() {
/* 9 */             zzeu zzeuVar = (zzeu) this.zza.zzi(4, null, null);
/* 13 */            zzj(zzeuVar, this.zza);
/* 16 */            this.zza = zzeuVar;
                }
            }
