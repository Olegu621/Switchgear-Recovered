            package com.google.android.recaptcha.internal;

            import com.google.android.recaptcha.internal.zzsh;
            import com.google.android.recaptcha.internal.zzsn;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zzsh<MessageType extends zzsn<MessageType, BuilderType>, BuilderType extends zzsh<MessageType, BuilderType>> extends zzpv<MessageType, BuilderType> {
                protected zzsn zza;
                private final zzsn zzb;

                public zzsh(MessageType messagetype) {
/* 4 */             this.zzb = messagetype;
/* 10 */            if (messagetype.zzL()) {
/* 21 */                C1951n4.m6859j("Default instance must be immutable.");
/* 25 */                throw null;
                    }
/* 16 */            this.zza = messagetype.zzv();
                }

                private static void zze(Object obj, Object obj2) {
/* 13 */            zzuc.zza().zzb(obj.getClass()).zzg(obj, obj2);
                }

                @Override // com.google.android.recaptcha.internal.zzpv
                public final /* synthetic */ zzpv zzb(zzpw zzpwVar) {
/* 3 */             zzh((zzsn) zzpwVar);
/* 6 */             return this;
                }

                @Override // com.google.android.recaptcha.internal.zzpv
                /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public final zzsh zza() {
/* 9 */             zzsh zzshVar = (zzsh) this.zzb.zzh(5, null, null);
/* 15 */            zzshVar.zza = zzl();
/* 17 */            return zzshVar;
                }

                public final zzsh zzh(zzsn zzsnVar) {
/* 7 */             if (!this.zzb.equals(zzsnVar)) {
/* 15 */                if (!this.zza.zzL()) {
/* 17 */                    zzo();
                        }
/* 22 */                zze(this.zza, zzsnVar);
                    }
/* 25 */            return this;
                }

                @Override // com.google.android.recaptcha.internal.zztr
                /* JADX INFO: renamed from: zzi, reason: merged with bridge method [inline-methods] */
                public final MessageType zzk() {
/* 1 */             MessageType messagetype = (MessageType) zzl();
/* 9 */             if (messagetype.zzp()) {
/* 11 */                return messagetype;
                    }
/* 17 */            throw new zzuu(messagetype);
                }

                @Override // com.google.android.recaptcha.internal.zztr
                /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
                public MessageType zzl() {
/* 3 */             boolean zZzL = this.zza.zzL();
/* 7 */             MessageType messagetype = (MessageType) this.zza;
/* 9 */             if (!zZzL) {
/* 11 */                return messagetype;
                    }
/* 12 */            messagetype.zzG();
/* 15 */            return (MessageType) this.zza;
                }

                @Override // com.google.android.recaptcha.internal.zztt
                public final /* synthetic */ zzts zzm() {
/* 1 */             return this.zzb;
                }

                public final void zzn() {
/* 7 */             if (this.zza.zzL()) {
/* 12 */                return;
                    }
/* 9 */             zzo();
                }

                public void zzo() {
/* 3 */             zzsn zzsnVarZzv = this.zzb.zzv();
/* 9 */             zze(zzsnVarZzv, this.zza);
/* 12 */            this.zza = zzsnVarZzv;
                }

                @Override // com.google.android.recaptcha.internal.zztt
                public final boolean zzp() {
/* 2 */             return zzsn.zzj(this.zza, false);
                }
            }
