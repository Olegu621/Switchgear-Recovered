            package com.google.android.recaptcha.internal;

            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.io.IOException;
            import java.util.Map;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzsa extends zzrz {
                @Override // com.google.android.recaptcha.internal.zzrz
                public final void zza(Object obj) {
/* 5 */             ((zzsk) obj).zzb.zzg();
                }

                @Override // com.google.android.recaptcha.internal.zzrz
                public final void zzb(zzvi zzviVar, Map.Entry entry) throws IOException {
/* 5 */             zzsl zzslVar = (zzsl) entry.getKey();
/* 7 */             zzvg zzvgVar = zzvg.zza;
                    switch (zzslVar.zzb.ordinal()) {
                        case 0:
/* 315 */                   zzviVar.zzf(zzslVar.zza, ((Double) entry.getValue()).doubleValue());
                            break;
                        case 1:
/* 299 */                   zzviVar.zzo(zzslVar.zza, ((Float) entry.getValue()).floatValue());
                            break;
                        case 2:
/* 283 */                   zzviVar.zzt(zzslVar.zza, ((Long) entry.getValue()).longValue());
                            break;
                        case 3:
/* 267 */                   zzviVar.zzK(zzslVar.zza, ((Long) entry.getValue()).longValue());
                            break;
                        case 4:
/* 251 */                   zzviVar.zzr(zzslVar.zza, ((Integer) entry.getValue()).intValue());
                            break;
                        case 5:
/* 235 */                   zzviVar.zzm(zzslVar.zza, ((Long) entry.getValue()).longValue());
                            break;
                        case 6:
/* 219 */                   zzviVar.zzk(zzslVar.zza, ((Integer) entry.getValue()).intValue());
                            break;
                        case 7:
/* 203 */                   zzviVar.zzb(zzslVar.zza, ((Boolean) entry.getValue()).booleanValue());
                            break;
                        case 8:
/* 187 */                   zzviVar.zzG(zzslVar.zza, (String) entry.getValue());
                            break;
                        case 9:
/* 175 */                   zzviVar.zzq(zzslVar.zza, entry.getValue(), zzuc.zza().zzb(entry.getValue().getClass()));
                            break;
                        case 10:
/* 149 */                   zzviVar.zzv(zzslVar.zza, entry.getValue(), zzuc.zza().zzb(entry.getValue().getClass()));
                            break;
                        case 11:
/* 123 */                   zzviVar.zzd(zzslVar.zza, (zzqm) entry.getValue());
                            break;
                        case 12:
/* 111 */                   zzviVar.zzI(zzslVar.zza, ((Integer) entry.getValue()).intValue());
                            break;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 95 */                    zzviVar.zzr(zzslVar.zza, ((Integer) entry.getValue()).intValue());
                            break;
                        case 14:
/* 79 */                    zzviVar.zzx(zzslVar.zza, ((Integer) entry.getValue()).intValue());
                            break;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 63 */                    zzviVar.zzz(zzslVar.zza, ((Long) entry.getValue()).longValue());
                            break;
                        case 16:
/* 47 */                    zzviVar.zzB(zzslVar.zza, ((Integer) entry.getValue()).intValue());
                            break;
                        case 17:
/* 31 */                    zzviVar.zzD(zzslVar.zza, ((Long) entry.getValue()).longValue());
                            break;
                    }
                }
            }
