            package com.supercell.p007id.scid_plugin;

            import android.os.Parcel;
            import android.os.Parcelable;
            import androidx.core.app.NotificationCompat;
            import com.supercell.p007id.scid_plugin.platform_interface.SharedDataContentProvider;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.Map;
            import kotlin.Metadata;
            import kotlin.Pair;
            import kotlin.jvm.internal.DefaultConstructorMarker;
            import kotlin.jvm.internal.Intrinsics;
            import kotlin.ranges.IntRange;
            import okhttp3.HttpUrl;
            import org.json.JSONArray;
            import org.json.JSONException;
            import org.json.JSONObject;
            import p000.AbstractC0886en;
            import p000.fm0;
            import p000.oc1;
            import p000.pm2;
            import p000.r02;
            import p000.wy0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 /2\u00020\u0001:\u0001/BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\n\u0010\u000eB\u0011\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\n\u0010\u0011J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001bH\u0016J\u0006\u0010 \u001a\u00020\u0010J\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\"J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\tHÆ\u0003JK\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010*\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010,HÖ\u0003J\t\u0010-\u001a\u00020\u001bHÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u00060"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/IdAccount;", "Landroid/os/Parcelable;", "supercellId", HttpUrl.FRAGMENT_ENCODE_SET, NotificationCompat.CATEGORY_EMAIL, "appAccount", "scidToken", "error", "rememberMe", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "getSupercellId", "()Ljava/lang/String;", "getEmail", "getAppAccount", "getScidToken", "getError", "getRememberMe", "()Z", "describeContents", HttpUrl.FRAGMENT_ENCODE_SET, "writeToParcel", HttpUrl.FRAGMENT_ENCODE_SET, "dest", "flags", "toJsonObject", "jsonMap", HttpUrl.FRAGMENT_ENCODE_SET, "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", "toString", "Companion", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 2 */     public final /* data */ class IdAccount implements Parcelable {
                private final String appAccount;
                private final String email;
                private final String error;
                private final boolean rememberMe;
                private final String scidToken;
                private final String supercellId;

                /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion(null);
                public static final Parcelable.Creator<IdAccount> CREATOR = new Parcelable.Creator<IdAccount>() { // from class: com.supercell.id.scid_plugin.IdAccount$special$$inlined$parcelableCreator$1
                    @Override // android.os.Parcelable.Creator
                    public IdAccount createFromParcel(Parcel source) {
/* 1 */                 source.getClass();
/* 6 */                 return new IdAccount(source);
                    }

                    @Override // android.os.Parcelable.Creator
                    public IdAccount[] newArray(int size) {
/* 1 */                 return new IdAccount[size];
                    }
                };

                /* JADX WARN: Illegal instructions before constructor call */
                public IdAccount(JSONObject jSONObject) throws JSONException {
                    String str;
                    String str2;
/* 1 */             jSONObject.getClass();
/* 6 */             String string = jSONObject.getString("scid");
/* 10 */            string.getClass();
/* 15 */            Object objOpt = jSONObject.opt(NotificationCompat.CATEGORY_EMAIL);
/* 19 */            Boolean bool = null;
/* 20 */            objOpt = (objOpt == null || objOpt.equals(JSONObject.NULL)) ? null : objOpt;
/* 31 */            if (objOpt != null) {
/* 40 */                str = objOpt instanceof String ? (String) objOpt : null;
                    } else {
/* 43 */                str = null;
                    }
/* 46 */            Object objOpt2 = jSONObject.opt("appAccount");
/* 50 */            objOpt2 = (objOpt2 == null || objOpt2.equals(JSONObject.NULL)) ? null : objOpt2;
/* 70 */            String str3 = (objOpt2 == null || !(objOpt2 instanceof String)) ? null : (String) objOpt2;
/* 71 */            if (str3 == null) {
/* 75 */                Object objOpt3 = jSONObject.opt("playerId");
/* 79 */                objOpt3 = (objOpt3 == null || objOpt3.equals(JSONObject.NULL)) ? null : objOpt3;
/* 99 */                str3 = (objOpt3 == null || !(objOpt3 instanceof String)) ? null : (String) objOpt3;
                    }
/* 100 */           String str4 = str3;
/* 103 */           Object objOpt4 = jSONObject.opt("scidToken");
/* 107 */           objOpt4 = (objOpt4 == null || objOpt4.equals(JSONObject.NULL)) ? null : objOpt4;
/* 127 */           String str5 = (objOpt4 == null || !(objOpt4 instanceof String)) ? null : (String) objOpt4;
/* 130 */           String str6 = str5 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str5;
/* 135 */           Object objOpt5 = jSONObject.opt("error");
/* 139 */           objOpt5 = (objOpt5 == null || objOpt5.equals(JSONObject.NULL)) ? null : objOpt5;
/* 150 */           if (objOpt5 != null) {
/* 159 */               str2 = objOpt5 instanceof String ? (String) objOpt5 : null;
                    } else {
/* 162 */               str2 = null;
                    }
/* 165 */           Object objOpt6 = jSONObject.opt("rememberMe");
/* 169 */           objOpt6 = (objOpt6 == null || objOpt6.equals(JSONObject.NULL)) ? null : objOpt6;
/* 180 */           if (objOpt6 != null && (objOpt6 instanceof Boolean)) {
/* 187 */               bool = (Boolean) objOpt6;
                    }
/* 200 */           this(string, str, str4, str6, str2, bool != null ? bool.booleanValue() : false);
                }

                public static /* synthetic */ IdAccount copy$default(IdAccount idAccount, String str, String str2, String str3, String str4, String str5, boolean z, int i, Object obj) {
/* 3 */             if ((i & 1) != 0) {
/* 5 */                 str = idAccount.supercellId;
                    }
/* 9 */             if ((i & 2) != 0) {
/* 11 */                str2 = idAccount.email;
                    }
/* 15 */            if ((i & 4) != 0) {
/* 17 */                str3 = idAccount.appAccount;
                    }
/* 21 */            if ((i & 8) != 0) {
/* 23 */                str4 = idAccount.scidToken;
                    }
/* 27 */            if ((i & 16) != 0) {
/* 29 */                str5 = idAccount.error;
                    }
/* 33 */            if ((i & 32) != 0) {
/* 35 */                z = idAccount.rememberMe;
                    }
/* 37 */            String str6 = str5;
/* 38 */            boolean z2 = z;
/* 44 */            return idAccount.copy(str, str2, str3, str4, str6, z2);
                }

                /* JADX INFO: renamed from: component1, reason: from getter */
                public final String getSupercellId() {
/* 1 */             return this.supercellId;
                }

                /* JADX INFO: renamed from: component2, reason: from getter */
                public final String getEmail() {
/* 1 */             return this.email;
                }

                /* JADX INFO: renamed from: component3, reason: from getter */
                public final String getAppAccount() {
/* 1 */             return this.appAccount;
                }

                /* JADX INFO: renamed from: component4, reason: from getter */
                public final String getScidToken() {
/* 1 */             return this.scidToken;
                }

                /* JADX INFO: renamed from: component5, reason: from getter */
                public final String getError() {
/* 1 */             return this.error;
                }

                /* JADX INFO: renamed from: component6, reason: from getter */
                public final boolean getRememberMe() {
/* 1 */             return this.rememberMe;
                }

                public final IdAccount copy(String supercellId, String email, String appAccount, String scidToken, String error, boolean rememberMe) {
/* 1 */             supercellId.getClass();
/* 4 */             scidToken.getClass();
/* 9 */             return new IdAccount(supercellId, email, appAccount, scidToken, error, rememberMe);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
/* 1 */             return 0;
                }

                public boolean equals(Object other) {
/* 2 */             if (this == other) {
/* 1 */                 return true;
                    }
/* 8 */             if (!(other instanceof IdAccount)) {
/* 7 */                 return false;
                    }
/* 11 */            IdAccount idAccount = (IdAccount) other;
                    return Intrinsics.m6216a(this.supercellId, idAccount.supercellId) && Intrinsics.m6216a(this.email, idAccount.email) && Intrinsics.m6216a(this.appAccount, idAccount.appAccount) && Intrinsics.m6216a(this.scidToken, idAccount.scidToken) && Intrinsics.m6216a(this.error, idAccount.error) && this.rememberMe == idAccount.rememberMe;
                }

                public final String getAppAccount() {
/* 1 */             return this.appAccount;
                }

                public final String getEmail() {
/* 1 */             return this.email;
                }

                public final String getError() {
/* 1 */             return this.error;
                }

                public final boolean getRememberMe() {
/* 1 */             return this.rememberMe;
                }

                public final String getScidToken() {
/* 1 */             return this.scidToken;
                }

                public final String getSupercellId() {
/* 1 */             return this.supercellId;
                }

                public int hashCode() {
/* 9 */             int iHashCode = this.supercellId.hashCode() * 31;
/* 10 */            String str = this.email;
/* 22 */            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
/* 23 */            String str2 = this.appAccount;
/* 37 */            int iM7485h = pm2.m7485h((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.scidToken);
/* 41 */            String str3 = this.error;
/* 58 */            return Boolean.hashCode(this.rememberMe) + ((iM7485h + (str3 != null ? str3.hashCode() : 0)) * 31);
                }

                public final Map<String, String> jsonMap() {
/* 7 */             Pair pair = new Pair("accountId", this.supercellId);
/* 10 */            String str = this.email;
/* 12 */            if (str == null) {
/* 14 */                str = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
/* 36 */            Map mapM7131e = oc1.m7131e(pair, new Pair(NotificationCompat.CATEGORY_EMAIL, str), new Pair("scidToken", this.scidToken));
/* 42 */            LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 57 */            for (Map.Entry entry : mapM7131e.entrySet()) {
/* 75 */                if (((String) entry.getValue()).length() > 0) {
/* 85 */                    linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
/* 89 */            return linkedHashMap;
                }

                public final JSONObject toJsonObject() throws JSONException {
/* 3 */             JSONObject jSONObject = new JSONObject();
/* 10 */            jSONObject.put("scid", this.supercellId);
/* 13 */            String str = this.email;
/* 15 */            if (str != null) {
/* 19 */                jSONObject.put(NotificationCompat.CATEGORY_EMAIL, str);
                    }
/* 22 */            String str2 = this.appAccount;
/* 24 */            if (str2 != null) {
/* 28 */                jSONObject.put("appAccount", str2);
                    }
/* 35 */            jSONObject.put("scidToken", this.scidToken);
/* 38 */            String str3 = this.error;
/* 40 */            if (str3 != null) {
/* 44 */                jSONObject.put("error", str3);
                    }
/* 51 */            jSONObject.put("rememberMe", this.rememberMe);
/* 54 */            return jSONObject;
                }

                public String toString() {
/* 1 */             String str = this.supercellId;
/* 3 */             String str2 = this.email;
/* 5 */             String str3 = this.appAccount;
/* 7 */             String str4 = this.scidToken;
/* 9 */             String str5 = this.error;
/* 11 */            boolean z = this.rememberMe;
/* 19 */            StringBuilder sbM3514r = AbstractC0886en.m3514r("IdAccount(supercellId=", str, ", email=", str2, ", appAccount=");
/* 27 */            fm0.m3796v(sbM3514r, str3, ", scidToken=", str4, ", error=");
/* 30 */            sbM3514r.append(str5);
/* 35 */            sbM3514r.append(", rememberMe=");
/* 38 */            sbM3514r.append(z);
/* 43 */            sbM3514r.append(")");
/* 46 */            return sbM3514r.toString();
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel dest, int flags) {
/* 1 */             dest.getClass();
/* 6 */             dest.writeString(this.supercellId);
/* 11 */            dest.writeString(this.email);
/* 16 */            dest.writeString(this.appAccount);
/* 21 */            dest.writeString(this.scidToken);
/* 26 */            dest.writeString(this.error);
/* 31 */            dest.writeInt(this.rememberMe ? 1 : 0);
                }

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                @Metadata(m6175d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tJ\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\u0006\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/IdAccount$Companion;", HttpUrl.FRAGMENT_ENCODE_SET, "<init>", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/supercell/id/scid_plugin/IdAccount;", "fromMap", "map", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "parse", HttpUrl.FRAGMENT_ENCODE_SET, SharedDataContentProvider.BASE_PATH, "Lorg/json/JSONArray;", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
/* 3 */         public static final class Companion {
                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
/* 1 */                 this();
                    }

                    public final IdAccount fromMap(Map<String, String> map) {
/* 1 */                 map.getClass();
/* 8 */                 String str = map.get("accountId");
/* 12 */                str.getClass();
/* 16 */                String str2 = str;
/* 20 */                String str3 = map.get(NotificationCompat.CATEGORY_EMAIL);
/* 29 */                String str4 = map.get("scidToken");
/* 35 */                if (str4 == null) {
/* 37 */                    str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
/* 43 */                return new IdAccount(str2, str3, null, str4, null, true);
                    }

                    public final List<IdAccount> parse(JSONArray data) {
/* 1 */                 data.getClass();
/* 9 */                 IntRange intRangeM8048e = r02.m8048e(0, data.length());
/* 15 */                ArrayList arrayList = new ArrayList();
/* 18 */                Iterator it = intRangeM8048e.iterator();
/* 26 */                while (it.hasNext()) {
/* 35 */                    IdAccount idAccount = null;
                            try {
/* 36 */                        JSONObject jSONObjectOptJSONObject = data.optJSONObject(((wy0) it).nextInt());
/* 40 */                        if (jSONObjectOptJSONObject != null) {
/* 44 */                            idAccount = new IdAccount(jSONObjectOptJSONObject);
                                }
                            } catch (JSONException e) {
/* 70 */                        AbstractC1245n0.m4889q("IdAccount", "JSON Parse error " + e.getLocalizedMessage());
                            }
/* 73 */                    if (idAccount != null) {
/* 75 */                        arrayList.add(idAccount);
                            }
                        }
/* 79 */                return arrayList;
                    }

/* 4 */             private Companion() {
                    }
                }

/* 203 */       public /* synthetic */ IdAccount(String str, String str2, String str3, String str4, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
/* 204 */           this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? false : z);
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 204 */       public IdAccount(Parcel parcel) {
                    parcel.getClass();
/* 205 */           String string = parcel.readString();
                    string.getClass();
/* 206 */           String string2 = parcel.readString();
/* 207 */           String string3 = parcel.readString();
/* 208 */           String string4 = parcel.readString();
                    string4.getClass();
/* 211 */           this(string, string2, string3, string4, parcel.readString(), parcel.readInt() != 0);
                }

/* 211 */       public IdAccount(String str, String str2, String str3, String str4, String str5, boolean z) {
                    str.getClass();
                    str4.getClass();
/* 213 */           this.supercellId = str;
/* 214 */           this.email = str2;
/* 215 */           this.appAccount = str3;
/* 216 */           this.scidToken = str4;
/* 217 */           this.error = str5;
/* 218 */           this.rememberMe = z;
                }
            }
