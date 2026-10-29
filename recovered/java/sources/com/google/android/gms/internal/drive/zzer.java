            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzer extends zzb implements zzeq {
                public zzer() {
/* 3 */             super("com.google.android.gms.drive.internal.IDriveServiceCallbacks");
                }

                @Override // com.google.android.gms.internal.drive.zzb
                public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
                    switch (i) {
                        case 1:
/* 248 */                   zza((zzfl) zzc.zza(parcel, zzfl.CREATOR));
                            break;
                        case 2:
/* 236 */                   zza((zzft) zzc.zza(parcel, zzft.CREATOR));
                            break;
                        case 3:
/* 224 */                   zza((zzfn) zzc.zza(parcel, zzfn.CREATOR));
                            break;
                        case 4:
/* 212 */                   zza((zzfy) zzc.zza(parcel, zzfy.CREATOR));
                            break;
                        case 5:
/* 200 */                   zza((zzfh) zzc.zza(parcel, zzfh.CREATOR));
                            break;
                        case 6:
/* 188 */                   zza((Status) zzc.zza(parcel, Status.CREATOR));
                            break;
                        case 7:
/* 176 */                   onSuccess();
                            break;
                        case 8:
/* 172 */                   zza((zzfv) zzc.zza(parcel, zzfv.CREATOR));
                            break;
                        case 9:
/* 160 */                   zza((zzgh) zzc.zza(parcel, zzgh.CREATOR));
                            break;
                        case 10:
                        case 19:
                        default:
/* 4 */                     return false;
                        case 11:
/* 148 */                   zza((zzfx) zzc.zza(parcel, zzfx.CREATOR), zzip.zzb(parcel.readStrongBinder()));
                            break;
                        case 12:
/* 127 */                   zza((zzgd) zzc.zza(parcel, zzgd.CREATOR));
                            break;
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 114 */                   zza((zzga) zzc.zza(parcel, zzga.CREATOR));
                            break;
                        case 14:
/* 101 */                   zza((zzfj) zzc.zza(parcel, zzfj.CREATOR));
                            break;
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 88 */                    zzb(zzc.zza(parcel));
                            break;
                        case 16:
/* 79 */                    zza((zzfr) zzc.zza(parcel, zzfr.CREATOR));
                            break;
                        case 17:
/* 66 */                    zza((com.google.android.gms.drive.zza) zzc.zza(parcel, com.google.android.gms.drive.zza.CREATOR));
                            break;
                        case 18:
/* 53 */                    zza((zzff) zzc.zza(parcel, zzff.CREATOR));
                            break;
                        case 20:
/* 40 */                    zza((zzem) zzc.zza(parcel, zzem.CREATOR));
                            break;
                        case Build.API_LEVELS.API_21 /* 21 */:
/* 27 */                    zza((zzgz) zzc.zza(parcel, zzgz.CREATOR));
                            break;
                        case Build.API_LEVELS.API_22 /* 22 */:
/* 14 */                    zza((zzgf) zzc.zza(parcel, zzgf.CREATOR));
                            break;
                    }
/* 251 */           parcel2.writeNoException();
/* 254 */           return true;
                }
            }
