            package com.google.android.gms.dynamic;

            import android.content.Intent;
            import android.os.Bundle;
            import android.os.IInterface;
            import android.os.Parcel;
            import com.google.android.gms.internal.common.zzc;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface IFragmentWrapper extends IInterface {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IFragmentWrapper {
                    public Stub() {
/* 3 */                 super("com.google.android.gms.dynamic.IFragmentWrapper");
                    }

                    @Override // com.google.android.gms.internal.common.zzb
                    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
                        switch (i) {
                            case 2:
/* 359 */                       ObjectWrapper objectWrapperZzb = zzb();
/* 363 */                       parcel2.writeNoException();
/* 366 */                       zzc.zze(parcel2, objectWrapperZzb);
/* 369 */                       return true;
                            case 3:
/* 348 */                       Bundle bundleZzc = zzc();
/* 352 */                       parcel2.writeNoException();
/* 355 */                       zzc.zzd(parcel2, bundleZzc);
/* 369 */                       return true;
                            case 4:
/* 337 */                       int iZzd = zzd();
/* 341 */                       parcel2.writeNoException();
/* 344 */                       parcel2.writeInt(iZzd);
/* 369 */                       return true;
                            case 5:
/* 326 */                       IFragmentWrapper iFragmentWrapperZze = zze();
/* 330 */                       parcel2.writeNoException();
/* 333 */                       zzc.zze(parcel2, iFragmentWrapperZze);
/* 369 */                       return true;
                            case 6:
/* 315 */                       ObjectWrapper objectWrapperZzf = zzf();
/* 319 */                       parcel2.writeNoException();
/* 322 */                       zzc.zze(parcel2, objectWrapperZzf);
/* 369 */                       return true;
                            case 7:
/* 302 */                       boolean zZzg = zzg();
/* 306 */                       parcel2.writeNoException();
/* 309 */                       int i3 = zzc.zza;
/* 311 */                       parcel2.writeInt(zZzg ? 1 : 0);
/* 369 */                       return true;
                            case 8:
/* 291 */                       String strZzh = zzh();
/* 295 */                       parcel2.writeNoException();
/* 298 */                       parcel2.writeString(strZzh);
/* 369 */                       return true;
                            case 9:
/* 280 */                       IFragmentWrapper iFragmentWrapperZzi = zzi();
/* 284 */                       parcel2.writeNoException();
/* 287 */                       zzc.zze(parcel2, iFragmentWrapperZzi);
/* 369 */                       return true;
                            case 10:
/* 269 */                       int iZzj = zzj();
/* 273 */                       parcel2.writeNoException();
/* 276 */                       parcel2.writeInt(iZzj);
/* 369 */                       return true;
                            case 11:
/* 256 */                       boolean zZzk = zzk();
/* 260 */                       parcel2.writeNoException();
/* 263 */                       int i4 = zzc.zza;
/* 265 */                       parcel2.writeInt(zZzk ? 1 : 0);
/* 369 */                       return true;
                            case 12:
/* 244 */                       ObjectWrapper objectWrapperZzl = zzl();
/* 248 */                       parcel2.writeNoException();
/* 251 */                       zzc.zze(parcel2, objectWrapperZzl);
/* 369 */                       return true;
                            case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 230 */                       boolean zZzm = zzm();
/* 234 */                       parcel2.writeNoException();
/* 237 */                       int i5 = zzc.zza;
/* 239 */                       parcel2.writeInt(zZzm ? 1 : 0);
/* 369 */                       return true;
                            case 14:
/* 216 */                       boolean zZzn = zzn();
/* 220 */                       parcel2.writeNoException();
/* 223 */                       int i6 = zzc.zza;
/* 225 */                       parcel2.writeInt(zZzn ? 1 : 0);
/* 369 */                       return true;
                            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 202 */                       boolean zZzo = zzo();
/* 206 */                       parcel2.writeNoException();
/* 209 */                       int i7 = zzc.zza;
/* 211 */                       parcel2.writeInt(zZzo ? 1 : 0);
/* 369 */                       return true;
                            case 16:
/* 188 */                       boolean zZzp = zzp();
/* 192 */                       parcel2.writeNoException();
/* 195 */                       int i8 = zzc.zza;
/* 197 */                       parcel2.writeInt(zZzp ? 1 : 0);
/* 369 */                       return true;
                            case 17:
/* 174 */                       boolean zZzq = zzq();
/* 178 */                       parcel2.writeNoException();
/* 181 */                       int i9 = zzc.zza;
/* 183 */                       parcel2.writeInt(zZzq ? 1 : 0);
/* 369 */                       return true;
                            case 18:
/* 160 */                       boolean zZzr = zzr();
/* 164 */                       parcel2.writeNoException();
/* 167 */                       int i10 = zzc.zza;
/* 169 */                       parcel2.writeInt(zZzr ? 1 : 0);
/* 369 */                       return true;
                            case 19:
/* 146 */                       boolean zZzs = zzs();
/* 150 */                       parcel2.writeNoException();
/* 153 */                       int i11 = zzc.zza;
/* 155 */                       parcel2.writeInt(zZzs ? 1 : 0);
/* 369 */                       return true;
                            case 20:
/* 131 */                       IObjectWrapper iObjectWrapperM2044a = IObjectWrapper.Stub.m2044a(parcel.readStrongBinder());
/* 135 */                       zzc.zzf(parcel);
/* 138 */                       mo2039j0(iObjectWrapperM2044a);
/* 141 */                       parcel2.writeNoException();
/* 369 */                       return true;
                            case Build.API_LEVELS.API_21 /* 21 */:
/* 112 */                       boolean zZza = zzc.zza(parcel);
/* 116 */                       zzc.zzf(parcel);
/* 119 */                       mo2038e(zZza);
/* 122 */                       parcel2.writeNoException();
/* 369 */                       return true;
                            case Build.API_LEVELS.API_22 /* 22 */:
/* 97 */                        boolean zZza2 = zzc.zza(parcel);
/* 101 */                       zzc.zzf(parcel);
/* 104 */                       mo2040k(zZza2);
/* 107 */                       parcel2.writeNoException();
/* 369 */                       return true;
                            case Build.API_LEVELS.API_23 /* 23 */:
/* 82 */                        boolean zZza3 = zzc.zza(parcel);
/* 86 */                        zzc.zzf(parcel);
/* 89 */                        mo2037c0(zZza3);
/* 92 */                        parcel2.writeNoException();
/* 369 */                       return true;
                            case 24:
/* 67 */                        boolean zZza4 = zzc.zza(parcel);
/* 71 */                        zzc.zzf(parcel);
/* 74 */                        mo2042o0(zZza4);
/* 77 */                        parcel2.writeNoException();
/* 369 */                       return true;
                            case Build.API_LEVELS.API_25 /* 25 */:
/* 54 */                        Intent intent = (Intent) zzc.zzb(parcel, Intent.CREATOR);
/* 56 */                        zzc.zzf(parcel);
/* 59 */                        mo2036W(intent);
/* 62 */                        parcel2.writeNoException();
/* 369 */                       return true;
                            case Build.API_LEVELS.API_26 /* 26 */:
/* 31 */                        Intent intent2 = (Intent) zzc.zzb(parcel, Intent.CREATOR);
/* 33 */                        int i12 = parcel.readInt();
/* 37 */                        zzc.zzf(parcel);
/* 40 */                        mo2043t(i12, intent2);
/* 43 */                        parcel2.writeNoException();
/* 369 */                       return true;
                            case Build.API_LEVELS.API_27 /* 27 */:
/* 10 */                        IObjectWrapper iObjectWrapperM2044a2 = IObjectWrapper.Stub.m2044a(parcel.readStrongBinder());
/* 14 */                        zzc.zzf(parcel);
/* 17 */                        mo2041m0(iObjectWrapperM2044a2);
/* 20 */                        parcel2.writeNoException();
/* 369 */                       return true;
                            default:
/* 4 */                         return false;
                        }
                    }
                }

                /* JADX INFO: renamed from: W */
                void mo2036W(Intent intent);

                /* JADX INFO: renamed from: c0 */
                void mo2037c0(boolean z);

                /* JADX INFO: renamed from: e */
                void mo2038e(boolean z);

                /* JADX INFO: renamed from: j0 */
                void mo2039j0(IObjectWrapper iObjectWrapper);

                /* JADX INFO: renamed from: k */
                void mo2040k(boolean z);

                /* JADX INFO: renamed from: m0 */
                void mo2041m0(IObjectWrapper iObjectWrapper);

                /* JADX INFO: renamed from: o0 */
                void mo2042o0(boolean z);

                /* JADX INFO: renamed from: t */
                void mo2043t(int i, Intent intent);

                ObjectWrapper zzb();

                Bundle zzc();

                int zzd();

                IFragmentWrapper zze();

                ObjectWrapper zzf();

                boolean zzg();

                String zzh();

                IFragmentWrapper zzi();

                int zzj();

                boolean zzk();

                ObjectWrapper zzl();

                boolean zzm();

                boolean zzn();

                boolean zzo();

                boolean zzp();

                boolean zzq();

                boolean zzr();

                boolean zzs();
            }
