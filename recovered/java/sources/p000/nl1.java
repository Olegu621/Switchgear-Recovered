            package p000;

            import android.app.UiModeManager;
            import android.content.Context;
            import android.os.Build;
            import com.usercentrics.sdk.UsercentricsOptions;
            import kotlin.text.StringsKt;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class nl1 {
                public static final ml1 Companion = new ml1();

                /* JADX INFO: renamed from: a */
                public final gv1 f14360a;

                /* JADX INFO: renamed from: b */
                public final hk2 f14361b;

                /* JADX INFO: renamed from: c */
                public final Context f14362c;

                /* JADX INFO: renamed from: d */
                public final ts0 f14363d;

                /* JADX INFO: renamed from: e */
                public final UsercentricsOptions f14364e;

                public nl1(Context context, ts0 ts0Var, gv1 gv1Var, UsercentricsOptions usercentricsOptions) {
/* 1 */             gv1Var.getClass();
/* 4 */             usercentricsOptions.getClass();
/* 7 */             gv1Var.getClass();
/* 13 */            this.f14360a = gv1Var;
/* 26 */            this.f14361b = r51.m8065b(new C0908f8(this, 17));
/* 28 */            this.f14362c = context;
/* 30 */            this.f14363d = ts0Var;
/* 32 */            this.f14364e = usercentricsOptions;
                }

                /* JADX INFO: renamed from: a */
                public final e13 m6997a() {
                    String str;
                    Object n42Var;
                    String str2;
/* 3 */             Context context = this.f14362c;
/* 5 */             context.getClass();
/* 10 */            Object systemService = context.getSystemService("uimode");
/* 22 */            UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
/* 29 */            Integer numValueOf = uiModeManager != null ? Integer.valueOf(uiModeManager.getCurrentModeType()) : null;
/* 33 */            if (numValueOf != null && numValueOf.intValue() == 4) {
/* 43 */                str = "Android-TV";
                    } else if (numValueOf != null && numValueOf.intValue() == 3) {
/* 56 */                str = "Android-Car";
                    } else if (numValueOf != null && numValueOf.intValue() == 2) {
/* 69 */                str = "Android-Desktop";
                    } else if (numValueOf != null && numValueOf.intValue() == 6) {
/* 82 */                str = "Android-Watch";
                    } else if (context.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
/* 97 */                str = "Android-Amazon-FireTV";
                    } else {
/* 117 */               str = (context.getResources().getConfiguration().screenLayout & 15) >= 3 ? "Android-Tablet" : "Android";
                    }
/* 121 */           String strValueOf = String.valueOf(Build.VERSION.SDK_INT);
/* 125 */           String packageName = context.getPackageName();
/* 129 */           packageName.getClass();
/* 138 */           String str3 = (String) this.f14361b.getValue();
                    try {
/* 141 */               m42 m42Var = o42.f14612b;
/* 155 */               n42Var = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
/* 157 */               n42Var.getClass();
                    } catch (Throwable th) {
/* 162 */               m42 m42Var2 = o42.f14612b;
/* 166 */               n42Var = new n42(th);
                    }
/* 174 */           if (o42.m7099a(n42Var) != null) {
/* 177 */               n42Var = "unknown-version";
                    }
/* 179 */           String str4 = (String) n42Var;
/* 189 */           ((il1) this.f14363d.f17248a).getClass();
                    try {
/* 192 */               Class.forName("com.usercentrics.sdk.flutter.UCFlutterFlag");
                    } catch (Exception unused) {
                        try {
/* 198 */                   Class.forName("usercentrics_sdk.UCFlutterFlag");
                        } catch (Exception unused2) {
                            try {
/* 207 */                       Class.forName("com.usercentrics.reactnativeusercentrics.UCRNFlag");
                            } catch (Exception unused3) {
                                try {
/* 213 */                           Class.forName("react_native_usercentrics.UCRNFlag");
                                } catch (Exception unused4) {
/* 232 */                           str2 = StringsKt.m6240z("2.24.4", "-unity", false) ? "unity" : "native";
                                }
                            }
/* 216 */                   str2 = "react-native";
                        }
                    }
/* 201 */           str2 = "flutter";
/* 240 */           return new e13(str, strValueOf, packageName, str3, str4, str2, this.f14364e.f6054g);
                }
            }
