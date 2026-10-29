            package com.google.android.gms.fido.u2f.api.common;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.Base64;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.List;
            import org.json.JSONException;
            import org.json.JSONObject;
            import p000.ds0;
            import p000.kb1;
            import p000.tf3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public class RegisteredKey extends AbstractSafeParcelable {
                public static final Parcelable.Creator<RegisteredKey> CREATOR = new tf3(27);

                /* JADX INFO: renamed from: a */
                public final KeyHandle f3896a;

                /* JADX INFO: renamed from: b */
                public final String f3897b;

                /* JADX INFO: renamed from: c */
                public final String f3898c;

                public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
/* 4 */             kb1.m6061n(keyHandle);
/* 7 */             this.f3896a = keyHandle;
/* 9 */             this.f3898c = str;
/* 11 */            this.f3897b = str2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(obj instanceof RegisteredKey)) {
/* 7 */                 return false;
                    }
/* 11 */            RegisteredKey registeredKey = (RegisteredKey) obj;
/* 13 */            String str = registeredKey.f3898c;
/* 15 */            String str2 = this.f3898c;
/* 17 */            if (str2 == null) {
/* 19 */                if (str != null) {
/* 7 */                     return false;
                        }
                    } else if (!str2.equals(str)) {
/* 7 */                 return false;
                    }
/* 38 */            if (!this.f3896a.equals(registeredKey.f3896a)) {
/* 7 */                 return false;
                    }
/* 41 */            String str3 = registeredKey.f3897b;
/* 43 */            String str4 = this.f3897b;
/* 45 */            if (str4 == null) {
/* 47 */                if (str3 != null) {
/* 7 */                     return false;
                        }
                    } else if (!str4.equals(str3)) {
/* 7 */                 return false;
                    }
/* 1 */             return true;
                }

                public final int hashCode() {
/* 2 */             String str = this.f3898c;
/* 22 */            int iHashCode = this.f3896a.hashCode() + (((str == null ? 0 : str.hashCode()) + 31) * 31);
/* 23 */            String str2 = this.f3897b;
/* 34 */            return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
/* 1 */             KeyHandle keyHandle = this.f3896a;
                    try {
/* 5 */                 JSONObject jSONObject = new JSONObject();
/* 18 */                jSONObject.put("keyHandle", Base64.encodeToString(keyHandle.f3876b, 11));
/* 21 */                ProtocolVersion protocolVersion = keyHandle.f3877c;
/* 25 */                if (protocolVersion != ProtocolVersion.UNKNOWN) {
/* 31 */                    jSONObject.put("version", protocolVersion.f3881a);
                        }
/* 34 */                List list = keyHandle.f3878d;
/* 36 */                if (list != null) {
/* 44 */                    jSONObject.put("transports", list.toString());
                        }
/* 47 */                String str = this.f3898c;
/* 49 */                if (str != null) {
/* 53 */                    jSONObject.put("challenge", str);
                        }
/* 56 */                String str2 = this.f3897b;
/* 58 */                if (str2 != null) {
/* 62 */                    jSONObject.put("appId", str2);
                        }
/* 65 */                return jSONObject.toString();
                    } catch (JSONException e) {
/* 71 */                ds0.m3199p(e);
/* 74 */                return null;
                    }
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 2, this.f3896a, i, false);
/* 17 */            w11.m9410T(parcel, 3, this.f3898c, false);
/* 23 */            w11.m9410T(parcel, 4, this.f3897b, false);
/* 26 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
