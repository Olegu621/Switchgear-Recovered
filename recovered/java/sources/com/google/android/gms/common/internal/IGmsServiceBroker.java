            package com.google.android.gms.common.internal;

            import android.os.Binder;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import p000.f42;
            import p000.kb1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public interface IGmsServiceBroker extends IInterface {

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public static abstract class Stub extends Binder implements IGmsServiceBroker {
                    @Override // android.os.IInterface
                    public final IBinder asBinder() {
/* 1 */                 return this;
                    }

                    /* JADX WARN: Code duplicated, block: B:61:0x00d2  */
                    /* JADX WARN: Code duplicated, block: B:63:0x00de  */
                    /* JADX WARN: Code duplicated, block: B:64:0x00e7  */
                    /* JADX WARN: Code duplicated, block: B:66:0x00ed  */
                    @Override // android.os.Binder
                    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
                        IInterface zzyVar;
/* 1 */                 if (i <= 0 || i > 16777215) {
/* 274 */                   return super.onTransact(i, parcel, parcel2, i2);
                        }
/* 12 */                parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
/* 15 */                IBinder strongBinder = parcel.readStrongBinder();
/* 20 */                if (strongBinder == null) {
/* 22 */                    zzyVar = null;
                        } else {
/* 26 */                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
/* 39 */                    zzyVar = iInterfaceQueryLocalInterface instanceof IGmsCallbacks ? (IGmsCallbacks) iInterfaceQueryLocalInterface : new zzy(strongBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
                        }
/* 45 */                if (i == 46) {
/* 64 */                    mo2020j((zzd) zzyVar, parcel.readInt() != 0 ? GetServiceRequest.CREATOR.createFromParcel(parcel) : null);
/* 67 */                    kb1.m6061n(parcel2);
/* 70 */                    parcel2.writeNoException();
/* 44 */                    return true;
                        }
/* 77 */                if (i == 47) {
/* 83 */                    if (parcel.readInt() != 0) {
/* 87 */                        zzai.CREATOR.createFromParcel(parcel);
                            }
/* 93 */                    f42.m3660p();
/* 76 */                    return false;
                        }
/* 97 */                parcel.readInt();
/* 101 */               if (i != 4) {
/* 103 */                   parcel.readString();
/* 106 */                   if (i == 1) {
/* 247 */                       parcel.readString();
/* 250 */                       parcel.createStringArray();
/* 253 */                       parcel.readString();
/* 260 */                       if (parcel.readInt() != 0) {
                                }
                            } else if (i == 2 || i == 23 || i == 25 || i == 27) {
/* 236 */                       if (parcel.readInt() != 0) {
                                }
                            } else if (i == 30) {
/* 211 */                       parcel.createStringArray();
/* 214 */                       parcel.readString();
/* 221 */                       if (parcel.readInt() != 0) {
                                }
                            } else if (i == 34) {
/* 207 */                       parcel.readString();
                            } else if (i != 41 && i != 43 && i != 37 && i != 38) {
                                switch (i) {
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 11:
                                    case 12:
                                    case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
                                    case 14:
                                    case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                                    case 16:
                                    case 17:
                                    case 18:
/* 236 */                               if (parcel.readInt() != 0) {
                                        }
                                        break;
                                    case 9:
/* 177 */                               parcel.readString();
/* 180 */                               parcel.createStringArray();
/* 183 */                               parcel.readString();
/* 186 */                               parcel.readStrongBinder();
/* 189 */                               parcel.readString();
/* 196 */                               if (parcel.readInt() != 0) {
                                        }
                                        break;
                                    case 10:
/* 170 */                               parcel.readString();
/* 173 */                               parcel.createStringArray();
                                        break;
                                    case 19:
/* 152 */                               parcel.readStrongBinder();
/* 159 */                               if (parcel.readInt() != 0) {
                                        }
                                        break;
                                    case 20:
/* 211 */                               parcel.createStringArray();
/* 214 */                               parcel.readString();
/* 221 */                               if (parcel.readInt() != 0) {
                                        }
                                        break;
                                }
                            } else if (parcel.readInt() != 0) {
                            }
                        }
/* 270 */               f42.m3660p();
/* 76 */                return false;
                    }
                }

                /* JADX INFO: renamed from: j */
                void mo2020j(zzd zzdVar, GetServiceRequest getServiceRequest);
            }
