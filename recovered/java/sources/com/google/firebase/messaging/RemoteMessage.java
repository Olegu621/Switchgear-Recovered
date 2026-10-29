            package com.google.firebase.messaging;

            import android.net.Uri;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Map;
            import p000.C1024id;
            import p000.C2216tf;
            import p000.qd3;
            import p000.ts0;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class RemoteMessage extends AbstractSafeParcelable {
                public static final Parcelable.Creator<RemoteMessage> CREATOR = new qd3(11);

                /* JADX INFO: renamed from: a */
                public final Bundle f5306a;

                /* JADX INFO: renamed from: b */
                public C1024id f5307b;

                /* JADX INFO: renamed from: c */
                public C2216tf f5308c;

                public RemoteMessage(Bundle bundle) {
/* 4 */             this.f5306a = bundle;
                }

                /* JADX INFO: renamed from: D1 */
                public final Map m2535D1() {
/* 3 */             if (this.f5307b == null) {
/* 7 */                 C1024id c1024id = new C1024id();
/* 10 */                Bundle bundle = this.f5306a;
/* 24 */                for (String str : bundle.keySet()) {
/* 32 */                    Object obj = bundle.get(str);
/* 38 */                    if (obj instanceof String) {
/* 40 */                        String str2 = (String) obj;
/* 48 */                        if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
/* 82 */                            c1024id.put(str, str2);
                                }
                            }
                        }
/* 86 */                this.f5307b = c1024id;
                    }
/* 88 */            return this.f5307b;
                }

                /* JADX INFO: renamed from: E1 */
                public final C2216tf m2536E1() {
/* 3 */             if (this.f5308c == null) {
/* 5 */                 Bundle bundle = this.f5306a;
/* 11 */                if (ts0.m8887z(bundle)) {
/* 17 */                    ts0 ts0Var = new ts0(bundle);
/* 20 */                    C2216tf c2216tf = new C2216tf();
/* 29 */                    c2216tf.f17061a = ts0Var.m8911x("gcm.n.title");
/* 31 */                    ts0Var.m8906r("gcm.n.title");
/* 34 */                    Object[] objArrM8905q = ts0Var.m8905q("gcm.n.title");
/* 39 */                    if (objArrM8905q != null) {
/* 43 */                        String[] strArr = new String[objArrM8905q.length];
/* 47 */                        for (int i = 0; i < objArrM8905q.length; i++) {
/* 55 */                            strArr[i] = String.valueOf(objArrM8905q[i]);
                                }
                            }
/* 66 */                    c2216tf.f17062b = ts0Var.m8911x("gcm.n.body");
/* 68 */                    ts0Var.m8906r("gcm.n.body");
/* 71 */                    Object[] objArrM8905q2 = ts0Var.m8905q("gcm.n.body");
/* 75 */                    if (objArrM8905q2 != null) {
/* 79 */                        String[] strArr2 = new String[objArrM8905q2.length];
/* 82 */                        for (int i2 = 0; i2 < objArrM8905q2.length; i2++) {
/* 90 */                            strArr2[i2] = String.valueOf(objArrM8905q2[i2]);
                                }
                            }
/* 97 */                    ts0Var.m8911x("gcm.n.icon");
/* 102 */                   String strM8911x = ts0Var.m8911x("gcm.n.sound2");
/* 110 */                   if (TextUtils.isEmpty(strM8911x)) {
/* 114 */                       strM8911x = ts0Var.m8911x("gcm.n.sound");
                            }
/* 118 */                   c2216tf.f17063c = strM8911x;
/* 122 */                   ts0Var.m8911x("gcm.n.tag");
/* 131 */                   c2216tf.f17064d = ts0Var.m8911x("gcm.n.color");
/* 135 */                   ts0Var.m8911x("gcm.n.click_action");
/* 140 */                   ts0Var.m8911x("gcm.n.android_channel_id");
/* 145 */                   String strM8911x2 = ts0Var.m8911x("gcm.n.link_android");
/* 153 */                   if (TextUtils.isEmpty(strM8911x2)) {
/* 157 */                       strM8911x2 = ts0Var.m8911x("gcm.n.link");
                            }
/* 165 */                   if (!TextUtils.isEmpty(strM8911x2)) {
/* 167 */                       Uri.parse(strM8911x2);
                            }
/* 172 */                   ts0Var.m8911x("gcm.n.image");
/* 177 */                   ts0Var.m8911x("gcm.n.ticker");
/* 182 */                   ts0Var.m8902m("gcm.n.notification_priority");
/* 187 */                   ts0Var.m8902m("gcm.n.visibility");
/* 192 */                   ts0Var.m8902m("gcm.n.notification_count");
/* 197 */                   ts0Var.m8900i("gcm.n.sticky");
/* 202 */                   ts0Var.m8900i("gcm.n.local_only");
/* 207 */                   ts0Var.m8900i("gcm.n.default_sound");
/* 212 */                   ts0Var.m8900i("gcm.n.default_vibrate_timings");
/* 217 */                   ts0Var.m8900i("gcm.n.default_light_settings");
/* 220 */                   ts0Var.m8907s();
/* 223 */                   ts0Var.m8904o();
/* 226 */                   ts0Var.m8912y();
/* 229 */                   this.f5308c = c2216tf;
                        }
                    }
/* 231 */           return this.f5308c;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9402L(parcel, 2, this.f5306a, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
