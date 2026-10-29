            package com.google.android.gms.internal.measurement;

            import com.google.android.gms.internal.measurement.zzma;
            import com.google.android.gms.internal.measurement.zzme;
            import java.io.IOException;
            import p000.C1951n4;
            import p000.ds0;
            import p000.pk3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zzma<MessageType extends zzme<MessageType, BuilderType>, BuilderType extends zzma<MessageType, BuilderType>> extends zzkq<MessageType, BuilderType> {
                protected zzme zza;
                private final zzme zzb;

                public zzma(MessageType messagetype) {
/* 4 */             this.zzb = messagetype;
/* 10 */            if (messagetype.zzcf()) {
/* 21 */                C1951n4.m6859j("Default instance must be immutable.");
/* 25 */                throw null;
                    }
/* 16 */            this.zza = messagetype.zzch();
                }

                private static void zza(Object obj, Object obj2) {
/* 13 */            zznt.zza().zzb(obj.getClass()).zzd(obj, obj2);
                }

                @Override // com.google.android.gms.internal.measurement.zzkq
                public final /* bridge */ /* synthetic */ zzkq zzaS(byte[] bArr, int i, int i2) throws zzmq {
/* 1 */             int i3 = zzlq.zzb;
/* 3 */             int i4 = zznt.zza;
/* 8 */             zzbe(bArr, 0, i2, zzlq.zza);
/* 11 */            return this;
                }

                @Override // com.google.android.gms.internal.measurement.zzkq
                public final /* bridge */ /* synthetic */ zzkq zzaT(byte[] bArr, int i, int i2, zzlq zzlqVar) throws zzmq {
/* 2 */             zzbe(bArr, 0, i2, zzlqVar);
/* 5 */             return this;
                }

                public final void zzaX() {
/* 7 */             if (this.zza.zzcf()) {
/* 12 */                return;
                    }
/* 9 */             zzaY();
                }

                public void zzaY() {
/* 3 */             zzme zzmeVarZzch = this.zzb.zzch();
/* 9 */             zza(zzmeVarZzch, this.zza);
/* 12 */            this.zza = zzmeVarZzch;
                }

                @Override // com.google.android.gms.internal.measurement.zzkq
                /* JADX INFO: renamed from: zzba, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public final zzma zzaR() {
/* 9 */             zzma zzmaVar = (zzma) this.zzb.zzl(5, null, null);
/* 15 */            zzmaVar.zza = zzbf();
/* 17 */            return zzmaVar;
                }

                @Override // com.google.android.gms.internal.measurement.zznk
                /* JADX INFO: renamed from: zzbb, reason: merged with bridge method [inline-methods] */
                public MessageType zzbf() {
/* 3 */             boolean zZzcf = this.zza.zzcf();
/* 7 */             MessageType messagetype = (MessageType) this.zza;
/* 9 */             if (!zZzcf) {
/* 11 */                return messagetype;
                    }
/* 12 */            messagetype.zzcj();
/* 15 */            return (MessageType) this.zza;
                }

                public final MessageType zzbc() {
/* 1 */             MessageType messagetype = (MessageType) zzbf();
/* 9 */             if (messagetype.zzcD()) {
/* 11 */                return messagetype;
                    }
/* 17 */            throw new zzog(messagetype);
                }

                public final zzma zzbd(zzme zzmeVar) {
/* 7 */             if (!this.zzb.equals(zzmeVar)) {
/* 15 */                if (!this.zza.zzcf()) {
/* 17 */                    zzaY();
                        }
/* 22 */                zza(this.zza, zzmeVar);
                    }
/* 25 */            return this;
                }

                public final zzma zzbe(byte[] bArr, int i, int i2, zzlq zzlqVar) throws zzmq {
/* 7 */             if (!this.zza.zzcf()) {
/* 9 */                 zzaY();
                    }
                    try {
/* 37 */                zznt.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i2, new zzkv(zzlqVar));
/* 40 */                return this;
                    } catch (zzmq e) {
/* 57 */                throw e;
                    } catch (IOException e2) {
/* 45 */                ds0.m3198o("Reading from byte array should not throw IOException.", e2);
/* 12 */                return null;
                    } catch (IndexOutOfBoundsException unused) {
/* 51 */                pk3.m7472h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 12 */                return null;
                    }
                }

                @Override // com.google.android.gms.internal.measurement.zznm
                public final boolean zzcD() {
/* 2 */             return zzme.zzd(this.zza, false);
                }

                @Override // com.google.android.gms.internal.measurement.zznm
                public final /* bridge */ /* synthetic */ zznl zzcE() {
/* 2 */             throw null;
                }
            }
