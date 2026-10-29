            package com.google.android.gms.common;

            import android.app.PendingIntent;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import io.flutter.Build;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import java.util.Arrays;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            import p000.de3;
            import p000.tc3;
            import p000.w11;
            import p000.wc0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public final class ConnectionResult extends AbstractSafeParcelable {

                /* JADX INFO: renamed from: a */
                public final int f3415a;

                /* JADX INFO: renamed from: b */
                public final int f3416b;

                /* JADX INFO: renamed from: c */
                public final PendingIntent f3417c;

                /* JADX INFO: renamed from: d */
                public final String f3418d;

                /* JADX INFO: renamed from: e */
                public final Integer f3419e;

                /* JADX INFO: renamed from: f */
                public static final ConnectionResult f3414f = new ConnectionResult(0, null, null);
                public static final Parcelable.Creator<ConnectionResult> CREATOR = new tc3(15);

                public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str, Integer num) {
/* 4 */             this.f3415a = i;
/* 6 */             this.f3416b = i2;
/* 8 */             this.f3417c = pendingIntent;
/* 10 */            this.f3418d = str;
/* 12 */            this.f3419e = num;
                }

                /* JADX INFO: renamed from: D1 */
                public static String m2003D1(int i) {
/* 3 */             if (i == 99) {
/* 129 */               return "UNFINISHED";
                    }
/* 7 */             if (i == 1500) {
/* 126 */               return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
                    }
                    switch (i) {
                        case -1:
/* 123 */                   return "UNKNOWN";
                        case 0:
/* 120 */                   return "SUCCESS";
                        case 1:
/* 117 */                   return "SERVICE_MISSING";
                        case 2:
/* 114 */                   return "SERVICE_VERSION_UPDATE_REQUIRED";
                        case 3:
/* 111 */                   return "SERVICE_DISABLED";
                        case 4:
/* 108 */                   return "SIGN_IN_REQUIRED";
                        case 5:
/* 105 */                   return "INVALID_ACCOUNT";
                        case 6:
/* 102 */                   return "RESOLUTION_REQUIRED";
                        case 7:
/* 99 */                    return "NETWORK_ERROR";
                        case 8:
/* 96 */                    return "INTERNAL_ERROR";
                        case 9:
/* 93 */                    return "SERVICE_INVALID";
                        case 10:
/* 90 */                    return "DEVELOPER_ERROR";
                        case 11:
/* 87 */                    return "LICENSE_CHECK_FAILED";
                        default:
                            switch (i) {
                                case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
/* 84 */                            return "CANCELED";
                                case 14:
/* 81 */                            return "TIMEOUT";
                                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
/* 78 */                            return "INTERRUPTED";
                                case 16:
/* 75 */                            return "API_UNAVAILABLE";
                                case 17:
/* 72 */                            return "SIGN_IN_FAILED";
                                case 18:
/* 69 */                            return "SERVICE_UPDATING";
                                case 19:
/* 66 */                            return "SERVICE_MISSING_PERMISSION";
                                case 20:
/* 63 */                            return "RESTRICTED_PROFILE";
                                case Build.API_LEVELS.API_21 /* 21 */:
/* 60 */                            return "API_VERSION_UPDATE_REQUIRED";
                                case Build.API_LEVELS.API_22 /* 22 */:
/* 57 */                            return "RESOLUTION_ACTIVITY_NOT_FOUND";
                                case Build.API_LEVELS.API_23 /* 23 */:
/* 54 */                            return "API_DISABLED";
                                case 24:
/* 51 */                            return "API_DISABLED_FOR_CONNECTION";
                                case Build.API_LEVELS.API_25 /* 25 */:
/* 48 */                            return "API_INSTALL_REQUIRED";
                                default:
/* 27 */                            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
/* 32 */                            sb.append("UNKNOWN_ERROR_CODE(");
/* 35 */                            sb.append(i);
/* 40 */                            sb.append(")");
/* 43 */                            return sb.toString();
                            }
                    }
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj == this) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof ConnectionResult)) {
/* 7 */                 return false;
                    }
/* 11 */            ConnectionResult connectionResult = (ConnectionResult) obj;
                    return this.f3416b == connectionResult.f3416b && de3.m3029k(this.f3417c, connectionResult.f3417c) && de3.m3029k(this.f3418d, connectionResult.f3418d) && de3.m3029k(this.f3419e, connectionResult.f3419e);
                }

                public final int hashCode() {
/* 17 */            return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3416b), this.f3417c, this.f3418d, this.f3419e});
                }

                public final String toString() {
/* 3 */             wc0 wc0Var = new wc0(this);
/* 14 */            wc0Var.m9529d(m2003D1(this.f3416b), "statusCode");
/* 21 */            wc0Var.m9529d(this.f3417c, "resolution");
/* 28 */            wc0Var.m9529d(this.f3418d, "message");
/* 35 */            wc0Var.m9529d(this.f3419e, "clientMethodKey");
/* 38 */            return wc0Var.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3415a);
/* 18 */            w11.m9420b0(parcel, 2, 4);
/* 23 */            parcel.writeInt(this.f3416b);
/* 30 */            w11.m9409S(parcel, 3, this.f3417c, i, false);
/* 35 */            w11.m9410T(parcel, 4, this.f3418d, false);
/* 41 */            w11.m9407Q(parcel, 5, this.f3419e);
/* 44 */            w11.m9428f0(iM9422c0, parcel);
                }

/* 14 */        public ConnectionResult(int i, String str, PendingIntent pendingIntent) {
/* 15 */            this(1, i, pendingIntent, str, null);
                }
            }
